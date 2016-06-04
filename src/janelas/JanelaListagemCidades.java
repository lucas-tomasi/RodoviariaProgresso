package janelas;

import classeDeNegocio.Cidade;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaListagemCidades extends javax.swing.JDialog {

    public JanelaListagemCidades(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        filtrarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSituacao = new javax.swing.ButtonGroup();
        lblIconeCidade = new javax.swing.JLabel();
        lblListarCidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCidades = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblCidade = new javax.swing.JLabel();
        txfNomeProcurado = new javax.swing.JTextField();
        lblSituacao = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ckbTodasCidades = new javax.swing.JCheckBox();
        ckbTodasSitucoes = new javax.swing.JCheckBox();
        rdbAtivos = new javax.swing.JRadioButton();
        rdbInativos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem Cidades");

        lblIconeCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cidade.png"))); // NOI18N

        lblListarCidade.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblListarCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListarCidade.setText("Listagem Cidades");
        lblListarCidade.setToolTipText("");

        tblCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Cidade", "UF", "Ativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCidades);
        if (tblCidades.getColumnModel().getColumnCount() > 0) {
            tblCidades.getColumnModel().getColumn(0).setMinWidth(70);
            tblCidades.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblCidades.getColumnModel().getColumn(0).setMaxWidth(70);
            tblCidades.getColumnModel().getColumn(2).setMinWidth(50);
            tblCidades.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblCidades.getColumnModel().getColumn(2).setMaxWidth(50);
            tblCidades.getColumnModel().getColumn(3).setMinWidth(70);
            tblCidades.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblCidades.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        txfNomeProcurado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNomeProcurado.setEnabled(false);

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

        ckbTodasCidades.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasCidades.setSelected(true);
        ckbTodasCidades.setText("Todos Nomes");
        ckbTodasCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasCidadesMousePressed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblListarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIconeCidade))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidade)
                                    .addComponent(lblSituacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfNomeProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbAtivos)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbInativos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbTodasCidades)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ckbTodasSitucoes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnVoltar)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblListarCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconeCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txfNomeProcurado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodasCidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituacao)
                    .addComponent(btnBuscar)
                    .addComponent(ckbTodasSitucoes)
                    .addComponent(rdbAtivos)
                    .addComponent(rdbInativos))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!ckbTodasCidades.isSelected()) {
            if (txfNomeProcurado.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!","erro!",0);
            } else {
                filtrarTabela();
            }
        } else {
            filtrarTabela();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ckbTodasSitucoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasSitucoesMousePressed
        rdbInativos.setEnabled(ckbTodasSitucoes.isSelected());
        rdbAtivos.setEnabled(ckbTodasSitucoes.isSelected());
    }//GEN-LAST:event_ckbTodasSitucoesMousePressed

    private void ckbTodasCidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasCidadesMousePressed
              txfNomeProcurado.setEnabled(ckbTodasCidades.isSelected());      
    }//GEN-LAST:event_ckbTodasCidadesMousePressed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void redimensionarTabela(int tamanho) {
        tblCidades.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][4],
                new String[]{
                    "Código", "Cidade", "UF", "Ativa"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblCidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCidades);
        if (tblCidades.getColumnModel().getColumnCount() > 0) {
            tblCidades.getColumnModel().getColumn(0).setMinWidth(70);
            tblCidades.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblCidades.getColumnModel().getColumn(0).setMaxWidth(70);
            tblCidades.getColumnModel().getColumn(2).setMinWidth(50);
            tblCidades.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblCidades.getColumnModel().getColumn(2).setMaxWidth(50);
            tblCidades.getColumnModel().getColumn(3).setMinWidth(70);
            tblCidades.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblCidades.getColumnModel().getColumn(3).setMaxWidth(70);
        }
    }

    private void preencherTabela(ArrayList<Cidade> aux) {
        redimensionarTabela(aux.size());
        for (int i = 0; i < aux.size(); i++) {
            Cidade cAux = aux.get(i);
            tblCidades.setValueAt(cAux.getCodigo(), i, 0);
            tblCidades.setValueAt(cAux, i, 1);
            tblCidades.setValueAt(cAux.getUf(), i, 2);
            tblCidades.setValueAt(cAux.isSituacao(), i, 3);
        }
    }

    private void filtrarTabela() {
        ArrayList<Cidade> listaCidades = JanelaPrincipal.ctlCidades.listar();
        boolean achou = true;
        if (!ckbTodasSitucoes.isSelected()) {
            listaCidades = JanelaPrincipal.ctlCidades.listar(rdbAtivos.isSelected());
            if (listaCidades.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodasCidades.isSelected() && achou) {
            listaCidades = JanelaPrincipal.ctlCidades.listar(txfNomeProcurado.getText(), listaCidades);
            if (listaCidades.isEmpty()) {
                achou = false;
            }
        }
        if (achou) {
            preencherTabela(listaCidades);
        } else {
            JOptionPane.showMessageDialog(this, "NENHUMA CIDADE ENCONTRADA!\nTENTE OUTROS FILTROS!","busca!",2);
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
            java.util.logging.Logger.getLogger(JanelaListagemCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaListagemCidades dialog = new JanelaListagemCidades(new JanelaPrincipal(), true);
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
    private javax.swing.ButtonGroup btgSituacao;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbTodasCidades;
    private javax.swing.JCheckBox ckbTodasSitucoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblIconeCidade;
    private javax.swing.JLabel lblListarCidade;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JRadioButton rdbAtivos;
    private javax.swing.JRadioButton rdbInativos;
    private javax.swing.JTable tblCidades;
    private javax.swing.JTextField txfNomeProcurado;
    // End of variables declaration//GEN-END:variables
}
