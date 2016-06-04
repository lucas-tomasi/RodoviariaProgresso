package janelas;

import classeDeNegocio.Onibus;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaCadastrosOnibus extends javax.swing.JDialog {

    public JanelaCadastrosOnibus(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBanheiro = new javax.swing.ButtonGroup();
        btgExecutivo = new javax.swing.ButtonGroup();
        lblIconeOnibus = new javax.swing.JLabel();
        lblCadastrosOnibus = new javax.swing.JLabel();
        lblCodigoOnibus = new javax.swing.JLabel();
        lblBanheiro = new javax.swing.JLabel();
        lblAssentos = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txfCodigoOnibus = new javax.swing.JTextField();
        cbxNumeroAssentos = new javax.swing.JComboBox();
        rdbComBanheiro = new javax.swing.JRadioButton();
        rdbSemBanheiro = new javax.swing.JRadioButton();
        rdbSim = new javax.swing.JRadioButton();
        rdbNao = new javax.swing.JRadioButton();
        lblExecutivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Ônibus");

        lblIconeOnibus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Onibus.png"))); // NOI18N
        lblIconeOnibus.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblCadastrosOnibus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblCadastrosOnibus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrosOnibus.setText("Cadastros Ônibus");
        lblCadastrosOnibus.setToolTipText("");

        lblCodigoOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoOnibus.setText("Nome:");

        lblBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBanheiro.setText("Banheiro:");

        lblAssentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAssentos.setText("Assentos:");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.jpg"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        txfCodigoOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbxNumeroAssentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxNumeroAssentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "36", "38", "40", "42", "44", "46", "48", "50", "52" }));

        btgBanheiro.add(rdbComBanheiro);
        rdbComBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbComBanheiro.setText("Com Banheiro");
        rdbComBanheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdbComBanheiroMousePressed(evt);
            }
        });

        btgBanheiro.add(rdbSemBanheiro);
        rdbSemBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbSemBanheiro.setText("Sem Banheiro");
        rdbSemBanheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdbSemBanheiroMousePressed(evt);
            }
        });

        btgExecutivo.add(rdbSim);
        rdbSim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbSim.setText("Sim");

        btgExecutivo.add(rdbNao);
        rdbNao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbNao.setSelected(true);
        rdbNao.setText("Não");

        lblExecutivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExecutivo.setText("Executivo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCadastrosOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblExecutivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbSim)
                                .addGap(12, 12, 12)
                                .addComponent(rdbNao))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAssentos)
                                    .addComponent(lblCodigoOnibus)
                                    .addComponent(lblBanheiro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxNumeroAssentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbComBanheiro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbSemBanheiro))
                                    .addComponent(txfCodigoOnibus))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCadastrosOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIconeOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoOnibus)
                    .addComponent(txfCodigoOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBanheiro)
                    .addComponent(rdbComBanheiro)
                    .addComponent(rdbSemBanheiro))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssentos)
                    .addComponent(cbxNumeroAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExecutivo)
                    .addComponent(rdbSim)
                    .addComponent(rdbNao))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txfCodigoOnibus.getText().equalsIgnoreCase("")) {
            if (JanelaPrincipal.ctlOnibus.verificarNome(null, txfCodigoOnibus.getText(),rdbSim.isSelected())) {
                Onibus novoOnibus = new Onibus();
                novoOnibus.setNumeroOnibus(txfCodigoOnibus.getText());
                novoOnibus.setAssentos(Integer.parseInt(String.valueOf(cbxNumeroAssentos.getSelectedItem())));
                novoOnibus.setBanheiro(rdbComBanheiro.isSelected());
                novoOnibus.setExecutivo(rdbSim.isSelected());
                JanelaPrincipal.ctlOnibus.inserir(novoOnibus);
                JOptionPane.showMessageDialog(this, "CADASTRADO COM SUCESSO!", "confirmação!", 1);
                atualizar();
            } else {
                JOptionPane.showMessageDialog(this, "NÚMERO JÁ CADASTRADO!", "incoerência!", 0);
                atualizar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!","erro!",0);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void rdbComBanheiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbComBanheiroMousePressed
        cbxNumeroAssentos.removeAllItems();
        for (int i = 36; i <= 48; i = i + 2) {
            cbxNumeroAssentos.addItem(i);
        }
    }//GEN-LAST:event_rdbComBanheiroMousePressed

    private void rdbSemBanheiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbSemBanheiroMousePressed
        cbxNumeroAssentos.removeAllItems();
        for (int i = 36; i <= 52; i = i + 2) {
            cbxNumeroAssentos.addItem(i);
        }
    }//GEN-LAST:event_rdbSemBanheiroMousePressed
   
    private void atualizar() {
        txfCodigoOnibus.setText("");
        txfCodigoOnibus.requestFocus();
        rdbSemBanheiro.isSelected();
        cbxNumeroAssentos.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(JanelaCadastrosOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCadastrosOnibus dialog = new JanelaCadastrosOnibus(new JanelaPrincipal(), true);
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
    private javax.swing.ButtonGroup btgBanheiro;
    private javax.swing.ButtonGroup btgExecutivo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxNumeroAssentos;
    private javax.swing.JLabel lblAssentos;
    private javax.swing.JLabel lblBanheiro;
    private javax.swing.JLabel lblCadastrosOnibus;
    private javax.swing.JLabel lblCodigoOnibus;
    private javax.swing.JLabel lblExecutivo;
    private javax.swing.JLabel lblIconeOnibus;
    private javax.swing.JRadioButton rdbComBanheiro;
    private javax.swing.JRadioButton rdbNao;
    private javax.swing.JRadioButton rdbSemBanheiro;
    private javax.swing.JRadioButton rdbSim;
    private javax.swing.JTextField txfCodigoOnibus;
    // End of variables declaration//GEN-END:variables
}
