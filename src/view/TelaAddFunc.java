package view;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author allan
 */
public class TelaAddFunc extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaProfessor
     */
    private static TelaAddFunc tela;
    /*variavel estatica para verificar se existe mais de um objeto do mesmo
    tipo aberto*/
    private URL url;
    
    public static TelaAddFunc getAbrir(){
      if(tela==null){
          tela=new TelaAddFunc();
      }  
      /*se a tela estiver null, ou seja, se nao estiver nada aberto. Abra uma!
        Senao matenha a mesma aberta  */
      return tela;
    }
    public TelaAddFunc() {
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

        sexoBtnGroup = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        lblNasc = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JFormattedTextField();
        campoNasc = new javax.swing.JFormattedTextField();
        rBtnmasc = new javax.swing.JRadioButton();
        rBtnfem = new javax.swing.JRadioButton();
        lblSexo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnLimparCampo = new javax.swing.JButton();
        lblCEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JFormattedTextField();
        lblEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        tipoCargo = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        campoSalario = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Cadastrar Funcionário");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        fundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblNome.setText("Nome");

        lblNasc.setText("Data de Nascimento");

        lblCPF.setText("CPF");

        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        sexoBtnGroup.add(rBtnmasc);
        rBtnmasc.setText("Masculino");

        sexoBtnGroup.add(rBtnfem);
        rBtnfem.setText("Feminino");

        lblSexo.setText("Sexo");

        btnCadastrar.setText("Cadastrar");

        btnLimparCampo.setText("Limpar Campos");
        btnLimparCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCampoActionPerformed(evt);
            }
        });

        lblCEP.setText("CEP");

        try {
            campoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco.setText("Endereço");

        lblCargo.setText("Cargo");

        tipoCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Professor", "Diretor", "Administrativo", "Servicos Gerais", "Outros" }));

        lblSalario.setText("Salario");

        campoSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(lblCEP)
                    .addComponent(lblCPF)
                    .addComponent(lblNasc)
                    .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoCEP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoNasc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo)
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addComponent(rBtnmasc)
                                .addGap(18, 18, 18)
                                .addComponent(rBtnfem))
                            .addComponent(btnLimparCampo))
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCargo)
                                    .addComponent(lblSalario)
                                    .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(lblSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnmasc)
                    .addComponent(rBtnfem)
                    .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(lblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampo)
                    .addComponent(btnCadastrar))
                .addContainerGap(144, Short.MAX_VALUE))
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
    
    //muda o icone do jInternalFrame
    private void setIcon() {
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/LogoFrame.png")));
    }
    
    /* Metodo para definir a posicao fixa do JinternalFrame (Aplicavel 
    em janelas que estao como default Maximizaveis
    */
    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
       
    }//GEN-LAST:event_formComponentMoved

   //fecha a tela
    private void btnLimparCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCampoActionPerformed
        campoCEP.setText("");
        campoCPF.setText("");
        campoEndereco.setText("");
        campoNome.setText("");
        campoSalario.setText("");
        campoNasc.setText("");
        tipoCargo.setSelectedItem("Selecione");
        if(rBtnfem.isSelected()){
            rBtnfem.setSelected(false);
        }
        if(rBtnmasc.isSelected()){
            rBtnmasc.setSelected(false);
        }
    }//GEN-LAST:event_btnLimparCampoActionPerformed

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimparCampo;
    private javax.swing.JFormattedTextField campoCEP;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JFormattedTextField campoNasc;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoSalario;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rBtnfem;
    private javax.swing.JRadioButton rBtnmasc;
    private javax.swing.ButtonGroup sexoBtnGroup;
    private javax.swing.JComboBox<String> tipoCargo;
    // End of variables declaration//GEN-END:variables
}
