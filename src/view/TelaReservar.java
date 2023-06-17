package view;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Livros;
import model.Reservas;
import model.Usuarios;
import repositorios.RepLivros;
import repositorios.RepReservar;
import utils.Utils;

public class TelaReservar extends javax.swing.JDialog {

    Utils util = new Utils();
    RepReservar repReservar = new RepReservar();
    List<Reservas> reservas;
    List<Usuarios> usuarios;
    List<Livros> livros;
    int id;

    public TelaReservar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        habilitarCampos(false);
        reservas = repReservar.retornarTabela();

        preencherJTableReserva(reservas);
    }

    private void habilitarCampos(Boolean valor) {

        jTextFieldCodLivro.setEnabled(valor);
        jTextFieldCodUsuario.setEnabled(valor);
        jTextFieldDtReserva.setEnabled(valor);
        jTextFieldDtEntrega.setEnabled(valor);
        jButtonSalvar.setEnabled(valor);
        jButtonCancelar.setEnabled(valor);

    }

    private void limparCampos() {
        jTextFieldCodLivro.setText("");
        jTextFieldCodUsuario.setText("");
        jTextFieldDtReserva.setText("");
        jTextFieldDtEntrega.setText("");

    }

    public void preencherJTableLivro(List<Reservas> reserva) {

        DefaultTableModel modelo = (DefaultTableModel) jTableLivro.getModel();
        modelo.setNumRows(0);

        for (Reservas r : reserva) {
            modelo.addRow(new Object[]{
                //aqui vao ficar as colunas
                r.getLivro(),
                r.getCategoria(),
                r.getCop_disp(),});
        }

    }

    public void preencherJTableUsuario(List<Usuarios> usuario) {

        DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();
        modelo.setNumRows(0);

        String multa;
        for (Usuarios u : usuario) {

            if (u.getMulta() == 1) {
                multa = "COM PENDÊNCIA";
            } else {
                multa = "PERMITIDO";
            }
            modelo.addRow(new Object[]{
                //aqui vao ficar as colunas
                u.getNome(),
                u.getTelefone(),
                multa
            });
        }

    }

    public void preencherJTableReserva(List<Reservas> reserva) {

        DefaultTableModel modelo = (DefaultTableModel) jTableReserva.getModel();
        modelo.setNumRows(0);

        try {
            for (Reservas r : reserva) {
                modelo.addRow(new Object[]{
                    //aqui vao ficar as colunas
                    r.getId(),
                    r.getLivro(),
                    r.getUsuario(),
                    util.formatarDataHora(r.getData_reserva()),
                    r.dataEntregaTostring()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupProcurar = new javax.swing.ButtonGroup();
        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        jLabelCodLivro = new javax.swing.JLabel();
        jTextFieldCodUsuario = new javax.swing.JTextField();
        jLabelCodUsuario = new javax.swing.JLabel();
        jLabelDtReserva = new javax.swing.JLabel();
        jLabelDtEntrega = new javax.swing.JLabel();
        jTextFieldCodLivro = new javax.swing.JTextField();
        jTextFieldDtEntrega = new javax.swing.JFormattedTextField();
        jTextFieldDtReserva = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNova = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivro = new javax.swing.JTable();
        jLabelLivroLista = new javax.swing.JLabel();
        jLabelUsuarioLista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableReserva = new javax.swing.JTable();
        jButtonFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodLivro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCodLivro.setText("Cód. Livro");

        jTextFieldCodUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldCodUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCodUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodUsuarioActionPerformed(evt);
            }
        });
        jTextFieldCodUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodUsuarioKeyPressed(evt);
            }
        });

        jLabelCodUsuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelCodUsuario.setText("Cód. Usuário");

        jLabelDtReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelDtReserva.setText("Data da Reserva");

        jLabelDtEntrega.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelDtEntrega.setText("Data da Entrega");

        jTextFieldCodLivro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldCodLivro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCodLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodLivroActionPerformed(evt);
            }
        });
        jTextFieldCodLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodLivroKeyPressed(evt);
            }
        });

        jTextFieldDtEntrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            jTextFieldDtEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDtEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDtEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtEntregaActionPerformed(evt);
            }
        });

        jTextFieldDtReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            jTextFieldDtReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDtReserva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDtReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtReservaActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonSalvar.setText("Reservar Livro");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonNova.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonNova.setText("Nova Reserva");
        jButtonNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaActionPerformed(evt);
            }
        });

        jTableLivro.setBorder(new javax.swing.border.MatteBorder(null));
        jTableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Título", "Categoria", "Cóp. Disponiveis"
            }
        ));
        jTableLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLivro);

        jLabelLivroLista.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelLivroLista.setText("Livro");

        jLabelUsuarioLista.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabelUsuarioLista.setText("Usuário");

        jTableUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTableUsuario);

        jTableReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Livro", "Usuário", "Dt Reserva", "Dt Entrega"
            }
        ));
        jTableReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableReserva);

        jButtonFinalizar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonFinalizar.setText("Finalizar Reserva");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCodUsuario)
                            .addComponent(jLabelCodLivro)
                            .addComponent(jLabelDtReserva)
                            .addComponent(jLabelDtEntrega))
                        .addGap(45, 45, 45)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNova)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLivroLista)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuarioLista)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(490, 490, 490))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonFinalizar)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelLivroLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodLivro)
                            .addComponent(jTextFieldCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDtEntrega)
                            .addComponent(jTextFieldDtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonNova)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelUsuarioLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFinalizar)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodLivroActionPerformed

    private void jTextFieldCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodUsuarioActionPerformed

    private void jTextFieldDtEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtEntregaActionPerformed

    private void jTextFieldDtReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtReservaActionPerformed

    private void jButtonNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaActionPerformed
        limparCampos();
        habilitarCampos(true);
        jTextFieldCodLivro.requestFocus();

    }//GEN-LAST:event_jButtonNovaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldCodLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o código do livro!");
        } else if (jTextFieldCodUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira o código do usuário!");
            jTextFieldCodUsuario.requestFocus();
        } else if (jTextFieldDtReserva.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira a data da reserva!");
            jTextFieldDtReserva.requestFocus();
        } else if (jTextFieldDtEntrega.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira a data da entrega!");
            jTextFieldDtEntrega.requestFocus();
        } else {

            Reservas r = new Reservas();

            r.setId_livro(Integer.parseInt(jTextFieldCodLivro.getText()));
            r.setId_usuario(Integer.parseInt(jTextFieldCodUsuario.getText()));
            r.setData_reserva(util.tolocaldate(jTextFieldDtReserva.getText()));
            r.setData_entrega(util.tolocaldate(jTextFieldDtEntrega.getText()));

            if (repReservar.inserir(r) == true) {
                JOptionPane.showMessageDialog(null, "Reservado com sucesso!");
                habilitarCampos(false);
                limparCampos();
                reservas = repReservar.retornarTabela();
                preencherJTableReserva(reservas);
                DefaultTableModel model = (DefaultTableModel) jTableLivro.getModel();
                model.setRowCount(0);
                DefaultTableModel m = (DefaultTableModel) jTableUsuario.getModel();
                m.setRowCount(0);

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao reservar.");
            }

        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldCodLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodLivroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            reservas = repReservar.pesquisarLivro(jTextFieldCodLivro.getText(), "titulo");

            preencherJTableLivro(reservas);
        }
    }//GEN-LAST:event_jTextFieldCodLivroKeyPressed

    private void jTableLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLivroMouseClicked

    }//GEN-LAST:event_jTableLivroMouseClicked

    private void jTextFieldCodUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            usuarios = repReservar.pesquisarUsuario(jTextFieldCodUsuario.getText());

            preencherJTableUsuario(usuarios);

        }

    }//GEN-LAST:event_jTextFieldCodUsuarioKeyPressed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirmar a finalização da reserva?") == JOptionPane.YES_OPTION) {
            repReservar.finalizar(id);

            JOptionPane.showMessageDialog(null, "Reserva Finalizada com Sucesso!");
        }

    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jTableReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservaMouseClicked
        if (jTableReserva.getSelectedRow() != - 1) {
            id = (Integer.parseInt(jTableReserva.getValueAt(jTableReserva.getSelectedRow(), 0).toString()));
        }
    }//GEN-LAST:event_jTableReservaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaReservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaReservar dialog = new TelaReservar(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonNova;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodLivro;
    private javax.swing.JLabel jLabelCodUsuario;
    private javax.swing.JLabel jLabelDtEntrega;
    private javax.swing.JLabel jLabelDtReserva;
    private javax.swing.JLabel jLabelLivroLista;
    private javax.swing.JLabel jLabelUsuarioLista;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableLivro;
    private javax.swing.JTable jTableReserva;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldCodLivro;
    private javax.swing.JTextField jTextFieldCodUsuario;
    private javax.swing.JFormattedTextField jTextFieldDtEntrega;
    private javax.swing.JFormattedTextField jTextFieldDtReserva;
    // End of variables declaration//GEN-END:variables
}
