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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allan
 */
public class SearchDao {

    public SearchDao() {
        
    }
    
    public boolean procurar(String login, String senha){
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario WHERE login = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            
            if(rs.next()){
                if(rs.getString("login").equals(login) && rs.getString("senha").equals(senha)){
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            return false;
        }
      return true;
    }
}