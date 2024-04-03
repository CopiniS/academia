
package controller;

import models.Instrutor;
import models.Modalidade;

public class ControllerMenuInstrutor {
    
    public void criaInstrutor(String nome, String cpf){
        Instrutor instrutor = new Instrutor(nome, cpf);
    }
    
    public void mostraInstrutores(){
        //chama sql 
    }
    
    public void deletaModalidade(Instrutor instrutor, Modalidade modalidade){
        for(int i=0; i<instrutor.getModalidadesEnsinadas().size(); i++){
            if(instrutor.getModalidadesEnsinadas().get(i).getNome().equals(modalidade.getNome())){
                //CHAMA SQL E DELETA ESSA MODALIDADE DO BANCO
            }
        }
    }
        
    
    public void adicionaModalidade(Instrutor instrutor, String nome, String horarios){
        Modalidade modalidade = new Modalidade(nome, horarios);
        //FAZER UM IF COM A LISTA DOS INSTRUTORES, PARA VER SE JÁ NÃO ESTÁ LÁ O NOVO INSTRUTOR
        modalidade.getInstrutores().add(instrutor);
        instrutor.getModalidadesEnsinadas().add(modalidade);
    }
    
    public void deletaInstrutor(Instrutor instrutor){
        //CHAMAR SQL PARA DELETAR INSTRUTOR DO BANCO
    }
}
