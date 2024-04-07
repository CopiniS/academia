
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    private String banco;
    private String url;
    private String porta;
    private String usuario;
    private String senha;
    private String nome;

    public Banco() {
        this.banco = "mysql";
        this.porta = "3306";
        this.usuario = "root";
        this.senha = "123";
        this.nome = "academiadb";
    }
    
    public Connection getConexao(){
        Connection conexao = null;
        try {
            this.url = "jdbc:"+this.banco+"://localhost:"+this.porta+"/"+this.nome;
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Conexão falhou");
        }
        return conexao;
    }
    
    
}

