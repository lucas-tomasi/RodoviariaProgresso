package janelas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Parada;
import classesDeAjuda.DataHora;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaCadastrosLinhas extends javax.swing.JDialog {

    public JanelaCadastrosLinhas(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        auxParadas = new ArrayList<>();
        atualizarComboCidades();
        atualizarComboOnibus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBanheiro = new javax.swing.ButtonGroup();
        btgTipo = new javax.swing.ButtonGroup();
        lblIconeLinha = new javax.swing.JLabel();
        lblCadastrosLinhas = new javax.swing.JLabel();
        lblNumeroLinha = new javax.swing.JLabel();
        lblOrigem = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txfNmeroLinha = new javax.swing.JTextField();
        cmbOnibus = new javax.swing.JComboBox();
        lblSaida = new javax.swing.JLabel();
        lblOnibus = new javax.swing.JLabel();
        txfOrigem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParadas = new javax.swing.JTable();
        cmbDestino = new javax.swing.JComboBox();
        lblFrequencia = new javax.swing.JLabel();
        ckbDom = new javax.swing.JCheckBox();
        ckbTer = new javax.swing.JCheckBox();
        ckbSeg = new javax.swing.JCheckBox();
        ckbQuar = new javax.swing.JCheckBox();
        ckbQui = new javax.swing.JCheckBox();
        ckbSex = new javax.swing.JCheckBox();
        ckbSab = new javax.swing.JCheckBox();
        btnRemoverParadas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCidades = new javax.swing.JTable();
        btnAdicionarParadas = new javax.swing.JButton();
        ftxSaida = new javax.swing.JFormattedTextField();
        rdbExtra = new javax.swing.JRadioButton();
        rdbNormal = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros Linhas");

        lblIconeLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Linha.jpg"))); // NOI18N
        lblIconeLinha.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblCadastrosLinhas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblCadastrosLinhas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrosLinhas.setText("Cadastros Linhas");
        lblCadastrosLinhas.setToolTipText("");

        lblNumeroLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroLinha.setText("Número:");

        lblOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrigem.setText("Origem:");

        lblDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestino.setText("Destino:");

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

        txfNmeroLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbOnibus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaida.setText("Saída:");

        lblOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnibus.setText("Ônibus:");

        txfOrigem.setEditable(false);
        txfOrigem.setBackground(new java.awt.Color(255, 255, 255));
        txfOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfOrigem.setText("Progresso");

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
        jScrollPane1.setViewportView(tblParadas);

        cmbDestino.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDestinoItemStateChanged(evt);
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

        ckbQuar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbQuar.setText("Qua");

        ckbQui.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbQui.setText("Qui");

        ckbSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbSex.setText("Sex");

        ckbSab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbSab.setText("Sáb");

        btnRemoverParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemoverParadas.setText("-");
        btnRemoverParadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverParadasActionPerformed(evt);
            }
        });

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

        btnAdicionarParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdicionarParadas.setText("+");
        btnAdicionarParadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarParadasActionPerformed(evt);
            }
        });

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

        btgTipo.add(rdbExtra);
        rdbExtra.setText("Extra");

        btgTipo.add(rdbNormal);
        rdbNormal.setSelected(true);
        rdbNormal.setText("Normal");

        lblTipo.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadastrosLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeLinha))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroLinha)
                                    .addComponent(lblOrigem))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfNmeroLinha)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txfOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addGap(63, 63, 63)
                                        .addComponent(lblTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbExtra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbNormal)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFrequencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbSeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbTer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbQuar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbQui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbSex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbSab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbDom)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblOnibus))
                            .addComponent(lblSaida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbOnibus, 0, 283, Short.MAX_VALUE)
                            .addComponent(cmbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ftxSaida)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoverParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconeLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastrosLinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfNmeroLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroLinha)
                            .addComponent(lblSaida))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrigem)
                            .addComponent(txfOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestino)
                            .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbExtra)
                            .addComponent(rdbNormal)
                            .addComponent(lblTipo))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFrequencia)
                            .addComponent(ckbTer)
                            .addComponent(ckbSeg)
                            .addComponent(ckbQuar)
                            .addComponent(ckbQui)
                            .addComponent(ckbSex)
                            .addComponent(ckbSab)
                            .addComponent(ckbDom)
                            .addComponent(lblOnibus)
                            .addComponent(cmbOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ftxSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnRemoverParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txfNmeroLinha.getText().equalsIgnoreCase("")
                || ftxSaida.getText().equalsIgnoreCase("")
                || getFrequencia().isEmpty()
                || auxParadas.isEmpty()
                || cmbOnibus.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!", "erro!", 0);
        } else {
            if (JanelaPrincipal.ctlLinha.verificarNome(null, txfNmeroLinha.getText())) {
                if (JanelaPrincipal.ctlLinha.verificarDisponibilidadeOnibus((Onibus) cmbOnibus.getSelectedItem(), getFrequencia(), ftxSaida.getText(), null)) {
                    Linha novaLinha = new Linha();
                    novaLinha.setFreq(getFrequencia());
                    novaLinha.setHorario(ftxSaida.getText());
                    novaLinha.setNumeroLinha(txfNmeroLinha.getText());
                    novaLinha.setOnibus(((Onibus) cmbOnibus.getSelectedItem()).getCodigo());
                    novaLinha.setOrigem(1);
                    novaLinha.setParadas(getParadas(novaLinha));
                    novaLinha.setExtra(rdbExtra.isSelected());
                    JanelaPrincipal.ctlLinha.inserir(novaLinha);
                    auxParadas.removeAll(auxParadas);
                    JOptionPane.showMessageDialog(this, "CADASTRADO COM SUCESSO!", "informação!", 1);
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "ÔNIBUS JÁ UTILIZADO NESSA SITUAÇÃO!", "conflito horários!", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "NÚMERO JÁ CADASTRADO!", "incoerência!", 0);
                txfNmeroLinha.setText("");
                txfNmeroLinha.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarParadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarParadasActionPerformed
        if (tblCidades.getSelectedRow() != -1) {
            new JanelaValorPassagem(this, true);
            Cidade aux = (Cidade) tblCidades.getValueAt(tblCidades.getSelectedRow(), 0);
            auxParadas.add(aux.getCodigo() + ";" + aux.getNome() + ";" + "Parada" + ";" + this.valor);
            preencherTabelaParadas();
            preencherTabelaCidades();
        }
    }//GEN-LAST:event_btnAdicionarParadasActionPerformed

    private void btnRemoverParadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverParadasActionPerformed
        if (tblParadas.getSelectedRow() != -1) {
            if (tblParadas.getSelectedRow() == 0) {
                JOptionPane.showMessageDialog(this, "AÇÃO NÃO PERMITIDA!", "atenção!", 2);
            } else {
                auxParadas.remove(auxParadas.get(tblParadas.getSelectedRow()));
                preencherTabelaCidades();
                preencherTabelaParadas();
            }
        }
    }//GEN-LAST:event_btnRemoverParadasActionPerformed

    private void ftxSaidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxSaidaKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_ftxSaidaKeyTyped

    private void ftxSaidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxSaidaFocusLost
        if (!DataHora.verificarHora(ftxSaida.getText())) {
            ftxSaida.setText("");
            JOptionPane.showMessageDialog(this, "HORA INVÁLIDA!", "erro!", 0);
            ftxSaida.requestFocus();
        }
    }//GEN-LAST:event_ftxSaidaFocusLost

    private void ftxSaidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxSaidaFocusGained
        ftxSaida.setText("");
    }//GEN-LAST:event_ftxSaidaFocusGained

    private void cmbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDestinoItemStateChanged
        if (evt.getStateChange() == 2) {
            if (cmbDestino.getSelectedIndex() != 0) {
                if (!auxParadas.isEmpty()) {
                    auxParadas.removeAll(auxParadas);
                }
                new JanelaValorPassagem(this, true);
                Cidade cidadeAux = (Cidade) (cmbDestino.getSelectedItem());
                auxParadas.add(cidadeAux.getCodigo() + ";" + cidadeAux.getNome() + ";" + "Destino" + ";" + this.valor);
                preencherTabelaParadas();
                preencherTabelaCidades();
            } else {
                auxParadas.removeAll(auxParadas);
                preencherTabelaParadas();
                preencherTabelaCidades();
            }
        }
    }//GEN-LAST:event_cmbDestinoItemStateChanged

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

    private void preencherTabelaCidades() {
        ArrayList<Cidade> aux = new ArrayList<>();
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
                    aux.add(cidades.get(i));
                }
            }
        }
        redimencionarTabelaCidades(aux.size());
        for (int i = 0; i < aux.size(); i++) {
            tblCidades.setValueAt(aux.get(i), i, 0);
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

    private void atualizarComboCidades() {
        cmbDestino.addItem(": SELECIONE :");
        ArrayList<Cidade> cidades = JanelaPrincipal.ctlCidades.listar(true);
        for (int i = 1; i < cidades.size(); i++) {
            cmbDestino.addItem(cidades.get(i));
        }
    }

    private void atualizarComboOnibus() {
        cmbOnibus.addItem(": SELECIONE :");
        ArrayList<Onibus> onibus = JanelaPrincipal.ctlOnibus.listar(true);
        for (int i = 0; i < onibus.size(); i++) {
            cmbOnibus.addItem(onibus.get(i));
        }
    }

    private ArrayList<Parada> getParadas(Linha novaLinha) {
        ArrayList<Parada> paradas = new ArrayList<>();
        for (int i = 0; i < auxParadas.size(); i++) {
            Parada novaParada = new Parada();
            String aux[] = auxParadas.get(i).split(";");
            novaParada.setCodigoLinha(novaLinha.getCodigo());
            novaParada.setParada(Integer.parseInt(aux[0]));
            novaParada.setTipo(aux[2]);
            novaParada.setValor(Double.parseDouble(aux[3]));
            paradas.add(novaParada);
        }
        return paradas;
    }

    private ArrayList<String> getFrequencia() {
        ArrayList<String> frequencias = new ArrayList<>();
        if (ckbDom.isSelected()) {
            frequencias.add("dom");
        }
        if (ckbQuar.isSelected()) {
            frequencias.add("qua");
        }
        if (ckbQui.isSelected()) {
            frequencias.add("qui");
        }
        if (ckbSab.isSelected()) {
            frequencias.add("sab");
        }
        if (ckbSeg.isSelected()) {
            frequencias.add("seg");
        }
        if (ckbSex.isSelected()) {
            frequencias.add("sex");
        }
        if (ckbTer.isSelected()) {
            frequencias.add("ter");
        }
        return frequencias;
    }

    private void limparCampos() {
        txfNmeroLinha.setText("");
        ftxSaida.setText("00:00");
        cmbDestino.setSelectedIndex(0);
        cmbOnibus.setSelectedIndex(0);
        preencherTabelaCidades();
        preencherTabelaParadas();
        ckbDom.setSelected(false);
        ckbQuar.setSelected(false);
        ckbQui.setSelected(false);
        ckbSab.setSelected(false);
        ckbSeg.setSelected(false);
        ckbSex.setSelected(false);
        ckbTer.setSelected(false);
        txfNmeroLinha.requestFocus();
        rdbNormal.setSelected(true);
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
            java.util.logging.Logger.getLogger(JanelaCadastrosLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastrosLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCadastrosLinhas dialog = new JanelaCadastrosLinhas(new JanelaPrincipal(), true);
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

    ArrayList<String> auxParadas;
    static String valor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBanheiro;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.JButton btnAdicionarParadas;
    private javax.swing.JButton btnRemoverParadas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbDom;
    private javax.swing.JCheckBox ckbQuar;
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
    private javax.swing.JLabel lblCadastrosLinhas;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblFrequencia;
    private javax.swing.JLabel lblIconeLinha;
    private javax.swing.JLabel lblNumeroLinha;
    private javax.swing.JLabel lblOnibus;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rdbExtra;
    private javax.swing.JRadioButton rdbNormal;
    private javax.swing.JTable tblCidades;
    private javax.swing.JTable tblParadas;
    private javax.swing.JTextField txfNmeroLinha;
    private javax.swing.JTextField txfOrigem;
    // End of variables declaration//GEN-END:variables
}
