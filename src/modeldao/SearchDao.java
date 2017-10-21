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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelbean.EmployeeBean;
import modelbean.StudentBean;
import modelbean.UserBean;

/**
 *
 * @author allan
 */
public class SearchDao {

    //busca usuario para as tela de edicao e telaPesquisa
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
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return listUsers; //retorno do array dos registros
    } 
    //Para exclusao do usuario
    public List<UserBean> procurarUser(int ID, String login){
        //metodo para listar usuarios no jtable
        List<UserBean> listUsers = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "select * from usuario where id ='"+ID+"'  and login='"+login+"'";
            Statement stm= conn.prepareStatement(SQL);
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
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return listUsers; //retorno do array dos registros
    } 
    
    //Metodo de procurar usuario pelo ID - pesquisa
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
            }
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
        } catch (SQLException ex) {
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listUsers;
    }
    //Metodo de procurar usuario pelo LOGIN - pesquisa
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
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listUsers;
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
                }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return listStudents;
    }
    
    //procurar Aluno pelo nivel de grau(Para exclusao)
    public List<StudentBean> procurarStudent(String grau,String tipo,boolean status){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL =  "SELECT * FROM student WHERE "+tipo+" IS NOT NULL";
        try {
            Connection conn = ConnectionFactory.conexao();
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                StudentBean student  = new StudentBean();
                student.setMatricula(rs.getString("matricula"));
                student.setNome(rs.getString("nome"));
                if(rs.getString("anoPrimario") != null){
                    student.setGrau("Primario");
                    student.setAno(rs.getString("anoPrimario"));
                }
                if(rs.getString("anoGinasio") != null){
                    student.setGrau("Ginasio");
                    student.setAno(rs.getString("anoGinasio"));
                }
                if(rs.getString("anoEM") != null){
                    student.setGrau("Ensino Medio");
                    student.setAno(rs.getString("anoEM"));
                }
                if(rs.getString("anoTecnico") != null){
                    student.setGrau("Tecnico");
                    student.setAno(rs.getString("anoTecnico"));
                }
                listStudents.add(student);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudents;
    }
    
    //procurar por aluno somente pelo nivel do grau (para pesquisa)
    public List<StudentBean> procurarStudent(String grau,String tipo){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL;
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
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudents;
    }
    
    //procurar por aluno pelo nome, CPF ou matricula (para pesquisa)
    public List<StudentBean> procurarStudent(String grau,String tipo, String dado){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL;
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
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudents;
    }
     
    //procurar aluno para Preencher a tabela (para edicao)
     public List<StudentBean> procurarStudent(String nome,String matricula, String grau, String colunaBanco, boolean checkMatricula){
        List<StudentBean> listStudents = new ArrayList<>();
        String SQL;
        try {
            Connection conn = ConnectionFactory.conexao();
            if(!grau.equals("Selecione")){
                if(checkMatricula){
                    SQL = "SELECT * FROM student WHERE "+colunaBanco+" IS NOT NULL and nome LIKE '%"+nome+"%' and matricula = '"+matricula+"'";
                    
                }else{
                    SQL = "SELECT * FROM student WHERE "+colunaBanco+" IS NOT NULL and nome LIKE '%"+nome+"%'";
                }
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
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
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
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return status;
    }
    
    
    //Procurar employee para remoção
    public List<EmployeeBean> procurarEmployee(int registro,String nome){
         List<EmployeeBean> listEmployees = new ArrayList<>();
         String SQL;
         Connection conn = ConnectionFactory.conexao();
         try{
             Statement stm = conn.createStatement();
             SQL = "SELECT * from employee WHERE registro='"+registro+"' and nome LIKE '%"+nome+"%'";
             ResultSet rs = stm.executeQuery(SQL);
             while(rs.next()){
                 EmployeeBean employee = new EmployeeBean();
                 employee.setRegistro(rs.getInt("registro"));
                 employee.setNome(rs.getString("nome"));
                 employee.setSexo(rs.getString("sexo"));
                 employee.setDataNascimento(converterData(rs.getString("dataNascimento")));
                 employee.setCPF(rs.getString("CPF"));
                 employee.setCargo(rs.getString("cargo"));
                 employee.setSalario(rs.getString("salario"));
                 employee.setCEP(rs.getString("CEP"));
                 employee.setEndereco(rs.getString("endereco"));
                 listEmployees.add(employee);
             }
         }catch(SQLException ex){
             Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return listEmployees;
    }
    
    public List<EmployeeBean> procurarEmployee (int registro, String nome, String profissao, boolean nomeActive){
        List<EmployeeBean> listEmployee = new ArrayList<>();
        Connection conn = ConnectionFactory.conexao();
        String SQL;
        if(nomeActive){
            SQL = "SELECT * FROM employee WHERE registro = '"+registro+"' and nome LIKE '%"+nome+"%' and cargo = '"+profissao+"'";
        }else{
            SQL = "SELECT * FROM employee WHERE registro = '"+registro+"' and cargo = '"+profissao+"'";
        }
        try {
            Statement stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                EmployeeBean employee = new EmployeeBean();
                employee.setRegistro(rs.getInt("registro"));
                employee.setNome(rs.getString("nome"));
                employee.setSexo(rs.getString("sexo"));
                employee.setDataNascimento(converterData(rs.getString("dataNascimento")));
                employee.setCPF(rs.getString("CPF"));
                employee.setCargo(rs.getString("cargo"));
                employee.setSalario(rs.getString("salario"));
                employee.setCEP(rs.getString("CEP"));
                employee.setEndereco(rs.getString("endereco"));
                listEmployee.add(employee);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listEmployee;
    }
    
    //Procurar Funcionario somente pelo nivel de profissao
    public List<EmployeeBean> procurarEmployee (int counter){
        List<EmployeeBean> listEmployees = new ArrayList<>();
        String SQL= "";
        Connection conn = ConnectionFactory.conexao();
        switch(counter)
        {
            case 1:
            {
                SQL="SELECT * FROM employee";
                break;
            }
            
            case 2:
            {
                SQL="SELECT * FROM employee WHERE cargo = 'Professor'";
                break;
            }
            
            case 3:
            {
                SQL = "SELECT * FROM employee WHERE cargo = 'Diretor'";
                break;
            }
            
            case 4:
            {
                SQL ="SELECT * FROM employee WHERE cargo = 'Administrativo'";
                break;
            }
            case 5:
            {
                SQL="SELECT * FROM employee WHERE cargo = 'Outros'";
                break;
            }
            case 6:
            {
                SQL="SELECT * FROM employee WHERE cargo = 'Servicos Gerais'";
                break;
            }
        }
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                EmployeeBean employee = new EmployeeBean();
                 employee.setRegistro(rs.getInt("registro"));
                 employee.setNome(rs.getString("nome"));
                 employee.setSexo(rs.getString("sexo"));
                 employee.setDataNascimento(converterData(rs.getString("dataNascimento")));
                 employee.setCPF(rs.getString("CPF"));
                 employee.setCargo(rs.getString("cargo"));
                 employee.setSalario(rs.getString("salario"));
                 employee.setCEP(rs.getString("CEP"));
                 employee.setEndereco(rs.getString("endereco"));
                 listEmployees.add(employee);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listEmployees;
    }
    
    //
    public List<EmployeeBean> procurarEmployee (int counter, String nome,boolean status){
        List<EmployeeBean> listEmployees = new ArrayList<>();
        String SQL= "";
        Connection conn = ConnectionFactory.conexao();
        switch(counter)
        {
            case 1:
            {
                SQL="SELECT * FROM employee WHERE nome LIKE '%"+nome+"%'";
                break;
            }
            
            case 2:
            {
                SQL="SELECT * FROM employee WHERE cargo = 'Professor' and nome LIKE '%"+nome+"%'";
                break;
            }
            
            case 3:
            {
                SQL = "SELECT * FROM employee WHERE cargo = 'Diretor' and nome LIKE '%"+nome+"%'";
                break;
            }
            
            case 4:
            {
                SQL ="SELECT * FROM employee WHERE cargo = 'Administrativo' and nome LIKE '%"+nome+"%'";
                break;
            }
            case 5:
            {
                SQL="SELECT * FROM employee WHERE cargo = 'Outros' and nome LIKE '%"+nome+"%'";
                break;
            }
            case 6:
            {
                SQL="SELECT * FROM employee WHERE cargo = 'Servicos Gerais' and nome LIKE '%"+nome+"%'";
                break;
            }
    }
         
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                EmployeeBean employee = new EmployeeBean();
                 employee.setRegistro(rs.getInt("registro"));
                 employee.setNome(rs.getString("nome"));
                 employee.setSexo(rs.getString("sexo"));
                 employee.setDataNascimento(converterData(rs.getString("dataNascimento")));
                 employee.setCPF(rs.getString("CPF"));
                 employee.setCargo(rs.getString("cargo"));
                 employee.setSalario(rs.getString("salario"));
                 employee.setCEP(rs.getString("CEP"));
                 employee.setEndereco(rs.getString("endereco"));
                 listEmployees.add(employee);
            }
            ConnectionFactory.encerrarConexao(conn, stm, rs);
        } catch (SQLException ex) {
            Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listEmployees;
    }
    
    private String converterData(String data){//Converte dados do tipo Data para o serem representados no programa
    Date formatarData;
    String dadoData="";
        try {
            formatarData = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            dadoData = new SimpleDateFormat("dd/MM/yyyy").format(formatarData);
        } catch (ParseException ex) {
            Logger.getLogger(SearchDao.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return dadoData;
    }
    }