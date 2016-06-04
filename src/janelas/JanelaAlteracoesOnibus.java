package janelas;

import classeDeNegocio.Onibus;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaAlteracoesOnibus extends javax.swing.JDialog {

    public JanelaAlteracoesOnibus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabelaOnibus();
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSit = new javax.swing.ButtonGroup();
        btgBan = new javax.swing.ButtonGroup();
        btgExecutivo = new javax.swing.ButtonGroup();
        txfNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOnibus = new javax.swing.JTable();
        rdbAtivo = new javax.swing.JRadioButton();
        rdbInativo = new javax.swing.JRadioButton();
        btnSelecionar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblNumero = new javax.swing.JLabel();
        lblAlteracaoOnibus = new javax.swing.JLabel();
        lblBanheiro = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        rdbComBanheiro = new javax.swing.JRadioButton();
        rdbSemBanheiro = new javax.swing.JRadioButton();
        cmbNumeroAssentos = new javax.swing.JComboBox();
        lblAssentos = new javax.swing.JLabel();
        lblIconeOnibus = new javax.swing.JLabel();
        lblExecutivo = new javax.swing.JLabel();
        rdbSim = new javax.swing.JRadioButton();
        rdbNao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterações Ônibus");

        tblOnibus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Ônibus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOnibus.getTableHeader().setReorderingAllowed(false);
        tblOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOnibusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOnibus);

        btgSit.add(rdbAtivo);
        rdbAtivo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbAtivo.setText("Ativo");

        btgSit.add(rdbInativo);
        rdbInativo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbInativo.setSelected(true);
        rdbInativo.setText("Inativo");

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setText("Número:");

        lblAlteracaoOnibus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAlteracaoOnibus.setText("Alterações Ônibus");

        lblBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBanheiro.setText("Banheiro:");

        lblSituacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSituacao.setText("Situação:");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.jpg"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btgBan.add(rdbComBanheiro);
        rdbComBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbComBanheiro.setText("Com Banheiro");
        rdbComBanheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbComBanheiroMouseClicked(evt);
            }
        });

        btgBan.add(rdbSemBanheiro);
        rdbSemBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbSemBanheiro.setSelected(true);
        rdbSemBanheiro.setText("Sem Banheiro");
        rdbSemBanheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbSemBanheiroMouseClicked(evt);
            }
        });

        cmbNumeroAssentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbNumeroAssentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "36", "38", "40", "42", "44", "46", "48", "50", "52" }));

        lblAssentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAssentos.setText("Assentos:");

        lblIconeOnibus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Onibus.png"))); // NOI18N

        lblExecutivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExecutivo.setText("Executivo:");

        btgExecutivo.add(rdbSim);
        rdbSim.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbSim.setText("Sim");

        btgExecutivo.add(rdbNao);
        rdbNao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbNao.setSelected(true);
        rdbNao.setText("Não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAlteracaoOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(20, 20, 20))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblBanheiro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdbComBanheiro)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdbSemBanheiro))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAssentos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbNumeroAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNumero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblSituacao)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdbAtivo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rdbInativo)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblExecutivo)
                                .addGap(18, 18, 18)
                                .addComponent(rdbSim)
                                .addGap(18, 18, 18)
                                .addComponent(rdbNao)
                                .addGap(122, 122, 122)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconeOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(89, 89, 89)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelecionar)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconeOnibus)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblAlteracaoOnibus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBanheiro)
                            .addComponent(rdbComBanheiro)
                            .addComponent(rdbSemBanheiro))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAssentos)
                            .addComponent(cmbNumeroAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSituacao)
                            .addComponent(rdbAtivo)
                            .addComponent(rdbInativo))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExecutivo)
                            .addComponent(rdbSim)
                            .addComponent(rdbNao)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblOnibusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOnibusMouseClicked
        if (evt.getClickCount() == 2) {
            atualizarCampos();
        }
    }//GEN-LAST:event_tblOnibusMouseClicked

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblOnibus.getSelectedRow() != -1) {
            atualizarCampos();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean cancelarOperacao = false;
        if (txfNumero.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!", "erro!", 0);
        } else {
            if (JanelaPrincipal.ctlOnibus.verificarNome(onibusAux, txfNumero.getText(), rdbAtivo.isSelected())) {
                if (rdbInativo.isSelected() && onibusAux.isSituacao()) {
                    if (JOptionPane.showConfirmDialog(this, "ESSA MUDANÇA PODE INATIVAR ALGUMAS LINHAS!\nDESEJA CONTINUAR?", "atenção!", 0, 2) == 1) {
                        cancelarOperacao = true;
                    }
                }
                if (!cancelarOperacao) {
                    if (rdbInativo.isSelected()) {
                        JanelaPrincipal.ctlOnibus.inativar(onibusAux);
                    } else {
                        onibusAux.setSituacao(true);
                    }
                    onibusAux.setExecutivo(rdbSim.isSelected());
                    onibusAux.setAssentos(Integer.parseInt(String.valueOf(cmbNumeroAssentos.getSelectedItem())));
                    onibusAux.setBanheiro(rdbComBanheiro.isSelected());
                    onibusAux.setNumeroOnibus(txfNumero.getText());
                    JanelaPrincipal.ctlOnibus.salvarArquivo();
                    preencherTabelaOnibus();
                    JOptionPane.showMessageDialog(this, "ALTERADO COM SUCESSO!", "confirmação!", 1);
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "OPERAÇÃO CANCELADA!", "cancelamento!", 1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "NÚMERO JÁ CADASTRADO!", "incoerência!", 0);
            }

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rdbComBanheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbComBanheiroMouseClicked
        cmbNumeroAssentos.removeAllItems();
        for (int i = 36; i <= 48; i = i + 2) {
            cmbNumeroAssentos.addItem(i);
        }
    }//GEN-LAST:event_rdbComBanheiroMouseClicked

    private void rdbSemBanheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbSemBanheiroMouseClicked
        cmbNumeroAssentos.removeAllItems();
        for (int i = 36; i <= 52; i = i + 2) {
            cmbNumeroAssentos.addItem(i);
        }
    }//GEN-LAST:event_rdbSemBanheiroMouseClicked

    private void desbloquearComponentes(boolean situacao) {
        txfNumero.setEnabled(situacao);
        rdbAtivo.setEnabled(situacao);
        rdbComBanheiro.setEnabled(situacao);
        rdbInativo.setEnabled(situacao);
        rdbSemBanheiro.setEnabled(situacao);
        cmbNumeroAssentos.setEnabled(situacao);
        rdbSim.setEnabled(situacao);
        rdbNao.setEnabled(situacao);
    }

    private void limparCampos() {
        desbloquearComponentes(false);
        txfNumero.setText("");
        rdbInativo.setSelected(true);
        rdbSemBanheiro.setSelected(true);
        cmbNumeroAssentos.setSelectedIndex(0);
        rdbNao.setSelected(true);
    }

    private void atualizarCampos() {
        limparCampos();
        onibusAux = (Onibus) tblOnibus.getValueAt(tblOnibus.getSelectedRow(), 0);
        desbloquearComponentes(true);
        txfNumero.setText(onibusAux.getNumeroOnibus());
        rdbComBanheiro.setSelected(onibusAux.isBanheiro());
        if (rdbComBanheiro.isSelected()) {
            cmbNumeroAssentos.removeAllItems();
            for (int i = 36; i <= 48; i = i + 2) {
                cmbNumeroAssentos.addItem(i);
            }
        } else {
            cmbNumeroAssentos.removeAllItems();
            for (int i = 36; i <= 52; i = i + 2) {
                cmbNumeroAssentos.addItem(i);
            }
        }
        cmbNumeroAssentos.setSelectedItem(onibusAux.getAssentos());
        rdbAtivo.setSelected(onibusAux.isSituacao());
        rdbSim.setSelected(onibusAux.isExecutivo());
    }

    private void redimencionarTabelaOnibus(int tamanho) {
        tblOnibus.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][1],
                new String[]{
                    "Ônibus"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOnibus);

    }

    private void preencherTabelaOnibus() {
        ArrayList<Onibus> onibus = JanelaPrincipal.ctlOnibus.listar();
        redimencionarTabelaOnibus(onibus.size());
        for (int i = 0; i < onibus.size(); i++) {
            tblOnibus.setValueAt(onibus.get(i), i, 0);
        }
    }

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
            java.util.logging.Logger.getLogger(JanelaAlteracoesOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaAlteracoesOnibus dialog = new JanelaAlteracoesOnibus(new javax.swing.JFrame(), true);
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

    Onibus onibusAux;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBan;
    private javax.swing.ButtonGroup btgExecutivo;
    private javax.swing.ButtonGroup btgSit;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbNumeroAssentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlteracaoOnibus;
    private javax.swing.JLabel lblAssentos;
    private javax.swing.JLabel lblBanheiro;
    private javax.swing.JLabel lblExecutivo;
    private javax.swing.JLabel lblIconeOnibus;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JRadioButton rdbAtivo;
    private javax.swing.JRadioButton rdbComBanheiro;
    private javax.swing.JRadioButton rdbInativo;
    private javax.swing.JRadioButton rdbNao;
    private javax.swing.JRadioButton rdbSemBanheiro;
    private javax.swing.JRadioButton rdbSim;
    private javax.swing.JTable tblOnibus;
    private javax.swing.JTextField txfNumero;
    // End of variables declaration//GEN-END:variables
}
