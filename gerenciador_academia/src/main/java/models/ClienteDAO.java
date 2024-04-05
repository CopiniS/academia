
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteDAO{
    Banco banco = new Banco();
    String idEndereco;
    
    public void criaNovoCliente(String nome, String cpf, Date dataNascimento, String idPlano, String idTreino){
        
        if(insertClienteSql(nome, cpf, dataNascimento, idPlano, idTreino)){
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");
        }
    }
    
    public void criaNovoEnderecoCliente(String cep, String rua, String bairro, String numero){
        insertEnderecoClienteSql(cep, rua, bairro, numero);
    }
    
    public List mostraClientes(){
        Connection conexao = this.banco.getConexao();
        List<Cliente> lista = new ArrayList();
        
        String sql = "SELECT * FROM cliente";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            Cliente objeto;
            while(resultados.next()){
                int idCliente = Integer.parseInt(resultados.getString("idCliente"));
                String nomeCliente = resultados.getString("nome");
                String cpfCliente = resultados.getString("cpf");
                objeto = new Cliente();
                objeto.setNome(nomeCliente);
                objeto.setCpf(cpfCliente);
                objeto.setId(idCliente);
                lista.add(objeto);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    }
    
    public void alteraCliente(Cliente cliente, String cep, String rua, String bairro, String numero){
        if(updateClienteSql(cliente.getId(), cep, rua, bairro, numero)){
            System.out.println("Registro de "+cliente.getNome()+ " atulizado com sucesso");
        }
        else{
            System.out.println("Ocorreu um erro na atualização dos dados");
        }
    }
    
    public void adicionaPlano(Cliente cliente, Plano plano){
        if(updateClienteIdPlano(cliente.getId(), plano.getId())){
        System.out.println("Plano de "+cliente.getNome()+ " adicionado com sucesso");
        }
    }
    
    public void adicionaTreino(Cliente cliente, Treino treino){
        if(updateClienteIdTreino(cliente.getId(), treino.getId())){
            System.out.println("Treino de "+cliente.getNome()+ " adicionado com sucesso");
        }
    }
    
    public void removeTreino(Cliente cliente){
        if(deleteClienteIdTreino(cliente.getId())){
            System.out.println("Treino removido com sucesso");
        }
        else{
            System.out.println("Treino não pode ser removido");
        }
    }
        
    public void deletaCliente(Cliente cliente){
        if(deletaClienteSql(cliente.getId())){
            System.out.println("Cliente excluido com sucesso");
        }
        else{
            System.out.println("O cliente requisitado, não foi encontrado no banco de dados");
        }
    }
    
    public boolean insertClienteSql(String nome, String cpf, Date dataNascimento, String idPlano, String idTreino){
        boolean resultado = false;
        Connection conexao = this.banco.getConexao();
        
            String sql = "INSERT INTO cliente(nome, cpf, dataNascimento, idEndereco, idPlano, idTreino) VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement consulta;
            
            try {
                consulta = conexao.prepareStatement(sql);
                consulta.setString(1, nome);
                consulta.setString(2, cpf);
                consulta.setDate(3, dataNascimento);
                consulta.setObject(4, this.idEndereco);
                consulta.setObject(5, idPlano);
                consulta.setObject(6, idTreino);
                consulta.execute();
                resultado = true;
                this.idEndereco = null;

            } catch (SQLException ex) {
                System.out.println("Erro ao cadastrar cliente: " + ex.getMessage());
                resultado = false;
            }
            return resultado;
    }
    
    public boolean insertEnderecoClienteSql(String cep, String rua, String bairro, String numero){
        boolean resultado = false;
        
        Connection conexao = this.banco.getConexao();
        String sql = "INSERT INTO enderecoCliente(cep, rua, bairro, numero) VALUES(?, ?, ?, ?)";
        PreparedStatement consulta;
        
        try {
            consulta = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, cep);
            consulta.setString(2, rua);
            consulta.setString(3, bairro);
            consulta.setString(4, numero);
            consulta.execute();
            ResultSet key = consulta.getGeneratedKeys();
            if (key.next()) { // Mova o cursor para a primeira linha do ResultSet
                this.idEndereco = key.getString(1);
                resultado = true;
            } 
            else {
                System.out.println("Nenhuma chave gerada após a execução da consulta.");
                resultado = false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar cliente: " + ex.getMessage());
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean updateClienteSql(int idCliente, String cep, String rua, String bairro, String numero){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE enderecoCliente SET cep = ?, rua = ?, bairro = ?, numero = ? WHERE idEnderecoCliente= (SELECT idEndereco FROM cliente WHERE idCliente = ?)";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, cep);
            consulta.setString(2, rua);
            consulta.setString(3, bairro);
            consulta.setString(4, numero);
            consulta.setInt(5, idCliente);
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel fazer a atualização dos dados" + ex.getMessage());
        }
        return atualizado;
    }
    
    public boolean updateClienteIdPlano(int idCliente, int idPlano){
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
    
    public boolean updateClienteIdTreino(int idCliente, int idTreino){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE Cliente SET idTreino = ? WHERE idCliente = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idTreino);
            consulta.setInt(2, idCliente);
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel adicionar o treino ao cliente" + ex.getMessage());
        }
        return atualizado;
    }
    
    public boolean deleteClienteIdTreino(int idCliente){
        Connection conexao = this.banco.getConexao();
        String sql = "UPDATE Cliente SET idTreino = ? WHERE idCliente = ?";
        PreparedStatement consulta;
        boolean atualizado = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, null);
            consulta.setInt(2, idCliente);
 
            
            int linhasAtualizadas = consulta.executeUpdate();
            if(linhasAtualizadas > 0) atualizado = true;
        } catch (SQLException ex) {
            atualizado = false;
            System.out.println("Não foi possivel remover o treino do cliente" + ex.getMessage());
        }
        return atualizado;
    }
    
    public boolean deletaClienteSql(int idCliente){
        Connection conexao = this.banco.getConexao();
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        PreparedStatement consulta;
        boolean excluido = false;
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, idCliente);
 
            
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
        
        String sql = "SELECT cpf FROM cliente";
        ResultSet resultados;
        
        try {
            resultados = conexao.createStatement().executeQuery(sql);
            
            while(resultados.next()){
                String cpfCliente = resultados.getString("cpf");

                lista.add(cpfCliente);
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return lista;
    }
    
    public Cliente retornaClientePeloCpf(String cpf) throws ParseException{
        Connection conexao = this.banco.getConexao();
        
        String sql = "SELECT c.nome, c.dataNascimento, e.rua, e.cep, e.bairro, e.numero p.nome FROM cliente as c LEFT JOIN enderecoCliente ON e.idEnderecoCliente = c.idendereco "
                + "LEFT JOIN plano as p ON p.idPlano = c.idPlano LEFT JOIN treino as t ON t.idTreino = c.idTreino WHERE c.cpf = ?";
        ResultSet resultados;
        Cliente objeto = new Cliente();
        String dataNascimento = "";
        try {
            resultados = conexao.createStatement().executeQuery(sql);
        
            while(resultados.next()){
                int idCliente = Integer.parseInt(resultados.getString("idCliente"));
                String nomeCliente = resultados.getString("nome");
                String cpfCliente = resultados.getString("cpf");
                dataNascimento = resultados.getString("dataNascimento");
                String cep = resultados.getString("cep");
                String rua = resultados.getString("rua");
                String bairro = resultados.getString("bairro");
                String numero = resultados.getString("numero");
                
            }
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date utilDate = formato.parse(dataNascimento);
        Date data = new Date(utilDate.getTime());
        }
        catch (SQLException ex) {
            System.out.println("Erro na consulta ao Banco de dados" + ex.getMessage());
        }
        return objeto;
    }
        
}
