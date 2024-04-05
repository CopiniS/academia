
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InstrutorDAO {
    Banco banco = new Banco();
    
    public void criaInstrutor(String nome, String cpf, String idModalidade){
        if(insertInstrutor(nome, cpf, idModalidade)){
            System.out.println("Dados cadastrados com sucesso");
        }
    }
    
    public void mostraInstrutores(){
        List<Instrutor> lista = selectInstrutor();
        for(Instrutor instrutor : lista){
            System.out.println(instrutor.toString());
        }
    }
    
    public void AlteraModalidade(Instrutor instrutor, Modalidade modalidade){
        if(updateInstrutorIdModalidade(instrutor.getId(), modalidade.getId())){
            System.out.println("Modalidade de "+instrutor.getNome()+ " alterada com sucesso");
        }
        else{
            System.out.println("Os dados não foram atualizados");
        }
    }
        
    public void adicionaModalidade(Instrutor instrutor, Modalidade modalidade){
        if(insertInstrutorIdModalidade(instrutor.getId(), modalidade.getId())){
            System.out.println("Modalidade de "+instrutor.getNome()+ " adicionada com sucesso");
        }
    }
        
    public void deletaInstrutor(Instrutor instrutor){
        if(deleteInstrutorSql(instrutor.getId())){
            System.out.println("Instrutor excluido com sucesso");
        }
        else{
            System.out.println("O Instrutor requisitado, não foi encontrado no banco de dados");
        }
    }
    
    public boolean insertInstrutor(String nome, String cpf, String idModalidade){
        boolean resultado = false;
        String idInstrutor = "";
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO instrutor(nome, cpf) VALUES(?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, nome);
            consulta.setString(2, cpf);
            consulta.execute();
            resultado = true;
            
            ResultSet key = consulta.getGeneratedKeys();
            if (key.next()) { // Mova o cursor para a primeira linha do ResultSet
                idInstrutor = key.getString(1);
                resultado = true;
            } 
            else {
                System.out.println("Nenhuma chave gerada após a execução da consulta.");
                resultado = false;
            }
            
            if(!idModalidade.isBlank()){
                insertInstrutorIdModalidade(Integer.parseInt(idInstrutor), Integer.parseInt(idModalidade));
            }
            

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar instrutor: " + ex.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    
    
    public List selectInstrutor(){
        Connection conexao = this.banco.getConexao();
        List<Instrutor> lista = new ArrayList();
        
        String sql = "SELECT * FROM instrutor";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            Instrutor objeto;
            while(resultados.next()){
                int idInstrutor = Integer.parseInt(resultados.getString("idInstrutor"));
                String nomeInstrutor = resultados.getString("nome");
                String cpfInstrutor = resultados.getString("cpf");
                objeto = new Instrutor(nomeInstrutor, cpfInstrutor);
                objeto.setId(idInstrutor);
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    }
    
    public boolean insertInstrutorIdModalidade(int idInstrutor, int idModalidade){
        boolean resultado = false;
        
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO modalidade_has_instrutor(idModalidade, idInstrutor) VALUES(?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idModalidade);
            consulta.setInt(2, idInstrutor);

            consulta.execute();
            resultado = true;

        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar modalidade: " + ex.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean updateInstrutorIdModalidade(int idInstrutor, int idModalidade){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE modalidade_has_instrutor SET idModalidade = ? WHERE idInstrutor= ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idModalidade);
            consulta.setInt(2, idInstrutor);
            
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel alterar a modalidade do instrutor" + ex.getMessage());
        }
        return atualizado;
    }
    
    public boolean deleteInstrutorSql(int idInstrutor){
        Connection conexao = this.banco.getConexao();
        String sql = "DELETE FROM instrutor WHERE idInstrutor = ?";
        PreparedStatement consulta;
        boolean excluido = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idInstrutor);
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) excluido = true;
        } catch (SQLException ex) {
            excluido = false;
            System.out.println("Não foi possivel remover o treino do cliente" + ex.getMessage());
        }
        return excluido;
    }
    
    public List retonaListaDeCPFS(){
        Connection conexao = this.banco.getConexao();
        List lista = new ArrayList();
        
        String sql = "SELECT cpf FROM instrutor";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
            
            while(resultados.next()){
                String cpfInstrutor = resultados.getString("cpf");

                lista.add(cpfInstrutor);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    }
}
