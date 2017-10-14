/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import modelbean.StudentBean;

/**
 *
 * @author allan
 */
public class UpdateDao {
    
    public boolean updateUser(String SQL,String login,int id){ //Update somente do login
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(SQL);
            pstm.setString(1, login);
            pstm.setInt(2, id);
            pstm.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        ConnectionFactory.encerrarConexao(conn, pstm);
        return true;
    }
    
    public boolean updateUser(String SQL,String permissao,String id){ //Update somente da permissao
         Connection conn = ConnectionFactory.conexao();
         PreparedStatement pstm;
         try {
            int id1 = Integer.parseInt(id);//refatorar essa parte, ID esta em string
            pstm = conn.prepareStatement(SQL);
            pstm.setString(1, permissao);
            pstm.setString(2, id);
            pstm.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        ConnectionFactory.encerrarConexao(conn, pstm);
        return true;
    }
   
    //Atualizando todos os campos do registro
    public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String bairro, String responsavel, String nomeMae, String nomePai, String colunaGrau,
            String ano) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomeMae=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, bairro);
                pstm.setString(6, responsavel);
                pstm.setString(7, nomeMae);
                pstm.setString(8, nomePai);
                pstm.setString(9, ano);
                pstm.setString(10, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomeMae=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, bairro);
                pstm.setString(7, responsavel);
                pstm.setString(8, nomeMae);
                pstm.setString(9, nomePai);
                pstm.setString(10, ano);
                pstm.setString(11, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
    
    //Atualizando os campos do registro que nao contenha dado no campo BAIRRO
    public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String responsavel, String nomeMae, String nomePai, String colunaGrau,
            String ano) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?, nomeMae=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, responsavel);
                pstm.setString(6, nomeMae);
                pstm.setString(7, nomePai);
                pstm.setString(8, ano);
                pstm.setString(9, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?, nomeMae=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, responsavel);
                pstm.setString(7, nomeMae);
                pstm.setString(8, nomePai);
                pstm.setString(9, ano);
                pstm.setString(10, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
    
    //Atualizando os campos do registro que nao contenha dado no campo NOMEMAE
    public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String bairro, String responsavel, String nomePai, String colunaGrau,
            String ano, boolean nomeMae) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, bairro);
                pstm.setString(6, responsavel);
                pstm.setString(7, nomePai);
                pstm.setString(8, ano);
                pstm.setString(9, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, bairro);
                pstm.setString(7, responsavel);
                pstm.setString(8, nomePai);
                pstm.setString(9, ano);
                pstm.setString(10, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
    
    //Atualizando os campos do registro que nao contenha dado no campo NOMEPAI
     public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String bairro, String responsavel, String nomeMae, String colunaGrau, String ano,
            char nomePai) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomeMae=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, bairro);
                pstm.setString(6, responsavel);
                pstm.setString(7, nomeMae);
                pstm.setString(8, ano);
                pstm.setString(9, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomeMae=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, bairro);
                pstm.setString(7, responsavel);
                pstm.setString(8, nomeMae);
                pstm.setString(9, ano);
                pstm.setString(10, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
     
     //Atualizando os campos do registro que nao contenha dado no campo BAIRRO e NOMEMAE
     public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String responsavel, String nomePai, String colunaGrau, String ano) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?, nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, responsavel);
                pstm.setString(6, nomePai);
                pstm.setString(7, ano);
                pstm.setString(8, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?, nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, responsavel);
                pstm.setString(7, nomePai);
                pstm.setString(8, ano);
                pstm.setString(9, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
     
     //Atualizando os campos do registro que nao contenha dado no campo BAIRRO e NOMEPAI
     public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String responsavel, String nomeMae, String colunaGrau, String ano,boolean nomePai) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?, nomeMae=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, responsavel);
                pstm.setString(6, nomeMae);
                pstm.setString(7, ano);
                pstm.setString(8, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?, nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, responsavel);
                pstm.setString(7, nomeMae);
                pstm.setString(8, ano);
                pstm.setString(9, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
     
     
}
    
     //Atualizando os campos do registro que nao contenha dado no campo NOMEMAE e NOMEPAI
     public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String bairro, String responsavel, String colunaGrau, String ano,boolean nomeMae, boolean nomePai) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, "+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, bairro);
                pstm.setString(6, responsavel);
                pstm.setString(7, ano);
                pstm.setString(8, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomeMae=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, bairro);
                pstm.setString(7, responsavel);
                pstm.setString(8, ano);
                pstm.setString(9, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
     
      //Atualizando os campos do registro que nao contenha dado no campo NOMEMAE e NOMEPAI e BAIRRO
     public boolean updateStudent(String matricula, String nome, String CPF ,String dataNascimento,String CEP,
            String endereco, String responsavel,  String colunaGrau, String ano) throws SQLException{
        
        Connection conn = ConnectionFactory.conexao();
        PreparedStatement pstm;
        PreparedStatement pstm2;
        //=====NECESSARIO PARA VERIFICAR SE O CPF FOI ALTERADO=======
        String verCPF = "SELECT * from student WHERE matricula = ?";
                pstm2=conn.prepareStatement(verCPF);
                pstm2.setString(1, matricula);
                ResultSet rs = pstm2.executeQuery();
                rs.next();
        //===========================================================
        try {
            if(rs.getString("CPF").equals(CPF)){//verifica se o CPF do banco e o mesmo do informado no parametro
                String SQL = "UPDATE student SET nome = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, responsavel=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, converterData(dataNascimento));
                pstm.setString(3, CEP);
                pstm.setString(4, endereco);
                pstm.setString(5, responsavel);
                pstm.setString(6, ano);
                pstm.setString(7, matricula);
            }else{
                String SQL = "UPDATE student SET nome = ? , CPF = ? , dataNascimento = ?, CEP = ?,"
                + "endereco=?, bairro=?, responsavel=?, nomeMae=?,nomePai=?,"+colunaGrau+"=? WHERE matricula = ?";
                pstm = conn.prepareStatement(SQL);
                pstm.setString(1, nome);
                pstm.setString(2, CPF);
                pstm.setString(3, converterData(dataNascimento));
                pstm.setString(4, CEP);
                pstm.setString(5, endereco);
                pstm.setString(6, responsavel);
                pstm.setString(7, ano);
                pstm.setString(8, matricula);
                
            }
            pstm.execute();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            pstm2.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de conexao com o banco "+ex.getMessage());
            return false;
        }
        return true;
    }
    
     
     private String converterData(String data){//Converte dados do tipo Data para inserir no banco
        Date formatarData;
        String dadoData="";
            try {
                formatarData = new SimpleDateFormat("dd-MM-yyyy").parse(data);
                dadoData = new SimpleDateFormat("yyyy-MM-dd").format(formatarData);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao converter a data ID: "+ex.getMessage());
            }   
            return dadoData;
    }
}