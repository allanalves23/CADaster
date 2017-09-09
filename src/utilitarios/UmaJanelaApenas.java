package utilitarios;

/**
 *
 * @author areznla
 */
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class UmaJanelaApenas {

    private static JDesktopPane fundo;

    public UmaJanelaApenas(JDesktopPane fundo2) {
        UmaJanelaApenas.fundo=fundo2;
    }
    
    public void abrirJanela(JInternalFrame janela){
        if(janela.isVisible()){
            janela.toFront();
            janela.requestFocus();
            
        }else{
            fundo.add(janela);
            janela.setVisible(true);
        }
    }
}
