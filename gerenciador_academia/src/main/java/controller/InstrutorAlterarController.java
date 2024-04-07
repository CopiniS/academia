
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Instrutor;
import models.Modalidade;

public class InstrutorAlterarController {

    public InstrutorAlterarController() {
    }
    
    public List<Instrutor> retornaListaInstrutores(){
        return Main.controllerManager.getApplicationModel().getInstrutorDAO().selectInstrutor();
    }
    
    public List<Modalidade> retornaTodasModalidades(){
        return Main.controllerManager.getApplicationModel().getModalidadeDAO().selectModalidadeSql();
    }
    
    public Instrutor retornaInstrutorPeloCPf(String cpf, List<Instrutor> lista){
        for(Instrutor i : lista){
            if(i.getCpf().equals(cpf)){
                return i;
            }
        }
        return null;
    }
    
    public List<Modalidade> retornaModalidadesDoInstrutor(int idInstrutor) throws SQLException{
        return Main.controllerManager.getApplicationModel().getInstrutorDAO().retornaListaDeModalidadesDoInstrutor(idInstrutor);
    }
    
    public boolean validaCampoNome(String nome){
        return !nome.isBlank();
    }    
    
    public boolean alteraModalidades(Instrutor instrutor, List<Modalidade> antigas, List<Modalidade> novas){

        boolean resultado = false;
        boolean insercoes = false;
        boolean remocoes = false;
        if(!antigas.isEmpty()){
            if(Main.controllerManager.getApplicationModel().getInstrutorDAO().deleteInstrutorHasModalidade(instrutor.getId(), antigas)){
                remocoes = true;
            }
        }
        else{
            remocoes = true;
        }
        
        if(!novas.isEmpty()){
            if(Main.controllerManager.getApplicationModel().getInstrutorDAO().insertInstrutorHasModalidade(instrutor.getId(), novas)){
                insercoes = true;
            }
        }
        else{
            insercoes = true;
        }
        
        if(insercoes && remocoes){
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
    
    public boolean deletaInstrutor(int idInstrutor){
        return Main.controllerManager.getApplicationModel().getInstrutorDAO().deleteInstrutorSql(idInstrutor);
    }
}
