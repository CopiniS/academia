
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InstrutorDAO {
    Banco banco = new Banco();
    

    
    public void mostraInstrutores(){
        List<Instrutor> lista = selectInstrutor();
        for(Instrutor instrutor : lista){
            System.out.println(instrutor.toString());
        }
    }
    
    public int insertInstrutor(String nome, String cpf){
        
        int idInstrutor = -1;
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO instrutor(nome, cpf) VALUES(?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, nome);
            consulta.setString(2, cpf);
            consulta.execute();
            
            ResultSet key = consulta.getGeneratedKeys();
            if (key.next()) { // Mova o cursor para a primeira linha do ResultSet
                idInstrutor = key.getInt(1);
            } 
            else {
                System.out.println("Nenhuma chave gerada após a execução da consulta.");
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar instrutor: " + ex.getMessage());
        }
        
        return idInstrutor;
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
                objeto = new Instrutor();
                objeto.setNome(nomeInstrutor);
                objeto.setCpf(cpfInstrutor);
                objeto.setId(idInstrutor);
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
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
    
    public boolean insertInstrutorHasModalidade(int idInstrutor, List<Modalidade> listaModalidadesSelecionadas){
        boolean resultado = false;
        Connection conexao = this.banco.getConexao();
        for(Modalidade m : listaModalidadesSelecionadas){
            String sql = "INSERT INTO modalidade_has_instrutor(idModalidade, idInstrutor) VALUES(?, ?)";
            PreparedStatement consulta;

            try {
                consulta = conexao.prepareStatement(sql);
                consulta.setInt(1, m.getId());
                consulta.setFloat(2, idInstrutor);
                consulta.execute();
                resultado = true;

            } catch (SQLException ex) {
                System.out.println("Erro ao cadastrar plano: " + ex.getMessage());
                resultado = false;
            }
        }
        return resultado;
    }
    
    public boolean deleteInstrutorHasModalidade(int idInstrutor, List<Modalidade> listaModalidadesAntigas){
        boolean excluido = false;
        Connection conexao = this.banco.getConexao();
        
        for(int i=0; i<listaModalidadesAntigas.size(); i++){
            String sql = "DELETE FROM modalidade_has_instrutor WHERE idInstrutor = ? AND idModalidade = ?";
            PreparedStatement consulta;


            try {
                consulta = conexao.prepareStatement(sql);
                consulta.setInt(1, idInstrutor);
                consulta.setInt(2, listaModalidadesAntigas.get(i).getId());

                int linhasAtualizadas = consulta.executeUpdate();
                if(linhasAtualizadas > 0) excluido = true;

            } catch (SQLException ex) {
                excluido = false;
                System.out.println("Não foi possivel excluir o plano" + ex.getMessage());
            }
        }
        return excluido;     
    }
    
    public List retornaListaDeModalidadesDoInstrutor(int idInstrutor) throws SQLException{
        Connection conexao = this.banco.getConexao();
        List<Modalidade> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        ResultSet resultados;
        String sql = "SELECT m.nome, m.idModalidade FROM instrutor AS i JOIN modalidade_has_instrutor AS mhp ON i.idInstrutor = mhp.idInstrutor JOIN modalidade AS m ON m.idModalidade = mhp.idModalidade WHERE i.idInstrutor = ?";
        
        consulta = conexao.prepareStatement(sql);
        consulta.setInt(1, idInstrutor);
        resultados = consulta.executeQuery();
        
        
        try {
        
            Modalidade objeto;
            while(resultados.next()){
                String nomeModalidade = resultados.getString("m.nome");
                int idModalidade = resultados.getInt("m.idModalidade");
                
                objeto = new Modalidade();
                objeto.setNome(nomeModalidade);
                objeto.setId(idModalidade);
                
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        
        return lista;
    }
}
