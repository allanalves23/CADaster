/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class UpdateDao {
    
    public boolean updateUser(String SQL,String login,int id){ //Update somente do login
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(SQL);
            pstm.setString(1, login);
            pstm.setInt(2, id);
            pstm.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        ConnectionFactory.encerrarConexao(conn, pstm);
        return true;
    }
    
    public boolean updateUser(String SQL,String permissao,String id){ //Update somente da permissao
        try {
            int id1 = Integer.parseInt(id);//refatorar essa parte, ID esta em string
            Connection conn = ConnectionFactory.conexao();
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1, permissao);
            pstm.setString(2, id);
            pstm.execute();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
   
    
    
}
