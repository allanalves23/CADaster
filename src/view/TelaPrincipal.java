
package view;

import javax.swing.JOptionPane;
import utilitarios.UmaJanelaApenas;


/**
 *
 * @author areznla
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    //Flags dos jInternalFrames
    
    UmaJanelaApenas controle;
    
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(TelaPrincipal.MAXIMIZED_BOTH);
        this.setVisible(true);
        TelaLogin login = new TelaLogin(this, true);
        login.setVisible(true);
        this.controle=new UmaJanelaApenas(fundo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        sistema = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        usuarios = new javax.swing.JMenu();
        addUser = new javax.swing.JMenuItem();
        removeUser = new javax.swing.JMenuItem();
        editUser = new javax.swing.JMenuItem();
        searchUser = new javax.swing.JMenuItem();
        alunos = new javax.swing.JMenu();
        alunoGeren = new javax.swing.JMenuItem();
        alunoPesq = new javax.swing.JMenuItem();
        alunoDel = new javax.swing.JMenuItem();
        alunoAdd = new javax.swing.JMenuItem();
        funcionarios = new javax.swing.JMenu();
        funcProf = new javax.swing.JMenuItem();
        funcAdm = new javax.swing.JMenuItem();
        funcUtil = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADaster - Gerenciamento Acadêmico [Build 0.2]");

        fundo.setBackground(new java.awt.Color(153, 153, 255));

        sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home.png"))); // NOI18N
        sistema.setText("Sistema");

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        sistema.add(logout);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quit.png"))); // NOI18N
        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        sistema.add(exit);

        barraMenu.add(sistema);

        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Person.png"))); // NOI18N
        usuarios.setText("Usuarios");

        addUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Male.png"))); // NOI18N
        addUser.setText("Cadastrar");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        usuarios.add(addUser);

        removeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Trash.png"))); // NOI18N
        removeUser.setText("Remover");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });
        usuarios.add(removeUser);

        editUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Modify.png"))); // NOI18N
        editUser.setText("Editar");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });
        usuarios.add(editUser);

        searchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        searchUser.setText("Pesquisar");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });
        usuarios.add(searchUser);

        barraMenu.add(usuarios);

        alunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/People.png"))); // NOI18N
        alunos.setText("Alunos");

        alunoGeren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Notes.png"))); // NOI18N
        alunoGeren.setText("Gerenciar");
        alunoGeren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoGerenActionPerformed(evt);
            }
        });
        alunos.add(alunoGeren);

        alunoPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Text preview.png"))); // NOI18N
        alunoPesq.setText("Pesquisar");
        alunoPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoPesqActionPerformed(evt);
            }
        });
        alunos.add(alunoPesq);

        alunoDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        alunoDel.setText("Excluir");
        alunoDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoDelActionPerformed(evt);
            }
        });
        alunos.add(alunoDel);

        alunoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Female.png"))); // NOI18N
        alunoAdd.setText("Adicionar");
        alunoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoAddActionPerformed(evt);
            }
        });
        alunos.add(alunoAdd);

        barraMenu.add(alunos);

        funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boss.png"))); // NOI18N
        funcionarios.setText("Funcionarios");

        funcProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teacher.png"))); // NOI18N
        funcProf.setText("Professor");
        funcProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcProfActionPerformed(evt);
            }
        });
        funcionarios.add(funcProf);

        funcAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User group.png"))); // NOI18N
        funcAdm.setText("Administração");
        funcAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcAdmActionPerformed(evt);
            }
        });
        funcionarios.add(funcAdm);

        funcUtil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        funcUtil.setText("Serviços Gerais");
        funcionarios.add(funcUtil);

        barraMenu.add(funcionarios);

        sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/About.png"))); // NOI18N
        sobre.setText("Sobre");

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/About.png"))); // NOI18N
        about.setText("Sobre");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        sobre.add(about);

        barraMenu.add(sobre);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //chamada do JDialog para o logout
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        TelaLogin login = new TelaLogin(this, true);
        login.setVisible(true);
        
    }//GEN-LAST:event_logoutActionPerformed
    //Chamada da tela de adicao de usuario
    
    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        controle.abrirJanela(false,TelaCadastro.getAbrir());
    }//GEN-LAST:event_addUserActionPerformed
    //Chamada da tela de remocao de usuario
    
    private void removeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserActionPerformed
        controle.abrirJanela(true,RemoveUser.getAbrir());
    }//GEN-LAST:event_removeUserActionPerformed
    //Chamada da tela de edicao de usuario
    
    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        controle.abrirJanela(true,EditUser.getAbrir());
    }//GEN-LAST:event_editUserActionPerformed
    //Chamada da tela de procura de usuario
    
    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
        controle.abrirJanela(true,TelaPesquisa.getAbrir());
    }//GEN-LAST:event_searchUserActionPerformed
    //Chamada da tela de sobre o programa
    
    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        controle.abrirJanela(false,Sobre.getAbrir());
    }//GEN-LAST:event_aboutActionPerformed
    //Chamada da tela de adicionar aluno
    
    private void alunoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoAddActionPerformed
        controle.abrirJanela(false,TelaAddAluno.getAbrir());
    }//GEN-LAST:event_alunoAddActionPerformed
    //Chamada da tela de remocao de aluno
    
    private void alunoDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoDelActionPerformed
       controle.abrirJanela(true,TelaDelAluno.getAbrir());
    }//GEN-LAST:event_alunoDelActionPerformed
    //Chamada da tela de pesquisar aluno

    private void alunoPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoPesqActionPerformed
        controle.abrirJanela(true,TelaPesqAluno.getAbrir());
    }//GEN-LAST:event_alunoPesqActionPerformed
    //Chamada da tela de gerencia de aluno

    private void alunoGerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoGerenActionPerformed
        controle.abrirJanela(true,TelaGerenciaAluno.getAbrir());
    }//GEN-LAST:event_alunoGerenActionPerformed
    //Chamada do JOptionpane para confirmar a saida do programa

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar o programa?",
                "CADaster - Fechar",JOptionPane.YES_NO_OPTION);
        if(i==JOptionPane.YES_OPTION){
            dispose();
        }
        
    }//GEN-LAST:event_exitActionPerformed
    //Chamada da tela de gerenciamento de cadastro de professor

    private void funcProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcProfActionPerformed
        controle.abrirJanela(true,TelaProfessor.getAbrir());
    }//GEN-LAST:event_funcProfActionPerformed
    /*Chamada da tela de gerenciamento de casdastro de funcionarios
      administrativos*/
    private void funcAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcAdmActionPerformed
        controle.abrirJanela(true,TelaAdministracao.getAbrir());
         
    }//GEN-LAST:event_funcAdmActionPerformed
    

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem addUser;
    private javax.swing.JMenuItem alunoAdd;
    private javax.swing.JMenuItem alunoDel;
    private javax.swing.JMenuItem alunoGeren;
    private javax.swing.JMenuItem alunoPesq;
    private javax.swing.JMenu alunos;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem editUser;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem funcAdm;
    private javax.swing.JMenuItem funcProf;
    private javax.swing.JMenuItem funcUtil;
    private javax.swing.JMenu funcionarios;
    private javax.swing.JDesktopPane fundo;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem removeUser;
    private javax.swing.JMenuItem searchUser;
    private javax.swing.JMenu sistema;
    private javax.swing.JMenu sobre;
    private javax.swing.JMenu usuarios;
    // End of variables declaration//GEN-END:variables
}
