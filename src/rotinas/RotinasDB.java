package rotinas;

import conexaobd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class RotinasDB {
    
    public static boolean verificarMatricula(String matricula){
        boolean response=false;
        try {
            Connection conn = ConnectionFactory.conexao();
            PreparedStatement pstm = conn.prepareStatement("SELECT matricula FROM student where matricula = ?");
            pstm.setString(1, matricula);
            ResultSet rs = pstm.executeQuery();
            response = rs.next();
            ConnectionFactory.encerrarConexao(conn, pstm, rs);
            return response;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a verificação de unicidade da matricula\n"
                    + "Entre em contato com o desenvolvedor deste aplicativo para resolver este problema - "+ex.getMessage());
        }
        return response;
    }
}
