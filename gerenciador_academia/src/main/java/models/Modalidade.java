
package models;

import java.util.ArrayList;

public class Modalidade {
    private int id;
    private String nome;
    private String horarios;
    private ArrayList<Instrutor> instrutores;

    public Modalidade(String nome, String horarios) {
        this.nome = nome;
        this.horarios = horarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public ArrayList<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(ArrayList<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Modalidade{" + "id=" + id + ", nome=" + nome + ", horarios=" + horarios + ", instrutores=" + instrutores + '}';
    }
    
    
}
