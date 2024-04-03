
package controller;

import models.Exercicio;

public class ControllerMenuExercicio {
    
    public void criaExercicio(String nome, String musculaturaAfetada){
        Exercicio exercicio = new Exercicio(nome, musculaturaAfetada);
    }
    
    public void mostraExercicios(){
        //chamar sql
    }
    
    public void alteraExercicio(Exercicio exercicio, String novoNome, String novaMusculaturaAfetada){
        exercicio.setNome(novoNome);
        exercicio.setMusculaturaAfetada(novaMusculaturaAfetada);
    }
    
    public void deletaExercicio(Exercicio exercicio){
        //CHAMAR SQL PARA DELETAR
    }
}
