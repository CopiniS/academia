
package controller;

import java.util.List;
import models.Exercicio;

public class ExercicioAlterarController {

    public ExercicioAlterarController() {
    }
    
    public List retornaListaexercicios(){
        return Main.controllerManager.getApplicationModel().getExercicioDAO().selectExerciciosSql();
    }
    
    public int retornaIdExercicioParaExcluir(List<Exercicio> lista, String nomeSelecionado){
        for(Exercicio e : lista){
            if(e.getNome().equals(nomeSelecionado)){
                return e.getId();
            }
        }
        return 0;
    }
    
    public boolean btDeleteExercicio(int idExercicio){
        return Main.controllerManager.getApplicationModel().getExercicioDAO().delteExercicioSql(idExercicio);
    }
    
}
