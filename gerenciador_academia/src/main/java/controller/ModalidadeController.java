
package controller;

import views.TelaModalidadeAdicionar;
import views.TelaModalidadeDeletar;

public class ModalidadeController {

    public ModalidadeController() {
    }

    public void btAdicionarModalidade(){
        Main.controllerManager.getApplicationView().setTelaModalidadeAdicionar(new TelaModalidadeAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaModalidadeAdicionar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
    
    public void btDeletarModalidade(){
        Main.controllerManager.getApplicationView().setTelaModalidadeDeletar(new TelaModalidadeDeletar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaModalidadeDeletar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);        
    }
}
