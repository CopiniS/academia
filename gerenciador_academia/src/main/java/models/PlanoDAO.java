
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanoDAO {
    Banco banco = new Banco();
    public void criaPlano(String nome, float valor, int tempoAtivacao){
        if(insertPlanoSql(nome, valor, tempoAtivacao)){
            System.out.println("Dados cadastrados com sucesso");
        }
        else{
            System.out.println("Ocorreu um erro no cadastro");
        }
    }
    
    public void alteraPlano(Plano plano, String nome, float valor, int tempoAtivacao){
        if(updatePlanoSql(plano.getId(), nome, valor, tempoAtivacao)){
            System.out.println("Dados atualizados com sucesso");
        }
    }
    
    public void verPlanos(){
        List<Plano> lista = selectPlanoSql();
        for(Plano plano : lista){
            System.out.println(plano.toString());
        }      
    }
    
    public void deletaPlano(Plano plano){
        if(deletePlanoSql(plano.getId())){
            System.out.println("Plano excluido com sucesso");
        }
        else{
            System.out.println("O Plano requisitado, não foi encontrado no banco de dados");
        }      
    }
    
    public void adicionaCliente(Cliente cliente, Plano plano){
        if(updateClienteIdPlano(plano.getId(), cliente.getId())){
        System.out.println("Plano de "+cliente.getNome()+ " adicionado com sucesso");
        }        
    }
    
    public void removeCliente(Cliente cliente, Plano plano){
        if(updateDeleteClienteIdPlano(plano.getId(), cliente.getId())){
        System.out.println("Plano de "+cliente.getNome()+ " removido com sucesso");
        }         
    }
    
    
    
    //-------------------------------------------------------------------------------------------------------------------------//
    //SQL
    
    
    public boolean insertPlanoSql(String nome, float valor, int tempoAtivacao){
        boolean resultado = false;
        
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO plano(nome, valor, tempoAtivacao) VALUES(?, ?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, nome);
            consulta.setFloat(2, valor);
            consulta.setInt(3, tempoAtivacao);
            consulta.execute();
            resultado = true;

        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar plano: " + ex.getMessage());
            resultado = false;
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
