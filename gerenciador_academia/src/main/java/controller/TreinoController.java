
package controller;

import views.TelaTreinoAdicionar;
import views.TelaTreinoAlterar;


public class TreinoController {

    public TreinoController() {
    }

    public void btAdicionarTreino(){
        Main.controllerManager.getApplicationView().setTelaTreinoAdicionar(new TelaTreinoAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaTreinoAdicionar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
    
    public void btAlterarTreino(){
        Main.controllerManager.getApplicationView().setTelaTreinoAlterar(new TelaTreinoAlterar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaTreinoAlterar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }

}
