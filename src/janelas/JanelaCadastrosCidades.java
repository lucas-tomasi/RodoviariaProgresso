package janelas;

import classeDeNegocio.Cidade;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaCadastrosCidades extends javax.swing.JDialog {

    public JanelaCadastrosCidades(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jp = parent;
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconeCidade = new javax.swing.JLabel();
        lblCadastrosCidades = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txfNomeCidade = new javax.swing.JTextField();
        cmbUf = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros Cidades");

        lblIconeCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cidade.png"))); // NOI18N

        lblCadastrosCidades.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblCadastrosCidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrosCidades.setText("Cadastros Cidades");
        lblCadastrosCidades.setToolTipText("");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUf.setText("UF:");

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

        txfNomeCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNomeCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfNomeCidadeFocusGained(evt);
            }
        });
        txfNomeCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNomeCidadeKeyTyped(evt);
            }
        });

        cmbUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ": Selecione :", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblUf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfNomeCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(cmbUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCadastrosCidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconeCidade)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCadastrosCidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconeCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txfNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUf)
                    .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNomeCidadeFocusGained
        txfNomeCidade.setText("");
    }//GEN-LAST:event_txfNomeCidadeFocusGained

    private void txfNomeCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNomeCidadeKeyTyped
        String caracteres = "0987654321.";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txfNomeCidadeKeyTyped

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txfNomeCidade.getText().equalsIgnoreCase("") || cmbUf.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!", "erro!", 0);
            txfNomeCidade.requestFocus();
        } else {
            if (JanelaPrincipal.ctlCidades.verificarNomeCidade(null,String.valueOf(cmbUf.getSelectedItem()), txfNomeCidade.getText())) {
                Cidade novaCidade = new Cidade();
                novaCidade.setNome(txfNomeCidade.getText());
                novaCidade.setUf(String.valueOf(cmbUf.getSelectedItem()));
                JanelaPrincipal.ctlCidades.inserir(novaCidade);
                JOptionPane.showMessageDialog(this, "CADASTRADO COM SUCESSO!", "confirmação!", 1);
                jp.preencherComboDestino();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "NOME JÁ CADASTRADO!", "incoerência!", 0);
                txfNomeCidade.requestFocus();
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void limparCampos() {
        cmbUf.setSelectedIndex(0);
        txfNomeCidade.requestFocus();
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
            java.util.logging.Logger.getLogger(JanelaCadastrosCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCadastrosCidades dialog = new JanelaCadastrosCidades(new JanelaPrincipal(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbUf;
    private javax.swing.JLabel lblCadastrosCidades;
    private javax.swing.JLabel lblIconeCidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTextField txfNomeCidade;
    // End of variables declaration//GEN-END:variables
}
