package controller;

import views.TelaInstrutorAdicionar;
import views.TelaInstrutorAlterar;

public class InstrutorController {

    public InstrutorController() {
        
    }
    
    public void btAdd(){
        Main.controllerManager.getApplicationView().setTelaInstrutorAdicionar(new TelaInstrutorAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaInstrutorAdicionar());
    }
    
    public void btAlterar(){
        Main.controllerManager.getApplicationView().setTelaInstrutorAlterar(new TelaInstrutorAlterar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaInstrutorAlterar());
    }
    
    public void btMostrar(){
        Main.controllerManager.getApplicationModel().getInstrutorDAO().mostraInstrutores();
    }
}
