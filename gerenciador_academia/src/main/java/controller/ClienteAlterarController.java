
package controller;

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
    
}
