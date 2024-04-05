
package controller;

import views.TelaClienteAdicionar;
import views.TelaClienteAlterar;

public class ClienteController {
  
    public void btAdicionarCliente(){
        Main.controllerManager.getApplicationView().setTelaClienteAdicionar(new TelaClienteAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaClienteAdicionar());
    }
    
    public void btAlterarCliente(){
        Main.controllerManager.getApplicationView().setTelaClienteAlterar(new TelaClienteAlterar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaClienteAlterar());
    }
    
    public void btMostrarCliente(){
        
    }
}
    
