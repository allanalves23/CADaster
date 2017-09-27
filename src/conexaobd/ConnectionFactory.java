package conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author areznla
 */
public class  ConnectionFactory {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/school";
    private static final String USER="root";
    private static final String PASS="";
    
    public static Connection conexao(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro ao realizar a conexão com os dados\n ID: ",ex);
        }
    }
    
    public static void encerrarConexao(Connection conec){
       try{
        if(conec!=null){
            conec.close();
        }
       }catch(SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
       }
    }
    
     public static void encerrarConexao(Connection conec, PreparedStatement stm){
       encerrarConexao(conec);
       
       try{
            if(stm!=null){
            stm.close();
            }
       }catch(SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
       }
    }
     
    public static void encerrarConexao(Connection conec, PreparedStatement stm, ResultSet result){
        encerrarConexao(conec,stm);
         try{
             if(result!=null){
                 result.close();
             }
         }catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
         }
    }
}
