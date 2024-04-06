
package controller;

import javax.swing.JOptionPane;
import models.Modalidade;

public class ModalidadeAdicionarController {

    public ModalidadeAdicionarController() {
    }
    
    public void btAddModalidade(Modalidade modalidade){
        if(Main.controllerManager.getApplicationModel().getModalidadeDAO().insertModalidadeSql(modalidade)){
            JOptionPane.showMessageDialog(null, "Modalidade cadastrada com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar modalidade, tente novamente mais tarde");
        }
    }
    
    public boolean validaCampo(String str){
        boolean resultado = false;
        
        if(!str.isBlank()){
            resultado = true;
        }
        return resultado;
    }
}
