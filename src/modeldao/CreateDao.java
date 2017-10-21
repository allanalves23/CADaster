package modeldao;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allan
 */
public class CreateDao {
    public static boolean createDataBase(){
        boolean status=false;
        try {
            Connection conn = ConnectionFactory.criarBanco();
            String SQL = "CREATE DATABASE IF NOT EXISTS school";
            Statement stm = conn.createStatement();
            stm.executeUpdate(SQL);
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    public static boolean createTableStudent(){
        boolean status=false;
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "CREATE TABLE IF NOT EXISTS student("
                +"matricula VARCHAR(12),nome VARCHAR(100) NOT NULL,"
                + "CPF VARCHAR(15) NOT NULL UNIQUE, dataNascimento DATE NOT NULL,"
                + "CEP VARCHAR(9) NOT NULL, endereco VARCHAR(100) NOT NULL, bairro VARCHAR(50),"
                + "nomeMae VARCHAR(100), nomePai VARCHAR(100), responsavel VARCHAR(100) NOT NULL,"
                + "transferencia ENUM('S','N') NOT NULL,anoTecnico ENUM('1','2','3'),"
                + "anoPrimario ENUM('1','2','3','4','5'),anoGinasio ENUM('6','7','8','9'),"
                + "anoEM ENUM('1','2','3'),curso VARCHAR(35),bolsa int, PRIMARY KEY(matricula)"
                + ")ENGINE=InnoDB DEFAULT CHARSET=utf8";
            Statement stm = conn.createStatement();
            stm.execute(SQL);
            ConnectionFactory.encerrarConexao(conn, stm);
            status=true;
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
 
    public static boolean createTableUser(){
        boolean status=false;
        try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "CREATE TABLE IF NOT EXISTS usuario("
                    + "id int AUTO_INCREMENT, login VARCHAR(20) NOT NULL UNIQUE,"
                    + "senha VARCHAR(50) NOT NULL,PRIMARY KEY(id))ENGINE=InnoDB DEFAULT CHARSET=utf8";
            Statement stm = conn.createStatement();
            stm.execute(SQL);
            ConnectionFactory.encerrarConexao(conn, stm);
            status=true;
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return status;
    } 
    
    public static boolean createTableEmployee(){
        boolean status=false;
         try {
            Connection conn = ConnectionFactory.conexao();
            String SQL = "CREATE TABLE IF NOT EXISTS employee (registro int AUTO_INCREMENT,"
                    + " nome varchar(50) NOT NULL, sexo enum('F','M') NOT NULL, "
                    + "dataNascimento DATE NOT NULL, CPF varchar(15) NOT NULL UNIQUE, "
                    + "cargo enum('Professor','Diretor','Administrativo','Servicos Gerais','Outros')"
                    + " NOT NULL,salario float NOT NULL, CEP varchar(10) NOT NULL , "
                    + "endereco varchar(100) NOT NULL, PRIMARY KEY(registro))ENGINE=InnoDB DEFAULT CHARSET=utf8";
            Statement stm = conn.createStatement();
            stm.execute(SQL);
            ConnectionFactory.encerrarConexao(conn, stm);
            status=true;
        } catch (SQLException ex) {
            Logger.getLogger(CreateDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return status;
    }
}
