
package controller;

import java.time.LocalDate;
import models.Cliente;
import models.Plano;

public class ControllerMenuPlano {
    
    public void criaPlano(String nome, float valor, int tempoAtivacao){
        Plano plano = new Plano(nome, valor, tempoAtivacao);
        //chama sql
    }
    
    public void alteraPlano(Plano plano, String nome, float valor, int tempoAtivacao){
        plano.setNome(nome);
        plano.setValor(valor);
        plano.setTempoAtivacao(tempoAtivacao);
        //chama sql pra salvar
    }
    
    public void verPlano(){
        //chama sql
    }
    
    public void deletaPlano(Plano plano){
        //chama o sql
    }
    
    public void adicionaCliente(Cliente cliente, Plano plano){
        cliente.setPlano(plano);
        cliente.setDataInicioPlano(LocalDate.now());
    }
    
}
