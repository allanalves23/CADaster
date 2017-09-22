package modeldao;

import conexaobd.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelbean.UserBean;

/**
 *
 * @author areznla
 */
public class UserDao {
    
    
    public void criar(UserBean cad){
        Connection con = ConectionFactory.conexao();
        PreparedStatement stm= null;
        
        try {
            stm=con.prepareStatement("INSERT INTO usuarios (nome,senha,permissao)VALUES(?,?,?)");
            stm.setString(1,cad.getNome());
            stm.setString(2,cad.getSenha());
            stm.setString(3, cad.getPermissao());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro no Banco\n ID: "+ex);
        }finally{
            ConectionFactory.encerrarConexao(con, stm);
        }
        
    }
}   
