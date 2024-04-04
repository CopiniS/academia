
package controller;

import views.TelaClienteAdicionar;
import views.TelaClienteAlterar;
import views.TelaInstrutor;
import views.TelaModalidade;
import views.TelaPlano;
import views.TelaTreino;

public class ClienteController {

    public ClienteController() {
    }
    
    public void btInstrutor(){
        Main.controllerManager.getApplicationView().setTelaInstrutor(new TelaInstrutor());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaInstrutor());
    }
    
    public void btPlano(){
        Main.controllerManager.getApplicationView().setTelaPlano(new TelaPlano());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaPlano());
    }
    
    public void btModalidade(){
        Main.controllerManager.getApplicationView().setTelaModalidade(new TelaModalidade());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaModalidade());
    }
    
    public void btTreino(){
        Main.controllerManager.getApplicationView().setTelaTreino(new TelaTreino());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaTreino());
    }
    
    public void btExercicio(){
        
    }
    
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
    
    public void btSalvarNovoCliente(){
        
    }
    
    public void btSalvarAlteraçãoCliente(){
        
    }
    
    public void btDeletarCliente(){
        
    }
}
    
