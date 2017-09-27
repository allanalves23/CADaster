/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conexaobd.ConnectionFactory;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modeldao.SearchDao;

/**
 *
 * @author allan
 */
public class TelaLogin extends javax.swing.JDialog {

    /**
     * Creates new form TelaLogin
     * @param parent
     * @param modal
     */
    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camposLogin = new javax.swing.JPanel();
        icone = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        campoLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblMensagemerro = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CADaster - Bem vindo");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setName("LoginTela"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        camposLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loginIcon.png"))); // NOI18N

        lblUser.setText("Usuario");

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });

        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoLoginKeyPressed(evt);
            }
        });

        lblSenha.setText("Senha");

        lblMensagemerro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMensagemerro.setForeground(new java.awt.Color(255, 0, 0));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout camposLoginLayout = new javax.swing.GroupLayout(camposLogin);
        camposLogin.setLayout(camposLoginLayout);
        camposLoginLayout.setHorizontalGroup(
            camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(icone)
                .addGap(60, 60, 60)
                .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(camposLoginLayout.createSequentialGroup()
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnEntrar))
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensagemerro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        camposLoginLayout.setVerticalGroup(
            camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser)
                .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camposLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMensagemerro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camposLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(camposLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(camposLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        SearchDao sd = new SearchDao();
        if(sd.procurar(campoLogin.getText(), Arrays.toString(campoSenha.getPassword()))){
            this.dispose();
        }else{
            lblMensagemerro.setText("Login ou senha invalidos");
            lblMensagemerro.setIcon(new ImageIcon(getClass().getResource("../imagens/About.png")));
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","CADaster - Sair",JOptionPane.YES_NO_OPTION);
        if(op==JOptionPane.YES_OPTION){
            System.exit(1);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()));
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()));
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void verificarLogin(String login, String senha){
        if(login.equals("root") && senha.equals("123")){
            this.dispose();
        }else{
            lblMensagemerro.setText("Login ou senha invalidos");
            lblMensagemerro.setIcon(new ImageIcon(getClass().getResource("../imagens/About.png")));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPanel camposLogin;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel lblMensagemerro;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
