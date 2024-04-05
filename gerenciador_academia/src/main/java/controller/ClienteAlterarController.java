
package controller;

import views.TelaClienteAlterar;

public class ClienteAlterarController {

    public ClienteAlterarController() {
    }
    
    public void btAlteraDados(){
        Main.controllerManager.getApplicationView().setTelaClienteAlterar(new TelaClienteAlterar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaClienteAlterar());
    }
}
