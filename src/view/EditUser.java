package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelbean.UserBean;
import modeldao.SearchDao;
import modeldao.UpdateDao;

/**
 *
 * @author allan
 */
public class EditUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditUser
     */
    private static EditUser tela;
    /*variavel estatica para verificar se existe mais de um objeto do mesmo
    tipo aberto*/    
    
    public static EditUser getAbrir(){
        if(tela==null){
            tela= new EditUser();
        }
        return tela;
        /*se a tela estiver null, ou seja, se nao estiver nada aberto. Abra uma!
        Senao matenha a mesma aberta  */
        
    }
    
    
    public EditUser() {
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

        fundo = new javax.swing.JPanel();
        lblTipocampo = new javax.swing.JTextField();
        lblTipodado = new javax.swing.JLabel();
        metBusca = new javax.swing.JComboBox<>();
        lblMetbusca = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEditar = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Alterar dados de usuario");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        fundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblTipocampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblTipocampoKeyPressed(evt);
            }
        });

        lblTipodado.setText("ID");

        metBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ID", "Login" }));
        metBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metBuscaActionPerformed(evt);
            }
        });

        lblMetbusca.setText("Método de Busca");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMetbusca)
                    .addComponent(lblTipodado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(metBusca, 0, 169, Short.MAX_VALUE)
                        .addComponent(lblTipocampo))))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetbusca))
                .addGap(31, 31, 31)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipodado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipocampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnBuscar))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        tabelaEditar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "LOGIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEditar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaEditar);
        if (tabelaEditar.getColumnModel().getColumnCount() > 0) {
            tabelaEditar.getColumnModel().getColumn(0).setResizable(false);
            tabelaEditar.getColumnModel().getColumn(1).setResizable(false);
        }

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnConfirmar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Modificar visualização da label enquanto o combo box e selecionado
    private void metBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metBuscaActionPerformed
        if(metBusca.getSelectedItem().toString().equals("Login")){
            lblTipodado.setText("Login: ");
        }else if(metBusca.getSelectedItem().toString().equals("ID")){
            lblTipodado.setText("ID");
        }
    }//GEN-LAST:event_metBuscaActionPerformed

    //Verificacao do tipo de metodo de busca
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (metBusca.getSelectedItem().toString()) {
            case "Selecione":
            {
                JOptionPane.showMessageDialog(null,"Selecione um método de busca");
                break;
            }
            case "Login":
            {
                DefaultTableModel model = (DefaultTableModel) tabelaEditar.getModel();
                model.setRowCount(0);
                SearchDao sd = new SearchDao();
                for(UserBean user: sd.procurarUser(lblTipocampo.getText())){
                    model.addRow(new Object[]{
                        user.getId(),
                        user.getNome(),
                    });
                }
                break;
            }
            default:
            {
                DefaultTableModel model = (DefaultTableModel) tabelaEditar.getModel();
                model.setRowCount(0);
                SearchDao sd = new SearchDao();
                for(UserBean user: sd.procurarUser(Integer.parseInt(lblTipocampo.getText()))){
                    model.addRow(new Object[]{
                        user.getId(),
                        user.getNome(),
                    });
                }
                break;
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Metodo de fechar a tela
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        metBusca.setSelectedItem("Selecione");
        lblTipocampo.setText("");
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    /*Metodo de definir a posicao do JinternalFrame de maneira fixa (Aplicavel 
    em janelas maximizadas)
    */
    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        
    }//GEN-LAST:event_formComponentMoved
    
    
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       if(tabelaEditar.getSelectedRow() != -1){
           SearchDao sd = new SearchDao();
           int id=(int)tabelaEditar.getValueAt(tabelaEditar.getSelectedRow(), 0);
           String login=tabelaEditar.getValueAt(tabelaEditar.getSelectedRow(), 1).toString();
           int control=0;
           for(UserBean user:sd.procurarUser()){
              if(user.getId()==id){
                  if(!user.getNome().equals(login)){
                      UpdateDao upd = new UpdateDao();
                      upd.updateUser("UPDATE usuario SET login = ? WHERE id = ?",login,id);
                      control++;
                  }
              }
           }
           switch(control){
                     case 0:
                        {
                         JOptionPane.showMessageDialog(null, "Você não pode modificar pelo mesmo registro");
                         break;
                        }
                     case 1:
                        {
                         JOptionPane.showMessageDialog(null, "Registro atualizado");
                         DefaultTableModel model = (DefaultTableModel) tabelaEditar.getModel();
                         model.removeRow(tabelaEditar.getSelectedRow());
                         break;
                        }
                 }
       }else{
           JOptionPane.showMessageDialog(null, "Nenhum registro selecionado!");
       }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void lblTipocampoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblTipocampoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            switch (metBusca.getSelectedItem().toString()) {
                case "Selecione":
                {
                    JOptionPane.showMessageDialog(null,"Selecione um método de busca");
                    break;
                }
                case "Login":
                {
                    DefaultTableModel model = (DefaultTableModel) tabelaEditar.getModel();
                    model.setRowCount(0);
                    SearchDao sd = new SearchDao();
                    for(UserBean user: sd.procurarUser(lblTipocampo.getText())){
                        model.addRow(new Object[]{
                            user.getId(),
                            user.getNome(),
                        });
                    }
                    break;
                }
                default:
                {
                    DefaultTableModel model = (DefaultTableModel) tabelaEditar.getModel();
                    model.setRowCount(0);
                    SearchDao sd = new SearchDao();
                    for(UserBean user: sd.procurarUser(Integer.parseInt(lblTipocampo.getText()))){
                        model.addRow(new Object[]{
                            user.getId(),
                            user.getNome(),
                        });
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_lblTipocampoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMetbusca;
    private javax.swing.JTextField lblTipocampo;
    private javax.swing.JLabel lblTipodado;
    private javax.swing.JComboBox<String> metBusca;
    private javax.swing.JTable tabelaEditar;
    // End of variables declaration//GEN-END:variables
}
