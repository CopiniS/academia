
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModalidadeDAO {
    Banco banco = new Banco();
    
    public void alteraModalidade(Modalidade modalidade, String novoNome, String novosHorarios){
        if(updateModalidadeSql(modalidade.getId(), novoNome, novosHorarios)){
            System.out.println("Dados atualizados com sucesso");
        }
    }
    
    public void mostraModalidades(){
        List<Modalidade> lista = selectModalidadeSql();
        for(Modalidade modalidade : lista){
            System.out.println(modalidade.toString());
        }
    }
    
    public void deletaModalidade(Modalidade modalidade){
        if(deleteModalidadeSql(modalidade.getId())){
            System.out.println("Modalidade excluida com sucesso");
        }
        else{
            System.out.println("A Modalidade requisitada, não foi encontrada no banco de dados");
        }
    }
    
    public void adicionaInstrutor(Modalidade modalidade, Instrutor instrutor){
        if(insertInstrutorModalidadeSql(modalidade.getId(), instrutor.getId())){
            System.out.println("Instrutor adicionado com sucesso");
        }
    }
    
    public void alteraInstrutor(Modalidade modalidade, Instrutor instrutor){
        if(updateInstrutorModalidadeSql(modalidade.getId(), instrutor.getId())){
            System.out.println("Instrutor alterado com sucesso");
        }
        else{
            System.out.println("Os dados não foram atualizados");
        }
    }
    
    public void deletaInstrutor(Modalidade modalidade){
        if(deleteInstrutorModalidadeSql(modalidade.getId())){
            System.out.println("Instrutor removido com sucesso");
        }
        else{
            System.out.println("Ocorreu algum erro na remoção do instrutor");
        }
    }
    
    
    //--------------------------------------------------------------------------------------------------------------------//
    
    
    public boolean insertModalidadeSql(Modalidade modalidade){
        boolean resultado = false;
        
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO modalidade(nome) VALUES(?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, modalidade.getNome());
            consulta.execute();
            resultado = true;

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar modalidade: " + ex.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean updateModalidadeSql(int idModalidade, String nome, String horarios){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE modalidade SET nome= ?, horarios = ? WHERE idModalidade = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, nome);
            consulta.setString(2, horarios);
            consulta.setInt(3, idModalidade);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel fazer a atualização dos dados" + ex.getMessage());
        }
        return atualizado; 
    }
    
    public List selectModalidadeSql(){
        Connection conexao = this.banco.getConexao();
        List<Modalidade> lista = new ArrayList();
        
        String sql = "SELECT * FROM modalidade";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            Modalidade objeto;
            while(resultados.next()){
                int idModalidade = Integer.parseInt(resultados.getString("idModalidade"));
                String nomeModalidade = resultados.getString("nome");
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
    
    public boolean deleteModalidadeSql(int idModalidade){
        Connection conexao = this.banco.getConexao();
        String sql = "DELETE FROM modalidade WHERE idModalidade = ?";
        PreparedStatement consulta;
        boolean excluido = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idModalidade);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) excluido = true;
            
        } catch (SQLException ex) {
            excluido = false;
            System.out.println("Não foi possivel remover a modalidade" + ex.getMessage());
        }
        return excluido;
    }
    
    public boolean insertInstrutorModalidadeSql(int idModalidade, int idInstrutor){
        boolean resultado = false;
        
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO modalidade_has_instrutor(idModalidade, idInstrutor) VALUES(?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idInstrutor);
            consulta.setInt(2, idModalidade);

            consulta.execute();
            resultado = true;

        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar o instrutor: " + ex.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean updateInstrutorModalidadeSql(int idModalidade, int idInstrutor){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE modalidade_has_instrutor SET idInstrutor= ? WHERE idModalidade= ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idInstrutor);
            consulta.setInt(2, idModalidade);
            
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel alterar o instrutor na modalidade: " + ex.getMessage());
        }
        return atualizado;
    }
    
    public boolean deleteInstrutorModalidadeSql(int idModalidade){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE modalidade_has_instrutor SET idInstrutor= null WHERE idModalidade= ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(2, idModalidade);
            
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel remover o instrutor: " + ex.getMessage());
        }
        return atualizado;
    }
    
}
