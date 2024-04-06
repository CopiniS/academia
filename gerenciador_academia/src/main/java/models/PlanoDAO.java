
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanoDAO {
    Banco banco = new Banco();


    public void verPlanos(){
        List<Plano> lista = selectPlanoSql();
        for(Plano plano : lista){
            System.out.println(plano.toString());
        }      
    }
    //-------------------------------------------------------------------------------------------------------------------------//
    //SQL
    
    
    public int insertPlanoSql(Plano plano){
        int idPlano = -1;
        
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO plano(nome, valor, tempoAtivacao) VALUES(?, ?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, plano.getNome());
            consulta.setFloat(2, plano.getValor());
            consulta.setInt(3, plano.getTempoAtivacao());
            consulta.execute();
            ResultSet key = consulta.getGeneratedKeys();
            if (key.next()) { // Mova o cursor para a primeira linha do ResultSet
                idPlano = key.getInt(1);
                
            } 
            else {
                System.out.println("Nenhuma chave gerada após a execução da consulta.");
                
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar plano: " + ex.getMessage());
            
        }
        return idPlano;
    }
    
    public boolean insertPlanoHasModalidade(int idPlano, List<Modalidade> listaModalidadesSelecionadas){
        boolean resultado = false;
        Connection conexao = this.banco.getConexao();
        for(Modalidade m : listaModalidadesSelecionadas){
            String sql = "INSERT INTO plano_has_modalidade(idPlano, idModalidade) VALUES(?, ?)";
            PreparedStatement consulta;

            try {
                consulta = conexao.prepareStatement(sql);
                consulta.setInt(1, idPlano);
                consulta.setFloat(2, m.getId());
                consulta.execute();
                resultado = true;

            } catch (SQLException ex) {
                System.out.println("Erro ao cadastrar plano: " + ex.getMessage());
                resultado = false;
            }
        }
        return resultado;
    }
    
    public boolean updatePlanoSql(int idPlano, String nome, float valor, int tempoAtivacao){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE plano SET nome= ?, valor = ?, tempoAtivacao = ? WHERE idPlano= ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, nome);
            consulta.setFloat(2, valor);
            consulta.setInt(3, tempoAtivacao);
            consulta.setInt(4, idPlano);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel fazer a atualização dos dados" + ex.getMessage());
        }
        return atualizado; 
    }
    
    public List selectPlanoSql(){
        Connection conexao = this.banco.getConexao();
        List<Plano> lista = new ArrayList();
        
        String sql = "SELECT * FROM plano";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            Plano objeto;
            while(resultados.next()){
                int idPlano = Integer.parseInt(resultados.getString("idPlano"));
                String nomePlano = resultados.getString("nome");
                float valorPlano = Float.parseFloat(resultados.getString("valor"));
                int tempoAtivacaoPlano = Integer.parseInt(resultados.getString("tempoAtivacao"));
                
                objeto = new Plano();
                objeto.setNome(nomePlano);
                objeto.setValor(valorPlano);
                objeto.setTempoAtivacao(tempoAtivacaoPlano);
                objeto.setId(idPlano);
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    };
    
    public boolean deletePlanoSql(int idPlano){
        Connection conexao = this.banco.getConexao();
        String sql = "DELETE FROM plano WHERE idPlano = ?";
        PreparedStatement consulta;
        boolean excluido = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idPlano);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) excluido = true;
            
        } catch (SQLException ex) {
            excluido = false;
            System.out.println("Não foi possivel excluir o plano" + ex.getMessage());
        }
        return excluido;         
    }
    
    public boolean updateClienteIdPlano(int idPlano, int idCliente){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE Cliente SET idPlano = ?, dataInicioPlano = ? WHERE idCliente = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        LocalDate dataHoje = LocalDate.now();
        
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idPlano);
            consulta.setDate(2, Date.valueOf(dataHoje));
            consulta.setInt(3, idCliente);
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel adicionar o plano ao cliente" + ex.getMessage());
        }
        return atualizado;       
    }
    
    public boolean updateDeleteClienteIdPlano(int idPlano, int idCliente){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE Cliente SET idPlano = ?, dataInicioPlano = ? WHERE idCliente = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, null);
            consulta.setString(2,  null);
            consulta.setInt(3, idCliente);
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel remover o cliente do plano" + ex.getMessage());
        }
        return atualizado;          
    }
    
}
