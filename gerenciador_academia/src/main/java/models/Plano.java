
package models;

public class Plano {
    private int id;
    private String nome;
    private Float valor;
    private int tempoAtivacao;

    public Plano(String nome, Float valor, int tempoAtivacao) {
        this.nome = nome;
        this.valor = valor;
        this.tempoAtivacao = tempoAtivacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getTempoAtivacao() {
        return tempoAtivacao;
    }

    public void setTempoAtivacao(int tempoAtivacao) {
        this.tempoAtivacao = tempoAtivacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
