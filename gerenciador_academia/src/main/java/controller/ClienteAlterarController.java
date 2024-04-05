
package controller;

import javax.swing.JOptionPane;
import models.Cliente;

public class ClienteAlterarController {

    public ClienteAlterarController() {
    }
    
    public void btAlteraDados(Cliente cliente){
    boolean updatePlano = false;
    boolean updateTreino = false;
    boolean updateEndereco = false;

    if(Main.controllerManager.getApplicationModel().getClienteDAO().updateClienteSql(cliente)){
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
    
}
