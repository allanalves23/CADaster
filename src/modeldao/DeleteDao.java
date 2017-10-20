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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class DeleteDao {
    
    //Deleta usuario do sistema no banco
    public void deletarUser(int id, String login){
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
        }
    } 
    
    //Deleta aluno no banco
    public void deletarStudent (String matricula){
        try {
            Connection conn = ConnectionFactory.conexao();
            String delete = "DELETE FROM student where matricula = ?";
            PreparedStatement pstm = conn.prepareStatement(delete);
            pstm.setString(1, matricula);
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm);
            JOptionPane.showMessageDialog(null, "Usuario removido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o registro, verifique a"
                    + "integridade com o banco");
        }

    }
    
    public void  deletarEmployee(int registro){
        try {
            Connection conn = ConnectionFactory.conexao();
            String delete = "DELETE FROM employee WHERE registro=?";
            PreparedStatement pstm = conn.prepareStatement(delete);
            pstm.setInt(1, registro);
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm);
            JOptionPane.showMessageDialog(null, "Funcionario removido com êxito", "Êxito", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de incosistencia no banco\n"
                    + "Consulta a integridade do banco - MSG : "+ex.getMessage(), "Erro banco de dados", 1);
        }
        
    }
}
