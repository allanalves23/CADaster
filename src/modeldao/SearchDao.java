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
    //Busca de usuarios no banco de dados
    public boolean procurar(String login, String senha){
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