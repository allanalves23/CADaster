package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelbean.UserBean;

/**
 *
 * @author allan
 */
public class CreateDao {
    public static void createDataBase(){
        
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "CREATE DATABASE IF NOT EXISTS school";
            Statement stm = conn.createStatement();
            stm.execute(SQL);
            JOptionPane.showMessageDialog(null, "Banco criado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void createTableStudent(){
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "CREATE TABLE IF NOT EXISTS student("
                +"matricula VARCHAR(12),nome VARCHAR(100) NOT NULL,"
                + "CPF VARCHAR(15) NOT NULL UNIQUE, dataNascimento VARCHAR(10) NOT NULL,"
                + "CEP VARCHAR(9) NOT NULL, endereco VARCHAR(100) NOT NULL, bairro VARCHAR(50),"
                + "nomeMae VARCHAR(100), nomePai VARCHAR(100), responsavel VARCHAR(100) NOT NULL,"
                + "transferencia ENUM('S','N') NOT NULL,anoTecnico ENUM('1','2','3'),"
                + "anoPrimario ENUM('1','2','3','4','5'),anoGinasio ENUM('6','7','8','9'),"
                + "anoEM ENUM('1','2','3'),curso VARCHAR(35),bolsa int, PRIMARY KEY(matricula)"
                + ")ENGINE=InnoDB DEFAULT CHARSET=utf8";
            Statement stm = conn.createStatement();
            stm.execute(SQL);
            JOptionPane.showMessageDialog(null, "Tabela Criada de Alunos Criada");
            ConnectionFactory.encerrarConexao(conn, stm);
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public static void createTableUser(){

        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "CREATE TABLE IF NOT EXISTS usuario("
                    + "id int AUTO_INCREMENT, login VARCHAR(20) NOT NULL UNIQUE,"
                    + "senha VARCHAR(50) NOT NULL,PRIMARY KEY(id))ENGINE=InnoDB DEFAULT CHARSET=utf8";
            Statement stm = conn.createStatement();
            stm.execute(SQL);
            JOptionPane.showMessageDialog(null, "Tabela Criada de Usuários Criada");
            ConnectionFactory.encerrarConexao(conn, stm);
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
    } 
}
