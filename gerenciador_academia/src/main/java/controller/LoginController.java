
package controller;

import javax.swing.JOptionPane;
import views.TelaCliente;


public class LoginController {

    public LoginController() {

    }
    
    public void btEntrar(String usuario, String senha){
       Main.controllerManager.getApplicationModel().startDAOModels();
       if(Main.controllerManager.getApplicationModel().getLoginDAO().SelectSenhaDoUsuarioSQL(usuario, senha)){
             Main.controllerManager.getApplicationView().setTelaCliente(new TelaCliente());
             Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaCliente());
             Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
       }
       else{
           JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
       }
    }
}
