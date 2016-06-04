package janelas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Passagem;
import classesDeAjuda.DataHora;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaEstatisticasDeVendas extends javax.swing.JDialog {

    public JanelaEstatisticasDeVendas(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherComboParadas();
        preencherComboLinhas();
        preencherComboOnibus();
        filtrarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgStatus = new javax.swing.ButtonGroup();
        lblEstatisticas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPassagens = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblDe = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ckbTodasAsDatas = new javax.swing.JCheckBox();
        ckbTodosStatus = new javax.swing.JCheckBox();
        rdbCanceladas = new javax.swing.JRadioButton();
        rdbVendidas = new javax.swing.JRadioButton();
        lblParada = new javax.swing.JLabel();
        ckbTodosOnibus = new javax.swing.JCheckBox();
        lblStatus = new javax.swing.JLabel();
        cmbParada = new javax.swing.JComboBox();
        ftxDe = new javax.swing.JFormattedTextField();
        ftxAte = new javax.swing.JFormattedTextField();
        lblAte = new javax.swing.JLabel();
        lblIconeEstatisticas = new javax.swing.JLabel();
        lblOnibus = new javax.swing.JLabel();
        lblLinha = new javax.swing.JLabel();
        cmbLinha = new javax.swing.JComboBox();
        cmbOnibus = new javax.swing.JComboBox();
        ckbTodasParadas = new javax.swing.JCheckBox();
        ckbTodasLinhas = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estatísticas de Vendas");

        lblEstatisticas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEstatisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstatisticas.setText("Estatísticas Vendas");
        lblEstatisticas.setToolTipText("");

        tblPassagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Linha", "Ônibus", "Hora", "Parada", "Data", "Poltrona", "Valor Total", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPassagens.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPassagens);
        if (tblPassagens.getColumnModel().getColumnCount() > 0) {
            tblPassagens.getColumnModel().getColumn(0).setResizable(false);
            tblPassagens.getColumnModel().getColumn(1).setResizable(false);
            tblPassagens.getColumnModel().getColumn(2).setResizable(false);
            tblPassagens.getColumnModel().getColumn(3).setResizable(false);
            tblPassagens.getColumnModel().getColumn(4).setResizable(false);
            tblPassagens.getColumnModel().getColumn(5).setResizable(false);
            tblPassagens.getColumnModel().getColumn(6).setResizable(false);
            tblPassagens.getColumnModel().getColumn(7).setResizable(false);
            tblPassagens.getColumnModel().getColumn(8).setResizable(false);
        }

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDe.setText("De:");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buscar.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ckbTodasAsDatas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasAsDatas.setSelected(true);
        ckbTodasAsDatas.setText("Todas Datas");
        ckbTodasAsDatas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasAsDatasMousePressed(evt);
            }
        });

        ckbTodosStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodosStatus.setSelected(true);
        ckbTodosStatus.setText("Todas Situações");
        ckbTodosStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodosStatusMousePressed(evt);
            }
        });

        btgStatus.add(rdbCanceladas);
        rdbCanceladas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbCanceladas.setSelected(true);
        rdbCanceladas.setText("Canceladas");
        rdbCanceladas.setEnabled(false);

        btgStatus.add(rdbVendidas);
        rdbVendidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbVendidas.setText("Vendidas");
        rdbVendidas.setEnabled(false);

        lblParada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParada.setText("Parada:");

        ckbTodosOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodosOnibus.setSelected(true);
        ckbTodosOnibus.setText("Todos Ônibus");
        ckbTodosOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodosOnibusMousePressed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStatus.setText("Status:");

        cmbParada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbParada.setToolTipText("");
        cmbParada.setEnabled(false);

        try {
            ftxDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxDe.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        ftxDe.setEnabled(false);
        ftxDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxDe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftxDeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxDeFocusLost(evt);
            }
        });

        try {
            ftxAte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxAte.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        ftxAte.setEnabled(false);
        ftxAte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftxAte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftxAteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxAteFocusLost(evt);
            }
        });

        lblAte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAte.setText("Até:");

        lblIconeEstatisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeEstatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Estatisticas.png"))); // NOI18N

        lblOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnibus.setText("Ônibus:");

        lblLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLinha.setText("Linha:");

        cmbLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLinha.setToolTipText("");
        cmbLinha.setEnabled(false);

        cmbOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbOnibus.setToolTipText("");
        cmbOnibus.setEnabled(false);

        ckbTodasParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasParadas.setSelected(true);
        ckbTodasParadas.setText("Todas Paradas");
        ckbTodasParadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasParadasMousePressed(evt);
            }
        });

        ckbTodasLinhas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasLinhas.setSelected(true);
        ckbTodasLinhas.setText("Todas Linhas");
        ckbTodasLinhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasLinhasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxDe, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAte)
                                        .addGap(21, 21, 21)
                                        .addComponent(ftxAte, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblParada))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbTodasAsDatas)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ckbTodosOnibus)
                                        .addComponent(ckbTodasParadas)
                                        .addComponent(ckbTodasLinhas)
                                        .addComponent(ckbTodosStatus)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeEstatisticas))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addGap(28, 28, 28)
                                .addComponent(rdbCanceladas)
                                .addGap(18, 18, 18)
                                .addComponent(rdbVendidas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(btnVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOnibus)
                                    .addComponent(lblLinha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbParada, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbLinha, 0, 275, Short.MAX_VALUE)
                                        .addComponent(cmbOnibus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(250, 250, 250)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconeEstatisticas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEstatisticas)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDe)
                            .addComponent(ftxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAte)
                            .addComponent(ckbTodasAsDatas))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParada)
                            .addComponent(ckbTodasParadas)
                            .addComponent(cmbParada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOnibus)
                    .addComponent(cmbOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodosOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinha)
                    .addComponent(cmbLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodasLinhas))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCanceladas)
                    .addComponent(rdbVendidas)
                    .addComponent(lblStatus)
                    .addComponent(btnBuscar)
                    .addComponent(ckbTodosStatus))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtrarTabela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void ckbTodasAsDatasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasAsDatasMousePressed
        ftxAte.setEnabled(ckbTodasAsDatas.isSelected());
        ftxDe.setEnabled(ckbTodasAsDatas.isSelected());
    }//GEN-LAST:event_ckbTodasAsDatasMousePressed

    private void ckbTodosOnibusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodosOnibusMousePressed
        cmbOnibus.setEnabled(ckbTodosOnibus.isSelected());
    }//GEN-LAST:event_ckbTodosOnibusMousePressed

    private void ckbTodosStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodosStatusMousePressed
        rdbCanceladas.setEnabled(ckbTodosStatus.isSelected());
        rdbVendidas.setEnabled(ckbTodosStatus.isSelected());
    }//GEN-LAST:event_ckbTodosStatusMousePressed

    private void ftxDeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxDeFocusGained
        ftxDe.setText("");
    }//GEN-LAST:event_ftxDeFocusGained

    private void ftxAteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxAteFocusGained
        ftxAte.setText("");
    }//GEN-LAST:event_ftxAteFocusGained

    private void ftxDeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxDeFocusLost
        if (ftxDe.getText().equalsIgnoreCase("  /  /    ")) {
            ftxDe.setText(DataHora.getData());
        }
        if (!DataHora.verificarData(ftxDe.getText())) {
            JOptionPane.showMessageDialog(this, "HORA INVÁLIDA!", "erro!", 1);
            ftxDe.setText("");
            ftxDe.requestFocus();
        }
    }//GEN-LAST:event_ftxDeFocusLost

    private void ftxAteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxAteFocusLost
        if (ftxAte.getText().equalsIgnoreCase("  /  /    ")) {
            ftxAte.setText(ftxDe.getText());
        }
        if (!DataHora.verificarData(ftxAte.getText()) || ftxAte.getText().compareToIgnoreCase(DataHora.getData()) > 0) {
            JOptionPane.showMessageDialog(this, "HORA INVÁLIDA!", "erro!", 1);
            ftxAte.setText("");
            ftxAte.requestFocus();
        }
    }//GEN-LAST:event_ftxAteFocusLost

    private void ckbTodasParadasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasParadasMousePressed
        cmbParada.setEnabled(ckbTodasParadas.isSelected());
    }//GEN-LAST:event_ckbTodasParadasMousePressed

    private void ckbTodasLinhasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasLinhasMousePressed
        cmbLinha.setEnabled(ckbTodasLinhas.isSelected());
    }//GEN-LAST:event_ckbTodasLinhasMousePressed

    private void redimensionarTabela(int tamanho) {
        tblPassagens.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][9],
                new String[]{
                    "Código", "Linha", "Ônibus", "Hora Venda", "Parada", "Data", "Poltrona", "Valor Total", "Status"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblPassagens.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPassagens);
    }

    private void preencherTabela(ArrayList<Passagem> passagens) {
        redimensionarTabela(passagens.size());
        for (int i = 0; i < passagens.size(); i++) {
            Passagem auxPassagem = passagens.get(i);
            Linha auxLinha = JanelaPrincipal.ctlLinha.buscarLinha(auxPassagem.getLinha());
            tblPassagens.setValueAt(auxPassagem.getCodigo(), i, 0);
            tblPassagens.setValueAt(auxLinha, i, 1);
            tblPassagens.setValueAt(String.valueOf(JanelaPrincipal.ctlOnibus.buscar(auxLinha.getOnibus())), i, 2);
            tblPassagens.setValueAt(auxPassagem.getHora(), i, 3);
            tblPassagens.setValueAt(auxPassagem.getParada(), i, 4);
            tblPassagens.setValueAt(auxPassagem.getData(), i, 5);
            tblPassagens.setValueAt(auxPassagem.getPoltrona(), i, 6);
            tblPassagens.setValueAt(String.valueOf(auxPassagem.getValorTotal()), i, 7);
            tblPassagens.setValueAt(String.valueOf(auxPassagem.getSituacao()), i, 8);
        }
    }

    private void filtrarTabela() {
        boolean achou = true;
        ArrayList<Passagem> listaPassagens = JanelaPrincipal.ctlPassagens.listar();
        if (!ckbTodasAsDatas.isSelected()) {
            listaPassagens = JanelaPrincipal.ctlPassagens.listar(listaPassagens, ftxDe.getText(), ftxAte.getText());
            if (listaPassagens.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodosStatus.isSelected() && achou) {
            if (rdbCanceladas.isSelected()) {
                listaPassagens = JanelaPrincipal.ctlPassagens.listar(listaPassagens, 'C');
                if (listaPassagens.isEmpty()) {
                    achou = false;
                }
            } else {
                listaPassagens = JanelaPrincipal.ctlPassagens.listar(listaPassagens, 'V');
                if (listaPassagens.isEmpty()) {
                    achou = false;
                }
            }
        }

        if (!ckbTodasLinhas.isSelected() && achou) {
            listaPassagens = JanelaPrincipal.ctlPassagens.listar(listaPassagens, ((Linha) cmbLinha.getSelectedItem()));
            if (listaPassagens.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodosOnibus.isSelected() && achou) {
            listaPassagens = JanelaPrincipal.ctlPassagens.listar(listaPassagens, ((Onibus) cmbOnibus.getSelectedItem()));
            if (listaPassagens.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodasParadas.isSelected() && achou) {
            listaPassagens = JanelaPrincipal.ctlPassagens.listar(listaPassagens, String.valueOf(cmbParada.getSelectedItem()));
            if (listaPassagens.isEmpty()) {
                achou = false;
            }
        }

        if (achou) {
            preencherTabela(listaPassagens);
        } else {
            JOptionPane.showMessageDialog(this, "NENHUMA PASSAGEM ENCONTRADA!\nTENTE OUTROS FILTROS!", "busca!", 2);
        }

    }

    private void preencherComboParadas() {
        ArrayList<Cidade> paradas = JanelaPrincipal.ctlCidades.listar();
        for (int i = 1; i < paradas.size(); i++) {
            cmbParada.addItem(paradas.get(i));
        }
    }

    private void preencherComboLinhas() {
        ArrayList<Linha> linhas = JanelaPrincipal.ctlLinha.listar();
        for (int i = 0; i < linhas.size(); i++) {
            cmbLinha.addItem(linhas.get(i));
        }
    }

    private void preencherComboOnibus() {
        ArrayList<Onibus> onibus = JanelaPrincipal.ctlOnibus.listar();
        for (int i = 0; i < onibus.size(); i++) {
            cmbOnibus.addItem(onibus.get(i));
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
            java.util.logging.Logger.getLogger(JanelaEstatisticasDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaEstatisticasDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaEstatisticasDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaEstatisticasDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaEstatisticasDeVendas dialog = new JanelaEstatisticasDeVendas(new JanelaPrincipal(), true);
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
    private javax.swing.ButtonGroup btgStatus;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbTodasAsDatas;
    private javax.swing.JCheckBox ckbTodasLinhas;
    private javax.swing.JCheckBox ckbTodasParadas;
    private javax.swing.JCheckBox ckbTodosOnibus;
    private javax.swing.JCheckBox ckbTodosStatus;
    private javax.swing.JComboBox cmbLinha;
    private javax.swing.JComboBox cmbOnibus;
    private javax.swing.JComboBox cmbParada;
    private javax.swing.JFormattedTextField ftxAte;
    private javax.swing.JFormattedTextField ftxDe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblEstatisticas;
    private javax.swing.JLabel lblIconeEstatisticas;
    private javax.swing.JLabel lblLinha;
    private javax.swing.JLabel lblOnibus;
    private javax.swing.JLabel lblParada;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JRadioButton rdbCanceladas;
    private javax.swing.JRadioButton rdbVendidas;
    private javax.swing.JTable tblPassagens;
    // End of variables declaration//GEN-END:variables
}
