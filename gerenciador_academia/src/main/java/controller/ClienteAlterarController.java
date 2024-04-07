
package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import models.Cliente;
import models.Plano;
import models.Treino;

public class ClienteAlterarController {

    public ClienteAlterarController() {
    }
    
    public void btAlteraDados(Cliente cliente){
        boolean updatePlano = false;
        boolean updateTreino = false;
        boolean updateEndereco = false;

        if(alteraEnderecoCliente(cliente)){
            updateEndereco = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Problemas na alteração do endereço do cliente");
        }

        if(Main.controllerManager.getApplicationModel().getClienteDAO().updateClienteIdTreino(cliente)){
            updateTreino = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Problemas na alteração do Treino do cliente");
        }

        if(Main.controllerManager.getApplicationModel().getClienteDAO().updateClienteIdPlano(cliente)){
            updatePlano = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Problemas na alteração do plano do cliente");
        }

        if(updatePlano && updateEndereco && updateTreino){
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }
    }
    
    public Plano retornaPlano(List<Plano> lista, String planoSelecionado){
        boolean existe = false;
        Plano certo = new Plano();
        for(Plano p : lista){
            if(p.getNome().equals(planoSelecionado)){
                existe = true;
                certo = p;
            }
        }
        
        if(existe == true) { 
            return certo;
        }
        
        return null;
    }
    
    public Treino retornaTreino(List<Treino> lista, String treinoSelecionado){
        boolean existe = false;
        Treino certo = new Treino();
        for(Treino t : lista){
            if(t.getNome().equals(treinoSelecionado)){
                existe = true;
                certo = t;
            }
        }
        
        if(existe == true) { 
            return certo;
        }
        
        return null;
    }
    
    public Cliente retornaClientePeloCpf(String cpf) throws ParseException, SQLException{
        return Main.controllerManager.getApplicationModel().getClienteDAO().retornaClientePeloCpf(cpf);
    }
    
    public List retornaListaCPFS(){
       return Main.controllerManager.getApplicationModel().getClienteDAO().retonaListaDeCPFS();
    }
    
    public List retornaListaPlanos(){
        return Main.controllerManager.getApplicationModel().getPlanoDAO().selectPlanoSql();
    }
    
    public List retornaListatreinos(){
        return Main.controllerManager.getApplicationModel().getTreinoDAO().selectTreinos();
    }
    
    public String retornaIdEnderecoDoCliente(int idCliente){
        return Main.controllerManager.getApplicationModel().getClienteDAO().selectIdEnderecoCliente(idCliente);
    }
    
    public boolean alteraEnderecoCliente(Cliente cliente){
        boolean resultado = false;
        String idEndereco = retornaIdEnderecoDoCliente(cliente.getId());
        if(idEndereco == null){
            idEndereco = Main.controllerManager.getApplicationModel().getClienteDAO().insertEnderecoClienteSql(cliente);
            if(idEndereco != null){
                if(Main.controllerManager.getApplicationModel().getClienteDAO().updateIdEnderecoNoCliente(cliente.getId(), Integer.parseInt(idEndereco))){
                    resultado = true;
                }
            }
        }    
        else{
           Main.controllerManager.getApplicationModel().getClienteDAO().updateEnderecoClienteSql(cliente, Integer.parseInt(idEndereco));
        }
            
        return resultado;
    }
    
    public Cliente verificaEnderecoNulo(Cliente cliente){
        if(cliente.getBairro().isBlank()){
            cliente.setBairro(null);
        }
        if(cliente.getCep().isBlank()){
            cliente.setCep(null);
        }
        if(cliente.getRua().isBlank()){
            cliente.setRua(null);
        }
        if(cliente.getNumero().isBlank()){
            cliente.setNumero(null);
        }
        
        
        return cliente;
    }
    
    public boolean deletaCliente(int idCliente){
        return Main.controllerManager.getApplicationModel().getClienteDAO().deletaClienteSql(idCliente);
    }
    
   
}
