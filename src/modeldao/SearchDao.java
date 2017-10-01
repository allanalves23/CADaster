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
public class SearchDao {

    public SearchDao() {
        
    }
    public boolean procurar(int id, String login){
        //metodo ao verificar registro para deletar registro do sistema
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM usuario WHERE id = ? and login = ?";
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setInt(1, id);
            pstm.setString(2, login);
            ResultSet rs = pstm.executeQuery();
            //Se o dado existir, irá prosseguir para o proximo registro.
            if(rs.next()){
                
                    ConnectionFactory.encerrarConexao(conn, pstm, rs);
                    return true; 
                
            }
            
        } catch (SQLException ex) {
            return false;
        }
      return false; //caso login ou senha estiver errado
    } 
    
    
    
    //Busca de usuarios no banco de dados
    public boolean procurar(String login, String senha){
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
                if(rs.getString("login").equals(login) && rs.getString("senha").equals(senha)){
                    ConnectionFactory.encerrarConexao(conn, pstm, rs);
                    return true; //caso o login E senha estiverem corretos
                }
            }
            
        } catch (SQLException ex) {
            return false;
        }
      return false; //caso login ou senha estiver errado
    }
}