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
 * @author allan
 */
public class  ConnectionFactory {
    private static final String DRIVER="com.mysql.jdbc.Driver"; 
    private static final String URL="jdbc:mysql://localhost:3306/school";
    private static final String USER="root";
    private static final String PASS="";
    
    //Gerando pareamento com o driver e a conexao com o banco
    public static Connection conexao(){
        try {
            Class.forName(DRIVER); //Carregando o Driver de conexao
            
            return DriverManager.getConnection(URL, USER, PASS); //Conectando ao banco
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro ao realizar a conexão com o banco de dados\n ID: "+ex.getMessage());
        }
    }
    
    //Encerrando somente a conexão com o banco
    public static void encerrarConexao(Connection conec){
       try{
        if(conec!=null){
            conec.close();
        }
       }catch(SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
       }
    }
    
    //Encerrando a conexao e o prepare statement
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
    
     ////Encerrando a conexao e o prepare statement e o resultSet
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
