package janelas;

import classeDeNegocio.Onibus;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaListagemOnibus extends javax.swing.JDialog {

    public JanelaListagemOnibus(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        filtrarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSituacao = new javax.swing.ButtonGroup();
        btgBanheiro = new javax.swing.ButtonGroup();
        lblIconeOnibus = new javax.swing.JLabel();
        lblListarOnibus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOnibus = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblNumeroOnibus = new javax.swing.JLabel();
        txfNumero = new javax.swing.JTextField();
        lblSituacao = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ckbTodosOnibus = new javax.swing.JCheckBox();
        ckbTodasSitucoes = new javax.swing.JCheckBox();
        rdbAtivos = new javax.swing.JRadioButton();
        rdbInativos = new javax.swing.JRadioButton();
        lblBancos = new javax.swing.JLabel();
        cmbAssentos = new javax.swing.JComboBox();
        ckbTodosAssentos = new javax.swing.JCheckBox();
        lblBanheiro = new javax.swing.JLabel();
        rdbComBanheiro = new javax.swing.JRadioButton();
        rdbSemBanheiro = new javax.swing.JRadioButton();
        ckbComESemBanheiro = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem Ônibus");

        lblIconeOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Onibus.png"))); // NOI18N

        lblListarOnibus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblListarOnibus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListarOnibus.setText("Listagem Ônibus");
        lblListarOnibus.setToolTipText("");

        tblOnibus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Numero", "Bancos", "Executivo", "Banheiro", "Ativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOnibus.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOnibus);
        if (tblOnibus.getColumnModel().getColumnCount() > 0) {
            tblOnibus.getColumnModel().getColumn(0).setMinWidth(70);
            tblOnibus.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblOnibus.getColumnModel().getColumn(0).setMaxWidth(70);
            tblOnibus.getColumnModel().getColumn(2).setMinWidth(50);
            tblOnibus.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblOnibus.getColumnModel().getColumn(2).setMaxWidth(50);
            tblOnibus.getColumnModel().getColumn(3).setMinWidth(70);
            tblOnibus.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblOnibus.getColumnModel().getColumn(3).setMaxWidth(70);
            tblOnibus.getColumnModel().getColumn(4).setMinWidth(70);
            tblOnibus.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblOnibus.getColumnModel().getColumn(4).setMaxWidth(70);
            tblOnibus.getColumnModel().getColumn(5).setMinWidth(70);
            tblOnibus.getColumnModel().getColumn(5).setPreferredWidth(70);
            tblOnibus.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblNumeroOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroOnibus.setText("Número:");

        txfNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNumero.setEnabled(false);

        lblSituacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSituacao.setText("Situação:");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buscar.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ckbTodosOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodosOnibus.setSelected(true);
        ckbTodosOnibus.setText("Todos Números");
        ckbTodosOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodosOnibusMousePressed(evt);
            }
        });

        ckbTodasSitucoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasSitucoes.setSelected(true);
        ckbTodasSitucoes.setText("Todas Situações");
        ckbTodasSitucoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasSitucoesMousePressed(evt);
            }
        });

        btgSituacao.add(rdbAtivos);
        rdbAtivos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbAtivos.setSelected(true);
        rdbAtivos.setText("Ativos");
        rdbAtivos.setEnabled(false);

        btgSituacao.add(rdbInativos);
        rdbInativos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbInativos.setText("Inativos");
        rdbInativos.setEnabled(false);

        lblBancos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBancos.setText("Bancos:");

        cmbAssentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAssentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "36", "38", "40", "42", "44", "46", "48", "50", "52" }));
        cmbAssentos.setEnabled(false);

        ckbTodosAssentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodosAssentos.setSelected(true);
        ckbTodosAssentos.setText("Todas Quantidades");
        ckbTodosAssentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodosAssentosMousePressed(evt);
            }
        });

        lblBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBanheiro.setText("Banheiro:");

        btgBanheiro.add(rdbComBanheiro);
        rdbComBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbComBanheiro.setText("Com");
        rdbComBanheiro.setEnabled(false);

        btgBanheiro.add(rdbSemBanheiro);
        rdbSemBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbSemBanheiro.setSelected(true);
        rdbSemBanheiro.setText("Sem");
        rdbSemBanheiro.setEnabled(false);

        ckbComESemBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbComESemBanheiro.setSelected(true);
        ckbComESemBanheiro.setText("Todos Tipos");
        ckbComESemBanheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbComESemBanheiroMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSituacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbAtivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbInativos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBancos)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAssentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbTodosAssentos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckbTodasSitucoes)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroOnibus)
                            .addComponent(lblBanheiro))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txfNumero))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbComBanheiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbSemBanheiro)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbTodosOnibus)
                            .addComponent(ckbComESemBanheiro))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblListarOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeOnibus)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblListarOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconeOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroOnibus)
                    .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodosOnibus))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanheiro)
                    .addComponent(rdbComBanheiro)
                    .addComponent(rdbSemBanheiro)
                    .addComponent(ckbComESemBanheiro))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBancos)
                    .addComponent(cmbAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodosAssentos))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(lblSituacao)
                    .addComponent(rdbAtivos)
                    .addComponent(rdbInativos)
                    .addComponent(ckbTodasSitucoes))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!ckbTodosOnibus.isSelected()) {
            if (txfNumero.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!","erro!",1);
            } else {
                filtrarTabela();
            }
        } else {
            filtrarTabela();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void ckbTodosOnibusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodosOnibusMousePressed
        txfNumero.setEnabled(ckbTodosOnibus.isSelected());
    }//GEN-LAST:event_ckbTodosOnibusMousePressed

    private void ckbComESemBanheiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbComESemBanheiroMousePressed
        rdbComBanheiro.setEnabled(ckbComESemBanheiro.isSelected());
        rdbSemBanheiro.setEnabled(ckbComESemBanheiro.isSelected());
    }//GEN-LAST:event_ckbComESemBanheiroMousePressed

    private void ckbTodosAssentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodosAssentosMousePressed
        cmbAssentos.setEnabled(ckbTodosAssentos.isSelected());
    }//GEN-LAST:event_ckbTodosAssentosMousePressed

    private void ckbTodasSitucoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasSitucoesMousePressed
        rdbInativos.setEnabled(ckbTodasSitucoes.isSelected());
        rdbAtivos.setEnabled(ckbTodasSitucoes.isSelected());
    }//GEN-LAST:event_ckbTodasSitucoesMousePressed

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
            java.util.logging.Logger.getLogger(JanelaListagemOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaListagemOnibus dialog = new JanelaListagemOnibus(new JanelaPrincipal(), true);
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

    private void redimensionarTabela(int tamanho) {
            tblOnibus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [tamanho][6],
            new String [] {
                "Código", "Numero", "Bancos", "Executivo", "Banheiro", "Ativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOnibus.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOnibus);
        }

    private void preencherTabela(ArrayList<Onibus> aux) {
        redimensionarTabela(aux.size());
        for (int i = 0; i < aux.size(); i++) {
            Onibus cAux = aux.get(i);
            tblOnibus.setValueAt(cAux.getCodigo(), i, 0);
            tblOnibus.setValueAt(cAux, i, 1);
            tblOnibus.setValueAt(cAux.getAssentos(), i, 2);
            tblOnibus.setValueAt(cAux.isExecutivo(), i, 3);
            tblOnibus.setValueAt(cAux.isBanheiro(), i, 4);
            tblOnibus.setValueAt(cAux.isSituacao(), i, 5);
        }
    }

    private void filtrarTabela() {
        ArrayList<Onibus> aux;
        aux = JanelaPrincipal.ctlOnibus.listar();
        boolean achou = true;
        if (!ckbTodosOnibus.isSelected() && achou) {
            aux = JanelaPrincipal.ctlOnibus.listar(txfNumero.getText());
            if (aux.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbComESemBanheiro.isSelected() && achou) {
            aux = JanelaPrincipal.ctlOnibus.listar(aux, rdbComBanheiro.isSelected());
            if (aux.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodasSitucoes.isSelected() && achou) {
            aux = JanelaPrincipal.ctlOnibus.listar(aux, rdbAtivos.isSelected());
            if (aux.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodosAssentos.isSelected() && achou) {
            aux = JanelaPrincipal.ctlOnibus.listar(aux, (Integer.parseInt(String.valueOf(cmbAssentos.getSelectedItem()))));
            if (aux.isEmpty()) {
                achou = false;
            }
        }
        if (achou) {
            preencherTabela(aux);
        } else {
            JOptionPane.showMessageDialog(this, "NENHUM ÔNIBUS ENCONTRADO!\nTENTE OUTROS FILTROS!","busca!",2);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBanheiro;
    private javax.swing.ButtonGroup btgSituacao;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbComESemBanheiro;
    private javax.swing.JCheckBox ckbTodasSitucoes;
    private javax.swing.JCheckBox ckbTodosAssentos;
    private javax.swing.JCheckBox ckbTodosOnibus;
    private javax.swing.JComboBox cmbAssentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBancos;
    private javax.swing.JLabel lblBanheiro;
    private javax.swing.JLabel lblIconeOnibus;
    private javax.swing.JLabel lblListarOnibus;
    private javax.swing.JLabel lblNumeroOnibus;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JRadioButton rdbAtivos;
    private javax.swing.JRadioButton rdbComBanheiro;
    private javax.swing.JRadioButton rdbInativos;
    private javax.swing.JRadioButton rdbSemBanheiro;
    private javax.swing.JTable tblOnibus;
    private javax.swing.JTextField txfNumero;
    // End of variables declaration//GEN-END:variables
}
