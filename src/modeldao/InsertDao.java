package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelbean.UserBean;

/**
 *
 * @author allan
 */
public class InsertDao {
    
   //Criar um registro de usuarios no banco de dados 
    public void criarUser(UserBean cad){
        Connection conn = ConnectionFactory.conexao();
        String SQL = "INSERT INTO usuario (login,senha,permissao)VALUES(?,?,?)";
        try {
            PreparedStatement pstm= conn.prepareStatement(SQL); 
            pstm.setString(1,cad.getNome());
            pstm.setString(2,cad.getSenha());
            pstm.setString(3,cad.getPermissao());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            ConnectionFactory.encerrarConexao(conn, pstm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro no Banco\n ID: "+ex.getMessage());
        }
    }
}   
