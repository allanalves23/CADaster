package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelbean.StudentBean;
import modelbean.UserBean;

/**
 *
 * @author allan
 */
public class InsertDao {
    
   private int counterParameterInsert; /*contadora de parametros do Insert de alunos
   // VALORES POSSIVEIS:
   // 9 - SE O CAMPO MAE E PAI NAO ESTIVEREM PREENCHIDOS
   // 10 - SE O CAMPO MAE NAO ESTIVER PREENCHIDO
   // 11 - SE TODOS OS CAMPOS ESTAO PREENCHIDOS
   // 14 - SE O CAMPO MAE E BAIRRO NAO ESTIVEREM PREENCHIDOS
   // 15 - SE O CAMPO PAI E BAIRRO NAO ESTIVEREM PREENCHIDOS
   // 20 - SE O CAMPO PAI NAO ESTIVER PREENCHIDO
   // 21 - SE O CAMPO BAIRRO NAO ESTIVER PREENCHIDO
   */
   
   
   //Criar um registro de usuario no banco de dados 
    public void criarUser(UserBean cad){
        Connection conn = ConnectionFactory.conexao();
        String SQL = "INSERT INTO usuario (login,senha,permissao)VALUES(?,?,?)";
        try {
            PreparedStatement pstm= conn.prepareStatement(SQL); 
            pstm.setString(1,cad.getNome());
            pstm.setString(2,cad.getSenha());
            pstm.setString(3,cad.getPermissao());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            ConnectionFactory.encerrarConexao(conn, pstm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro no Banco\n ID: "+ex.getMessage());
        }
    }
    
    //Criar um registro de aluno no banco de dados
    public void criarAluno(StudentBean student,int count){
        Connection conn = ConnectionFactory.conexao();
        String SQL = stringInsertInto(count,student.getGrau());
       try {
           PreparedStatement pstm = conn.prepareStatement(SQL);
           switch(this.getCounterParameterInsert()){
               case 8:
               {    
                   JOptionPane.showMessageDialog(null, "Não é recomendado inserir registros com muita ausência de dados."
                           + "\n Recomendamos que você edite o registro futuramente caso for possível");
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getResponsavel());
                   pstm.setString(8, student.getAno());
                   pstm.execute();
                   break;
               }
               case 9://caso o campo mae e pai nao estiverem preenchidos
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getBairro());
                   pstm.setString(8, student.getResponsavel());
                   pstm.setString(9, student.getAno());
                   pstm.execute();
                   break;
               }
               case 10://caso o campo mae nao estiver preenchido
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getBairro());
                   pstm.setString(8, student.getNomePai());
                   pstm.setString(9, student.getResponsavel());
                   pstm.setString(10, student.getAno());
                   pstm.execute();
                   break;
               }
               case 11://caso todos os campos foram preenchidos
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getBairro());
                   pstm.setString(8, student.getNomeMae());
                   pstm.setString(9, student.getNomePai());
                   pstm.setString(10, student.getResponsavel());
                   pstm.setString(11, student.getAno());
                   pstm.execute();
                   break;
               }
               case 14: //caso o campo mae e bairro nao estiverem preenchidos
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getNomePai());
                   pstm.setString(8, student.getResponsavel());
                   pstm.setString(9, student.getAno());
                   pstm.execute();
                   break;
               }
               case 15://caso o campo pai e bairro nao estiverem preenchidos
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getNomeMae());
                   pstm.setString(8, student.getResponsavel());
                   pstm.setString(9, student.getAno());
                   pstm.execute();
                   break;
               }
               case 20://caso o campo pai nao estiver preenchido
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getBairro());
                   pstm.setString(8, student.getNomeMae());
                   pstm.setString(9, student.getResponsavel());
                   pstm.setString(10, student.getAno());
                   pstm.execute();
                   break;
               }
               case 21://caso o campo bairro nao estiver preenchido
               {
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getNomeMae());
                   pstm.setString(8, student.getNomePai());
                   pstm.setString(9, student.getResponsavel());
                   pstm.setString(10, student.getAno());
                   pstm.execute();
                   break;  
               }
               
           }
           JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
           ConnectionFactory.encerrarConexao(conn, pstm);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir dados no banco ID: "+ex.getMessage());
       }
        
    }
    
    private String stringInsertInto(int count,String coluna){
        switch(count){
        
            case 0://se todos os campos estiverem preenchidos
            {
                this.setCounterParameterInsert(11);
                return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,"
                    + "bairro,nomeMae,nomePai,responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            case 1://se campo mae nao estiver preenchido
            {   
               this.setCounterParameterInsert(10);
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,"
                    + "bairro,nomePai,responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            case 2://se o campo pai nao estiver preenchido
            {
               this.setCounterParameterInsert(10+10);//dez pelo fato de remover somente o campo nomePai
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,"
                    + "bairro,nomeMae,responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            case 4://se o campo bairro nao estiver preenchido
            {
               this.setCounterParameterInsert(10+11);//11 pelo fato de remover somente o campo nomeBairro
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,nomeMae,nomePai,"
                    + "responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
               
               
               
                   pstm.setString(1, student.getMatricula());
                   pstm.setString(2, student.getNome());
                   pstm.setString(3, student.getCPF());
                   pstm.setString(4, converterData(student.getDataNasc()));
                   pstm.setString(5, student.getCEP());
                   pstm.setString(6, student.getEndereco());
                   pstm.setString(7, student.getNomeMae());
                   pstm.setString(8, student.getNomePai());
                   pstm.setString(9, student.getResponsavel());
                   pstm.setString(10, student.getAno());
                   pstm.execute();
                   break; 
                */
            }
            case 3://se o campo mae e pai nao estiverem preenchidos
            {
               this.setCounterParameterInsert(9);
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,"
                    + "bairro,responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            case 5://se o campo mae e bairro nao estiverem preenchidos
            {
               this.setCounterParameterInsert(9+1+4);/*1 pelo campo mae nao preenchido e outro 4 pelo
                                                     campo bairro nao preenchido*/
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,nomePai,"
                    + "responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            case 6://se o campo pai e bairro nao estiverem preenchidos
            {
               this.setCounterParameterInsert(9+2+4);/*2 pelo campo pai nao preenchido e outro 4 pelo
                                                     campo bairro nao preenchido*/
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,nomeMae,"
                    + "responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            case 7://se os campos pai, bairro e mae nao esiverem preenchidos
            {
                this.setCounterParameterInsert(8);/*8 pelo fato de existir somente
                                                    8 campos preenchidos no registro*/
               return "INSERT INTO student(matricula,nome,CPF,dataNascimento,CEP,endereco,"
                    + "responsavel,"+coluna+") VALUES(?,?,?,?,?,?,?,?)"; 
               /*matricula, nome, CPF, dataNascimento, CEP, endereco, bairro
                //nomeMae, nomePai, responsavel,transferencia,anoTecnico,anoPrimario
                //anoGinasio, anoEM, curso, bolsa.
                */
            }
            default:
            {
                JOptionPane.showMessageDialog(null, "ERROR 404 - os campos nao foram interpretados corretamente"
                        + "\n entre em contato com o desenvolvedor deste aplicativo");
                return "";
            }
                
        }
        
    }
    
    private String converterData(String data){//Converte dados do tipo Data para o banco
        Date formatarData;
        String dadoData="";
            try {
                formatarData = new SimpleDateFormat("dd/MM/yyyy").parse(data);
                dadoData = new SimpleDateFormat("yyyy-MM-dd").format(formatarData);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao converter a data ID: "+ex.getMessage());
            }   
            return dadoData;
    }

    private int getCounterParameterInsert() {
        return counterParameterInsert;
    }

    private void setCounterParameterInsert(int counter) {
        this.counterParameterInsert = counter;
    }
    
   
}   
