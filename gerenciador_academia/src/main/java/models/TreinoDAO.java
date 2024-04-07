
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreinoDAO {
    Banco banco = new Banco();


    
        
    
    public void mostraListaTreinos(){
        List<Treino> lista = selectTreinos();
        for(Treino treino : lista){
            System.out.println(treino.toString());
        }        
    }
    
    public void mostraTreinoCompleto(Treino treino){
        List<Treino> lista = selectTreinoComExercicios(treino.getId());
        for(Treino t : lista){
            System.out.println(t.toString());
        } 
    }

//--------------------------------------------------------------------------------------------------------------------------------------//
    //SQL
    
    
    public int insertTreinoSql(String nome, String descricao){
        int idTreino = -1;
        boolean resultado = false;
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO treino(nome, descricao) VALUES(?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, nome);
            consulta.setString(2, descricao);
            consulta.execute();
            ResultSet key = consulta.getGeneratedKeys();
            if (key.next()) { // Mova o cursor para a primeira linha do ResultSet
                idTreino = key.getInt(1);
            } 
            else {
                System.out.println("Nenhuma chave gerada após a execução da consulta.");
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar treino: " + ex.getMessage());
            resultado = false;
        }
        
        return idTreino;
    }
    
    public boolean insertTreinoHasExercicioSql(int idTreino, int idExercicio, String diaSemana){
        boolean resultado = false;
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO treino_has_exercicio(idTreino, idExercicio, diaSemana) VALUES(?, ?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idTreino);
            consulta.setInt(2, idExercicio);
            consulta.setString(3, diaSemana);
            consulta.execute();
            resultado = true;

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar cliente: " + ex.getMessage());
            resultado = false;
        }
        return resultado;
    }
    
    public boolean updateTreinoSql(int idTreino, String descricao){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE treino SET descricao = ? WHERE idTreino = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, descricao);
            consulta.setInt(2, idTreino);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel fazer a atualização dos dados" + ex.getMessage());
        }
        return atualizado; 
    }
    
    public boolean updateTreinoHasExercicioSql(int idTreino, int idExercicioNovo, int idExercicioRetirado, String diaSemana){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE treino_has_exercicio SET idExercicio = ? WHERE idTreino = ? AND diaSemana = ? AND idExercicio = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idExercicioNovo);
            consulta.setInt(2, idTreino);
            consulta.setString(3, diaSemana);
            consulta.setInt(4, idExercicioRetirado);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel fazer a atualização dos dados" + ex.getMessage());
        }
        return atualizado; 
    }
    
    public boolean deleteTreinoSql(int idTreino){
        Connection conexao = this.banco.getConexao();
        String sql = "DELETE FROM treino WHERE idTreino = ?";
        PreparedStatement consulta;
        boolean excluido = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idTreino);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) excluido = true;
            
        } catch (SQLException ex) {
            excluido = false;
            System.out.println("Não foi possivel remover o treino" + ex.getMessage());
        }
        return excluido;
    }
    
    public List selectTreinos(){
        Connection conexao = this.banco.getConexao();
        List<Treino> lista = new ArrayList();
        
        String sql = "SELECT * FROM treino";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            Treino objeto;
            while(resultados.next()){
                int idTreino = resultados.getInt("idTreino");
                String nomeTreino = resultados.getString("nome");
                String descricaoTreino = resultados.getString("descricao");
                objeto = new Treino();
                objeto.setNome(nomeTreino);
                objeto.setDescricao(descricaoTreino);
                objeto.setId(idTreino);
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    }
    
    public List selectTreinoComExercicios(int idTreino){
                Connection conexao = this.banco.getConexao();
        List<Treino> lista = new ArrayList();
        
        String sql = "SELECT treino.nome, treino.descricao, the.diaSemana, exercicio.nome, exercicio.musculaturaAfetada FROM treino LEFT JOIN treino_has_exercicio as the "
                + "WHERE treino.idTreino = the.idTreino LEFT JOIN exercicio WHERE the.idExercicio = exercicio.idExercicio";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            Treino objeto;
            while(resultados.next()){
                String nomeTreino = resultados.getString("treino.nome");
                String descricaoTreino = resultados.getString("treino.descricao");
                String diaSemana = resultados.getString("the.diaSemana");
                String nomeExercicio = resultados.getString("exercicio.nome");
                String musculaturaExercicio = resultados.getString("exercicio.musculaturaAfetada");
                objeto = new Treino();
                objeto.setNome(nomeTreino);
                objeto.setDescricao(descricaoTreino);
                objeto.setDiaSemana(diaSemana);
                objeto.setExercicio(new Exercicio());
                objeto.getExercicio().setNome(nomeExercicio);
                objeto.getExercicio().setMusculaturaAfetada(musculaturaExercicio);
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    }
    
    public List<Exercicio> selectTreinoHasExercicioSql(int idTreino){
        Connection conexao = this.banco.getConexao();
        List<Exercicio> lista = new ArrayList();
        PreparedStatement consulta = null;
        
        String sql = "SELECT t.idExercicio, e.nome, e.musculaturaAfetada FROM treino_has_exercicio as t JOIN exercicio as e ON t.idExercicio = e.idExercicio WHERE t.idTreino = ?";
        ResultSet resultados;
        
        try {
        consulta = conexao.prepareStatement(sql);
        consulta.setInt(1, idTreino);
        resultados = consulta.executeQuery();
        
            Exercicio objeto = new Exercicio();
            while(resultados.next()){
                int idExercicio = resultados.getInt("t.idExercicio");
                String nomeExercicio = resultados.getString("e.nome");
                String musculatura = resultados.getString("e.musculaturaAfetada");

                objeto.setId(idExercicio);
                objeto.setNome(nomeExercicio);
                objeto.setMusculaturaAfetada(musculatura);
                
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;        
    }
    
    public boolean deleteTreinoHasExercicioSql(int idTreino){
        Connection conexao = this.banco.getConexao();
        String sql = "DELETE FROM treino_has_exercicio WHERE idTreino = ?";
        PreparedStatement consulta;
        boolean excluido = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idTreino);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) excluido = true;
            
        } catch (SQLException ex) {
            excluido = false;
            System.out.println("Não foi possivel remover o treino" + ex.getMessage());
        }
        return excluido;
    }
    
    
}

