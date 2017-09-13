/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author areznla
 */
public class Usuarios {
    
   static boolean exists;
    public void users(){
        try{
            FileReader ler = new FileReader("usuarios.txt");
            exists=true;
        }catch(Exception senao){
            JOptionPane.showMessageDialog(null ,"Erro ao ler os usuarios do sistema..");
            System.exit(1);
        }
    }
    
    public boolean verificar(){
       return exists;
    }
    
    public void inserirUser(String user, String senha,String tipo){
        try{
        Formatter arquivo= new Formatter("arquivo.txt");
        arquivo.format(user,senha,tipo);
        arquivo.close();
        }
        catch(Exception errin){
            
        }
    }
    
   
    
}