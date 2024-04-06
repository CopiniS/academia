
package controller;

import views.TelaPlanoAdicionar;
import views.TelaPlanoAlterar;

public class PlanoController {

    public PlanoController() {
    }

    public void btAdicionarPlano(){
        Main.controllerManager.getApplicationView().setTelaPlanoAdicionar(new TelaPlanoAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaPlanoAdicionar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
    
    public void btAlterarPlano(){
        Main.controllerManager.getApplicationView().setTelaPlanoAlterar(new TelaPlanoAlterar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaPlanoAlterar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
}   
        