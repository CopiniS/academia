
package controller;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import models.Plano;
import models.Treino;

public class ClienteAdicionarController {
    
    public ClienteAdicionarController() {
    }
       
    public void btAddCliente(String nome, String cpf, String dataNascimento, String cep, String rua, String bairro, String numero, String idPlano, String idTreino) throws ParseException{
        if(nome.isBlank() || cpf.isBlank() || dataNascimento.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
        }
        
        else if(!validarCPF(cpf)){
            JOptionPane.showMessageDialog(null, "este CPF não é valido");
        }
        
        else if(verificaCPFrepetido(cpf)){
            JOptionPane.showMessageDialog(null, "CPF já cadastrado");
        }
        
        else{
            if(!cep.isBlank() || !rua.isBlank() || !bairro.isBlank() || !numero.isBlank()){
                Main.controllerManager.getApplicationModel().getClienteDAO().criaNovoEnderecoCliente(cep, rua, bairro, numero);
            }
            Main.controllerManager.getApplicationModel().getClienteDAO().criaNovoCliente(nome, cpf, validaDataNascimento(dataNascimento), idPlano, idTreino);
        }
    }
    
    public boolean validarCPF(String cpf) {
        // Remover caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");
        
        // Verificar se o CPF tem 11 dígitos
        if (cpf.length() != 11)
            return false;
        
        // Verificar se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}"))
            return false;
        
        // Calcular o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) digito1 = 0;
        
        // Calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) digito2 = 0;
        
        // Verificar se os dígitos calculados são iguais aos dígitos do CPF
        return (Character.getNumericValue(cpf.charAt(9)) == digito1) && 
               (Character.getNumericValue(cpf.charAt(10)) == digito2);
    }
    
    public boolean verificaCPFrepetido(String cpf){
        List<String> lista = Main.controllerManager.getApplicationModel().getClienteDAO().retonaListaDeCPFS();
        
        return lista.contains(cpf);
    }
    
    public Date validaDataNascimento(String dataString) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date utilDate = formato.parse(dataString);
        return new Date(utilDate.getTime());
    }
    
    public String retornaIdPlanoSelecionado(List<Plano> lista, String nomePlano){
        for(Plano p : lista){
            if(p.getNome().equals(nomePlano)){
                return String.valueOf(p.getId());
            }
        }
        return null;
    }  
    
    public String retornaIdTreinoSelecionado(List<Treino> lista, String nomeTreino){
        for(Treino t : lista){
            if(t.getNome().equals(nomeTreino)){
                return String.valueOf(t.getId());
            }
        }
            return null;
    }
    
}

