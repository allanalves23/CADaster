package utilitarios;

/**
 *
 * @author areznla
 */
import java.awt.Dimension;
import javafx.geometry.Pos;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class UmaJanelaApenas {

    private static JDesktopPane fundo;

    public UmaJanelaApenas(JDesktopPane fundo2) {
        UmaJanelaApenas.fundo=fundo2;
    }
    
    public void abrirJanela(boolean size,JInternalFrame janela){
        if(janela.isVisible()){
            janela.toFront();
            janela.requestFocus();
        }else{
            if(size){
                Dimension res = fundo.getSize();
                janela.setSize(res);
                fundo.add(janela);
                janela.setVisible(true);
            }else{
                fundo.add(janela);
                janela.setVisible(true);
            }
        }
    }
}
