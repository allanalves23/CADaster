package view;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modeldao.LoginDao;

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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        camposLogin = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        campoLogin = new javax.swing.JTextField();
        lblMensagemerro = new javax.swing.JLabel();
        btnConfigurarBanco = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CADaster - Bem vindo");
        setBackground(new java.awt.Color(1, 1, 1));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setName("LoginTela"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(240, 241, 242));

        camposLogin.setBackground(new java.awt.Color(254, 254, 254));
        camposLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(158, 158, 158), 1, true));

        btnEntrar.setForeground(new java.awt.Color(1, 1, 1));
        btnEntrar.setText("Login");
        btnEntrar.setAutoscrolls(true);
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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

        lblMensagemerro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMensagemerro.setForeground(new java.awt.Color(255, 0, 0));

        btnConfigurarBanco.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        btnConfigurarBanco.setText("Configurar base de dados");
        btnConfigurarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarBancoActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/password.png"))); // NOI18N

        javax.swing.GroupLayout camposLoginLayout = new javax.swing.GroupLayout(camposLogin);
        camposLogin.setLayout(camposLoginLayout);
        camposLoginLayout.setHorizontalGroup(
            camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLoginLayout.createSequentialGroup()
                .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camposLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, camposLoginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, camposLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoSenha))))
                    .addGroup(camposLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(camposLoginLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnSair))
                            .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConfigurarBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(camposLoginLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblMensagemerro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        camposLoginLayout.setVerticalGroup(
            camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoLogin)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(camposLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblMensagemerro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfigurarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoFrame.png"))); // NOI18N
        jLabel3.setText("ADaster");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(camposLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(camposLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void limparInputs(){
        campoLogin.setText("");
        campoSenha.setText("");
    }
//Login com verificação da conta no banco de dados
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if(verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()))){
            JOptionPane.showMessageDialog(this, "Você entrou no modo ROOT, para isso recomendamos que você tenha\n"
                    + "Toda a estrutura do banco criada, sem ela você não \n"
                    + "conseguirá usufruir de toda a capacidade do programa", "AVISO!", 1);
            this.dispose();
        }else{
            LoginDao ld = new LoginDao();
                if((ld.login(campoLogin.getText(), new String(campoSenha.getPassword())))){
                    this.dispose();
                }else{
                    if(verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()))){
                        this.dispose();
                    }
                    lblMensagemerro.setText("Login ou senha invalidos");
                    lblMensagemerro.setIcon(new ImageIcon(getClass().getResource("../imagens/About.png")));
                }
        }
        limparInputs();
    }//GEN-LAST:event_btnEntrarActionPerformed
    //Sair da aplicação na tela de Login
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","CADaster - Sair",JOptionPane.YES_NO_OPTION);
        if(op==JOptionPane.YES_OPTION){
            System.exit(1);
        }
    }//GEN-LAST:event_btnSairActionPerformed
    //Login com verificação da conta no banco de dados
    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()))){
                JOptionPane.showMessageDialog(this, "Você entrou no modo ROOT, para isso recomendamos que você tenha\n"
                        + "Toda a estrutura do banco criada, sem ela você não \n"
                        + "conseguirá usufruir de toda a capacidade do programa", "AVISO!", 1);
                this.dispose();
            }else{
                LoginDao ld = new LoginDao();
                    if((ld.login(campoLogin.getText(), new String(campoSenha.getPassword())))){
                        this.dispose();
                    }else{
                        if(verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()))){
                            this.dispose();
                        }
                        lblMensagemerro.setText("Login ou senha invalidos");
                        lblMensagemerro.setIcon(new ImageIcon(getClass().getResource("../imagens/About.png")));
                    }
            }
        } 
    }//GEN-LAST:event_campoSenhaKeyPressed
    //Login com verificação da conta no banco de dados
    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()))){
                JOptionPane.showMessageDialog(this, "Você entrou no modo ROOT, para isso recomendamos que você tenha\n"
                        + "Toda a estrutura do banco criada, sem ela você não \n"
                        + "conseguirá usufruir de toda a capacidade do programa", "AVISO!", 1);
                this.dispose();
            }else{
                LoginDao ld = new LoginDao();
                    if((ld.login(campoLogin.getText(), new String(campoSenha.getPassword())))){
                        this.dispose();
                    }else{
                        if(verificarLogin(campoLogin.getText(), new String(campoSenha.getPassword()))){
                            this.dispose();
                        }
                        lblMensagemerro.setText("Login ou senha invalidos");
                        lblMensagemerro.setIcon(new ImageIcon(getClass().getResource("../imagens/About.png")));
                    }
            }
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void btnConfigurarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarBancoActionPerformed
        GerenciaBanco config = new GerenciaBanco();
        config.setVisible(true);
    }//GEN-LAST:event_btnConfigurarBancoActionPerformed
    //Metodo de login via root - Não implementado
    private boolean verificarLogin(String login, String senha){
        if(login.equals("root") && senha.equals("123")){
            return true;
        }else{
            return false;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
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
    private javax.swing.JButton btnConfigurarBanco;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPanel camposLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblMensagemerro;
    // End of variables declaration//GEN-END:variables
}
