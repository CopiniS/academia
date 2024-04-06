
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Modalidade;
import models.Plano;

public class PlanoAlterarController {
    
    
    public List<Plano> retornaListaPlanos(){
        return Main.controllerManager.getApplicationModel().getPlanoDAO().selectPlanoSql();
    }
    
    public Plano retornaPlanoPeloNome(String nome, List<Plano> planos){
        Plano plano = new Plano();
        for(Plano p : planos){
            if(p.getNome().equals(nome)){
                plano = p;
            }
        }
            
        return plano;
    }
    
    public List retornaModalidadesDoPlano(Plano plano) throws SQLException{
        return Main.controllerManager.getApplicationModel().getPlanoDAO().retornaListaDeModalidadesDoPlano(plano.getId());
    }
    
    public List<Modalidade> retornaTodasModalidades(){
        return Main.controllerManager.getApplicationModel().getModalidadeDAO().selectModalidadeSql();
    }
    
    public boolean validaCamposGerais(boolean [] vetorCheckBox, String valor, String meses){
        boolean resultado = false;
        
        if(validaCheckBox(vetorCheckBox) && isInteger(meses) && isFloat(valor)){
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
    
    public boolean alteraModalidades(Plano plano, List<Modalidade> antigas, List<Modalidade> novas){

        boolean resultado = false;
        for (int i = 0; i < novas.size(); i++) {
            for (int j = 0; j < antigas.size(); j++) {
                if (novas.get(i).getId() == antigas.get(j).getId()) {
                    novas.remove(i);
                    antigas.remove(j);
                    i--; // Decrementa i para ajustar após a remoção de um elemento de novas
                    break; // Sai do loop interno para evitar ConcurrentModificationException
                }
            }
        }
       
        boolean insercoes = false;
        boolean remocoes = false;
        if(Main.controllerManager.getApplicationModel().getPlanoDAO().insertPlanoHasModalidade(plano.getId(), novas)){
            insercoes = true;
        }
        
        if(Main.controllerManager.getApplicationModel().getPlanoDAO().deletePlanohasModalidade(plano.getId(), antigas)){
            remocoes = true;
        }
        
        if(insercoes && remocoes){
            resultado = true;
        }

        return resultado;
    }
    
    public boolean alteraValorEMeses(Plano plano){
        boolean resultado = false;
        
        if(Main.controllerManager.getApplicationModel().getPlanoDAO().updatePlanoSql(plano)){
            resultado = true;
        }
        return resultado;
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
    
    public boolean deletarPlano(Plano plano){
        boolean resultado = false;
        
        if(Main.controllerManager.getApplicationModel().getPlanoDAO().deletePlanoSql(plano.getId())){
            resultado = true;
        }
        return resultado;
    }
}
