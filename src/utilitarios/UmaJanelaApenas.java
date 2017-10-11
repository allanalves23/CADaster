package utilitarios;

/**
 *
 * @author allan
 */
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

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
                janela.setMaximizable(true);
            }
            fundo.add(janela);
            janela.setVisible(true);
            
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
