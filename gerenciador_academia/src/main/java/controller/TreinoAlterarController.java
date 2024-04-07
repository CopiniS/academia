
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Exercicio;
import models.Treino;

public class TreinoAlterarController {

    public TreinoAlterarController() {
    }
    
    public List<Treino> retornaListaTreinos(){
        return Main.controllerManager.getApplicationModel().getTreinoDAO().selectTreinos();
    }
    
    public List<Exercicio> retornaListaExercicios(int idTreino, String musc){
        List<Exercicio> lista =  Main.controllerManager.getApplicationModel().getTreinoDAO().selectTreinoHasExercicioSql(idTreino);
        List<Exercicio> listaAux = new ArrayList();
        
        for(Exercicio e : lista){
            if(e.getMusculaturaAfetada().equals(musc)){
                listaAux.add(e);
            }
        }
        return listaAux;
    } 
    
    public List<Exercicio> retornaListaExerciciosPeloMusculo(String musculo, List<Exercicio> lista){
        List<Exercicio> listaEspecifica = new ArrayList<>();
        
        for(Exercicio e : lista){
            if(e.getMusculaturaAfetada().equals(musculo)){
                listaEspecifica.add(e);
            }
        }
        return listaEspecifica;
    }
    
    public boolean removeExerciciosAntigos(int idTreino){
        boolean resultado = false;
        
        if(Main.controllerManager.getApplicationModel().getTreinoDAO().deleteTreinoHasExercicioSql(idTreino)){
            resultado = true;
        }
        return resultado;
    }
    
    public boolean btAddtreino(Map<String, List<Exercicio>> map, String descricao, List<String> diasAdd, int idTreino){
        boolean resultado = false;
        Main.controllerManager.getApplicationModel().getTreinoDAO().updateTreinoSql(idTreino, descricao);
        
        if(removeExerciciosAntigos(idTreino) && addExercicios(map, diasAdd, idTreino)){
                resultado = true;
        }
         
        return resultado;
    }
    
    public boolean addExercicios(Map<String, List<Exercicio>> map, List<String> diasAdd, int idTreino){
        int contador = 0;
        for(String dia : diasAdd){
            if(addExerciciosPorDiaSemana(map, idTreino, dia)){
                contador++;
            }
        }
        return contador == diasAdd.size();
    }
    
    public boolean addExerciciosPorDiaSemana(Map<String, List<Exercicio>> map, int idTreino, String dia){
        boolean resultado = false;
        int contador = 0;
        if(!map.get(dia).isEmpty()){
            for(Exercicio e : map.get(dia)){
                if(Main.controllerManager.getApplicationModel().getTreinoDAO().insertTreinoHasExercicioSql(idTreino, e.getId(), dia)){
                    contador++;
                }
            }
            if(map.get(dia).size() == contador){
                resultado = true;
            }
        }
        return resultado;
    }
    
    public List<Exercicio> retornaExerciciosSelecionados(boolean [] vetorCheckBox, List<Exercicio> lista){
        List<Exercicio> selecionados = new ArrayList<>();
        
        for(int i=0; i<20; i++){
            if(vetorCheckBox[i]){
                selecionados.add(lista.get(i));
            }
        }
        
        return selecionados;
    }
    
    public Treino retornaTreinoPeloNome(String nome, List<Treino> listaTreinos){
        for(Treino t : listaTreinos){
            if(t.getNome().equals(nome)){
                return t;
            }
        }
        return null;
    }
    
    public boolean removerTreino(int idTreino){
       return Main.controllerManager.getApplicationModel().getTreinoDAO().deleteTreinoSql(idTreino);
    }
    
    public boolean validaDescricao(String descricao){
        return !descricao.isBlank();
    }
    
    public boolean validaExercicios(List<String> diasAdd){
        return !diasAdd.isEmpty();
    }
    
    
    
    
}
