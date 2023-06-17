package view;

import java.awt.event.KeyEvent;
import java.util.List;
import model.Usuarios;
import repositorios.RepUsuarios;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class TelaUsuarios extends javax.swing.JDialog {

    RepUsuarios repUsuarios = new RepUsuarios();
    List<Usuarios> usuarios;

    public TelaUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        jTextFieldCodigo.setEnabled(false);
        habilitarCampos(false);
        jTextFieldProcurar.requestFocus();
        usuarios = repUsuarios.retornar();
        preencherJTable(usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jLabelUF = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldProcurar = new javax.swing.JTextField();
        jLabelProcurar = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setSelectionColor(new java.awt.Color(0, 0, 255));

        jLabelNome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("Nome");

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setSelectionColor(new java.awt.Color(0, 0, 255));

        jLabelEndereco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEndereco.setText("Endereço");

        jTextFieldEndereco.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldEndereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEndereco.setSelectionColor(new java.awt.Color(0, 0, 255));

        jTextFieldBairro.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldBairro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldBairro.setSelectionColor(new java.awt.Color(0, 0, 255));

        jLabelBairro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBairro.setText("Bairro");

        jLabelCidade.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCidade.setText("Cidade");

        jTextFieldCidade.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCidade.setSelectionColor(new java.awt.Color(0, 0, 255));

        jComboBoxUF.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUFActionPerformed(evt);
            }
        });

        jLabelUF.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelUF.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUF.setText("UF");

        jLabelTelefone.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelefone.setText("Telefone");

        jLabelEmail.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Email");

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setSelectionColor(new java.awt.Color(0, 0, 255));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelSexo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSexo.setText("Sexo");

        buttonGroup1.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRadioButtonMasculino.setText("M");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRadioButtonFeminino.setText("F");

        jTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Endereço", "Bairro", "Cidade", "UF", "Telefone", "Email", "Sexo"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButtonNovo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldProcurar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldProcurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldProcurar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldProcurar.setSelectionColor(new java.awt.Color(0, 0, 255));
        jTextFieldProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProcurarActionPerformed(evt);
            }
        });
        jTextFieldProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarKeyPressed(evt);
            }
        });

        jLabelProcurar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelProcurar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelProcurar.setText("Procurar Nome");

        jTextFieldTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEndereco)))
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigo)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBairro)
                                .addGap(251, 251, 251))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSexo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonFeminino)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabelUF)))
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovo)
                        .addGap(180, 180, 180))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelUF)
                    .addComponent(jLabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFeminino))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProcurar)
                    .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jComboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        limparCampos();
        habilitarCampos(true);
        jTextFieldNome.requestFocus();

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Editora");
            jTextFieldEmail.requestFocus();
        } else {
            Usuarios u = new Usuarios();
            u.setNome(jTextFieldNome.getText());
            u.setEndereço(jTextFieldEndereco.getText());
            u.setBairro(jTextFieldBairro.getText());
            u.setCidade(jTextFieldCidade.getText());
            u.setUF((String) jComboBoxUF.getSelectedItem());
            u.setTelefone(jTextFieldTelefone.getText());
            u.setEmail(jTextFieldEmail.getText());
            if (jRadioButtonFeminino.isSelected()) {
                u.setSexo("F");
            } else if (jRadioButtonMasculino.isSelected()) {
                u.setSexo("M");
            }

            if (jTextFieldCodigo.getText().equals("")) {
                if (repUsuarios.inserir(u) == true) {
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    limparCampos();
                    habilitarCampos(false);
                    usuarios = repUsuarios.retornar();
                    preencherJTable(usuarios);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
                }
            } else {
                u.setId(Integer.parseInt(jTextFieldCodigo.getText()));

                if (repUsuarios.atualizar(u) == true) {
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    limparCampos();
                    habilitarCampos(false);
                    usuarios = repUsuarios.retornar();
                    preencherJTable(usuarios);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
                }
            }
        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        if (!jTextFieldCodigo.getText().equals("")) {
            habilitarCampos(true);
            jTextFieldNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um registro para alterar!");
        }

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja excluir o usuário (" + jTextFieldNome.getText() + ")  ? ") == JOptionPane.YES_OPTION) {
            if (!jTextFieldCodigo.getText().equals("")) {
                repUsuarios.excluir(Integer.parseInt(jTextFieldCodigo.getText()));

                usuarios = repUsuarios.retornar();
                preencherJTable(usuarios);
            } else {
                JOptionPane.showMessageDialog(null, "Escolha um registro para excluir!");
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        if (jTable.getSelectedRow() != -1) {
            jTextFieldCodigo.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            jTextFieldNome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            jTextFieldEndereco.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            jTextFieldBairro.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            jTextFieldCidade.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            jComboBoxUF.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            jTextFieldTelefone.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            jTextFieldEmail.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            if (jTable.getValueAt(jTable.getSelectedRow(), 8).toString().equals("F")) {
                jRadioButtonFeminino.setSelected(true);
            } else if (jTable.getValueAt(jTable.getSelectedRow(), 8).toString().equals("M")) {
                jRadioButtonMasculino.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextFieldProcurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           
            usuarios = repUsuarios.pesquisar(jTextFieldProcurar.getText(), "no_usuario");
            
            preencherJTable(usuarios);
        }
    }//GEN-LAST:event_jTextFieldProcurarKeyPressed

    private void jTextFieldProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProcurarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaUsuarios dialog = new TelaUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void habilitarCampos(Boolean valor) {

        jTextFieldNome.setEnabled(valor);
        jTextFieldEndereco.setEnabled(valor);
        jTextFieldBairro.setEnabled(valor);
        jTextFieldCidade.setEnabled(valor);
        jComboBoxUF.setEnabled(valor);
        jTextFieldTelefone.setEnabled(valor);
        jTextFieldEmail.setEnabled(valor);
        jRadioButtonMasculino.setEnabled(valor);
        jRadioButtonFeminino.setEnabled(valor);
    }

    private void limparCampos() {
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jComboBoxUF.setSelectedItem("AC");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
        jRadioButtonMasculino.setEnabled(false);
        jRadioButtonFeminino.setEnabled(false);
    }

    public void preencherJTable(List<Usuarios> usuario) {

        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);

        for (Usuarios u : usuarios) {
            modelo.addRow(new Object[]{
                //aqui vao ficar as colunas
                u.getId(),
                u.getNome(),
                u.getEndereço(),
                u.getBairro(),
                u.getCidade(),
                u.getUF(),
                u.getTelefone(),
                u.getEmail(),
                u.getSexo()
            });
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldProcurar;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
