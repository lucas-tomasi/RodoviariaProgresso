package janelas;

import classeDeNegocio.Cidade;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaAlteracoesCidades extends javax.swing.JDialog {

    public JanelaAlteracoesCidades(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jp = parent;
        preencherTabela();
        limparCampos();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSituacao = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCidades = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblAlteracaoCidades = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txfNome = new javax.swing.JTextField();
        cmbUf = new javax.swing.JComboBox();
        rdbAtivo = new javax.swing.JRadioButton();
        rdbInativo = new javax.swing.JRadioButton();
        lblIconeCidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterações Cidades");

        tblCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCidades.getTableHeader().setReorderingAllowed(false);
        tblCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCidades);
        if (tblCidades.getColumnModel().getColumnCount() > 0) {
            tblCidades.getColumnModel().getColumn(0).setResizable(false);
        }

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

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblAlteracaoCidades.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAlteracaoCidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlteracaoCidades.setText("Alterações Cidades");

        lblUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUf.setText("UF:");

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

        cmbUf.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ": Selecione :", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        btgSituacao.add(rdbAtivo);
        rdbAtivo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbAtivo.setText("Ativo");

        btgSituacao.add(rdbInativo);
        rdbInativo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rdbInativo.setSelected(true);
        rdbInativo.setText("Inativo");

        lblIconeCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cidade.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAlteracaoCidades)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(lblIconeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblSituacao)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbInativo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnVoltar)
                                    .addGap(117, 117, 117)
                                    .addComponent(btnSalvar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUf)
                                    .addGap(28, 28, 28)
                                    .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSelecionar)
                                .addGap(68, 68, 68))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblAlteracaoCidades))
                    .addComponent(lblIconeCidade))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUf)
                            .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSituacao)
                            .addComponent(rdbAtivo)
                            .addComponent(rdbInativo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean cancelarOperacao = false;
        if ((txfNome.getText().equalsIgnoreCase("")) || cmbUf.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS", "erro!", 0);
        } else {
            if (JanelaPrincipal.ctlCidades.verificarNomeCidade(cidadeAux, String.valueOf(cmbUf.getSelectedItem()), txfNome.getText())) {
                if (cidadeAux.isSituacao() && rdbInativo.isSelected()) {
                    if (JOptionPane.showConfirmDialog(this, "ESSA MUDANÇA PODERÁ INATIVAR ALGUMAS LINHAS!\nDESEJA CONTINUAR ?", "atenção", 0, 3) == 1) {
                        cancelarOperacao = true;
                    }
                }
                if (!cancelarOperacao) {
                    if (rdbInativo.isSelected()) {
                        JanelaPrincipal.ctlCidades.inativar(cidadeAux);
                    } else {
                        cidadeAux.setSituacao(true);
                    }
                    cidadeAux.setNome(txfNome.getText());
                    cidadeAux.setUf(String.valueOf(cmbUf.getSelectedItem()));
                    JanelaPrincipal.ctlCidades.salvarArquivo();
                    JOptionPane.showMessageDialog(this, "ALTERADO COM SUCESSO!", "confirmação!", 1);
                    jp.preencherComboDestino();
                    preencherTabela();
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "OPERAÇÃO CANCELADA!", "cancelamento!", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "NOME JÁ CADASTRADO!", "incoerência", 0);
                txfNome.setText("");
                txfNome.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblCidades.getSelectedRow() != -1) {
            atualizarCampos();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void tblCidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCidadesMouseClicked
        if (evt.getClickCount() == 2) {
            atualizarCampos();
        }
    }//GEN-LAST:event_tblCidadesMouseClicked

    private void redimencionarTabela(int tamanho) {
        tblCidades.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][1],
                new String[]{
                    "Cidade"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblCidades.getTableHeader().setReorderingAllowed(false);
        tblCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCidades);

    }

    private void preencherTabela() {
        ArrayList<Cidade> aux = JanelaPrincipal.ctlCidades.listar();
        redimencionarTabela(aux.size() - 1);
        for (int i = 1; i < aux.size(); i++) {
            tblCidades.setValueAt(aux.get(i), i - 1, 0);
        }
    }

    private void desbloquearComponentes(boolean situacao) {
        txfNome.setEnabled(situacao);
        cmbUf.setEnabled(situacao);
        rdbAtivo.setEnabled(situacao);
        rdbInativo.setEnabled(situacao);
    }

    private void atualizarCampos() {
        limparCampos();
        cidadeAux = (Cidade) tblCidades.getValueAt(tblCidades.getSelectedRow(), 0);
        desbloquearComponentes(true);
        txfNome.setText(cidadeAux.getNome());
        rdbAtivo.setSelected(cidadeAux.isSituacao());
        cmbUf.setSelectedItem(cidadeAux.getUf());
    }

    private void limparCampos() {
        txfNome.setText("");
        cmbUf.setSelectedIndex(0);
        rdbInativo.setSelected(true);
        desbloquearComponentes(false);
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
            java.util.logging.Logger.getLogger(JanelaAlteracoesCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaAlteracoesCidades dialog = new JanelaAlteracoesCidades(new JanelaPrincipal(), true);
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

    JanelaPrincipal jp;
    Cidade cidadeAux;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSituacao;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbUf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlteracaoCidades;
    private javax.swing.JLabel lblIconeCidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblUf;
    private javax.swing.JRadioButton rdbAtivo;
    private javax.swing.JRadioButton rdbInativo;
    private javax.swing.JTable tblCidades;
    private javax.swing.JTextField txfNome;
    // End of variables declaration//GEN-END:variables
}
