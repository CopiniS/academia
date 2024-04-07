
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Exercicio;

public class TreinoAdicionarController {

    public TreinoAdicionarController() {
    }
    
    public List<Exercicio> retornaListaExerciciosCompleta(){
        return Main.controllerManager.getApplicationModel().getExercicioDAO().selectExerciciosSql();
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
    
    public boolean validaCheckBox(boolean [] vetorCheckBox){
        boolean resultado = false;
        
        for(int i=0; i<20; i++){
            if(vetorCheckBox[i] == true){
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
    
    public boolean validaNomeEdescricao(String nome, String descricao){
        return !nome.isBlank() && !descricao.isBlank();
    }
    
    public boolean validaExercicios(List<String> diasAdd){
        return !diasAdd.isEmpty();
    }
    
    public boolean btAddtreino(Map<String, List<Exercicio>> map, String nome, String descricao, List<String> diasAdd){
        boolean resultado = false;
        
        int idTreino = Main.controllerManager.getApplicationModel().getTreinoDAO().insertTreinoSql(nome, descricao);
        
        if(addExercicios(map, diasAdd, idTreino)){
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

    
    
}
