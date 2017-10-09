package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelbean.StudentBean;
import modeldao.DeleteDao;
import modeldao.SearchDao;

/**
 *
 * @author allan
 */
public class TelaDelAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaDelAluno
     */
    private static TelaDelAluno tela;
    /*variavel estatica para verificar se existe mais de um objeto do mesmo
    tipo aberto*/ 
    
    public static TelaDelAluno getAbrir(){
        if(tela==null){
            tela=new TelaDelAluno();
            
        }
        /*se a tela estiver null, ou seja, se nao estiver nada aberto. Abra uma!
        Senao matenha a mesma aberta  */
        return tela;
    }
    public TelaDelAluno() {
        initComponents();
        btnConfirmarExclusao.setEnabled(false);
        btnLimparTabela.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("school?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        usuarioQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        usuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuarioQuery.getResultList();
        fundo = new javax.swing.JPanel();
        campos = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaStudents = new javax.swing.JTable();
        btnConfirmarExclusao = new javax.swing.JButton();
        btnLimparTabela = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Remover aluno");
        setToolTipText("");
        setFrameIcon(null);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        campos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblNome.setText("Nome");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout camposLayout = new javax.swing.GroupLayout(campos);
        campos.setLayout(camposLayout);
        camposLayout.setHorizontalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camposLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camposLayout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        camposLayout.setVerticalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        tabelaStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Grau", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaStudents.getTableHeader().setReorderingAllowed(false);
        tabelaStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaStudents);
        if (tabelaStudents.getColumnModel().getColumnCount() > 0) {
            tabelaStudents.getColumnModel().getColumn(3).setResizable(false);
        }

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

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnLimparTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmarExclusao)
                        .addGap(39, 39, 39))))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarExclusao)
                    .addComponent(btnLimparTabela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    //fechar a tela
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    
    
    
    /* Metodo para definir a posicao fixa do JinternalFrame (Aplicavel 
    em janelas que estao como default Maximizaveis
    */
    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        this.setLocation(0, 0);
    }//GEN-LAST:event_formComponentMoved

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(!campoNome.getText().equals("")){
            leituraTabela(campoNome.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void tabelaStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaStudentsMouseClicked
      //Implementar..
    }//GEN-LAST:event_tabelaStudentsMouseClicked

    private void btnLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTabelaActionPerformed
        if(tabelaStudents.getRowCount()>0){
            DefaultTableModel model = (DefaultTableModel) tabelaStudents.getModel();
            model.setNumRows(0);
        }
    }//GEN-LAST:event_btnLimparTabelaActionPerformed

    private void btnConfirmarExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarExclusaoActionPerformed
        if(tabelaStudents.getSelectedRow()==-1)
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        else{
            Object registro = tabelaStudents.getValueAt(tabelaStudents.getSelectedRow(), 0);
            String matricula = registro.toString();
            DeleteDao del = new DeleteDao();
            int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o registro?",
                    "Confirmar Exclusão",JOptionPane.YES_NO_OPTION);
            if(i == JOptionPane.YES_OPTION){
                del.deletarStudent(matricula);
                btnLimparTabelaActionPerformed(evt);
                campoNome.setText("");
            }
        }
    }//GEN-LAST:event_btnConfirmarExclusaoActionPerformed

    private boolean leituraTabela(String nome){
        DefaultTableModel model = (DefaultTableModel) tabelaStudents.getModel();
        model.setNumRows(0);
        SearchDao sd = new SearchDao();
        for(StudentBean student : sd.procurarStudent(nome)){
            model.addRow(new Object[]{
                student.getMatricula(),
                student.getNome(),
                student.getGrau(),
                student.getAno()
            });
        }
        if(model.getRowCount()==0){
            if(btnConfirmarExclusao.isEnabled() && btnLimparTabela.isEnabled()){
                btnConfirmarExclusao.setEnabled(false);
                btnLimparTabela.setEnabled(false);
            }
            return false;
        }
        btnConfirmarExclusao.setEnabled(true);
        btnLimparTabela.setEnabled(true);
        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmarExclusao;
    private javax.swing.JButton btnLimparTabela;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPanel campos;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tabelaStudents;
    private java.util.List<view.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    // End of variables declaration//GEN-END:variables
}
