
package models;

import DB.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    Banco banco = new Banco();
    public LoginDAO() {
    }
    
    public boolean SelectSenhaDoUsuarioSQL(String usuario, String senha){
        boolean senhaCorreta = false;
        
        Connection conexao = this.banco.getConexao();
        String sql = "SELECT senha FROM login WHERE usuario = ?";
        PreparedStatement consulta;
        ResultSet resultado;
        
        
        try {
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, usuario);
            resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                String senhaBanco = resultado.getString("senha");
                if (senha.equals(senhaBanco)) {
                    senhaCorreta = true;
        }
    }

            
        } catch (SQLException ex) {
            System.out.println("Erro na conexão, tente novamente mais tarde" + ex.getMessage());
        }
        return senhaCorreta;
    }
    
    
}
