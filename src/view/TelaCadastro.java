package view;

import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modelbean.UserBean;
import modeldao.UserDao;

/**
 *
 * @author allan
 */
public class TelaCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    
    private static TelaCadastro telaCad;
    /*variavel estatica para verificar se existe mais de um objeto do mesmo
    tipo aberto*/
    
    public static TelaCadastro getAbrir(){
        if(telaCad==null){
            telaCad=new TelaCadastro();
        }
        /*se a tela estiver null, ou seja, se nao estiver nada aberto. Abra uma!
        Senao mantenha a mesma aberta  */
        return telaCad;
    }
    
    public TelaCadastro() {
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

        sexo = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblSenha2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        campoSenha2 = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cadTipofunc = new javax.swing.JComboBox<>();
        areaTexto = new javax.swing.JPanel();
        descTexto = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btnSobre = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADaster - Cadastro de usuários");

        lblLogin.setText("Login");

        lblSenha.setText("Senha");

        lblSenha2.setText("Confirmar senha");

        campoSenha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenha2KeyPressed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        btnCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarKeyPressed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo");

        cadTipofunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Comum", "Funcionario", "Administrador" }));
        cadTipofunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadTipofuncActionPerformed(evt);
            }
        });
        cadTipofunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadTipofuncKeyPressed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descTexto.setViewportView(textArea);

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaTextoLayout = new javax.swing.GroupLayout(areaTexto);
        areaTexto.setLayout(areaTextoLayout);
        areaTextoLayout.setHorizontalGroup(
            areaTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaTextoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        areaTextoLayout.setVerticalGroup(
            areaTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaTextoLayout.createSequentialGroup()
                .addComponent(descTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre)
                .addContainerGap())
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLogin)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenha)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSenha2)
                                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(campoSenha2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblTipo)
                                    .addComponent(cadTipofunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(90, 90, 90)
                        .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSenha2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadTipofunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSair)
                            .addComponent(btnCadastrar))
                        .addGap(64, 64, 64))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
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
    
    //Cadastro de usuarios
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(!(Arrays.toString(campoSenha.getPassword()).equals(Arrays.toString(campoSenha2.getPassword())))){
            JOptionPane.showMessageDialog(null, "As senhas não conferem\nDigite novamente");
        }else if(campoNome.getText().equals("") || Arrays.toString(campoSenha.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null, "Um ou mais campos estão em branco");
        
        }else{
            UserBean dados = new UserBean();//Recebe os dados do formulario e
            //passa para o DAO
            UserDao insert = new UserDao(); //DAO criado
            dados.setNome(campoNome.getText());
            dados.setSenha(new String(campoSenha.getPassword()));
            dados.setPermissao(cadTipofunc.getSelectedItem().toString());
            
            insert.criar(dados); //Comando para inserção dos dados
        }
        campoNome.setText("");
        campoSenha.setText("");
        campoSenha2.setText("");
        cadTipofunc.setSelectedItem("Selecione");
        //Reseta os campos ao terminar de inserir um registro
    }//GEN-LAST:event_btnCadastrarActionPerformed
    //fechar a tela
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed
    //Metodo para imprimir uma descrição da categoria conforme o combox
    private void cadTipofuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadTipofuncActionPerformed
        switch(cadTipofunc.getSelectedItem().toString()){
            case "Comum":
                textArea.setText("Cadastro do tipo 'Comum' retém permissões "
                        + "de acesso de somente aos alunos do sistema, não possui "
                        + "qualquer tipo de acesso a alterações aos registros de "
                        + "qualquer setor. Somente usuários do tipo funcionário "
                        + "e administrador podem registrar usuários do tipo "
                        + "'Comum'");
                break;
            case "Funcionario":
                textArea.setText("Cadastro do tipo 'Funcionario' retém permissões "
                        + "de acesso à registros de alunos e usuários do sistema.\n"
                        + "Possui Capacidade de alterar registros de usuários do "
                        + "tipo 'Usuario' e de alunos do sistema. Não possui "
                        + "capacidade de visualizar outros funcionários do sistema "
                        + "e também não consegue deletar cadastros de alunos, somente "
                        + "de usuários do tipo 'Usuario'");
                break;
            case "Administrador":
                textArea.setText("Cadastro do tipo 'Administrador' retém todas as "
                        + "permissões de gerenciamento do sistema.\n"
                        + "Remoção de todos os registros de todos os setores, "
                        + "alteração e inserção.");
                break;
           default:
               textArea.setText("Nenhum tipo de usuário selecionado");
                
                
        }
        
    }//GEN-LAST:event_cadTipofuncActionPerformed
    //Metodo para imprimir um "sobre"
    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        textArea.setText("O cadastro de usuario é referênte a adição de Logins "
        +"ao sistema, cada usuario terá um nível de privilégio ao ser adicionado.\n "
        +"Selecione os tipos de cadastros existêntes para uma breve explicação."
        +"Mais detalhes consulte a documentação");
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void campoSenha2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenha2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!(Arrays.toString(campoSenha.getPassword()).equals(Arrays.toString(campoSenha2.getPassword())))){
                JOptionPane.showMessageDialog(null, "As senhas não conferem\nDigite novamente");
            }else if(campoNome.getText().equals("") || Arrays.toString(campoSenha.getPassword()).equals("")){
                JOptionPane.showMessageDialog(null, "Um ou mais campos estão em branco");
            }else{
                UserBean dados = new UserBean();//Recebe os dados do formulario e
                //passa para o DAO
                UserDao insert = new UserDao(); //DAO criado
                dados.setNome(campoNome.getText());
                dados.setSenha(new String(campoSenha.getPassword()));
                dados.setPermissao(cadTipofunc.getSelectedItem().toString());

                insert.criar(dados); //Comando para inserção dos dados
            }
            campoNome.setText("");
            campoSenha.setText("");
            campoSenha2.setText("");
            cadTipofunc.setSelectedItem("Selecione");
            //Reseta os campos ao terminar de inserir um registro
        }
    }//GEN-LAST:event_campoSenha2KeyPressed

    private void cadTipofuncKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadTipofuncKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!(Arrays.toString(campoSenha.getPassword()).equals(Arrays.toString(campoSenha2.getPassword())))){
                JOptionPane.showMessageDialog(null, "As senhas não conferem\nDigite novamente");
            }else if(campoNome.getText().equals("") || Arrays.toString(campoSenha.getPassword()).equals("")){
                JOptionPane.showMessageDialog(null, "Um ou mais campos estão em branco");
            }else{
                UserBean dados = new UserBean();//Recebe os dados do formulario e
                //passa para o DAO
                UserDao insert = new UserDao(); //DAO criado
                dados.setNome(campoNome.getText());
                dados.setSenha(new String(campoSenha.getPassword()));
                dados.setPermissao(cadTipofunc.getSelectedItem().toString());

                insert.criar(dados); //Comando para inserção dos dados
            }
            campoNome.setText("");
            campoSenha.setText("");
            campoSenha2.setText("");
            cadTipofunc.setSelectedItem("Selecione");
            //Reseta os campos ao terminar de inserir um registro
        }
    }//GEN-LAST:event_cadTipofuncKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaTexto;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSobre;
    private javax.swing.JComboBox<String> cadTipofunc;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPasswordField campoSenha2;
    private javax.swing.JScrollPane descTexto;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JLabel lblTipo;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
