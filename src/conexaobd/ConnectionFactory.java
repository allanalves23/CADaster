package conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
           JOptionPane.showMessageDialog(null, "O banco de dados não foi encontrado, por favor verifique sua integridade e reinicie o sistema", "Erro", 0);
           throw new RuntimeException("Erro ao realizar a conexão com o banco de dados\n ID: "+ex.getMessage());
           
        }
    }
    
    public static Connection criarBanco(){
        
        try {
            String URL2 = "jdbc:mysql://localhost:3306";
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL2, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao realizar a conexao com o banco"+ex.getMessage());
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
     public static void encerrarConexao(Connection conec, PreparedStatement pstm){
       encerrarConexao(conec);
       
       try{
            if(pstm!=null){
            pstm.close();
            }
       }catch(SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
       }
    }
    
     ////Encerrando a conexao e o prepare statement e o resultSet
    public static void encerrarConexao(Connection conec, PreparedStatement pstm, ResultSet result){
        encerrarConexao(conec,pstm);
         try{
             if(result!=null){
                 result.close();
             }
         }catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
         }
    }
    //encerrar conection de query
    public static void encerrarConexao(Connection conec, Statement stm, ResultSet result){
         try{
             if(conec!=null && stm!=null && result!=null){
                 conec.close();
                 stm.close();
                 result.close();
             }
         }catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
         }
    }
    //encerrar conection e o statement
    public static void encerrarConexao(Connection conec, Statement stm){
       encerrarConexao(conec);
       
       try{
            if(stm!=null){
            stm.close();
            }
       }catch(SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null,ex);
       }
    }
}
