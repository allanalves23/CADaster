/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelbean.UserBean;
import modeldao.DeleteDao;
import modeldao.SearchDao;

/**
 *
 * @author allan
 */
public class TelaRemoverUsuario extends javax.swing.JInternalFrame {
    
    private static TelaRemoverUsuario tela;
    
    public static TelaRemoverUsuario getAbrir(){
        if(tela==null){
            tela=new TelaRemoverUsuario();
        }
        return tela;
    }
    /**
     * Creates new form TelaRemoveUser
     */
    public TelaRemoverUsuario() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        panelBuscauser = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        btnLimparInputs = new javax.swing.JButton();
        btnConfirmarBusca = new javax.swing.JButton();
        campoCodigo = new javax.swing.JFormattedTextField();
        lblInfo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btnConfirmarExclusao = new javax.swing.JButton();
        btnLimparTabela = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Remover Usuário");

        panelBuscauser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busca usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeKeyPressed(evt);
            }
        });

        lblNome.setText("Nome");

        lblCod.setText("Codigo");

        btnLimparInputs.setText("Limpar");
        btnLimparInputs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparInputsActionPerformed(evt);
            }
        });

        btnConfirmarBusca.setText("Confirmar");
        btnConfirmarBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarBuscaActionPerformed(evt);
            }
        });

        campoCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        javax.swing.GroupLayout panelBuscauserLayout = new javax.swing.GroupLayout(panelBuscauser);
        panelBuscauser.setLayout(panelBuscauserLayout);
        panelBuscauserLayout.setHorizontalGroup(
            panelBuscauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscauserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBuscauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscauserLayout.createSequentialGroup()
                        .addGroup(panelBuscauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInfo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBuscauserLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimparInputs)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmarBusca)
                                .addGap(25, 25, 25)))
                        .addGap(44, 44, 44))
                    .addGroup(panelBuscauserLayout.createSequentialGroup()
                        .addGroup(panelBuscauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(campoCodigo))
                        .addGap(19, 19, 19))))
        );
        panelBuscauserLayout.setVerticalGroup(
            panelBuscauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscauserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelBuscauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarBusca)
                    .addComponent(btnLimparInputs))
                .addGap(40, 40, 40)
                .addComponent(lblInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "LOGIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaUsuarios);

        btnConfirmarExclusao.setText("Confirmar Exclusão");
        btnConfirmarExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarExclusaoActionPerformed(evt);
            }
        });

        btnLimparTabela.setText("Limpar Tabela");
        btnLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTabelaActionPerformed(evt);
            }
        });

        lblInfo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnLimparTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmarExclusao)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparTabela)
                    .addComponent(btnConfirmarExclusao))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelBuscauser, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBuscauser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIcon(){
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/LogoFrame.png")));
    }
    
    private void campoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(campoCodigo.getText().length()>0 && campoNome.getText().length()>0){
                lblInfo2.setText("");
                lblInfo2.setIcon(new ImageIcon(getClass().getResource("")));
                DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
                model.setNumRows(0);
                SearchDao sd = new SearchDao();
                for(UserBean user : sd.procurarUser(Integer.parseInt(campoCodigo.getText()),campoNome.getText())){
                    model.addRow(new Object[]{
                        user.getId(),
                        user.getNome()
                    });
                }
                
                if(model.getRowCount()==0){
                    lblInfo2.setText("Nenhum Registro Encontrado");
                    lblInfo2.setIcon(new ImageIcon(getClass().getResource("../imagens/warningSmall.png")));
                }else{
                    limparInputs(true);
                }
                
            }else{
                lblInfo2.setText("Campo Obrigatório em Branco");
                lblInfo2.setIcon(new ImageIcon(getClass().getResource("../imagens/warningSmall.png")));
            }
        }
    }//GEN-LAST:event_campoNomeKeyPressed

    private void btnConfirmarBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarBuscaActionPerformed
        if(campoCodigo.getText().length()>0 && campoNome.getText().length()>0){
            DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
            model.setNumRows(0);
            SearchDao sd = new SearchDao();
            for(UserBean user : sd.procurarUser(Integer.parseInt(campoCodigo.getText()),campoNome.getText())){
                model.addRow(new Object[]{
                    user.getId(),
                    user.getNome()
                });
            }
            
            if(model.getRowCount()==0){
                lblInfo2.setText("Nenhum Registro Encontrado");
                lblInfo2.setIcon(new ImageIcon(getClass().getResource("../imagens/warningSmall.png")));
            }else{
                limparInputs(true);
            }
            
        }else{
            lblInfo2.setText("Campo Obrigatório em Branco");
            lblInfo2.setIcon(new ImageIcon(getClass().getResource("../imagens/warningSmall.png")));
        }
    }//GEN-LAST:event_btnConfirmarBuscaActionPerformed

    private void btnConfirmarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarExclusaoActionPerformed
        if(tabelaUsuarios.getSelectedRow()==-1){
            lblInfo.setText("Selecione um registro para excluir");
            lblInfo.setIcon(new ImageIcon(getClass().getResource("../imagens/warningSmall.png")));

        }else{
            lblInfo.setText("");
            lblInfo.setIcon(new ImageIcon(getClass().getResource("")));
            int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", "Confirmação", 0);
            if(i==JOptionPane.YES_OPTION){
                DeleteDao delete = new DeleteDao();
                boolean status = delete.deletarUser((int)tabelaUsuarios.getValueAt(tabelaUsuarios.getSelectedRow(),0));
                if(status){
                    JOptionPane.showMessageDialog(this, "Usuario removido com êxito","Êxito",1);
                    limparInputs();
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao deletar o registro, verifique a"
                    + " integridade com o banco","Erro ao deletar o registro",2); 
                }
            }
        }
    }//GEN-LAST:event_btnConfirmarExclusaoActionPerformed

    private void btnLimparInputsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparInputsActionPerformed
        limparInputs(true);
    }//GEN-LAST:event_btnLimparInputsActionPerformed

    private void btnLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTabelaActionPerformed
        limparInputs(false);
    }//GEN-LAST:event_btnLimparTabelaActionPerformed

    private void limparInputs(){
        campoNome.setText("");
        campoCodigo.setText("");
        lblInfo2.setText("");
        lblInfo2.setIcon(new ImageIcon(getClass().getResource("")));
        DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
        model.setNumRows(0);
    }
    
    private void limparInputs(boolean onlyInputs){
        if(onlyInputs){
            campoNome.setText("");
            campoCodigo.setText("");
            lblInfo2.setText("");
            lblInfo2.setIcon(new ImageIcon(getClass().getResource("")));
        }else{
            DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
            model.setNumRows(0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarBusca;
    private javax.swing.JButton btnConfirmarExclusao;
    private javax.swing.JButton btnLimparInputs;
    private javax.swing.JButton btnLimparTabela;
    private javax.swing.JFormattedTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel panelBuscauser;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
