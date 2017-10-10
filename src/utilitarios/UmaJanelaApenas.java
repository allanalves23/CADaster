package utilitarios;

/**
 *
 * @author allan
 */
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import view.GerenciaBanco;

public class UmaJanelaApenas {

    private static JDesktopPane fundo;
    private static JFrame config;
    
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
    
    public void abrirConfig(JFrame janela){
        if(janela.isVisible()){
            janela.toFront();
        }else{
            janela.setVisible(true);
        }
    }
    
}
