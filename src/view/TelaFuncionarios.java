
package view;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionarios;
import repositorios.RepFuncionarios;


public class TelaFuncionarios extends javax.swing.JDialog {

    RepFuncionarios repFuncionarios = new RepFuncionarios();
    List<Funcionarios> funcionarios;
   
    public TelaFuncionarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        jTextFieldCodigo.setEnabled(false);
        habilitarCampos(false);
        jTextFieldProcurar.requestFocus();
        funcionarios = repFuncionarios.retornar();
        preencherJTable(funcionarios);
    }
    
     private void habilitarCampos(Boolean valor) {

        jTextFieldNome.setEnabled(valor);
        jTextFieldCargo.setEnabled(valor);
        jTextFieldTelefone.setEnabled(valor);
        jTextFieldEmail.setEnabled(valor);
        jRadioButtonMasculino.setEnabled(valor);
        jRadioButtonFeminino.setEnabled(valor);
        jTextFieldEndereco.setEnabled(valor);
        jTextFieldBairro.setEnabled(valor);
        jTextFieldCidade.setEnabled(valor);
        jComboBoxUF.setEnabled(valor);
        jTextFieldSenha.setEnabled(valor);
    }
     
      private void limparCampos() {
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldCargo.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
        jRadioButtonMasculino.setEnabled(false);
        jRadioButtonFeminino.setEnabled(false);
        jTextFieldEndereco.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jComboBoxUF.setSelectedItem("AC");
        jTextFieldSenha.setText("");
    }
      
       public void preencherJTable(List<Funcionarios> funcionario) {

        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setNumRows(0);

        for (Funcionarios f : funcionarios) {
            modelo.addRow(new Object[]{
                //aqui vao ficar as colunas
                f.getId(),
                f.getNome(),
                f.getCargo(),
                f.getTelefone(),
                f.getEmail(),
                f.getSexo(),
                f.getEndereço(),
                f.getBairro(),
                f.getCidade(),
                f.getUF(),
                f.getSenha()
 
            });
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupProcurar = new javax.swing.ButtonGroup();
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
        jLabelCargo = new javax.swing.JLabel();
        jRadioButtonCargo = new javax.swing.JRadioButton();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();
        jTextFieldCargo = new javax.swing.JTextField();

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
        jLabelNome.setText("Primeiro Nome");

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

        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRadioButtonMasculino.setText("M");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        buttonGroupSexo.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRadioButtonFeminino.setText("F");

        jTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cargo", "Telefone", "Email", "Sexo", "Endereço", "Bairro", "Cidade", "UF"
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
        jLabelProcurar.setText("Procurar");

        jLabelCargo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCargo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCargo.setText("Cargo");

        buttonGroupProcurar.add(jRadioButtonCargo);
        jRadioButtonCargo.setText("Cargo");

        buttonGroupProcurar.add(jRadioButtonNome);
        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNomeActionPerformed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSenha.setText("Senha");

        jTextFieldSenha.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldSenha.setSelectionColor(new java.awt.Color(0, 0, 255));

        jTextFieldTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });

        jTextFieldCargo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCargo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCargo.setSelectionColor(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(680, 680, 680))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProcurar)
                                    .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(jLabelCargo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUF)
                                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSenha)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabelSexo)
                                                    .addGap(98, 98, 98)
                                                    .addComponent(jLabelEndereco))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jRadioButtonMasculino)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jRadioButtonFeminino)
                                                    .addGap(56, 56, 56)
                                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelBairro)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(57, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addGap(18, 18, 18)
                .addComponent(jButtonNovo)
                .addGap(180, 180, 180))
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
                    .addComponent(jLabelCargo)
                    .addComponent(jLabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFeminino)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelUF)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabelProcurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonCargo)
                    .addComponent(jRadioButtonNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addGap(61, 61, 61))
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

    private void jComboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
          if (jTable.getSelectedRow() != -1) { //organizar de acordo com a tabela
            jTextFieldCodigo.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            jTextFieldNome.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            jTextFieldCargo.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            jTextFieldTelefone.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            jTextFieldEmail.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
             
            if (jTable.getValueAt(jTable.getSelectedRow(), 5).toString().equals("F")) {
                jRadioButtonFeminino.setSelected(true);
            } else if (jTable.getValueAt(jTable.getSelectedRow(), 5).toString().equals("M")) {
                jRadioButtonMasculino.setSelected(true);
            }
            jTextFieldEndereco.setText(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            jTextFieldBairro.setText(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            jTextFieldCidade.setText(jTable.getValueAt(jTable.getSelectedRow(), 8).toString());
            jComboBoxUF.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 9).toString());
            
           
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        limparCampos();
        habilitarCampos(true);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Email");
            jTextFieldEmail.requestFocus();
        } else {
            Funcionarios f = new Funcionarios();
            f.setNome(jTextFieldNome.getText());
            f.setCargo(jTextFieldCargo.getText());
            f.setTelefone(jTextFieldTelefone.getText());
            f.setEmail(jTextFieldEmail.getText());
            if (jRadioButtonFeminino.isSelected()) {
                f.setSexo("F");
            } else if (jRadioButtonMasculino.isSelected()) {
                f.setSexo("M");
            }
            f.setEndereço(jTextFieldEndereco.getText());
            f.setBairro(jTextFieldBairro.getText());
            f.setCidade(jTextFieldCidade.getText());
            f.setUF((String) jComboBoxUF.getSelectedItem());
            f.setSenha(jTextFieldSenha.getText());
   
            if (jTextFieldCodigo.getText().equals("")) {
                if (repFuncionarios.inserir(f) == true) {
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    limparCampos();
                    habilitarCampos(false);
                    funcionarios = repFuncionarios.retornar();
                    preencherJTable(funcionarios);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
                }
            } else {
                f.setId(Integer.parseInt(jTextFieldCodigo.getText()));

                if (repFuncionarios.atualizar(f) == true) {
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    limparCampos();
                    habilitarCampos(false);
                    funcionarios = repFuncionarios.retornar();
                    preencherJTable(funcionarios);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar.");
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
                repFuncionarios.excluir(Integer.parseInt(jTextFieldCodigo.getText()));

                funcionarios = repFuncionarios.retornar();
                preencherJTable(funcionarios);
            } else {
                JOptionPane.showMessageDialog(null, "Escolha um registro para excluir!");
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldProcurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jRadioButtonNome.isSelected()){
            funcionarios = repFuncionarios.pesquisar(jTextFieldProcurar.getText(), "nome");
            }else{
            funcionarios = repFuncionarios.pesquisar(jTextFieldProcurar.getText(), "cargo");    
            }
            
            preencherJTable(funcionarios);
        }
    }//GEN-LAST:event_jTextFieldProcurarKeyPressed

    private void jTextFieldProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProcurarActionPerformed
        
    }//GEN-LAST:event_jTextFieldProcurarActionPerformed

    private void jRadioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNomeActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaFuncionarios dialog = new TelaFuncionarios(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupProcurar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonCargo;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldProcurar;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
