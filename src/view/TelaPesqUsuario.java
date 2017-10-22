package view;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelbean.UserBean;
import modeldao.SearchDao;
/**
 *
 * @author allan
 */
public class TelaPesqUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisa
     */
    
    private static TelaPesqUsuario tela;
    /*variavel estatica para verificar se existe mais de um objeto do mesmo
    tipo aberto*/
    
    public static TelaPesqUsuario getAbrir(){
        if(tela==null){
            tela=new TelaPesqUsuario();
            
        }
        /*se a tela estiver null, ou seja, se nao estiver nada aberto. Abra uma!
        Senao matenha a mesma aberta  */
        return tela;
    }
    public TelaPesqUsuario() {
        initComponents();
        setIcon();
        leituraTabela();
        tabelaResultado.setEnabled(false);
    }

    //muda o icone do jInternalFrame
    private void setIcon() {
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/LogoFrame.png")));
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
        campos = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        campoTipo = new javax.swing.JTextField();
        lblMetodobusca = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        metBusca = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        resultadoBusca = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultado = new javax.swing.JTable();
        todosUsuarios = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPrincipal = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Pesquisa de usuários");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        campos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblTipo.setText("ID");

        campoTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTipoKeyPressed(evt);
            }
        });

        lblMetodobusca.setText("Método de Busca");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        metBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ID", "Login" }));
        metBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout camposLayout = new javax.swing.GroupLayout(campos);
        campos.setLayout(camposLayout);
        camposLayout.setHorizontalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(camposLayout.createSequentialGroup()
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMetodobusca)
                            .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(metBusca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, camposLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        camposLayout.setVerticalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetodobusca))
                .addGap(31, 31, 31)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resultadoBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado da Busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tabelaResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaResultado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaResultado);
        if (tabelaResultado.getColumnModel().getColumnCount() > 0) {
            tabelaResultado.getColumnModel().getColumn(0).setResizable(false);
            tabelaResultado.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout resultadoBuscaLayout = new javax.swing.GroupLayout(resultadoBusca);
        resultadoBusca.setLayout(resultadoBuscaLayout);
        resultadoBuscaLayout.setHorizontalGroup(
            resultadoBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        resultadoBuscaLayout.setVerticalGroup(
            resultadoBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        todosUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Todos os Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tabelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPrincipal.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaPrincipal);
        if (tabelaPrincipal.getColumnModel().getColumnCount() > 0) {
            tabelaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tabelaPrincipal.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAtualizar.setText("Atualizar Lista");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout todosUsuariosLayout = new javax.swing.GroupLayout(todosUsuarios);
        todosUsuarios.setLayout(todosUsuariosLayout);
        todosUsuariosLayout.setHorizontalGroup(
            todosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(todosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(todosUsuariosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, todosUsuariosLayout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addGap(34, 34, 34))))
        );
        todosUsuariosLayout.setVerticalGroup(
            todosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAtualizar)
                .addContainerGap())
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(todosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo para mudar a label quando uma categoria no combo box e selecionado
    private void metBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metBuscaActionPerformed
        if(metBusca.getSelectedItem().toString().equals("Login")){
            lblTipo.setText("Login: ");
        }else if(metBusca.getSelectedItem().toString().equals("ID")){
            lblTipo.setText("ID");
        }
    }//GEN-LAST:event_metBuscaActionPerformed
    //Metodo para mostrar o resultado da busca por tipo definido no combobox
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (metBusca.getSelectedItem().toString()) {
            case "Selecione":
                JOptionPane.showMessageDialog(null,"Selecione um método de busca");
                break;
            case "ID":
                {
                    if(!tabelaResultado.isEnabled()){
                        tabelaResultado.setEnabled(true);
                    }
                    DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
                    model.setNumRows(0); 
                    SearchDao sd = new SearchDao();
                    for(UserBean user: sd.procurarUser(Integer.parseInt(campoTipo.getText()))){
                        model.addRow(new Object[]{
                            user.getId(),
                            user.getNome(),
                        });
                    }       
                    break;
                }
            default:
                {   
                    if(!tabelaResultado.isEnabled()){
                        tabelaResultado.setEnabled(true);
                    }
                    DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
                    model.setNumRows(0);
                    SearchDao sd = new SearchDao();
                    for(UserBean user: sd.procurarUser(campoTipo.getText())){
                        model.addRow(new Object[]{
                            user.getId(),
                            user.getNome(),
                        });
                    }       
                    break;
                }
        }
       
    }//GEN-LAST:event_btnBuscarActionPerformed
    //fecha a tela e limpa os campos
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        metBusca.setSelectedItem("Selecione");
        campoTipo.setText("");
        atualizarTabelaDados();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    /* Metodo para definir a posicao fixa do JinternalFrame (Aplicavel 
    em janelas que estao como default Maximizaveis
    */
    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved

    }//GEN-LAST:event_formComponentMoved
    //Botao para atualizar a lista dos dados
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizarTabelaDados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void atualizarTabelaDados(){
        DefaultTableModel model = (DefaultTableModel) tabelaPrincipal.getModel();
        model.setNumRows(0);
        SearchDao sd = new SearchDao();
        for(UserBean user: sd.procurarUser()){
            model.addRow(new Object[]{
                user.getId(),
                user.getNome(),
            });
        }
    }
    private void campoTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTipoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            switch (metBusca.getSelectedItem().toString()) {
                case "Selecione":
                    JOptionPane.showMessageDialog(null,"Selecione um método de busca");
                    break;
                case "ID":
                    {   if(!tabelaResultado.isEnabled()){
                            tabelaResultado.setEnabled(true);
                        }
                        DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
                        model.setNumRows(0); 
                        SearchDao sd = new SearchDao();
                        for(UserBean user: sd.procurarUser(Integer.parseInt(campoTipo.getText()))){
                            model.addRow(new Object[]{
                                user.getId(),
                                user.getNome(),
                            });
                        }       
                        break;
                    }
                default:
                    {   
                        if(!tabelaResultado.isEnabled()){
                            tabelaResultado.setEnabled(true);
                        }
                        DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
                        model.setNumRows(0);
                        SearchDao sd = new SearchDao();
                        for(UserBean user: sd.procurarUser(campoTipo.getText())){
                            model.addRow(new Object[]{
                                user.getId(),
                                user.getNome(),
                            });
                        }       
                        break;
                    }
             }
        }    
    }//GEN-LAST:event_campoTipoKeyPressed
    
    //metodo para preencher o Jtable no construtor do frame
    private void leituraTabela(){
        DefaultTableModel model = (DefaultTableModel) tabelaPrincipal.getModel();
        SearchDao sd = new SearchDao();
        for(UserBean user: sd.procurarUser()){
            model.addRow(new Object[]{
                user.getId(),
                user.getNome(),
            });
        }
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JPanel campos;
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMetodobusca;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JComboBox<String> metBusca;
    private javax.swing.JPanel resultadoBusca;
    private javax.swing.JTable tabelaPrincipal;
    private javax.swing.JTable tabelaResultado;
    private javax.swing.JPanel todosUsuarios;
    // End of variables declaration//GEN-END:variables
}