package utilitarios;

/**
 *
 * @author areznla
 */
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class UmaJanelaApenas {

    private static JDesktopPane fundo;
    private static JPanel fundoOp;

    public UmaJanelaApenas(JDesktopPane fundo2) {
        UmaJanelaApenas.fundo=fundo2;
        UmaJanelaApenas.fundoOp=fundoOp;
    }
    
    public void abrirJanela(short control,JInternalFrame janela,JPanel fundoOp){
        if(janela.isVisible()){
            janela.toFront();
            janela.requestFocus();
            switch (control) {
                case 0:
                    this.fundoOp=fundoOp;
                    CardLayout excluir = (CardLayout) this.fundoOp.getLayout();
                    excluir.show(this.fundoOp, "excluir");
                    break;
                case 1:
                    CardLayout alterar = (CardLayout) this.fundoOp.getLayout();
                    alterar.show(this.fundoOp, "alterar");
                    break;
                default:
                    
                    break;
            }
            
        }else{
            fundo.add(janela);
            janela.setVisible(true);
        }
    }
}
