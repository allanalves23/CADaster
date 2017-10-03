/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author allan
 */
public class LoginDao {
    
    
     public boolean login(String login, String senha){
        //metodo para verificar registro ao login do sistema
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario WHERE login = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            //Se o dado existir, irá prosseguir para o proximo registro.
            if(rs.next()){
                
                    ConnectionFactory.encerrarConexao(conn, pstm, rs);
                    return true; 
                
            }
            
        } catch (SQLException ex) {
            return false;
        }
      return false; 
    }
}
