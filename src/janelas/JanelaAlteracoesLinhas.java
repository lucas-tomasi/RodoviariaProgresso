package janelas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Parada;
import classesDeAjuda.DataHora;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JanelaAlteracoesLinhas extends javax.swing.JDialog {

    public JanelaAlteracoesLinhas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        auxParadas = new ArrayList<>();
        atualizarComboDestino();
        atualizarComboOnibus();
        preencherTabelaLinhas();
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSituacao = new javax.swing.ButtonGroup();
        btgTipo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParadas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCidades = new javax.swing.JTable();
        btnRemoverParadas = new javax.swing.JButton();
        btnAdicionarParadas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLinhas = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        lblDestino = new javax.swing.JLabel();
        ftxSaida = new javax.swing.JFormattedTextField();
        txfNmeroLinha = new javax.swing.JTextField();
        cmbOnibus = new javax.swing.JComboBox();
        lblSaida = new javax.swing.JLabel();
        lblOnibus = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox();
        lblFrequencia = new javax.swing.JLabel();
        ckbDom = new javax.swing.JCheckBox();
        ckbTer = new javax.swing.JCheckBox();
        ckbSeg = new javax.swing.JCheckBox();
        ckbQua = new javax.swing.JCheckBox();
        ckbQui = new javax.swing.JCheckBox();
        ckbSex = new javax.swing.JCheckBox();
        ckbSab = new javax.swing.JCheckBox();
        lblNumeroLinha = new javax.swing.JLabel();
        lblAlteracaoLinhas = new javax.swing.JLabel();
        lblSitução = new javax.swing.JLabel();
        rdbAtivo = new javax.swing.JRadioButton();
        rdbInativo = new javax.swing.JRadioButton();
        lblInfoLinha = new javax.swing.JLabel();
        lblIconeLinha = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        rdbExtra = new javax.swing.JRadioButton();
        rdbNormal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterações Linhas");

        tblParadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cidade", "Tipo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblParadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblParadas);
        if (tblParadas.getColumnModel().getColumnCount() > 0) {
            tblParadas.getColumnModel().getColumn(0).setResizable(false);
            tblParadas.getColumnModel().getColumn(1).setResizable(false);
            tblParadas.getColumnModel().getColumn(2).setResizable(false);
            tblParadas.getColumnModel().getColumn(3).setResizable(false);
        }

        tblCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCidades);

        btnRemoverParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemoverParadas.setText("-");
        btnRemoverParadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverParadasActionPerformed(evt);
            }
        });

        btnAdicionarParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdicionarParadas.setText("+");
        btnAdicionarParadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarParadasActionPerformed(evt);
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

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.jpg"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tblLinhas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linhas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLinhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLinhasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLinhas);

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        lblDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestino.setText("Destino:");

        try {
            ftxSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxSaida.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        ftxSaida.setText(" 00 :00");
        ftxSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxSaida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftxSaidaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxSaidaFocusLost(evt);
            }
        });
        ftxSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxSaidaKeyTyped(evt);
            }
        });

        txfNmeroLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbOnibus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaida.setText("Saída:");

        lblOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnibus.setText("Ônibus:");

        cmbDestino.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbDestinoFocusLost(evt);
            }
        });

        lblFrequencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFrequencia.setText("Frequência:");

        ckbDom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbDom.setText("Dom");

        ckbTer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTer.setText("Ter");

        ckbSeg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbSeg.setText("Seg");

        ckbQua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbQua.setText("Qua");

        ckbQui.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbQui.setText("Qui");

        ckbSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbSex.setText("Sex");

        ckbSab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbSab.setText("Sáb");

        lblNumeroLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroLinha.setText("Número:");

        lblAlteracaoLinhas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAlteracaoLinhas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlteracaoLinhas.setText("Alterações Linhas");

        lblSitução.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSitução.setText("Situação:");

        btgSituacao.add(rdbAtivo);
        rdbAtivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbAtivo.setText("Ativo");

        btgSituacao.add(rdbInativo);
        rdbInativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbInativo.setSelected(true);
        rdbInativo.setText("Inativo");

        lblInfoLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Info.png"))); // NOI18N
        lblInfoLinha.setText("  Para alterar valor da cidade clique em [  -  ] e adicione-a novamente ou altere o destino");

        lblIconeLinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Linha.jpg"))); // NOI18N

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        btgTipo.add(rdbExtra);
        rdbExtra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbExtra.setText("Extra");

        btgTipo.add(rdbNormal);
        rdbNormal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbNormal.setSelected(true);
        rdbNormal.setText("Normal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(331, 331, 331)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblInfoLinha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNumeroLinha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txfNmeroLinha))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOnibus)
                                    .addGap(21, 21, 21)
                                    .addComponent(cmbOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDestino)
                                .addComponent(lblSaida))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbDestino, 0, 150, Short.MAX_VALUE)
                                .addComponent(ftxSaida)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblFrequencia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ckbDom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckbSeg)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckbTer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ckbQua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckbQui)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckbSex)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckbSab))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAdicionarParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRemoverParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSitução)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdbAtivo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdbInativo)
                            .addGap(101, 101, 101)
                            .addComponent(lblTipo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdbExtra)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdbNormal))
                        .addComponent(lblAlteracaoLinhas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIconeLinha)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSelecionar)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlteracaoLinhas)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfNmeroLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroLinha)
                            .addComponent(lblSaida)
                            .addComponent(ftxSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDestino)
                            .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOnibus)
                            .addComponent(cmbOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckbTer)
                            .addComponent(lblFrequencia)
                            .addComponent(ckbDom)
                            .addComponent(ckbSeg)
                            .addComponent(ckbQua)
                            .addComponent(ckbQui)
                            .addComponent(ckbSex)
                            .addComponent(ckbSab))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionarParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnRemoverParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(lblInfoLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbAtivo)
                            .addComponent(rdbInativo)
                            .addComponent(lblSitução)
                            .addComponent(lblTipo)
                            .addComponent(rdbExtra)
                            .addComponent(rdbNormal)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconeLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar)
                    .addComponent(btnSelecionar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverParadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverParadasActionPerformed
        if (tblParadas.getSelectedRow() != -1) {
            if (tblParadas.getSelectedRow() == 0) {
                JOptionPane.showMessageDialog(this, "AÇÃO NÃO PERMITIDA!", "atençao!", 2);
            } else {
                auxParadas.remove(auxParadas.get(tblParadas.getSelectedRow()));
                preencherTabelaCidades();
                preencherTabelaParadas();
            }
        }
    }//GEN-LAST:event_btnRemoverParadasActionPerformed

    private void btnAdicionarParadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarParadasActionPerformed
        if (tblCidades.getSelectedRow() != -1) {
            new JanelaValorPassagem(this, true);
            Cidade aux = (Cidade) tblCidades.getValueAt(tblCidades.getSelectedRow(), 0);
            auxParadas.add(aux.getCodigo() + ";" + aux.getNome() + ";" + "Parada" + ";" + this.valor);
            preencherTabelaParadas();
            preencherTabelaCidades();
        }
    }//GEN-LAST:event_btnAdicionarParadasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean calcelar = false;
        if (txfNmeroLinha.getText().equalsIgnoreCase("")
                || ftxSaida.getText().equalsIgnoreCase("")
                || getFrequencia().isEmpty()
                || auxParadas.isEmpty()
                || cmbOnibus.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!", "erro!", 0);
        } else {
            if (!JanelaPrincipal.ctlLinha.verificarNome(linhaAux, txfNmeroLinha.getText())) {
                JOptionPane.showMessageDialog(this, "NÚMERO JÁ CADASTRADO!", "incoerência!", 0);
            } else {
                if (!JanelaPrincipal.ctlLinha.verificarObjetosInativosDaLinha(linhaAux, auxParadas, ((Onibus) cmbOnibus.getSelectedItem()))) {
                    JOptionPane.showMessageDialog(this, "CIDADES OU ÔNIBUS INATIVOS\nTROQUE OU ATIVE-OS!", "erro!", 0);
                    calcelar = true;
                }
                if (!calcelar) {
                    if (JanelaPrincipal.ctlLinha.verificarDisponibilidadeOnibus((Onibus) cmbOnibus.getSelectedItem(), getFrequencia(), ftxSaida.getText(), linhaAux)) {
                        linhaAux.setFreq(getFrequencia());
                        linhaAux.setHorario(ftxSaida.getText());
                        linhaAux.setNumeroLinha(txfNmeroLinha.getText());
                        linhaAux.setOnibus(((Onibus) (cmbOnibus.getSelectedItem())).getCodigo());
                        linhaAux.setOrigem(1);
                        linhaAux.setSituacao(rdbAtivo.isSelected());
                        JanelaPrincipal.ctlParadas.removerParadasLinha(linhaAux);
                        linhaAux.setParadas(getParadas());
                        linhaAux.setExtra(rdbExtra.isSelected());
                        JanelaPrincipal.ctlParadas.inserir(getParadas());
                        JanelaPrincipal.ctlLinha.salvarArquivo();
                        limparCampos();
                        preencherTabelaLinhas();
                        JOptionPane.showMessageDialog(this, "ALTERADO COM SUCESSO!", "confirmação!", 1);
                    } else {
                        JOptionPane.showMessageDialog(this, "ÔNIBUS JÁ UTILIZADO NESSA SITUAÇÃO!", "conflito horários!", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "OPERAÇÃO CANCELADA!", "cancelamento!", 0);
                }
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblLinhas.getSelectedRow() != -1) {
            atualizarCampos();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void ftxSaidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxSaidaFocusGained
        ftxSaida.setText("");
    }//GEN-LAST:event_ftxSaidaFocusGained

    private void ftxSaidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxSaidaFocusLost
        if (!DataHora.verificarHora(ftxSaida.getText())) {
            ftxSaida.setText("");
            ftxSaida.requestFocus();
            JOptionPane.showMessageDialog(this, "HORA INVÁLIDA!", "erro!", 0);
        }
    }//GEN-LAST:event_ftxSaidaFocusLost

    private void ftxSaidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxSaidaKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_ftxSaidaKeyTyped

    private void tblLinhasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLinhasMouseClicked
        if (evt.getClickCount() == 2) {
            atualizarCampos();
        }
    }//GEN-LAST:event_tblLinhasMouseClicked

    private void cmbDestinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDestinoFocusLost
        if (cmbDestino.getSelectedIndex() != 0) {
            if (!auxParadas.isEmpty()) {
                auxParadas.removeAll(auxParadas);
            }
            new JanelaValorPassagem(this, true);
            Cidade aux = (Cidade) (cmbDestino.getSelectedItem());
            auxParadas.add(aux.getCodigo() + ";" + aux.getNome() + ";" + "Destino" + ";" + this.valor);
            preencherTabelaParadas();
            preencherTabelaCidades();
        } else {
            auxParadas.removeAll(auxParadas);
            preencherTabelaParadas();
            preencherTabelaCidades();
        }
    }//GEN-LAST:event_cmbDestinoFocusLost

    private void redimensionarTabelaParadas(int tamanho) {

        tblParadas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][4],
                new String[]{
                    "Código", "Cidade", "Tipo", "Valor"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblParadas);
    }

    private void redimencionarTabelaCidades(int tamanho) {
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

    }

    private void redimencionarTabelaLinhas(int tamanho) {
        tblLinhas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][1],
                new String[]{
                    "Linhas"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblLinhas);
    }

    private void preencherTabelaCidades() {
        ArrayList<Cidade> auxCidades = new ArrayList<>();
        if (cmbDestino.getSelectedIndex() != 0) {
            ArrayList<Cidade> cidades = JanelaPrincipal.ctlCidades.listar(true);
            boolean isParada;
            for (int i = 1; i < cidades.size(); i++) {
                isParada = false;
                for (int j = 0; j < auxParadas.size(); j++) {
                    String parada[] = auxParadas.get(j).split(";");
                    if (cidades.get(i).getNome().equalsIgnoreCase(parada[1])) {
                        isParada = true;
                    }
                }
                if (!isParada) {
                    auxCidades.add(cidades.get(i));
                }
            }
        }
        redimencionarTabelaCidades(auxCidades.size());
        for (int i = 0; i < auxCidades.size(); i++) {
            tblCidades.setValueAt(auxCidades.get(i), i, 0);
        }
    }

    private void preencherTabelaParadas() {
        redimensionarTabelaParadas(auxParadas.size());
        for (int i = 0; i < auxParadas.size(); i++) {
            String auxTabela[] = auxParadas.get(i).split(";");
            tblParadas.setValueAt(auxTabela[0], i, 0);
            tblParadas.setValueAt(auxTabela[1], i, 1);
            tblParadas.setValueAt(auxTabela[2], i, 2);
            tblParadas.setValueAt(String.valueOf(auxTabela[3]), i, 3);
        }
    }

    private void preencherTabelaLinhas() {
        ArrayList<Linha> linhas = JanelaPrincipal.ctlLinha.listar();
        redimencionarTabelaLinhas(linhas.size());
        for (int i = 0; i < linhas.size(); i++) {
            tblLinhas.setValueAt(linhas.get(i), i, 0);
        }
    }

    private void atualizarComboDestino() {
        cmbDestino.addItem(": SELECIONE :");
        ArrayList<Cidade> aux = JanelaPrincipal.ctlCidades.listar();
        for (int i = 1; i < aux.size(); i++) {
            cmbDestino.addItem(aux.get(i));
        }
    }

    private void atualizarComboOnibus() {
        cmbOnibus.addItem(": SELECIONE :");
        ArrayList<Onibus> aux = JanelaPrincipal.ctlOnibus.listar();
        for (int i = 0; i < aux.size(); i++) {
            cmbOnibus.addItem(aux.get(i));
        }
    }

    private ArrayList<Parada> getParadas() {
        ArrayList<Parada> paradas = new ArrayList<>();
        for (int i = 0; i < auxParadas.size(); i++) {
            Parada novaParada = new Parada();
            String aux[] = auxParadas.get(i).split(";");
            novaParada.setCodigoLinha(linhaAux.getCodigo());
            novaParada.setParada(Integer.parseInt(aux[0]));
            novaParada.setTipo(aux[2]);
            novaParada.setValor(Double.parseDouble(aux[3]));
            paradas.add(novaParada);
        }
        return paradas;
    }

    private ArrayList<String> getFrequencia() {
        ArrayList<String> frequenciaLinha = new ArrayList<>();
        if (ckbDom.isSelected()) {
            frequenciaLinha.add("dom");
        }
        if (ckbQua.isSelected()) {
            frequenciaLinha.add("qua");
        }
        if (ckbQui.isSelected()) {
            frequenciaLinha.add("qui");
        }
        if (ckbSab.isSelected()) {
            frequenciaLinha.add("sab");
        }
        if (ckbSeg.isSelected()) {
            frequenciaLinha.add("seg");
        }
        if (ckbSex.isSelected()) {
            frequenciaLinha.add("sex");
        }
        if (ckbTer.isSelected()) {
            frequenciaLinha.add("ter");
        }
        return frequenciaLinha;
    }

    private void limparCampos() {
        rdbNormal.setSelected(true);
        auxParadas.removeAll(auxParadas);
        desbloquearComponentes(false);
        txfNmeroLinha.setText("");
        ftxSaida.setText("00:00");
        cmbDestino.setSelectedIndex(0);
        cmbOnibus.setSelectedIndex(0);
        preencherTabelaCidades();
        preencherTabelaParadas();
        ckbDom.setSelected(false);
        ckbQua.setSelected(false);
        ckbQui.setSelected(false);
        ckbSab.setSelected(false);
        ckbSeg.setSelected(false);
        ckbSex.setSelected(false);
        ckbTer.setSelected(false);
        rdbInativo.setSelected(true);
        txfNmeroLinha.requestFocus();
    }

    private void atualizarCampos() {
        limparCampos();
        linhaAux = (Linha) tblLinhas.getValueAt(tblLinhas.getSelectedRow(), 0);
        desbloquearComponentes(true);
        txfNmeroLinha.setText(linhaAux.getNumeroLinha());
        ftxSaida.setText(linhaAux.getHorario());
        ArrayList<Parada> paradas = linhaAux.getParadas();
        cmbDestino.setSelectedItem(JanelaPrincipal.ctlCidades.buscar(paradas.get(0).getParada()));
        for (int i = 0; i < paradas.size(); i++) {
            Cidade cidade = JanelaPrincipal.ctlCidades.buscar(paradas.get(i).getParada());
            auxParadas.add(cidade.getCodigo() + ";" + cidade.getNome() + ";" + paradas.get(i).getTipo() + ";" + paradas.get(i).getValor());
        }
        rdbAtivo.setSelected(linhaAux.isSituacao());
        rdbExtra.setSelected(linhaAux.isExtra());
        cmbOnibus.setSelectedItem(JanelaPrincipal.ctlOnibus.buscar(linhaAux.getOnibus()));
        ArrayList<String> auxFreq = linhaAux.getFreq();
        for (int i = 0; i < auxFreq.size(); i++) {
            if (auxFreq.get(i).equalsIgnoreCase("dom")) {
                ckbDom.setSelected(true);
            } else if (auxFreq.get(i).equalsIgnoreCase("seg")) {
                ckbSeg.setSelected(true);
            } else if (auxFreq.get(i).equalsIgnoreCase("ter")) {
                ckbTer.setSelected(true);
            } else if (auxFreq.get(i).equalsIgnoreCase("qua")) {
                ckbQua.setSelected(true);
            } else if (auxFreq.get(i).equalsIgnoreCase("qui")) {
                ckbQui.setSelected(true);
            } else if (auxFreq.get(i).equalsIgnoreCase("sex")) {
                ckbSex.setSelected(true);
            } else if (auxFreq.get(i).equalsIgnoreCase("sab")) {
                ckbSab.setSelected(true);
            }
        }
        preencherTabelaParadas();
        preencherTabelaCidades();
    }

    private void desbloquearComponentes(boolean situacao) {
        txfNmeroLinha.setEnabled(situacao);
        ftxSaida.setEnabled(situacao);
        cmbDestino.setEnabled(situacao);
        cmbOnibus.setEnabled(situacao);
        ckbDom.setEnabled(situacao);
        ckbSeg.setEnabled(situacao);
        ckbTer.setEnabled(situacao);
        ckbQua.setEnabled(situacao);
        ckbQui.setEnabled(situacao);
        ckbSex.setEnabled(situacao);
        ckbSab.setEnabled(situacao);
        rdbAtivo.setEnabled(situacao);
        rdbInativo.setEnabled(situacao);
        btnAdicionarParadas.setEnabled(situacao);
        btnRemoverParadas.setEnabled(situacao);
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
            java.util.logging.Logger.getLogger(JanelaAlteracoesLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAlteracoesLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaAlteracoesLinhas dialog = new JanelaAlteracoesLinhas(new javax.swing.JFrame(), true);
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
    Linha linhaAux;
    ArrayList<String> auxParadas;
    static String valor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSituacao;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.JButton btnAdicionarParadas;
    private javax.swing.JButton btnRemoverParadas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbDom;
    private javax.swing.JCheckBox ckbQua;
    private javax.swing.JCheckBox ckbQui;
    private javax.swing.JCheckBox ckbSab;
    private javax.swing.JCheckBox ckbSeg;
    private javax.swing.JCheckBox ckbSex;
    private javax.swing.JCheckBox ckbTer;
    private javax.swing.JComboBox cmbDestino;
    private javax.swing.JComboBox cmbOnibus;
    private javax.swing.JFormattedTextField ftxSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAlteracaoLinhas;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblFrequencia;
    private javax.swing.JLabel lblIconeLinha;
    private javax.swing.JLabel lblInfoLinha;
    private javax.swing.JLabel lblNumeroLinha;
    private javax.swing.JLabel lblOnibus;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblSitução;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rdbAtivo;
    private javax.swing.JRadioButton rdbExtra;
    private javax.swing.JRadioButton rdbInativo;
    private javax.swing.JRadioButton rdbNormal;
    private javax.swing.JTable tblCidades;
    private javax.swing.JTable tblLinhas;
    private javax.swing.JTable tblParadas;
    private javax.swing.JTextField txfNmeroLinha;
    // End of variables declaration//GEN-END:variables
}
