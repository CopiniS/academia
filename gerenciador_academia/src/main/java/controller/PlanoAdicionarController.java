
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Modalidade;
import models.Plano;

/**
 *
 * @author gabri
 */
public class PlanoAdicionarController {

    public PlanoAdicionarController() {
    }
    
    public List<Modalidade> retornaListaModadalidade(){
        return Main.controllerManager.getApplicationModel().getModalidadeDAO().selectModalidadeSql();
    }
    
    public List<Modalidade> retornaModalidadesSelecionadas(boolean [] vetorCheckBox, List<Modalidade> lista){
        List<Modalidade> selecionados = new ArrayList<>();
        
        for(int i=0; i<8; i++){
            if(vetorCheckBox[i]){
                selecionados.add(lista.get(i));
            }
        }
        
        return selecionados;
    }
    
    public boolean validaCamposGerais(String nome, boolean [] vetorCheckBox, String valor, String meses){
        boolean resultado = false;
        
        if(validaCampoNome(nome) && validaCheckBox(vetorCheckBox) && isInteger(meses) && isFloat(valor)){
            resultado = true;
        }
            
        return resultado;
    }
    
    public boolean validaCampoNome(String str){
        boolean resultado = false;
        if(!str.isBlank()){
            resultado = true;
        }
        return resultado;
    }
    
    public boolean validaCheckBox(boolean [] vetorCheckBox){
        boolean resultado = false;
        
        for(int i=0; i<8; i++){
            if(vetorCheckBox[i] == true){
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean isInteger(String str){
        return str.matches("^\\d+$");
    }
    
    public boolean isFloat(String str){
        return str.matches("^\\d*\\.?\\d+$");
    }
    
    public boolean btAddPlano(Plano plano, List<Modalidade> lista){
        boolean resultado = false;
        int idPlano = Main.controllerManager.getApplicationModel().getPlanoDAO().insertPlanoSql(plano);
        
        if(Main.controllerManager.getApplicationModel().getPlanoDAO().insertPlanoHasModalidade(idPlano, lista)){
            resultado = true;
        }
        return resultado;
    }
    
}
