package janelas;

import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Passagem;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaCancelamentoPassagens extends javax.swing.JDialog {

    public JanelaCancelamentoPassagens(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCancelarPassagem = new javax.swing.JLabel();
        lblCodigoPassagem = new javax.swing.JLabel();
        btnCancelamento = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txfNumeroPassagem = new javax.swing.JTextField();
        lblValorPassagem = new javax.swing.JLabel();
        lblPoltronas = new javax.swing.JLabel();
        lblOnibus = new javax.swing.JLabel();
        lblBanheiro = new javax.swing.JLabel();
        lblVT = new javax.swing.JLabel();
        lblCodBus = new javax.swing.JLabel();
        lblvalorTotal = new javax.swing.JLabel();
        lblNumPoltrona = new javax.swing.JLabel();
        lblSeguro = new javax.swing.JLabel();
        lblHoraSaida = new javax.swing.JLabel();
        lblValorSeguro = new javax.swing.JLabel();
        lblVP = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblVS = new javax.swing.JLabel();
        ckbBanheiro = new javax.swing.JCheckBox();
        ckbSeguro = new javax.swing.JCheckBox();
        lblOrigem = new javax.swing.JLabel();
        lblProgresso = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblCodigoPassagem1 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblDatas = new javax.swing.JLabel();
        lblDestinoLinha = new javax.swing.JLabel();
        lblHoraVenda = new javax.swing.JLabel();
        lblHV = new javax.swing.JLabel();
        lblParada = new javax.swing.JLabel();
        lblCidadeParada = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancelamento Passagens");

        lblCancelarPassagem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCancelarPassagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelarPassagem.setText("Cancelamento Passagens");
        lblCancelarPassagem.setToolTipText("");

        lblCodigoPassagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoPassagem.setText("Digite o Código:");

        btnCancelamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ok.jpg"))); // NOI18N
        btnCancelamento.setText("Confirmar");
        btnCancelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelamentoActionPerformed(evt);
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

        txfNumeroPassagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNumeroPassagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNumeroPassagemKeyTyped(evt);
            }
        });

        lblValorPassagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorPassagem.setText("Valor Passagem:");

        lblPoltronas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPoltronas.setText("Poltrona:");

        lblOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnibus.setText("Ônibus:");

        lblBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBanheiro.setText("Banheiro:");

        lblVT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVT.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVT.setText("-");

        lblCodBus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodBus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCodBus.setText("-");

        lblvalorTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblvalorTotal.setText("Valor Total:");

        lblNumPoltrona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumPoltrona.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumPoltrona.setText("-");

        lblSeguro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSeguro.setText("Seguro:");

        lblHoraSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraSaida.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHoraSaida.setText("-");

        lblValorSeguro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorSeguro.setText("Valor Seguro:");

        lblVP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVP.setText("-");

        lblSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaida.setText("Saída:");

        lblVS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVS.setText("-");

        ckbBanheiro.setEnabled(false);

        ckbSeguro.setEnabled(false);

        lblOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrigem.setText("Origem:");

        lblProgresso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProgresso.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblProgresso.setText("Progresso");

        lblDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestino.setText("Destino:");

        lblCodigoPassagem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoPassagem1.setText("Código:");

        lblCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCod.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCod.setText("-");

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblData.setText("-");

        lblDatas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatas.setText("Data:");

        lblDestinoLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestinoLinha.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDestinoLinha.setText("-");

        lblHoraVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraVenda.setText("Hora Venda:");

        lblHV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHV.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHV.setText("-");

        lblParada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParada.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblParada.setText("-");

        lblCidadeParada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCidadeParada.setText("Parada:");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buscar.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCancelarPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVoltar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCidadeParada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblParada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblNumPoltrona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblHoraVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHV, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(lblDestino)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblDestinoLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(1, 1, 1))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnCancelamento)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(lblSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(ckbSeguro))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(lblvalorTotal)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lblVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(lblValorPassagem)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lblVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(lblValorSeguro)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lblVS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblOrigem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigoPassagem1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCodigoPassagem, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBanheiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblPoltronas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(txfNumeroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ckbBanheiro)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOnibus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCodBus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDatas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblCancelarPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPassagem)
                    .addComponent(txfNumeroPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPassagem1)
                    .addComponent(lblCod)
                    .addComponent(lblOrigem)
                    .addComponent(lblProgresso))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCidadeParada)
                        .addComponent(lblParada))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDestino)
                        .addComponent(lblDestinoLinha)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatas)
                    .addComponent(lblData)
                    .addComponent(lblHoraVenda)
                    .addComponent(lblHV))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodBus)
                            .addComponent(lblSeguro)
                            .addComponent(lblOnibus))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBanheiro)
                            .addComponent(ckbBanheiro)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValorSeguro)
                                .addComponent(lblVS)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaida)
                            .addComponent(lblHoraSaida)
                            .addComponent(lblValorPassagem)
                            .addComponent(lblVP))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPoltronas)
                            .addComponent(lblNumPoltrona)
                            .addComponent(lblvalorTotal)
                            .addComponent(lblVT))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelamento)
                            .addComponent(btnVoltar)))
                    .addComponent(ckbSeguro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNumeroPassagemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNumeroPassagemKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txfNumeroPassagemKeyTyped

    private void btnCancelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelamentoActionPerformed
        if (lblCod.getText().equalsIgnoreCase("-")) {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!","erro!",0);
        } else {
            if (JanelaPrincipal.ctlPassagens.cancelar(passagemAux)) {
                JOptionPane.showMessageDialog(this, "CANCELADA COM SUCESSO!","confirmação",1);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "ERRO AO CANCELAR!","erro!",0);
                txfNumeroPassagem.setText("");
                txfNumeroPassagem.requestFocus();
            }

        }
    }//GEN-LAST:event_btnCancelamentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (JanelaPrincipal.ctlPassagens.validarCancelamento((Integer.parseInt(String.valueOf(txfNumeroPassagem.getText()))))) {
            passagemAux = JanelaPrincipal.ctlPassagens.buscar((Integer.parseInt(String.valueOf(txfNumeroPassagem.getText()))));
            atualizarCampos(passagemAux);
        } else {
            JOptionPane.showMessageDialog(this, "PASSAGEM INVÁLIDA!","erro!",0);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void atualizarCampos(Passagem p) {
        Linha auxLinha = JanelaPrincipal.ctlLinha.buscarLinha(p.getLinha());
        Onibus auxOnibus = JanelaPrincipal.ctlOnibus.buscar(auxLinha.getOnibus());
        lblCod.setText(String.valueOf(p.getCodigo()));
        lblData.setText(p.getData());
        lblCodBus.setText(auxOnibus.getNumeroOnibus());
        ckbBanheiro.setSelected(auxOnibus.isBanheiro());
        ckbSeguro.setSelected(p.isSeguro());
        lblHoraSaida.setText(auxLinha.getHorario());
        lblHV.setText(p.getHora());
        lblVP.setText(String.valueOf(p.getValorParada()));
        lblVS.setText(String.valueOf(p.getValorSeguro()));
        lblVT.setText(String.valueOf(p.getValorTotal()));
        lblNumPoltrona.setText(String.valueOf(p.getPoltrona()));
        lblDestinoLinha.setText(p.getDestino());
        lblParada.setText(p.getParada());
    }

    private void limparCampos() {
        lblCod.setText("-");
        lblData.setText("-");
        lblCodBus.setText("-");
        ckbBanheiro.setSelected(false);
        ckbSeguro.setSelected(false);
        lblHoraSaida.setText("-");
        lblHV.setText("-");
        lblVP.setText("-");
        lblVS.setText("-");
        lblVT.setText("-");
        lblNumPoltrona.setText("-");
        lblDestinoLinha.setText("-");
        lblParada.setText("-");
        txfNumeroPassagem.setText("");
        txfNumeroPassagem.requestFocus();
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
            java.util.logging.Logger.getLogger(JanelaCancelamentoPassagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCancelamentoPassagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCancelamentoPassagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCancelamentoPassagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCancelamentoPassagens dialog = new JanelaCancelamentoPassagens(new JanelaPrincipal(), true);
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

    Passagem passagemAux;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelamento;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbBanheiro;
    private javax.swing.JCheckBox ckbSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBanheiro;
    private javax.swing.JLabel lblCancelarPassagem;
    private javax.swing.JLabel lblCidadeParada;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodBus;
    private javax.swing.JLabel lblCodigoPassagem;
    private javax.swing.JLabel lblCodigoPassagem1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDatas;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDestinoLinha;
    private javax.swing.JLabel lblHV;
    private javax.swing.JLabel lblHoraSaida;
    private javax.swing.JLabel lblHoraVenda;
    private javax.swing.JLabel lblNumPoltrona;
    private javax.swing.JLabel lblOnibus;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblParada;
    private javax.swing.JLabel lblPoltronas;
    private javax.swing.JLabel lblProgresso;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblSeguro;
    private javax.swing.JLabel lblVP;
    private javax.swing.JLabel lblVS;
    private javax.swing.JLabel lblVT;
    private javax.swing.JLabel lblValorPassagem;
    private javax.swing.JLabel lblValorSeguro;
    private javax.swing.JLabel lblvalorTotal;
    private javax.swing.JTextField txfNumeroPassagem;
    // End of variables declaration//GEN-END:variables
}
