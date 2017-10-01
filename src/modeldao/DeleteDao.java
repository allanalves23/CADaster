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
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class DeleteDao extends SearchDao {
    @Override
    public boolean procurar(int id, String login){
         try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario WHERE id = ? and login = ?";
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setInt(1, id);
            pstm.setString(2, login);
            ResultSet rs = pstm.executeQuery();
            //Se o dado existir, irá prosseguir para o proximo registro.
            if(rs.next()){
                    String delete = "DELETE FROM usuario where id= ? or login=?";
                try (PreparedStatement pstmD = conn.prepareStatement(delete)) {
                    pstmD.setInt(1, id);
                    pstmD.setString(2, login);
                    pstmD.execute();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro desconhecido "+ex.getMessage());
                    
                }
                    ConnectionFactory.encerrarConexao(conn, pstm, rs);
                    return true; 
                
            }
            
        } catch (SQLException ex) {
            return false;
        }
      return false; //caso login ou senha estiver errado
    } 
}
