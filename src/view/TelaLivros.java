package view;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositorios.RepLivros;
import model.Livros;

public class TelaLivros extends javax.swing.JDialog {

    RepLivros replivros = new RepLivros();
    List<Livros> livros;

    public TelaLivros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        jTextFieldCodigo.setEnabled(false);
        habilitarCampos(false);
        jTextFieldProcurar.requestFocus();
        livros = replivros.retornar();
        preencherJTable(livros);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

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
            java.util.logging.Logger.getLogger(TelaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLivros dialog = new TelaLivros(new javax.swing.JFrame(), true);
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

        jTextFieldTitulo.setEnabled(valor);
        jTextFieldAutor.setEnabled(valor);
        jTextFieldEditora.setEnabled(valor);
        jTextFieldNumCop.setEnabled(valor);
        jTextFieldCategoria.setEnabled(valor);

    }

    private void limparCampos() {
        jTextFieldCodigo.setText("");
        jTextFieldTitulo.setText("");
        jTextFieldAutor.setText("");
        jTextFieldEditora.setText("");
        jTextFieldNumCop.setText("");
        jTextFieldCategoria.setText("");

    }

    public void preencherJTable(List<Livros> livros) {

        DefaultTableModel modelo = (DefaultTableModel) jTableLista.getModel();
        modelo.setNumRows(0);

        for (Livros l : livros) {
            modelo.addRow(new Object[]{
                //aqui vao ficar as colunas
                l.getId(),
                l.getTitulo(),
                l.getAutor(),
                l.getEditora(),
                l.getNum_cop_disp(),
                l.getCategoria()
            });
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldEditora = new javax.swing.JTextField();
        jTextFieldNumCop = new javax.swing.JTextField();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelEditora = new javax.swing.JLabel();
        jLabelNumCop = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jButtonSalva = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldProcurar = new javax.swing.JTextField();
        jLabelProcurar = new javax.swing.JLabel();
        jRadioButtonCategoria = new javax.swing.JRadioButton();
        jRadioButtonAutor = new javax.swing.JRadioButton();
        jRadioButtonTitulo = new javax.swing.JRadioButton();
        jRadioButtonCod_Barra = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldCodigo.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setSelectionColor(new java.awt.Color(0, 0, 255));

        jTextFieldTitulo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldAutor.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutorActionPerformed(evt);
            }
        });

        jTextFieldEditora.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditoraActionPerformed(evt);
            }
        });

        jTextFieldNumCop.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldNumCop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldCategoria.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });

        jLabelCodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código");

        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("Título");

        jLabelAutor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAutor.setText("Autor");

        jLabelEditora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelEditora.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEditora.setText("Editora");

        jLabelNumCop.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelNumCop.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNumCop.setText("Nº de Cópias");

        jLabelCategoria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCategoria.setText("Categoria");

        jButtonSalva.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonSalva.setText("Salvar");
        jButtonSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvaActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Editora", "Nº de Cópias", "Categoria"
            }
        ));
        jTableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLista);

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
        jLabelProcurar.setText("Procurar Livros");

        buttonGroup1.add(jRadioButtonCategoria);
        jRadioButtonCategoria.setText("Categoria");

        buttonGroup1.add(jRadioButtonAutor);
        jRadioButtonAutor.setText("Autor");

        buttonGroup1.add(jRadioButtonTitulo);
        jRadioButtonTitulo.setText("Título");
        jRadioButtonTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTituloActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCod_Barra);
        jRadioButtonCod_Barra.setText("Código");
        jRadioButtonCod_Barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCod_BarraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalva)
                .addGap(18, 18, 18)
                .addComponent(jButtonNovo)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(jTextFieldCodigo))
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAutor)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEditora)
                            .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAutor)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonCod_Barra)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumCop)
                            .addComponent(jTextFieldNumCop, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(435, 435, 435)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelAutor)
                    .addComponent(jLabelEditora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumCop, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumCop, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonCategoria)
                    .addComponent(jRadioButtonAutor)
                    .addComponent(jRadioButtonTitulo)
                    .addComponent(jRadioButtonCod_Barra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalva)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonCancelar))
                    .addComponent(jButtonNovo))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProcurarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jRadioButtonTitulo.isSelected()) {
                livros = replivros.pesquisar(jTextFieldProcurar.getText(), "titulo");
            } else if (jRadioButtonAutor.isSelected()) {
                livros = replivros.pesquisar(jTextFieldProcurar.getText(), "autor");
            } else if (jRadioButtonCategoria.isSelected()) {
                livros = replivros.pesquisar(jTextFieldProcurar.getText(), "categoria");
            } else {
                livros = replivros.pesquisar(jTextFieldProcurar.getText(), "id");
            }

            preencherJTable(livros);
        }
    }//GEN-LAST:event_jTextFieldProcurarKeyPressed

    private void jTextFieldProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProcurarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja excluir o item (" + jTextFieldTitulo.getText() + ")  ? ") == JOptionPane.YES_OPTION) {
            if (!jTextFieldCodigo.getText().equals("")) {
                replivros.excluir(Integer.parseInt(jTextFieldCodigo.getText()));

                livros = replivros.retornar();
                preencherJTable(livros);
            } else {
                JOptionPane.showMessageDialog(null, "Escolha um registro para excluir!");
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        if (!jTextFieldCodigo.getText().equals("")) {
            habilitarCampos(true);
            jTextFieldTitulo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um registro para alterar!");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaMouseClicked
        if (jTableLista.getSelectedRow() != - 1) {
            jTextFieldCodigo.setText(jTableLista.getValueAt(jTableLista.getSelectedRow(), 0).toString());
            jTextFieldTitulo.setText(jTableLista.getValueAt(jTableLista.getSelectedRow(), 1).toString());
            jTextFieldAutor.setText(jTableLista.getValueAt(jTableLista.getSelectedRow(), 2).toString());
            jTextFieldEditora.setText(jTableLista.getValueAt(jTableLista.getSelectedRow(), 3).toString());
            jTextFieldNumCop.setText(jTableLista.getValueAt(jTableLista.getSelectedRow(), 4).toString());
            jTextFieldCategoria.setText(jTableLista.getValueAt(jTableLista.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_jTableListaMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        limparCampos();
        habilitarCampos(true);
        jTextFieldTitulo.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvaActionPerformed
        if (jTextFieldTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição");
            jTextFieldTitulo.requestFocus();
        } else if (jTextFieldEditora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Editora");
            jTextFieldEditora.requestFocus();
        } else {
            Livros l = new Livros();
            l.setTitulo(jTextFieldTitulo.getText());
            l.setAutor(jTextFieldAutor.getText());
            l.setEditora(jTextFieldEditora.getText());
            l.setNum_cop_disp(Integer.parseInt(jTextFieldNumCop.getText()));
            l.setCategoria(jTextFieldCategoria.getText());

            if (jTextFieldCodigo.getText().equals("")) {
                if (replivros.inserir(l) == true) {
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    limparCampos();
                    habilitarCampos(false);
                    livros = replivros.retornar();
                    preencherJTable(livros);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
                }
            } else {
                l.setId(Integer.parseInt(jTextFieldCodigo.getText()));

                if (replivros.atualizar(l) == true) {
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    limparCampos();
                    habilitarCampos(false);
                    livros = replivros.retornar();
                    preencherJTable(livros);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
                }
            }
        }

    }//GEN-LAST:event_jButtonSalvaActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jTextFieldEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditoraActionPerformed

    private void jTextFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutorActionPerformed

    private void jRadioButtonTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTituloActionPerformed

    private void jRadioButtonCod_BarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCod_BarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCod_BarraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalva;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEditora;
    private javax.swing.JLabel jLabelNumCop;
    private javax.swing.JLabel jLabelProcurar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAutor;
    private javax.swing.JRadioButton jRadioButtonCategoria;
    private javax.swing.JRadioButton jRadioButtonCod_Barra;
    private javax.swing.JRadioButton jRadioButtonTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldNumCop;
    private javax.swing.JTextField jTextFieldProcurar;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables

}
