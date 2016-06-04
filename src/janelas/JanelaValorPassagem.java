package janelas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaValorPassagem extends javax.swing.JDialog {

    public JanelaValorPassagem(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        janela = (JDialog) parent;
        txfValor.setText("");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOK = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txfValor = new javax.swing.JTextField();
        lblRS = new javax.swing.JLabel();
        lblIconeValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Valor Passagem");

        btnOK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ok.jpg"))); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("Valor da Passagem:");

        txfValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfValor.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txfValor.setText("0.00");
        txfValor.setToolTipText("");

        lblRS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRS.setText("R$");

        lblIconeValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ValorPassagem.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeValor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRS)
                        .addGap(18, 18, 18)
                        .addComponent(txfValor)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconeValor))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRS)
                    .addComponent(txfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if (verificarValor()) {
            if (janela instanceof JanelaAlteracoesLinhas) {
                JanelaAlteracoesLinhas.valor = txfValor.getText();
            } else {
                JanelaCadastrosLinhas.valor = txfValor.getText();
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "VALOR INVÁLIDO!", "erro!", 0);
            txfValor.requestFocus();
            txfValor.selectAll();

        }
    }//GEN-LAST:event_btnOKActionPerformed

    private boolean verificarValor() {
        try {
            double valor = Double.parseDouble(txfValor.getText());
            return true;
        } catch (Exception e) {
            return false;
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
            java.util.logging.Logger.getLogger(JanelaValorPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaValorPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaValorPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaValorPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaValorPassagem dialog = new JanelaValorPassagem(new javax.swing.JDialog(), true);
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

    JDialog janela;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblIconeValor;
    private javax.swing.JLabel lblRS;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txfValor;
    // End of variables declaration//GEN-END:variables
}
