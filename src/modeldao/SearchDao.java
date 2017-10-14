package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
                listUsers.add(usuario);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado", "Aviso", 2);
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
                listUsers.add(usuario);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado", "Aviso", 2);
            }
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
        
        
        return listUsers;
    }
    
    //procurar Aluno para exclusão
    public List<StudentBean> procurarStudent(){
        List<StudentBean> listStudents = new ArrayList<>();
        return listStudents;
    } 
    
    //procurar Aluno pelo nome (para exclusao)
    public List<StudentBean> procurarStudent(String nome){
        int count=0;
        List<StudentBean> listStudents = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT matricula,nome,anoPrimario,anoGinasio,anoEM,"
                    + "anoTecnico FROM student where nome like '%"+nome+"%'";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
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
                    count++;
                }
            if(count==0){
                JOptionPane.showMessageDialog(null, "Nenhum registro foi encontrado, por favor verifique o nome digitado");
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os dados do banco - "+ex.getMessage());
        }
            
        return listStudents;
    }
    
    //procurar por aluno somente pelo nivel do grau (para pesquisa)
    public List<StudentBean> procurarStudent(String grau,String tipo){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL =  "";
        try {
            Connection conn = ConnectionFactory.conexao();
            if(tipo.equals("Todos")){
                SQL = "SELECT * FROM student WHERE "+grau+" IS NOT NULL";
            }else{
                SQL = "";
            }
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                StudentBean student  = new StudentBean();
                student.setMatricula(rs.getString("matricula"));
                student.setNome(rs.getString("nome"));
                student.setCPF(rs.getString("CPF"));
                student.setDataNasc(converterData(rs.getString("dataNascimento")));
                student.setCEP(rs.getString("CEP"));
                student.setEndereco(rs.getString("endereco"));
                student.setBairro(rs.getString("bairro"));
                student.setResponsavel(rs.getString("responsavel"));
                student.setNomeMae(rs.getString("nomeMae"));
                student.setNomePai(rs.getString("nomePai"));
                if(!(rs.getString("anoPrimario") == null)){
                    student.setGrau("Primario");
                    student.setAno(rs.getString("anoPrimario"));
                }
                if(!(rs.getString("anoGinasio") == null)){
                    student.setGrau("Ginasio");
                    student.setAno(rs.getString("anoGinasio"));
                }
                if(!(rs.getString("anoEM") == null)){
                    student.setGrau("Ensino Medio");
                    student.setAno(rs.getString("anoEM"));
                }
                if(!(rs.getString("anoTecnico") == null)){
                    student.setGrau("Tecnico");
                    student.setAno(rs.getString("anoTecnico"));
                }
                listStudents.add(student);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
        return listStudents;
    }
    
    //procurar por aluno pelo nome, CPF ou matricula (para pesquisa)
    public List<StudentBean> procurarStudent(String grau,String tipo, String dado){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL =  "";
        try {
            Connection conn = ConnectionFactory.conexao();
            if(tipo.equals("nome")||tipo.equals("CPF")||tipo.equals("matricula")){
                SQL = "SELECT * FROM student WHERE "+tipo+" LIKE '%"+dado+"%' and "+grau+" IS NOT NULL";
            }else{
                SQL = "";
            }
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                StudentBean student  = new StudentBean();
                student.setMatricula(rs.getString("matricula"));
                student.setNome(rs.getString("nome"));
                student.setCPF(rs.getString("CPF"));
                student.setDataNasc(converterData(rs.getString("dataNascimento")));
                student.setCEP(rs.getString("CEP"));
                student.setEndereco(rs.getString("endereco"));
                student.setBairro(rs.getString("bairro"));
                student.setResponsavel(rs.getString("responsavel"));
                student.setNomeMae(rs.getString("nomeMae"));
                student.setNomePai(rs.getString("nomePai"));
                if(!(rs.getString("anoPrimario") == null)){
                    student.setGrau("Primario");
                    student.setAno(rs.getString("anoPrimario"));
                }
                if(!(rs.getString("anoGinasio") == null)){
                    student.setGrau("Ginasio");
                    student.setAno(rs.getString("anoGinasio"));
                }
                if(!(rs.getString("anoEM") == null)){
                    student.setGrau("Ensino Medio");
                    student.setAno(rs.getString("anoEM"));
                }
                if(!(rs.getString("anoTecnico") == null)){
                    student.setGrau("Tecnico");
                    student.setAno(rs.getString("anoTecnico"));
                }
                listStudents.add(student);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
        return listStudents;
    }
     
    //procurar aluno para Preencher a tabela (para edicao)
     public List<StudentBean> procurarStudent(String nome,String matricula, String grau, String colunaBanco){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL =  "";
        try {
            Connection conn = ConnectionFactory.conexao();
            if(!grau.equals("Selecione")){
                SQL = "SELECT * FROM student WHERE "+colunaBanco+" IS NOT NULL and nome LIKE '%"+nome+"%'";
            }else{
                SQL = "";
            }
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                StudentBean student  = new StudentBean();
                student.setMatricula(rs.getString("matricula"));
                student.setNome(rs.getString("nome"));
                student.setCPF(rs.getString("CPF"));
                student.setDataNasc(converterData(rs.getString("dataNascimento")));
                student.setCEP(rs.getString("CEP"));
                student.setEndereco(rs.getString("endereco"));
                student.setBairro(rs.getString("bairro"));
                student.setResponsavel(rs.getString("responsavel"));
                student.setNomeMae(rs.getString("nomeMae"));
                student.setNomePai(rs.getString("nomePai"));
                if(!(rs.getString("anoPrimario") == null)){
                    student.setGrau("Primario");
                    student.setAno(rs.getString("anoPrimario"));
                }
                if(!(rs.getString("anoGinasio") == null)){
                    student.setGrau("Ginasio");
                    student.setAno(rs.getString("anoGinasio"));
                }
                if(!(rs.getString("anoEM") == null)){
                    student.setGrau("Ensino Medio");
                    student.setAno(rs.getString("anoEM"));
                }
                if(!(rs.getString("anoTecnico") == null)){
                    student.setGrau("Tecnico");
                    student.setAno(rs.getString("anoTecnico"));
                }
                listStudents.add(student);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ler os dados do banco "+ex.getMessage());
        }
        return listStudents;
    }
   
     //procurar aluno para realizar a mudanca
     public boolean verificarMatricula(String matricula){
        boolean status=false;
         try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "SELECT * FROM student WHERE matricula = '"+matricula+"'";
            Statement pstm = conn.createStatement();
            ResultSet rs = pstm.executeQuery(SQL);
            status=rs.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os dados do banco - "+ex.getMessage());
        }
            
        return status;
     }
     private String converterData(String data){//Converte dados do tipo Data para o serem representados no programa
        Date formatarData;
        String dadoData="";
            try {
                formatarData = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                dadoData = new SimpleDateFormat("dd-MM-yyyy").format(formatarData);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao converter a data ID: "+ex.getMessage());
            }   
            return dadoData;
    }
}