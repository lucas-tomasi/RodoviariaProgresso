package janelas;

import classeDeNegocio.Cidade;
import classeDeNegocio.Linha;
import classeDeNegocio.Parada;
import classeDeNegocio.Passagem;
import classesDeAjuda.DataHora;
import controlas.ControlaCidades;
import controlas.ControlaLinhas;
import controlas.ControlaOnibus;
import controlas.ControlaParadas;
import controlas.ControlaPassagens;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        ctlCidades = new ControlaCidades();
        ctlOnibus = new ControlaOnibus();
        ctlParadas = new ControlaParadas();
        ctlLinha = new ControlaLinhas();
        ctlPassagens = new ControlaPassagens();
        poltronas = new ArrayList<>();
        preencherComboDestino();
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbDestino = new javax.swing.JComboBox();
        lblRodoviariaProgresso = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLinhas = new javax.swing.JTable();
        lblDatas = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblCodigoPassagem = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblvalorTotal = new javax.swing.JLabel();
        lblSeguro = new javax.swing.JLabel();
        lblValorSeguro = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblLegendaPoltronas = new javax.swing.JLabel();
        lblFrenteOnibus = new javax.swing.JLabel();
        lblOrigem = new javax.swing.JLabel();
        lblProgresso = new javax.swing.JLabel();
        lblValorParada = new javax.swing.JLabel();
        lblPoltronas = new javax.swing.JLabel();
        btnEfetuarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPassagem = new javax.swing.JTextArea();
        lblOnibus = new javax.swing.JLabel();
        lblBanheiro = new javax.swing.JLabel();
        btnLiberadas = new javax.swing.JButton();
        lblInfoLinha = new javax.swing.JLabel();
        btnOcupada = new javax.swing.JButton();
        lblLiberada = new javax.swing.JLabel();
        lblOcupada = new javax.swing.JLabel();
        lblVT = new javax.swing.JLabel();
        lblCodBus = new javax.swing.JLabel();
        lblNumPoltrona = new javax.swing.JLabel();
        lblHoraSaida = new javax.swing.JLabel();
        lblVP = new javax.swing.JLabel();
        lblVS = new javax.swing.JLabel();
        ckbBanheiro = new javax.swing.JCheckBox();
        ckbSeguro = new javax.swing.JCheckBox();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnListar = new javax.swing.JMenu();
        mnListarCidades = new javax.swing.JMenuItem();
        mnListarOnibus = new javax.swing.JMenuItem();
        mnListarLinha = new javax.swing.JMenuItem();
        mnCadastrar = new javax.swing.JMenu();
        mnCadastrarCidade = new javax.swing.JMenuItem();
        mnCadastrarOnibus = new javax.swing.JMenuItem();
        mnCadastrarLinha = new javax.swing.JMenuItem();
        mnAlterar = new javax.swing.JMenu();
        mnAlterarInativarOnibus = new javax.swing.JMenuItem();
        mnAlterarInativarLinha = new javax.swing.JMenuItem();
        mnAlterarInativarCidade = new javax.swing.JMenuItem();
        mnEstatisticas = new javax.swing.JMenu();
        mnEstatisticasDeVenda = new javax.swing.JMenuItem();
        mnVisualizarPoltronas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnSistema = new javax.swing.JMenu();
        mnCancelaPassagem = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RODOVIÁRIA PROGRESSO");

        cmbDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDestinoItemStateChanged(evt);
            }
        });

        lblRodoviariaProgresso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRodoviariaProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRodoviariaProgresso.setText("RODOVIÁRIA PROGRESSO");

        tblLinhas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linha", "Destino", "Paradas", "Saida", "Valor", "Extra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLinhas.getTableHeader().setReorderingAllowed(false);
        tblLinhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLinhasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLinhas);

        lblDatas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatas.setText("Data:");

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("00/00/0000");

        lblCodigoPassagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoPassagem.setText("Código Passagem:");

        lblCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCod.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCod.setText("00001");

        lblDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDestino.setText("Destino:");

        lblvalorTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblvalorTotal.setText("Valor Total:");

        lblSeguro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSeguro.setText("Seguro:");

        lblValorSeguro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorSeguro.setText("Valor Seguro:");

        lblSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaida.setText("Saída:");

        lblLegendaPoltronas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Info.png"))); // NOI18N
        lblLegendaPoltronas.setText("LEGENDA POLTRONAS!");

        lblFrenteOnibus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrenteOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FrenteOnibus.png"))); // NOI18N
        lblFrenteOnibus.setToolTipText("");

        lblOrigem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrigem.setText("Origem:");

        lblProgresso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProgresso.setText("Progresso");

        lblValorParada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorParada.setText("Valor Parada:");

        lblPoltronas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPoltronas.setText("Poltrona:");

        btnEfetuarVenda.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEfetuarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Vendas.jpg"))); // NOI18N
        btnEfetuarVenda.setText("Efetuar Venda");
        btnEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarVendaActionPerformed(evt);
            }
        });

        txaPassagem.setEditable(false);
        txaPassagem.setColumns(20);
        txaPassagem.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txaPassagem.setRows(5);
        txaPassagem.setText("===========================\n\n Rodoviaria Progresso\n\n COD.: 0\n\n Data: 00/00/0000\n\n Hora: 00:00\n\n===========================\n\n Status: V\n Linha: 000\n Onibus: 000\n Seguro: Não\n Valor: 0.0\n Valor Seguro: 0.0\n Saida: 00:00\n Origem: Progresso\n Destino: Porto Alegre\n Parada: Lajeado\n Assento: 1\n\n Valor Total: 10.0\n\n===========================\n\n Boa Viagem!\n\n===========================\n");
        jScrollPane1.setViewportView(txaPassagem);

        lblOnibus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnibus.setText("Ônibus:");

        lblBanheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBanheiro.setText("Banheiro:");

        btnLiberadas.setBackground(new java.awt.Color(0, 204, 0));
        btnLiberadas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        lblInfoLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Info.png"))); // NOI18N
        lblInfoLinha.setText("  Selecione a linha para efetuar a venda na tabela abaixo!");

        btnOcupada.setBackground(new java.awt.Color(255, 0, 0));
        btnOcupada.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        lblLiberada.setText("Liberada!");

        lblOcupada.setText("Ocupada!");

        lblVT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVT.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVT.setText("0.00");

        lblCodBus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodBus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCodBus.setText("-");

        lblNumPoltrona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumPoltrona.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumPoltrona.setText("-");

        lblHoraSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraSaida.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHoraSaida.setText("-");

        lblVP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVP.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVP.setText("0.00");

        lblVS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVS.setText("0.00");

        ckbBanheiro.setEnabled(false);

        ckbSeguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ckbSeguroMousePressed(evt);
            }
        });

        mnListar.setText("Listar");
        mnListar.setRequestFocusEnabled(false);

        mnListarCidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnListarCidades.setText("Listar Cidades");
        mnListarCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarCidadesActionPerformed(evt);
            }
        });
        mnListar.add(mnListarCidades);

        mnListarOnibus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        mnListarOnibus.setText("Listar Ônibus");
        mnListarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarOnibusActionPerformed(evt);
            }
        });
        mnListar.add(mnListarOnibus);

        mnListarLinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        mnListarLinha.setText("Listar Linhas");
        mnListarLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarLinhaActionPerformed(evt);
            }
        });
        mnListar.add(mnListarLinha);

        mnuPrincipal.add(mnListar);

        mnCadastrar.setText("Cadastrar");

        mnCadastrarCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnCadastrarCidade.setText("Cadastrar Cidade");
        mnCadastrarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarCidadeActionPerformed(evt);
            }
        });
        mnCadastrar.add(mnCadastrarCidade);

        mnCadastrarOnibus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mnCadastrarOnibus.setText("Cadastrar Ônibus");
        mnCadastrarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarOnibusActionPerformed(evt);
            }
        });
        mnCadastrar.add(mnCadastrarOnibus);

        mnCadastrarLinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mnCadastrarLinha.setText("Cadastrar Linha");
        mnCadastrarLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarLinhaActionPerformed(evt);
            }
        });
        mnCadastrar.add(mnCadastrarLinha);

        mnuPrincipal.add(mnCadastrar);

        mnAlterar.setText("Alterar/Inativar");

        mnAlterarInativarOnibus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        mnAlterarInativarOnibus.setText("Alterar/Inativar Ônibus");
        mnAlterarInativarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarInativarOnibusActionPerformed(evt);
            }
        });
        mnAlterar.add(mnAlterarInativarOnibus);

        mnAlterarInativarLinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        mnAlterarInativarLinha.setText("Alterar/Inativar Linha");
        mnAlterarInativarLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarInativarLinhaActionPerformed(evt);
            }
        });
        mnAlterar.add(mnAlterarInativarLinha);

        mnAlterarInativarCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mnAlterarInativarCidade.setText("Alterar/Inativar Cidade");
        mnAlterarInativarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarInativarCidadeActionPerformed(evt);
            }
        });
        mnAlterar.add(mnAlterarInativarCidade);

        mnuPrincipal.add(mnAlterar);

        mnEstatisticas.setText("Estatísticas");

        mnEstatisticasDeVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnEstatisticasDeVenda.setText("Estatísticas de Vendas");
        mnEstatisticasDeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstatisticasDeVendaActionPerformed(evt);
            }
        });
        mnEstatisticas.add(mnEstatisticasDeVenda);

        mnVisualizarPoltronas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnVisualizarPoltronas.setText("Visualizar Poltronas");
        mnVisualizarPoltronas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarPoltronasActionPerformed(evt);
            }
        });
        mnEstatisticas.add(mnVisualizarPoltronas);

        jMenuItem1.setText("Estatísticas de Cancelamento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnEstatisticas.add(jMenuItem1);

        mnuPrincipal.add(mnEstatisticas);

        mnSistema.setText("Sistema");

        mnCancelaPassagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCancelaPassagem.setText("Cancelar Passagem");
        mnCancelaPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCancelaPassagemActionPerformed(evt);
            }
        });
        mnSistema.add(mnCancelaPassagem);

        mnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnSistema.add(mnSair);

        mnuPrincipal.add(mnSistema);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLiberadas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLiberada)
                                .addGap(18, 18, 18)
                                .addComponent(btnOcupada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOcupada))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(btnEfetuarVenda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblInfoLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRodoviariaProgresso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblPoltronas)
                                                        .addGap(8, 8, 8))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(lblOnibus, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblSaida, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addGap(16, 16, 16)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lblHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblCodBus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNumPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblBanheiro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ckbBanheiro)))
                                        .addGap(119, 119, 119)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblSeguro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblValorParada, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblValorSeguro)
                                                        .addGap(68, 68, 68)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblVS, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblVP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblvalorTotal)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblVT, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOrigem)
                                            .addComponent(lblDatas))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProgresso)
                                            .addComponent(lblData))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblDestino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ckbSeguro, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCodigoPassagem)
                                                .addGap(63, 63, 63)
                                                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFrenteOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLegendaPoltronas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRodoviariaProgresso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCodigoPassagem)
                                    .addComponent(lblCod)
                                    .addComponent(lblData)
                                    .addComponent(lblDatas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDestino)
                                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProgresso)
                                    .addComponent(lblOrigem)))
                            .addComponent(lblFrenteOnibus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInfoLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSeguro)
                                    .addComponent(lblCodBus)
                                    .addComponent(lblOnibus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblValorSeguro)
                                        .addComponent(lblVS))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblBanheiro))
                                    .addComponent(ckbBanheiro))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckbSeguro)
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorParada)
                            .addComponent(lblHoraSaida)
                            .addComponent(lblSaida)
                            .addComponent(lblVP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblvalorTotal)
                            .addComponent(lblNumPoltrona)
                            .addComponent(lblPoltronas)
                            .addComponent(lblVT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lblLegendaPoltronas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLiberadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOcupada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLiberada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOcupada, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarCidadeActionPerformed
        JanelaCadastrosCidades jcc = new JanelaCadastrosCidades(this, true);
        jcc.setResizable(false);
        jcc.setLocationRelativeTo(null);
        jcc.setVisible(true);

    }//GEN-LAST:event_mnCadastrarCidadeActionPerformed

    private void mnListarCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarCidadesActionPerformed
        JanelaListagemCidades jLc = new JanelaListagemCidades(this, true);
        jLc.setResizable(false);
        jLc.setLocationRelativeTo(null);
        jLc.setVisible(true);

    }//GEN-LAST:event_mnListarCidadesActionPerformed

    private void mnCadastrarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarOnibusActionPerformed
        JanelaCadastrosOnibus jco = new JanelaCadastrosOnibus(this, true);
        jco.setResizable(false);
        jco.setLocationRelativeTo(null);
        jco.setVisible(true);

    }//GEN-LAST:event_mnCadastrarOnibusActionPerformed

    private void mnListarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarOnibusActionPerformed
        JanelaListagemOnibus jlo = new JanelaListagemOnibus(this, true);
        jlo.setResizable(false);
        jlo.setLocationRelativeTo(null);
        jlo.setVisible(true);

    }//GEN-LAST:event_mnListarOnibusActionPerformed

    private void mnCadastrarLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarLinhaActionPerformed
        JanelaCadastrosLinhas jcl = new JanelaCadastrosLinhas(this, true);
        jcl.setResizable(false);
        jcl.setLocationRelativeTo(null);
        jcl.setVisible(true);
    }//GEN-LAST:event_mnCadastrarLinhaActionPerformed

    private void mnListarLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarLinhaActionPerformed
        JanelaListagemLinhas jLl = new JanelaListagemLinhas(this, true);
        jLl.setResizable(false);
        jLl.setLocationRelativeTo(null);
        jLl.setVisible(true);

    }//GEN-LAST:event_mnListarLinhaActionPerformed

    private void cmbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDestinoItemStateChanged
        if (evt.getStateChange() == 2) {
            if (cmbDestino.getSelectedIndex() > 0) {
                preencherTabelaLinhas();
            }
        }
    }//GEN-LAST:event_cmbDestinoItemStateChanged

    private void tblLinhasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLinhasMouseClicked
        if (evt.getClickCount() == 2) {
            linhaVenda = (Linha) tblLinhas.getValueAt(tblLinhas.getSelectedRow(), 0);
            preencherCampos();
        }
    }//GEN-LAST:event_tblLinhasMouseClicked

    private void ckbSeguroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbSeguroMousePressed
        calcularSeguro();
    }//GEN-LAST:event_ckbSeguroMousePressed

    private void btnEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarVendaActionPerformed
        int poltrona = 0;
        for (int i = 0; i < poltronas.size(); i++) {
            if (poltronas.get(i).getBackground().equals(Color.blue)) {
                poltrona = (Integer.parseInt(poltronas.get(i).getText()));
                poltronas.get(i).setBackground(Color.red);
            }
        }
        if (poltrona != 0) {
            if (ctlLinha.zerarPoltronasLinha(linhaVenda)) {
                JOptionPane.showMessageDialog(this, "LINHA ACABOU DE PARTIR", "erro!", 0);
            } else {
                Passagem novaPassagem = new Passagem();
                novaPassagem.setData(DataHora.getData());
                novaPassagem.setHora(DataHora.getHora());
                novaPassagem.setLinha(linhaVenda.getCodigo());
                novaPassagem.setSeguro(ckbSeguro.isSelected());
                novaPassagem.setValorSeguro(Double.parseDouble(lblVS.getText()));
                novaPassagem.setValorTotal(Double.parseDouble(lblVT.getText()));
                novaPassagem.setValorParada(Double.parseDouble(lblVP.getText()));
                novaPassagem.setPoltrona(poltrona);
                novaPassagem.setParada(paradaPassagem.getNome());
                novaPassagem.setDestino((ctlCidades.buscar(ctlLinha.buscarDestino(linhaVenda.getCodigo()))).getNome());
                ctlLinha.venderPoltrona(linhaVenda, poltrona);
                ctlPassagens.emitir(novaPassagem);
                txaPassagem.setText(ctlPassagens.gerarBilhete(novaPassagem));
                JOptionPane.showMessageDialog(this, "BILHETE GERADO COM SUCESSO!", "confirmação", 1);
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "SELECIONE UMA POLTRONA!", "atencão!", 2);
        }

    }//GEN-LAST:event_btnEfetuarVendaActionPerformed

    private void mnAlterarInativarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarInativarCidadeActionPerformed
        JanelaAlteracoesCidades jac = new JanelaAlteracoesCidades(this, true);
        jac.setResizable(false);
        jac.setLocationRelativeTo(null);
        jac.setVisible(true);
    }//GEN-LAST:event_mnAlterarInativarCidadeActionPerformed

    private void mnAlterarInativarLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarInativarLinhaActionPerformed
        JanelaAlteracoesLinhas jal = new JanelaAlteracoesLinhas(this, true);
        jal.setResizable(false);
        jal.setLocationRelativeTo(null);
        jal.setVisible(true);
    }//GEN-LAST:event_mnAlterarInativarLinhaActionPerformed

    private void mnAlterarInativarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarInativarOnibusActionPerformed
        JanelaAlteracoesOnibus jao = new JanelaAlteracoesOnibus(this, true);
        jao.setResizable(false);
        jao.setLocationRelativeTo(null);
        jao.setVisible(true);
    }//GEN-LAST:event_mnAlterarInativarOnibusActionPerformed

    private void mnVisualizarPoltronasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarPoltronasActionPerformed
        JanelaVisualicaoPoltronas jvp = new JanelaVisualicaoPoltronas(this, true);
        jvp.setResizable(false);
        jvp.setLocationRelativeTo(null);
        jvp.setVisible(true);
    }//GEN-LAST:event_mnVisualizarPoltronasActionPerformed

    private void mnEstatisticasDeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstatisticasDeVendaActionPerformed
        JanelaEstatisticasDeVendas jev = new JanelaEstatisticasDeVendas(this, true);
        jev.setResizable(false);
        jev.setLocationRelativeTo(null);
        jev.setVisible(true);
    }//GEN-LAST:event_mnEstatisticasDeVendaActionPerformed

    private void mnCancelaPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCancelaPassagemActionPerformed
        JanelaCancelamentoPassagens jcp = new JanelaCancelamentoPassagens(this, true);
        jcp.setResizable(false);
        jcp.setLocationRelativeTo(null);
        jcp.setVisible(true);
    }//GEN-LAST:event_mnCancelaPassagemActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        if (JOptionPane.showConfirmDialog(this, "DESEJA CONTINUAR?", "sair do sistema!", 2, 2) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JanelaEstatisticasDeCancelamento jec = new JanelaEstatisticasDeCancelamento(this,true);
        jec.setResizable(false);
        jec.setLocationRelativeTo(null);
        jec.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    public void preencherComboDestino() {
        cmbDestino.removeAllItems();
        cmbDestino.addItem(": Selecione Destino :");
        ArrayList<Cidade> cidades = ctlCidades.listar(true);
        for (int i = 1; i < cidades.size(); i++) {
            cmbDestino.addItem(cidades.get(i));
        }
        cmbDestino.setSelectedIndex(0);
    }

    private void redimencionarTamanhoTabela(int tamanho) {
        tblLinhas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[tamanho][6],
                new String[]{
                    "Linha", "Paradas", "Destino", "Saida", "Valor", "Extra"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblLinhas.getTableHeader().setReorderingAllowed(false);
        tblLinhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLinhasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLinhas);
    }

    private void preencherTabelaLinhas() {
        paradaPassagem = (Cidade) cmbDestino.getSelectedItem();
        ArrayList<Linha> listaLinha = ctlLinha.procurarParadas(paradaPassagem.getCodigo());
        listaLinha = ctlLinha.listar(listaLinha);
        int tamanho = listaLinha.size();
        redimencionarTamanhoTabela(tamanho);
        if (tamanho != 0) {
            for (int i = 0; i < tamanho; i++) {
                Linha linha = listaLinha.get(i);
                ArrayList<Parada> paradas = ctlLinha.buscarParadas(linha.getCodigo());
                ArrayList<String> cidadesParadas = new ArrayList<>();
                for (int j = 0; j < paradas.size(); j++) {
                    cidadesParadas.add(String.valueOf(ctlCidades.buscar(paradas.get(j).getParada())));
                }
                tblLinhas.setValueAt(linha, i, 0);
                tblLinhas.setValueAt(cidadesParadas, i, 2);
                tblLinhas.setValueAt(ctlCidades.buscar(ctlLinha.buscarDestino(linha.getCodigo())), i, 1);
                tblLinhas.setValueAt(linha.getHorario(), i, 3);
                tblLinhas.setValueAt(ctlParadas.getValorParada(paradaPassagem.getCodigo(), linha.getCodigo()), i, 4);
                tblLinhas.setValueAt(linha.isExtra(), i, 5);
            }
        } else {
            JOptionPane.showMessageDialog(this, "NENHUMA LINHA DISPONIVEL\nTENTE OUTRO DESTINO!", "busca!", 0);
        }

    }

    private void preencherCampos() {
        gerarPoltronas();
        lblCodBus.setText(String.valueOf(ctlOnibus.buscar(linhaVenda.getOnibus())));
        if (ctlOnibus.buscar(linhaVenda.getOnibus()).isBanheiro()) {
            ckbBanheiro.setSelected(true);
        }
        lblHoraSaida.setText(linhaVenda.getHorario());
        lblVP.setText(String.valueOf(tblLinhas.getValueAt(tblLinhas.getSelectedRow(), 4)));
        lblVT.setText(String.valueOf((Double.parseDouble(lblVP.getText())) + Double.parseDouble(lblVS.getText())));
    }

    private void calcularSeguro() {
        if (!ckbSeguro.isSelected()) {
            lblVS.setText("5.0");
            lblVT.setText(String.valueOf(5 + (Double.parseDouble(lblVP.getText()))));
        } else {
            lblVS.setText("0.0");
            lblVT.setText(lblVP.getText());
        }
    }

    private void limparCampos() {
        lblCod.setText(String.valueOf(ctlPassagens.codigoPassagem()));
        cmbDestino.setSelectedIndex(0);
        lblData.setText(DataHora.getData());
        lblCodBus.setText("-");
        ckbBanheiro.setSelected(false);
        ckbSeguro.setSelected(false);
        lblHoraSaida.setText("-");
        lblVP.setText("0.0");
        lblVS.setText("0.0");
        lblVT.setText("0.0");
        lblNumPoltrona.setText("-");
        removerBotoes();
        redimencionarTamanhoTabela(0);
    }

    private void removerBotoes() {
        for (int i = 0; i < poltronas.size(); i++) {
            this.remove(poltronas.get(i));
        }
        this.repaint();
    }

    private void gerarPoltronas() {
        removerBotoes();
        poltronas.removeAll(poltronas);
        int x1 = this.getSize().width - 310, x2 = this.getSize().width - 255, x3 = this.getSize().width - 155, x4 = this.getSize().width - 100, y = 117, cont = 1;
        situacaoPoltronas = linhaVenda.getSituacaoPoltronas();
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
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    validarVenda(botao, situacaoPoltronas);
                }
            });
            poltronas.add(botao);
            this.add(botao);
        }
        this.repaint();
    }

    private void validarVenda(JButton botao, String v[]) {
        for (int i = 1; i < v.length; i++) {
            if (v[i].equalsIgnoreCase("L")) {
                poltronas.get(i - 1).setBackground(Color.green);
            } else {
                poltronas.get(i - 1).setBackground(Color.red);
            }
        }
        if (botao.getBackground().equals(Color.green)) {
            botao.setBackground(Color.blue);
            lblNumPoltrona.setText(botao.getText());
        }
    }

    Linha linhaVenda;
    Cidade paradaPassagem;
    String situacaoPoltronas[];
    ArrayList<JButton> poltronas;

    // COntrolas
    public static ControlaPassagens ctlPassagens;
    public static ControlaParadas ctlParadas;
    public static ControlaLinhas ctlLinha;
    public static ControlaOnibus ctlOnibus;
    public static ControlaCidades ctlCidades;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfetuarVenda;
    private javax.swing.JButton btnLiberadas;
    private javax.swing.JButton btnOcupada;
    private javax.swing.JCheckBox ckbBanheiro;
    private javax.swing.JCheckBox ckbSeguro;
    private javax.swing.JComboBox cmbDestino;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBanheiro;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodBus;
    private javax.swing.JLabel lblCodigoPassagem;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDatas;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblFrenteOnibus;
    private javax.swing.JLabel lblHoraSaida;
    private javax.swing.JLabel lblInfoLinha;
    private javax.swing.JLabel lblLegendaPoltronas;
    private javax.swing.JLabel lblLiberada;
    private javax.swing.JLabel lblNumPoltrona;
    private javax.swing.JLabel lblOcupada;
    private javax.swing.JLabel lblOnibus;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblPoltronas;
    private javax.swing.JLabel lblProgresso;
    private javax.swing.JLabel lblRodoviariaProgresso;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblSeguro;
    private javax.swing.JLabel lblVP;
    private javax.swing.JLabel lblVS;
    private javax.swing.JLabel lblVT;
    private javax.swing.JLabel lblValorParada;
    private javax.swing.JLabel lblValorSeguro;
    private javax.swing.JLabel lblvalorTotal;
    private javax.swing.JMenu mnAlterar;
    private javax.swing.JMenuItem mnAlterarInativarCidade;
    private javax.swing.JMenuItem mnAlterarInativarLinha;
    private javax.swing.JMenuItem mnAlterarInativarOnibus;
    private javax.swing.JMenu mnCadastrar;
    private javax.swing.JMenuItem mnCadastrarCidade;
    private javax.swing.JMenuItem mnCadastrarLinha;
    private javax.swing.JMenuItem mnCadastrarOnibus;
    private javax.swing.JMenuItem mnCancelaPassagem;
    private javax.swing.JMenu mnEstatisticas;
    private javax.swing.JMenuItem mnEstatisticasDeVenda;
    private javax.swing.JMenu mnListar;
    private javax.swing.JMenuItem mnListarCidades;
    private javax.swing.JMenuItem mnListarLinha;
    private javax.swing.JMenuItem mnListarOnibus;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenuItem mnVisualizarPoltronas;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JTable tblLinhas;
    private javax.swing.JTextArea txaPassagem;
    // End of variables declaration//GEN-END:variables
}
