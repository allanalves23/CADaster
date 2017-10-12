package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelbean.StudentBean;
import modeldao.SearchDao;

/**
 *
 * @author allan
 */
public class TelaPesqAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesqAluno
     */
    private static TelaPesqAluno tela;
    /*variavel estatica para verificar se existe mais de um objeto do mesmo
    tipo aberto*/ 
    
    public static TelaPesqAluno getAbrir(){
        if(tela==null){
            tela=new TelaPesqAluno();
        }
        /*se a tela estiver null, ou seja, se nao estiver nada aberto. Abra uma!
        Senao matenha a mesma aberta  */
        return tela;
    }
    public TelaPesqAluno() {
        initComponents();
        setIcon();
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

        grupoTipoPesquisa = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        campos = new javax.swing.JPanel();
        tipoGrauAluno = new javax.swing.JComboBox<>();
        lblGraualyno = new javax.swing.JLabel();
        btnConfirma = new javax.swing.JButton();
        lblBusca = new javax.swing.JLabel();
        campoBusca = new javax.swing.JFormattedTextField();
        btnSair = new javax.swing.JButton();
        radioBtnMatricula = new javax.swing.JRadioButton();
        radioBtnNome = new javax.swing.JRadioButton();
        radioBtnCPF = new javax.swing.JRadioButton();
        lblTipoPesquisa = new javax.swing.JLabel();
        radioBtnTodos = new javax.swing.JRadioButton();
        campoNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaStudent = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Pesquisar aluno");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        campos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tipoGrauAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Primario", "Ginasio", "Ensino Medio", "Tecnico" }));
        tipoGrauAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoGrauAlunoActionPerformed(evt);
            }
        });

        lblGraualyno.setText("Grau do aluno");

        btnConfirma.setText("Confirmar");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        lblBusca.setText("Matricula");

        try {
            campoBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        grupoTipoPesquisa.add(radioBtnMatricula);
        radioBtnMatricula.setText("Matricula");
        radioBtnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMatriculaActionPerformed(evt);
            }
        });

        grupoTipoPesquisa.add(radioBtnNome);
        radioBtnNome.setText("Nome");
        radioBtnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNomeActionPerformed(evt);
            }
        });

        grupoTipoPesquisa.add(radioBtnCPF);
        radioBtnCPF.setText("CPF");
        radioBtnCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCPFActionPerformed(evt);
            }
        });

        lblTipoPesquisa.setText("Tipo de pesquisa");

        grupoTipoPesquisa.add(radioBtnTodos);
        radioBtnTodos.setText("Todos");
        radioBtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout camposLayout = new javax.swing.GroupLayout(campos);
        campos.setLayout(camposLayout);
        camposLayout.setHorizontalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirma)
                .addGap(23, 23, 23))
            .addGroup(camposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGraualyno)
                    .addComponent(tipoGrauAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(camposLayout.createSequentialGroup()
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoPesquisa)
                            .addComponent(lblBusca)
                            .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(camposLayout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoNome)))
                    .addGroup(camposLayout.createSequentialGroup()
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnTodos)
                            .addComponent(radioBtnMatricula))
                        .addGap(36, 36, 36)
                        .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnNome)
                            .addComponent(radioBtnCPF))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        camposLayout.setVerticalGroup(
            camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblGraualyno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoGrauAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lblTipoPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnMatricula)
                    .addComponent(radioBtnNome))
                .addGap(13, 13, 13)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnTodos)
                    .addComponent(radioBtnCPF))
                .addGap(20, 20, 20)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnConfirma))
                .addGap(229, 229, 229))
        );

        tabelaStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "CPF", "Data de Nascimento", "CEP", "Endereco", "Bairro", "Responsável", "Nome do Mãe", "Nome da Pai", "Grau", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaStudent.setAutoscrolls(false);
        tabelaStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaStudent.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaStudent);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                .addContainerGap())
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

    /* Metodo para definir a posicao fixa do JinternalFrame (Aplicavel 
    em janelas que estao como default Maximizaveis
    */
    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        
    }//GEN-LAST:event_formComponentMoved

    //fecha a tela
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        String parametroGrau="";
        String parametroTipo;
        
        
        if(!tipoGrauAluno.getSelectedItem().toString().equals("Selecione")){
            switch(tipoGrauAluno.getSelectedItem().toString()){
                case "Primario":
                parametroGrau="anoPrimario";
                break;
                case "Ginasio":
                parametroGrau="anoGinasio";
                break;
                case "Ensino Medio":
                parametroGrau="anoEM";
                break;
                case "Tecnico":
                parametroGrau="anoTecnico";
                break;
            }
            
            
            if(!(radioBtnCPF.isSelected() ||radioBtnNome.isSelected() || radioBtnMatricula.isSelected() || radioBtnTodos.isSelected())){
                JOptionPane.showMessageDialog(null, "Selecione um parâmetro de pesqusia", "Nenhum parâmetro selecionado", 2);            
            }
            

            if(radioBtnCPF.isSelected()){
                parametroTipo = "CPF";
                DefaultTableModel model = (DefaultTableModel) tabelaStudent.getModel();
                model.setNumRows(0);
                SearchDao sd = new SearchDao();
                for(StudentBean student : sd.procurarStudent(parametroGrau, parametroTipo, campoBusca.getText())){
                    model.addRow(new Object[]{
                    student.getMatricula(),
                    student.getNome(),
                    student.getCPF(),
                    student.getDataNasc(),
                    student.getCEP(),
                    student.getEndereco(),
                    student.getBairro(),
                    student.getResponsavel(),
                    student.getNomeMae(),
                    student.getNomePai(),
                    student.getGrau(),
                    student.getAno()
                  });
              }
           }
            
            
           if(radioBtnMatricula.isSelected()){
                parametroTipo = "matricula";
                DefaultTableModel model = (DefaultTableModel) tabelaStudent.getModel();
                model.setNumRows(0);
                SearchDao sd = new SearchDao();
                for(StudentBean student : sd.procurarStudent(parametroGrau, parametroTipo, campoBusca.getText())){
                    model.addRow(new Object[]{
                    student.getMatricula(),
                    student.getNome(),
                    student.getCPF(),
                    student.getDataNasc(),
                    student.getCEP(),
                    student.getEndereco(),
                    student.getBairro(),
                    student.getResponsavel(),
                    student.getNomeMae(),
                    student.getNomePai(),
                    student.getGrau(),
                    student.getAno()
                  });
              }
           }
           
           
           
           if(radioBtnNome.isSelected()){
              parametroTipo = "nome";
              DefaultTableModel model = (DefaultTableModel) tabelaStudent.getModel();
              model.setNumRows(0);
              SearchDao sd = new SearchDao();
              for(StudentBean student : sd.procurarStudent(parametroGrau, parametroTipo, campoNome.getText())){
                  model.addRow(new Object[]{
                    student.getMatricula(),
                    student.getNome(),
                    student.getCPF(),
                    student.getDataNasc(),
                    student.getCEP(),
                    student.getEndereco(),
                    student.getBairro(),
                    student.getResponsavel(),
                    student.getNomeMae(),
                    student.getNomePai(),
                    student.getGrau(),
                    student.getAno()
                  });
              }
              campoNome.setText("");
           }
           
           

           if(radioBtnTodos.isSelected()){
              parametroTipo = "Todos";
              DefaultTableModel model = (DefaultTableModel) tabelaStudent.getModel();
              model.setNumRows(0);
              SearchDao sd = new SearchDao();
              for(StudentBean student : sd.procurarStudent(parametroGrau, parametroTipo)){
                  model.addRow(new Object[]{
                    student.getMatricula(),
                    student.getNome(),
                    student.getCPF(),
                    student.getDataNasc(),
                    student.getCEP(),
                    student.getEndereco(),
                    student.getBairro(),
                    student.getResponsavel(),
                    student.getNomeMae(),
                    student.getNomePai(),
                    student.getGrau(),
                    student.getAno()
                  });
              }
           }
           
           campoBusca.setText("");
           
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um tipo de aluno para pesquisar", "Tipo de aluno nao selecionado", 2);
        }
        
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void radioBtnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMatriculaActionPerformed
        lblBusca.setText("Matricula");
        lblNome.setText("");
        try {
            campoBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
            campoBusca.setEnabled(true);
            campoNome.setVisible(false);
        } catch (java.text.ParseException ex) {
        }
    }//GEN-LAST:event_radioBtnMatriculaActionPerformed

    private void radioBtnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNomeActionPerformed
        campoBusca.setEnabled(false);
        campoBusca.setText("");
        lblNome.setText("Nome");
        campoNome.setVisible(true);
        
    }//GEN-LAST:event_radioBtnNomeActionPerformed

    private void radioBtnCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCPFActionPerformed
        lblBusca.setText("CPF");
        lblNome.setText("");
        try {
            campoBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            campoBusca.setEnabled(true);
            campoNome.setVisible(false);
        } catch (java.text.ParseException ex) {
        }
    }//GEN-LAST:event_radioBtnCPFActionPerformed

    private void radioBtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnTodosActionPerformed
        lblBusca.setText("Todos os alunos");
        lblNome.setText("");
        campoBusca.setEnabled(false);
        campoNome.setVisible(false);
    }//GEN-LAST:event_radioBtnTodosActionPerformed

    private void tipoGrauAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoGrauAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoGrauAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnSair;
    private javax.swing.JFormattedTextField campoBusca;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPanel campos;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoTipoPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblGraualyno;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipoPesquisa;
    private javax.swing.JRadioButton radioBtnCPF;
    private javax.swing.JRadioButton radioBtnMatricula;
    private javax.swing.JRadioButton radioBtnNome;
    private javax.swing.JRadioButton radioBtnTodos;
    private javax.swing.JTable tabelaStudent;
    private javax.swing.JComboBox<String> tipoGrauAluno;
    // End of variables declaration//GEN-END:variables
}
