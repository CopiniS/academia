
package controller;

import models.Instrutor;
import models.Modalidade;

public class ControllerMenuModalidade {
    public void criaModalidade(String nome, String horarios){
        Modalidade modalidade = new Modalidade(nome, horarios);
        //CHAMA SQL PRA SALVAR A CRIAÇÃO
    }
    
    public void alteraModalidade(Modalidade modalidade, String novoNome, String novosHorarios){
        modalidade.setNome(novoNome);
        modalidade.setHorarios(novosHorarios);
        //CHAMA SQL
    }
    
    public void mostraModalidades(){
        //CHAMA SQL
    }
    
    public void deletaModalidade(Modalidade modalidade){
        //chama sql
    }
    
    public void adicionaInstrutor(Modalidade modalidade, Instrutor instrutor){
        //chama um select da tabela modalidade e verifica se ja existe esse instrutor la
        modalidade.getInstrutores().add(instrutor);
        instrutor.getModalidadesEnsinadas().add(modalidade);
    }
    
    public void deletaInstrutor(Modalidade modalidade, Instrutor instrutor){
        for(int i=0; i<instrutor.getModalidadesEnsinadas().size(); i++){
            if(modalidade.getInstrutores().get(i).getCpf().equals(instrutor.getCpf())){
                //deleta esse instrutor no banco
            }
        }
    }
}
