
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import models.Cliente;
import views.TelaClienteAdicionar;
import views.TelaClienteAlterar;

public class ClienteController {
  
    public void btAdicionarCliente(){
        Main.controllerManager.getApplicationView().setTelaClienteAdicionar(new TelaClienteAdicionar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaClienteAdicionar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
    
    public void btAlterarCliente(){
        Main.controllerManager.getApplicationView().setTelaClienteAlterar(new TelaClienteAlterar());
        Main.controllerManager.getApplicationView().mostraTela(Main.controllerManager.getApplicationView().getTelaClienteAlterar());
        Main.controllerManager.getApplicationView().getJanela().setLocationRelativeTo(null);
    }
    
    public void btMostrarCliente(){
        List<Cliente> lista = Main.controllerManager.getApplicationModel().getClienteDAO().mostraClientes();
        String listaStr = "";
        for(Cliente c : lista){
            listaStr = listaStr + "nome: " + c.getNome() + "  -- CPF: " + c.getCpf() + "  --  Data nascimento: " + c.getDataNascimento() + 
                    "  --  CEP: " + c.getCep() + "  --  Plano: " + c.getPlano().getNome() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, listaStr);
    }
}
    
