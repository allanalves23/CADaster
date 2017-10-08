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
public class DeleteDao {
    
    public boolean deletarUser(int id, String login){
         try {
            Connection conn = ConnectionFactory.conexao();
            String delete = "DELETE FROM usuario where id= ? or login=?";
            PreparedStatement pstm = conn.prepareStatement(delete);
            pstm.setInt(1, id);
            pstm.setString(2, login);
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o registro, verifique a"
                    + " integridade com o banco" +ex.getMessage());
            return false;
        }
      return false; //caso login ou senha estiver errado
    } 
    
    
    public boolean deletarStudent (){
        
        Connection conn = ConnectionFactory.conexao();
        String delete = "DELETE FROM student where ";
        return false;
    }
    
    
}
