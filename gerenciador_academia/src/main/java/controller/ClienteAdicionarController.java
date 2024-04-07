
package controller;

import java.text.ParseException;
import java.util.List;
import models.Cliente;
import models.Plano;
import models.Treino;

public class ClienteAdicionarController {
    
    public ClienteAdicionarController() {
    }
    
    public boolean validacaoCamposObrigatorios(String nome, String cpf, String data){
        return nome.isBlank() || cpf.isBlank() || data.isBlank();
    }
    
    public boolean btAddCliente(Cliente cliente) throws ParseException{
        
        String idEndereco = null;
        if(!cliente.getCep().isBlank() || !cliente.getRua().isBlank() || !cliente.getBairro().isBlank() || !cliente.getNumero().isBlank()){
             idEndereco = Main.controllerManager.getApplicationModel().getClienteDAO().insertEnderecoClienteSql(cliente);
        }
        return Main.controllerManager.getApplicationModel().getClienteDAO().insertClienteSql(cliente, idEndereco);
        
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
    
    public Plano retornaPlanoSelecionado(List<Plano> lista, String nomePlano){
        for(Plano p : lista){
            if(p.getNome().equals(nomePlano)){
                return p;
            }
        }
        return null;
    }  
    
    public Treino retornaTreinoSelecionado(List<Treino> lista, String nomeTreino){
        for(Treino t : lista){
            if(t.getNome().equals(nomeTreino)){
                return t;
            }
        }
            return null;
    }
    
}

