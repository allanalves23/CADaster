package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelbean.StudentBean;
import modelbean.UserBean;

/**
 *
 * @author allan
 */
public class SearchDao {

    //busca exclusao usuario
    public List<UserBean> procurarUser(){
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
    public List<UserBean> procurarUser(int ID){
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
    public List<UserBean> procurarUser(String login){
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
    
    //procurar Aluno 
    public List<StudentBean> procurarStudent(){
        List<StudentBean> listStudents = new ArrayList<>();
        return listStudents;
    } 
    
    //procurar Aluno pelo nome (para exclusao)
    public List<StudentBean> procurarStudent(String nome){
        List<StudentBean> listStudents = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT matricula,nome,anoPrimario,anoGinasio,anoEM,"
                    + "anoTecnico FROM student where nome like '%"+nome+"%'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            if(rs.next()){
                StudentBean student = new StudentBean();
                student.setMatricula(rs.getString("matricula"));
                student.setNome(rs.getString("nome"));
                if(rs.getString("anoPrimario")!=null){
                    student.setAno(rs.getString("anoPrimario"));
                    student.setGrau("Primario");
                }else if(rs.getString("anoGinasio")!=null){
                    student.setAno(rs.getString("anoGinasio"));
                    student.setGrau("Ginasio");
                }else if(rs.getString("anoEM")!=null){
                    student.setAno(rs.getString("anoEM"));
                    student.setGrau("Ensino Médio");
                }else{
                    student.setAno(rs.getString("anoTecnico"));
                    student.setGrau("Curso Técnico");
                }
                listStudents.add(student);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado\n"
                        + "Verifique o nome digitado");
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os dados do banco - "+ex.getMessage());
        }
            
        return listStudents;
    }
    
    
    
}