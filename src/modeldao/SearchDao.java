package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelbean.UserBean;

/**
 *
 * @author allan
 */
public class SearchDao {

    public SearchDao() {
        
    }
    
    //busca exclusao usuario
    public List<UserBean> procurar(){
        //metodo para listar usuarios no jtable
        List<UserBean> listUsers = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            
            
            
            //Se o dado existir, irá prosseguir para o proximo registro.
            while(rs.next()){
                    UserBean usuario = new UserBean();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("login"));
                    usuario.setPermissao(rs.getString("permissao"));
                    
                    listUsers.add(usuario);
                
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
      return listUsers; //retorno do array dos registros
    } 
    //Metodo de procurar usuario pelo ID
    public List<UserBean> procurar(int ID){
        List<UserBean> listUsers = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario WHERE id = ?";
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setInt(1, ID);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                UserBean usuario = new UserBean();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("login"));
                usuario.setPermissao(rs.getString("permissao"));
                
                listUsers.add(usuario);
            }
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
        
        
        return listUsers;
    }
    //Metodo de procurar usuario pelo LOGIN
    public List<UserBean> procurar(String login){
        List<UserBean> listUsers = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario WHERE login = ?";
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1, login);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                UserBean usuario = new UserBean();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("login"));
                usuario.setPermissao(rs.getString("permissao"));
                
                listUsers.add(usuario);
            }
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
        
        
        return listUsers;
    }
}