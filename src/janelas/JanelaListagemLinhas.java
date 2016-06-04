package janelas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classeDeNegocio.Onibus;
import classeDeNegocio.Parada;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Tomasi
 */
public class JanelaListagemLinhas extends javax.swing.JDialog {

    public JanelaListagemLinhas(JanelaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela(JanelaPrincipal.ctlLinha.listar());
        preencherComboCidade();
        preencherComboOnibus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSituacao = new javax.swing.ButtonGroup();
        btgFreq = new javax.swing.ButtonGroup();
        lblIconeLinha = new javax.swing.JLabel();
        lblListarLinha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLinha = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblNumeroLinha = new javax.swing.JLabel();
        txfNumeroLinha = new javax.swing.JTextField();
        lblOnibus = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ckbTodosNumerosDeLinhas = new javax.swing.JCheckBox();
        ckbTodasSitucoes = new javax.swing.JCheckBox();
        rdbAtivos = new javax.swing.JRadioButton();
        rdbInativos = new javax.swing.JRadioButton();
        lblFrequencia = new javax.swing.JLabel();
        ckbTodasFrequencia = new javax.swing.JCheckBox();
        lbDestinoParadas = new javax.swing.JLabel();
        ckbTodasDestinosParadas = new javax.swing.JCheckBox();
        lblSituacao1 = new javax.swing.JLabel();
        cmbOnibus = new javax.swing.JComboBox();
        ckbTodosOnibus = new javax.swing.JCheckBox();
        cmbDestinoParadas = new javax.swing.JComboBox();
        rdbDom = new javax.swing.JRadioButton();
        rdbTer = new javax.swing.JRadioButton();
        rdbSeg = new javax.swing.JRadioButton();
        rdbQua = new javax.swing.JRadioButton();
        rdbQui = new javax.swing.JRadioButton();
        rdbSex = new javax.swing.JRadioButton();
        rdbSab = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem Linhas");

        lblIconeLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Linha.jpg"))); // NOI18N

        lblListarLinha.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblListarLinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListarLinha.setText("Listagem Linhas");
        lblListarLinha.setToolTipText("");

        tblLinha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Numero", "Frequecia", "Ônibus", "Destino ", "Paradas", "Ativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLinha.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLinha);
        if (tblLinha.getColumnModel().getColumnCount() > 0) {
            tblLinha.getColumnModel().getColumn(0).setResizable(false);
            tblLinha.getColumnModel().getColumn(1).setResizable(false);
            tblLinha.getColumnModel().getColumn(2).setResizable(false);
            tblLinha.getColumnModel().getColumn(3).setResizable(false);
            tblLinha.getColumnModel().getColumn(4).setResizable(false);
            tblLinha.getColumnModel().getColumn(5).setResizable(false);
            tblLinha.getColumnModel().getColumn(6).setResizable(false);
        }

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.jpg"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblNumeroLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroLinha.setText("Número Linha:");

        txfNumeroLinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txfNumeroLinha.setEnabled(false);

        lblOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnibus.setText("Ônibus:");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buscar.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ckbTodosNumerosDeLinhas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodosNumerosDeLinhas.setSelected(true);
        ckbTodosNumerosDeLinhas.setText("Todos Números");
        ckbTodosNumerosDeLinhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodosNumerosDeLinhasMousePressed(evt);
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

        lblFrequencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFrequencia.setText("Frequência:");

        ckbTodasFrequencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasFrequencia.setSelected(true);
        ckbTodasFrequencia.setText("Todas Frequências");
        ckbTodasFrequencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasFrequenciaMousePressed(evt);
            }
        });

        lbDestinoParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDestinoParadas.setText("Destino/Paradas:");

        ckbTodasDestinosParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodasDestinosParadas.setSelected(true);
        ckbTodasDestinosParadas.setText("Todos Destinos/Paradas");
        ckbTodasDestinosParadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodasDestinosParadasMousePressed(evt);
            }
        });

        lblSituacao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSituacao1.setText("Situação:");

        cmbOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbOnibus.setToolTipText("");
        cmbOnibus.setBorder(null);
        cmbOnibus.setEnabled(false);

        ckbTodosOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckbTodosOnibus.setSelected(true);
        ckbTodosOnibus.setText("Todos Ônibus");
        ckbTodosOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbTodosOnibusMousePressed(evt);
            }
        });

        cmbDestinoParadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbDestinoParadas.setToolTipText("");
        cmbDestinoParadas.setBorder(null);
        cmbDestinoParadas.setEnabled(false);

        btgFreq.add(rdbDom);
        rdbDom.setSelected(true);
        rdbDom.setText("Dom");
        rdbDom.setEnabled(false);

        btgFreq.add(rdbTer);
        rdbTer.setText("Ter");
        rdbTer.setEnabled(false);

        btgFreq.add(rdbSeg);
        rdbSeg.setText("Seg");
        rdbSeg.setEnabled(false);

        btgFreq.add(rdbQua);
        rdbQua.setText("Qua");
        rdbQua.setEnabled(false);

        btgFreq.add(rdbQui);
        rdbQui.setText("Qui");
        rdbQui.setEnabled(false);

        btgFreq.add(rdbSex);
        rdbSex.setText("Sex");
        rdbSex.setEnabled(false);

        btgFreq.add(rdbSab);
        rdbSab.setText("Sáb");
        rdbSab.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblListarLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeLinha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroLinha)
                                    .addComponent(lbDestinoParadas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDestinoParadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfNumeroLinha)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSituacao1)
                                .addGap(6, 6, 6)
                                .addComponent(rdbAtivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbInativos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFrequencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOnibus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbDom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbSeg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbTer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbQua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbQui)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbSex)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbSab))
                                    .addComponent(cmbOnibus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbTodasDestinosParadas)
                                    .addComponent(ckbTodosNumerosDeLinhas)
                                    .addComponent(ckbTodasFrequencia)
                                    .addComponent(ckbTodasSitucoes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckbTodosOnibus)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblListarLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconeLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroLinha)
                    .addComponent(txfNumeroLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodosNumerosDeLinhas))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDestinoParadas)
                    .addComponent(cmbDestinoParadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodasDestinosParadas))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbTodasFrequencia)
                    .addComponent(lblFrequencia)
                    .addComponent(rdbDom)
                    .addComponent(rdbSeg)
                    .addComponent(rdbTer)
                    .addComponent(rdbQua)
                    .addComponent(rdbQui)
                    .addComponent(rdbSex)
                    .addComponent(rdbSab))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOnibus)
                    .addComponent(cmbOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbTodosOnibus))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(rdbAtivos)
                    .addComponent(rdbInativos)
                    .addComponent(ckbTodasSitucoes)
                    .addComponent(lblSituacao1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnVoltar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!ckbTodosNumerosDeLinhas.isSelected()) {
            if (txfNumeroLinha.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "PREENCHA TODOS OS CAMPOS!","erro!",0);
            } else {
                filtarTabela();
            }
        } else {
            filtarTabela();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void ckbTodosNumerosDeLinhasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodosNumerosDeLinhasMousePressed
             txfNumeroLinha.setEnabled(ckbTodosNumerosDeLinhas.isSelected());
    }//GEN-LAST:event_ckbTodosNumerosDeLinhasMousePressed

    private void ckbTodasDestinosParadasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasDestinosParadasMousePressed
                cmbDestinoParadas.setEnabled(ckbTodasDestinosParadas.isSelected());
    }//GEN-LAST:event_ckbTodasDestinosParadasMousePressed

    private void ckbTodasFrequenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasFrequenciaMousePressed
            rdbDom.setEnabled(ckbTodasFrequencia.isSelected());
            rdbSeg.setEnabled(ckbTodasFrequencia.isSelected());
            rdbTer.setEnabled(ckbTodasFrequencia.isSelected());
            rdbQua.setEnabled(ckbTodasFrequencia.isSelected());
            rdbQui.setEnabled(ckbTodasFrequencia.isSelected());
            rdbSex.setEnabled(ckbTodasFrequencia.isSelected());
            rdbSab.setEnabled(ckbTodasFrequencia.isSelected());
    }//GEN-LAST:event_ckbTodasFrequenciaMousePressed

    private void ckbTodasSitucoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodasSitucoesMousePressed
        if (ckbTodasSitucoes.isSelected()) {
            rdbInativos.setEnabled(true);
            rdbAtivos.setEnabled(true);
        } else {
            rdbAtivos.setEnabled(false);
            rdbInativos.setEnabled(false);
        }
    }//GEN-LAST:event_ckbTodasSitucoesMousePressed

    private void ckbTodosOnibusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbTodosOnibusMousePressed
        if (ckbTodosOnibus.isSelected()) {
            cmbOnibus.setEnabled(true);
        } else {
            cmbOnibus.setEnabled(false);
        }
    }//GEN-LAST:event_ckbTodosOnibusMousePressed

    private void redimensionarTabela(int tamanho) {
        tblLinha.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][7],
                new String[]{
                    "Código", "Número", "Frequêcia", "Ônibus", "Destino ", "Paradas", "Ativa"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblLinha.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLinha);
    }

    private void preencherTabela(ArrayList<Linha> listaLinhas) {
        redimensionarTabela(listaLinhas.size());
        for (int i = 0; i < listaLinhas.size(); i++) {
            Linha linha = listaLinhas.get(i);
            ArrayList<Parada> paradas = JanelaPrincipal.ctlLinha.buscarParadas(linha.getCodigo());
            ArrayList<String> cidadesParadas = new ArrayList<>();
            for (int j = 0; j < paradas.size(); j++) {
                cidadesParadas.add(String.valueOf(JanelaPrincipal.ctlCidades.buscar(paradas.get(j).getParada())));
            }
            tblLinha.setValueAt(linha.getCodigo(), i, 0);
            tblLinha.setValueAt(linha, i, 1);
            tblLinha.setValueAt(linha.getFreq(), i, 2);
            tblLinha.setValueAt(JanelaPrincipal.ctlOnibus.buscar(linha.getOnibus()), i, 3);
            tblLinha.setValueAt(JanelaPrincipal.ctlCidades.buscar(JanelaPrincipal.ctlLinha.buscarDestino(linha.getCodigo())), i, 4);
            tblLinha.setValueAt(cidadesParadas, i, 5);
            tblLinha.setValueAt(linha.isSituacao(), i, 6);
        }
    }

    private void filtarTabela() {
        ArrayList<Linha> listaLinha = JanelaPrincipal.ctlLinha.listar();
        boolean achou = true;
        if (!ckbTodasDestinosParadas.isSelected()) {
            listaLinha = JanelaPrincipal.ctlLinha.listar(((Cidade) cmbDestinoParadas.getSelectedItem()).getCodigo(),listaLinha);
            if (listaLinha.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodasFrequencia.isSelected() && achou) {
            if (rdbDom.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "dom");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            } else if (rdbSeg.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "seg");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            } else if (rdbTer.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "ter");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            } else if (rdbQua.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "qua");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            } else if (rdbQui.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "qui");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            } else if (rdbSex.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "sex");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            } else if (rdbSab.isSelected()) {
                listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, "sab");
                if (listaLinha.isEmpty()) {
                    achou = false;
                }
            }
        }
        if (!ckbTodasSitucoes.isSelected() && achou) {
            listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, rdbAtivos.isSelected());
            if (listaLinha.isEmpty()) {
                achou = false;
            }
        }

        if (!ckbTodosNumerosDeLinhas.isSelected() && achou) {
            listaLinha = JanelaPrincipal.ctlLinha.listar(txfNumeroLinha.getText(),listaLinha);
            if (listaLinha.isEmpty()) {
                achou = false;
            }
        }
        if (!ckbTodosOnibus.isSelected() && achou) {
            listaLinha = JanelaPrincipal.ctlLinha.listar(listaLinha, ((Onibus) cmbOnibus.getSelectedItem()).getCodigo());
            if (listaLinha.isEmpty()) {
                achou = false;
            }
        }
        if (achou) {
            preencherTabela(listaLinha);
        } else {
            JOptionPane.showMessageDialog(this, "NENHUMA LINHA ENCONTRADA!\nTENTE OUTROS FILTROS!","busca!",2);
        }
    }

    private void preencherComboOnibus() {
        ArrayList<Cidade> cidades = JanelaPrincipal.ctlCidades.listar();
        for (int i = 0; i < cidades.size(); i++) {
            cmbDestinoParadas.addItem(cidades.get(i));
        }
    }

    private void preencherComboCidade() {
        ArrayList<Onibus> bus = JanelaPrincipal.ctlOnibus.listar();
        for (int i = 0; i < bus.size(); i++) {
            cmbOnibus.addItem(bus.get(i));
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
            java.util.logging.Logger.getLogger(JanelaListagemLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaListagemLinhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaListagemLinhas dialog = new JanelaListagemLinhas(new JanelaPrincipal(), true);
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
    private javax.swing.ButtonGroup btgFreq;
    private javax.swing.ButtonGroup btgSituacao;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbTodasDestinosParadas;
    private javax.swing.JCheckBox ckbTodasFrequencia;
    private javax.swing.JCheckBox ckbTodasSitucoes;
    private javax.swing.JCheckBox ckbTodosNumerosDeLinhas;
    private javax.swing.JCheckBox ckbTodosOnibus;
    private javax.swing.JComboBox cmbDestinoParadas;
    private javax.swing.JComboBox cmbOnibus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDestinoParadas;
    private javax.swing.JLabel lblFrequencia;
    private javax.swing.JLabel lblIconeLinha;
    private javax.swing.JLabel lblListarLinha;
    private javax.swing.JLabel lblNumeroLinha;
    private javax.swing.JLabel lblOnibus;
    private javax.swing.JLabel lblSituacao1;
    private javax.swing.JRadioButton rdbAtivos;
    private javax.swing.JRadioButton rdbDom;
    private javax.swing.JRadioButton rdbInativos;
    private javax.swing.JRadioButton rdbQua;
    private javax.swing.JRadioButton rdbQui;
    private javax.swing.JRadioButton rdbSab;
    private javax.swing.JRadioButton rdbSeg;
    private javax.swing.JRadioButton rdbSex;
    private javax.swing.JRadioButton rdbTer;
    private javax.swing.JTable tblLinha;
    private javax.swing.JTextField txfNumeroLinha;
    // End of variables declaration//GEN-END:variables
}
