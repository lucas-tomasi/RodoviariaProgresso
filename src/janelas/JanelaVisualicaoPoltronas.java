package janelas;

import classeDeNegocio.Linha;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaVisualicaoPoltronas extends javax.swing.JDialog {

    /**
     *
     * @param parent
     * @param modal
     */
    public JanelaVisualicaoPoltronas(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherComboLinhas();
        poltronas = new ArrayList<>();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVisualizacaoPoltronas = new javax.swing.JLabel();
        lblLinha = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        cmbLinha = new javax.swing.JComboBox();
        lblInfo = new javax.swing.JLabel();
        lblIconePoltronas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualização Poltronas");

        lblVisualizacaoPoltronas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblVisualizacaoPoltronas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVisualizacaoPoltronas.setText("Visualização Poltronas");
        lblVisualizacaoPoltronas.setToolTipText("");

        lblLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLinha.setText("Linha:");

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        cmbLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLinha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLinhaItemStateChanged(evt);
            }
        });

        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Info.png"))); // NOI18N
        lblInfo.setText("  Selecione a linha para visualizar poltronas!");

        lblIconePoltronas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblIconePoltronas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconePoltronas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Poltrona.jpg"))); // NOI18N
        lblIconePoltronas.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblLinha)
                        .addGap(18, 18, 18)
                        .addComponent(cmbLinha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblVisualizacaoPoltronas)
                        .addGap(66, 66, 66)
                        .addComponent(lblIconePoltronas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVisualizacaoPoltronas)
                    .addComponent(lblIconePoltronas))
                .addGap(7, 7, 7)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinha)
                    .addComponent(cmbLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(484, 484, 484)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cmbLinhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLinhaItemStateChanged
        if (cmbLinha.getSelectedIndex() != 0) {
            gerarPoltronas((Linha) cmbLinha.getSelectedItem());
        }
    }//GEN-LAST:event_cmbLinhaItemStateChanged

    private void preencherComboLinhas() {
        ArrayList<Linha> aux = JanelaPrincipal.ctlLinha.listar();
        aux = JanelaPrincipal.ctlLinha.listar(aux);
        if (aux.isEmpty()) {
            cmbLinha.addItem("NENHUMA LINHA DISPONIVEL!");
        } else {
            cmbLinha.addItem(": SELECIONE :");
            for (int i = 0; i < aux.size(); i++) {
                cmbLinha.addItem(aux.get(i));
            }
        }

    }

    private void removerBotoes() {
        for (int i = 0; i < poltronas.size(); i++) {
            this.remove(poltronas.get(i));
        }
        this.repaint();
    }

    private void gerarPoltronas(Linha linha) {
        removerBotoes();
        String situacaoPoltronas [] = linha.getSituacaoPoltronas();
        poltronas.removeAll(poltronas);
        int x1 = 75, x2 = 135, x4 = 275, x3 = 215, y = 140, cont = 1;
        for (int i = 1; i < situacaoPoltronas.length; i++) {
            JButton botao = new JButton();
            botao.setSize(50, 30);
            botao.setText(String.valueOf(i));
            if (situacaoPoltronas[i].equalsIgnoreCase("L")) {
                botao.setBackground(Color.green);
            } else {
                botao.setBackground(Color.red);
            }
            if (cont == 5) {
                y = y + 35;
                cont = 1;
            }
            if (cont == 1) {
                botao.setLocation(x1, y);
                cont++;
            } else if (cont == 2) {
                botao.setLocation(x2, y);
                cont++;
            } else if (cont == 3) {
                cont++;
                botao.setLocation(x4, y);
            } else if (cont == 4) {
                cont++;
                botao.setLocation(x3, y);
            }            
            poltronas.add(botao);
            this.add(botao);
        }
        this.repaint();
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
            java.util.logging.Logger.getLogger(JanelaVisualicaoPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaVisualicaoPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaVisualicaoPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaVisualicaoPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaVisualicaoPoltronas dialog = new JanelaVisualicaoPoltronas(new JanelaPrincipal(), true);
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

    private ArrayList<JButton> poltronas;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbLinha;
    private javax.swing.JLabel lblIconePoltronas;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLinha;
    private javax.swing.JLabel lblVisualizacaoPoltronas;
    // End of variables declaration//GEN-END:variables
}
