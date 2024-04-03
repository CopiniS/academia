
package models;

import java.time.LocalDate;

public class Cliente {
    //teste commit
    //teste vinao
    //teste copini
    private int id;
    private String nome;
    private String cpf;
    private String cep;
    private String rua;
    private String bairro;
    private String numero;
    private Plano plano;
    private LocalDate dataInicioPlano;
    private Treino treino;

    public Cliente(String nome, String cpf, String cep, String rua, String bairro, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public LocalDate getDataInicioPlano() {
        return dataInicioPlano;
    }

    public void setDataInicioPlano(LocalDate dataInicioPlano) {
        this.dataInicioPlano = dataInicioPlano;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    @Override
    public String toString() {
        return "Cliente{" +"código= "+ id + ", nome=" + nome + ", cpf=" + cpf;
    }   
}
