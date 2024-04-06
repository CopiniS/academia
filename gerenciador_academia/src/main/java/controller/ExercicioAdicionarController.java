
package controller;

import javax.swing.JOptionPane;
import models.Exercicio;

public class ExercicioAdicionarController {

    public ExercicioAdicionarController() {
    }
    
    public void bt_addExercicio(Exercicio exercicio){
        if(Main.controllerManager.getApplicationModel().getExercicioDAO().insertExercicioSql(exercicio)){
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");
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
