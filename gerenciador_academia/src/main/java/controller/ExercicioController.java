
package controller;

import views.TelaExercicioAdicionar;
import views.TelaExercicioDeletar;

public class ExercicioController {

    public ExercicioController() {
    }
    
    public void btAdicionarExercicio(){
        Main.controllerManager.getApplicationView().setTelaExercicioAdicionar(new TelaExercicioAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaExercicioAdicionar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
    
    public void btDeletarExercicio(){
        Main.controllerManager.getApplicationView().setTelaExercicioDeletar(new TelaExercicioDeletar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaExercicioDeletar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
}
