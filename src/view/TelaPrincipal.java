/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author areznla
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        fundo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        User = new javax.swing.JMenu();
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
        aboutMaster = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADaster - Gerenciamento Acadêmico [Build 0.2]");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home.png"))); // NOI18N
        jMenu1.setText("Sistema");

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Person.png"))); // NOI18N
        User.setText("Usuarios");

        addUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Male.png"))); // NOI18N
        addUser.setText("Cadastrar");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        User.add(addUser);

        removeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Trash.png"))); // NOI18N
        removeUser.setText("Remover");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });
        User.add(removeUser);

        editUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Modify.png"))); // NOI18N
        editUser.setText("Editar");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });
        User.add(editUser);

        searchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        searchUser.setText("Pesquisar");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });
        User.add(searchUser);

        jMenuBar1.add(User);

        alunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/People.png"))); // NOI18N
        alunos.setText("Alunos");

        alunoGeren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Notes.png"))); // NOI18N
        alunoGeren.setText("Gerenciar");
        alunos.add(alunoGeren);

        alunoPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Text preview.png"))); // NOI18N
        alunoPesq.setText("Pesquisar");
        alunos.add(alunoPesq);

        alunoDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        alunoDel.setText("Excluir");
        alunos.add(alunoDel);

        alunoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Female.png"))); // NOI18N
        alunoAdd.setText("Adicionar");
        alunoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoAddActionPerformed(evt);
            }
        });
        alunos.add(alunoAdd);

        jMenuBar1.add(alunos);

        funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boss.png"))); // NOI18N
        funcionarios.setText("Funcionarios");

        funcProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teacher.png"))); // NOI18N
        funcProf.setText("Professor");
        funcionarios.add(funcProf);

        funcAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User group.png"))); // NOI18N
        funcAdm.setText("Administração");
        funcionarios.add(funcAdm);

        funcUtil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        funcUtil.setText("Serviços Gerais");
        funcionarios.add(funcUtil);

        jMenuBar1.add(funcionarios);

        aboutMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/About.png"))); // NOI18N
        aboutMaster.setText("Sobre");

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/About.png"))); // NOI18N
        about.setText("Sobre");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        aboutMaster.add(about);

        jMenuBar1.add(aboutMaster);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        TelaCadastro cadUser = new TelaCadastro();
        fundo.add(cadUser);
        cadUser.setVisible(true);
    }//GEN-LAST:event_addUserActionPerformed

    private void removeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserActionPerformed
        AlterarExcluir delAlt = new AlterarExcluir();
        delAlt.setControl(true);
        fundo.add(delAlt);
        delAlt.setVisible(true);
    }//GEN-LAST:event_removeUserActionPerformed

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        AlterarExcluir altDel = new AlterarExcluir();
        altDel.setControl(false);
        fundo.add(altDel);
        altDel.setVisible(true);
    }//GEN-LAST:event_editUserActionPerformed

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
        TelaPesquisa pesq = new TelaPesquisa();
        fundo.add(pesq);
        pesq.setVisible(true);
    }//GEN-LAST:event_searchUserActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        Sobre about = new Sobre();
        fundo.add(about);
        about.setVisible(true);
        
    }//GEN-LAST:event_aboutActionPerformed

    private void alunoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoAddActionPerformed
        TelaAddAluno addaluno = new TelaAddAluno();
        fundo.add(addaluno);
        addaluno.setVisible(true);
        
    }//GEN-LAST:event_alunoAddActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu User;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenu aboutMaster;
    private javax.swing.JMenuItem addUser;
    private javax.swing.JMenuItem alunoAdd;
    private javax.swing.JMenuItem alunoDel;
    private javax.swing.JMenuItem alunoGeren;
    private javax.swing.JMenuItem alunoPesq;
    private javax.swing.JMenu alunos;
    private javax.swing.JMenuItem editUser;
    private javax.swing.JMenuItem funcAdm;
    private javax.swing.JMenuItem funcProf;
    private javax.swing.JMenuItem funcUtil;
    private javax.swing.JMenu funcionarios;
    private javax.swing.JDesktopPane fundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem removeUser;
    private javax.swing.JMenuItem searchUser;
    // End of variables declaration//GEN-END:variables
}
