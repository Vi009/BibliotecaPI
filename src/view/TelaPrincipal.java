package view;

import repositorios.RepReservar;
import java.time.LocalTime;

public class TelaPrincipal extends javax.swing.JFrame {

    RepReservar reservar = new RepReservar();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        reservar.inserirMulta();
        saudacao();
        setExtendedState(MAXIMIZED_BOTH);
    }

    private void saudacao() {
        LocalTime horaAtual = LocalTime.now();

        if (horaAtual.isAfter(LocalTime.of(0, 0)) && horaAtual.isBefore(LocalTime.of(12, 0))) {
            jLabelSaudacao.setText("Bom Dia, " + TelaLogin.logado + "!");
        } else if (horaAtual.isAfter(LocalTime.of(12, 0)) && horaAtual.isBefore(LocalTime.of(18, 0))) {
            jLabelSaudacao.setText("Boa Tarde, " + TelaLogin.logado + "!");
        } else {
            jLabelSaudacao.setText("Boa Noite, " + TelaLogin.logado + "!");
        }
    }

    public void chamarTelaLivros() {

        TelaLivros telalivros = new TelaLivros(this, false);
        try {
            telalivros.setModal(true);
            telalivros.setVisible(true);
        } finally {
            telalivros.dispose();
            reservar.inserirMulta();
            saudacao();
        }
    }

    public void chamarTelaUsuarios() {

        TelaUsuarios telausuarios = new TelaUsuarios(this, false);
        try {
            telausuarios.setModal(true);
            telausuarios.setVisible(true);
        } finally {
            telausuarios.dispose();
            reservar.inserirMulta();
            saudacao();
        }
    }

    public void chamarTelaFuncionarios() {

        TelaFuncionarios telafuncionarios = new TelaFuncionarios(this, false);
        try {
            telafuncionarios.setModal(true);
            telafuncionarios.setVisible(true);
        } finally {
            telafuncionarios.dispose();
            reservar.inserirMulta();
            saudacao();
        }
    }

    public void chamarTelaReservas() {

        TelaReservar telareservas = new TelaReservar(this, false);
        try {
            telareservas.setModal(true);
            telareservas.setVisible(true);
        } finally {
            telareservas.dispose();
            reservar.inserirMulta();
            saudacao();
        }
    }

    public void chamarTelaMultas() {

        TelaMultas telamultas = new TelaMultas(this, false);
        try {
            telamultas.setModal(true);
            telamultas.setVisible(true);
        } finally {
            telamultas.dispose();
            reservar.inserirMulta();
            saudacao();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLivros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelReservas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelSaudacao = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemArquivoFun = new javax.swing.JMenuItem();
        jMenuItemArquivoUsu = new javax.swing.JMenuItem();
        jMenuItemArquivoLivros = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadFun = new javax.swing.JMenuItem();
        jMenuItemCadUsu = new javax.swing.JMenuItem();
        jMenuItemCadLivros = new javax.swing.JMenuItem();
        jMenuReservas = new javax.swing.JMenu();
        jMenuItemVerReservas = new javax.swing.JMenuItem();
        jMenuItemMultas = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemSobreBibli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelLivros.setBackground(new java.awt.Color(0, 0, 255));
        jPanelLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Livros");

        javax.swing.GroupLayout jPanelLivrosLayout = new javax.swing.GroupLayout(jPanelLivros);
        jPanelLivros.setLayout(jPanelLivrosLayout);
        jPanelLivrosLayout.setHorizontalGroup(
            jPanelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivrosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelLivrosLayout.setVerticalGroup(
            jPanelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivrosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelUsuarios.setBackground(new java.awt.Color(0, 0, 255));
        jPanelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUsuariosMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuários");

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Funcionários");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jPanelReservas.setBackground(new java.awt.Color(0, 0, 255));
        jPanelReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelReservasMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reservar");

        javax.swing.GroupLayout jPanelReservasLayout = new javax.swing.GroupLayout(jPanelReservas);
        jPanelReservas.setLayout(jPanelReservasLayout);
        jPanelReservasLayout.setHorizontalGroup(
            jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservasLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel5)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanelReservasLayout.setVerticalGroup(
            jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabelSaudacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSaudacao.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSaudacao.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jPanelLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelSaudacao)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jPanelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bilbioteca.jpg"))); // NOI18N
        jLabelImagem.setText("jLabel6");

        jMenuSair.setBackground(new java.awt.Color(51, 51, 51));
        jMenuSair.setForeground(new java.awt.Color(0, 0, 255));
        jMenuSair.setText("Arquivo");

        jMenuItemArquivoFun.setText("Funcionários");
        jMenuSair.add(jMenuItemArquivoFun);

        jMenuItemArquivoUsu.setText("Usuários");
        jMenuSair.add(jMenuItemArquivoUsu);

        jMenuItemArquivoLivros.setText("Livros");
        jMenuItemArquivoLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArquivoLivrosActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemArquivoLivros);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        jMenuCadastro.setForeground(new java.awt.Color(0, 0, 255));
        jMenuCadastro.setText("Cadastro");

        jMenuItemCadFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemCadFun.setText("Funcionários");
        jMenuItemCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFunActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFun);

        jMenuItemCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemCadUsu.setText("Usuários");
        jMenuItemCadUsu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuItemCadUsuAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuItemCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsu);

        jMenuItemCadLivros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemCadLivros.setText("Livros");
        jMenuItemCadLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadLivrosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadLivros);

        jMenuBar1.add(jMenuCadastro);

        jMenuReservas.setForeground(new java.awt.Color(0, 0, 255));
        jMenuReservas.setText("Reservas");

        jMenuItemVerReservas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemVerReservas.setText("Reservas");
        jMenuItemVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerReservasActionPerformed(evt);
            }
        });
        jMenuReservas.add(jMenuItemVerReservas);

        jMenuItemMultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItemMultas.setText("Multas");
        jMenuItemMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMultasActionPerformed(evt);
            }
        });
        jMenuReservas.add(jMenuItemMultas);

        jMenuBar1.add(jMenuReservas);

        jMenuSobre.setForeground(new java.awt.Color(0, 0, 255));
        jMenuSobre.setText("Sobre");

        jMenuItemSobreBibli.setText("Biblioteca");
        jMenuSobre.add(jMenuItemSobreBibli);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemArquivoLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArquivoLivrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemArquivoLivrosActionPerformed

    private void jMenuItemCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFunActionPerformed
        chamarTelaFuncionarios();
    }//GEN-LAST:event_jMenuItemCadFunActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadUsuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuAncestorAdded

    }//GEN-LAST:event_jMenuItemCadUsuAncestorAdded

    private void jPanelLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLivrosMouseClicked
        chamarTelaLivros();
    }//GEN-LAST:event_jPanelLivrosMouseClicked

    private void jMenuItemCadLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadLivrosActionPerformed
        chamarTelaLivros();
    }//GEN-LAST:event_jMenuItemCadLivrosActionPerformed

    private void jMenuItemCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuActionPerformed
        chamarTelaUsuarios();
    }//GEN-LAST:event_jMenuItemCadUsuActionPerformed

    private void jPanelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsuariosMouseClicked
        chamarTelaUsuarios();
    }//GEN-LAST:event_jPanelUsuariosMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        chamarTelaFuncionarios();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanelReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReservasMouseClicked
        chamarTelaReservas();
    }//GEN-LAST:event_jPanelReservasMouseClicked

    private void jMenuItemVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerReservasActionPerformed
        chamarTelaReservas();
    }//GEN-LAST:event_jMenuItemVerReservasActionPerformed

    private void jMenuItemMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMultasActionPerformed
        chamarTelaMultas();
    }//GEN-LAST:event_jMenuItemMultasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelSaudacao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemArquivoFun;
    private javax.swing.JMenuItem jMenuItemArquivoLivros;
    private javax.swing.JMenuItem jMenuItemArquivoUsu;
    private javax.swing.JMenuItem jMenuItemCadFun;
    private javax.swing.JMenuItem jMenuItemCadLivros;
    private javax.swing.JMenuItem jMenuItemCadUsu;
    private javax.swing.JMenuItem jMenuItemMultas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobreBibli;
    private javax.swing.JMenuItem jMenuItemVerReservas;
    private javax.swing.JMenu jMenuReservas;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelLivros;
    private javax.swing.JPanel jPanelReservas;
    private javax.swing.JPanel jPanelUsuarios;
    // End of variables declaration//GEN-END:variables
}
