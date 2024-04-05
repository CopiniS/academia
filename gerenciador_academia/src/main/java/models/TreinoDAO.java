
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TreinoDAO {
    Banco banco = new Banco();
    
    public void criaTreino(String nome, String descricao){
        if(insertTreinoSql(nome, descricao)){
            System.out.println("Os dados do Treino foram cadastrados com sucesso");
        }
        else{
            System.out.println("Ocorreu algum erro na adição dos exercicios");
        }
    }
    
    public void AdicionaExercicio(Treino treino, List<Exercicio> listaExercicios, String diaSemana){
        boolean resultado = true;
        
        for(int i=0; i<listaExercicios.size(); i++){
            resultado = insertTreinoHasExercicioSql(treino.getId(), listaExercicios.get(i).getId(), diaSemana);
        }
        
        if(resultado){
            System.out.println("Os exercicios foram cadastrados no treino");
        }
    }
    
    public void alteraTreino(Treino treino, String nome, String descricao){
        if(updateTreinoSql(treino.getId(), nome, descricao)){
            System.out.println("Dados do treino atualizados com sucesso");
        }
    }
    
    public void alteraExercicio(Treino treino, List<Exercicio> listaNovosExercicios, List<Exercicio> listaExerciciosRetirados, String diaSemana){
        boolean resultado = true;
        
        for(int i=0; i<listaNovosExercicios.size(); i++){
            if(!(updateTreinoHasExercicioSql(treino.getId(), listaNovosExercicios.get(i).getId(), listaExerciciosRetirados.get(i).getId(), diaSemana))){
                resultado = false;
            }
        }
        
        if(resultado){
            System.out.println("Exercicios alterados com sucesso");
        }
    }
    
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
    
    public void deletaTreino(Treino treino){
        if(deleteTreinoSql(treino.getId())){
            System.out.println("Treino removido com sucesso");
        }
        else{
            System.out.println("Ocorreu algum erro na remoção do treino");
        }
    }
    
    

//--------------------------------------------------------------------------------------------------------------------------------------//
    //SQL
    
    
    public boolean insertTreinoSql(String nome, String descricao){
        boolean resultado = false;
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO treino(nome, descricao) VALUES(?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, nome);
            consulta.setString(2, descricao);
            consulta.execute();
            resultado = true;

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar treino: " + ex.getMessage());
            resultado = false;
        }
        
        return resultado;
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
    
    public boolean updateTreinoSql(int idTreino, String nome, String descricao){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE treino SET nome= ?, descricao = ? WHERE idTreino = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, nome);
            consulta.setString(2, descricao);
            consulta.setInt(3, idTreino);
            
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
                int idTreino = Integer.parseInt(resultados.getString("idTreino"));
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
    
    
}

