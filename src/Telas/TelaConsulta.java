package Telas;

import Objetos.Doacao;
import Objetos.Doador;
import Objetos.Tema;
import Principal.DoacaoToDB;
import Principal.DoadorToDB;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author berna
 */
public class TelaConsulta extends javax.swing.JFrame {
    Tema temaClaro = new Tema();
    Doacao doacao = new Doacao();
    Doador doador = new Doador();
    DoacaoToDB doacaoToDB;
    DoadorToDB doadorToDB;
    
    
    public TelaConsulta() {
        initComponents();
        setLocationRelativeTo(null); 
        setTitle("Sado - Consulta");
        setIcon();
    }

    public void listarDoacao(){
        try {
            DoacaoToDB doacaoDB = new DoacaoToDB();
            List<Doacao> listaConsultaDoacao = doacaoDB.listarConsultaDoacao(doacao);
        
            DefaultTableModel modelo = (DefaultTableModel)tabelaConsultaDoacao.getModel();
            modelo.setNumRows(0);
         
            for(Doacao d : listaConsultaDoacao){
                modelo.addRow(new Object[]{
                    d.getCodigo(),
                    d.getNome(),
                    d.getQuantidade(),
                    d.getPeso(),
                    d.getDescricao(),
                    d.getCpfDoador()});

            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro na Consulta!");
            e.printStackTrace();
            
        }
    }
    public void listarDoador(){
        try {
            DoadorToDB doadorDB = new DoadorToDB();
            List<Doador> listaConsultaDoador = doadorDB.listarConsultaDoador(doador);
        
            DefaultTableModel modelo = (DefaultTableModel)tabelaConsultaDoador.getModel();
            modelo.setNumRows(0);
         
            for(Doador d : listaConsultaDoador){
                modelo.addRow(new Object[]{
                    d.getCodigo(),
                    d.getCpfDoador(),
                    d.getNome(),
                    d.getEndereco(),
                    d.getTelefone(),
                    d.getEmail()});

            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro na Consulta!");
            e.printStackTrace();
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame = new keeptoo.KGradientPanel();
        painelFundoTotal = new javax.swing.JPanel();
        painelSuperior = new javax.swing.JPanel();
        logoSado = new javax.swing.JLabel();
        botaoDeslogar = new javax.swing.JLabel();
        botaoTema = new javax.swing.JLabel();
        painelEsquerdo = new javax.swing.JPanel();
        botaoInicio = new javax.swing.JLabel();
        botaoCadastroHub = new javax.swing.JLabel();
        botaoConsultarHub = new javax.swing.JLabel();
        botaoHistoricoHub = new javax.swing.JLabel();
        painelAba = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelConsultaDoador = new javax.swing.JLabel();
        txtCpfDoador = new javax.swing.JTextField();
        botaoConsultarDoador = new javax.swing.JButton();
        botaoExcluirDoador = new javax.swing.JButton();
        comboBoxDoador = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelConsultarDoacao = new javax.swing.JLabel();
        txtIdDoacao = new javax.swing.JTextField();
        botaoConsultarDoacao = new javax.swing.JButton();
        botaoExcluirDoacao = new javax.swing.JButton();
        comboBoxDoacao = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultaDoador = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaConsultaDoacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Frame.setkEndColor(new java.awt.Color(246, 134, 86));
        Frame.setkStartColor(new java.awt.Color(0, 0, 0));

        painelFundoTotal.setBackground(new java.awt.Color(255, 255, 255));
        painelFundoTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        painelFundoTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelSuperior.setBackground(new java.awt.Color(153, 153, 153));

        logoSado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SADO LOGO ORIGINAL PRETA.png"))); // NOI18N

        botaoDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Sair preto.png"))); // NOI18N
        botaoDeslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDeslogarMouseClicked(evt);
            }
        });

        botaoTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz.png"))); // NOI18N
        botaoTema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoTemaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelSuperiorLayout = new javax.swing.GroupLayout(painelSuperior);
        painelSuperior.setLayout(painelSuperiorLayout);
        painelSuperiorLayout.setHorizontalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(logoSado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 961, Short.MAX_VALUE)
                .addComponent(botaoTema, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoSado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDeslogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelEsquerdo.setBackground(new java.awt.Color(204, 204, 204));

        botaoInicio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        botaoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoInicio.setText("Início");
        botaoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoInicioMouseClicked(evt);
            }
        });

        botaoCadastroHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        botaoCadastroHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoCadastroHub.setText("Cadastrar");
        botaoCadastroHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastroHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastroHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastroHubMouseClicked(evt);
            }
        });

        botaoConsultarHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 20)); // NOI18N
        botaoConsultarHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoConsultarHub.setText("Consultar");
        botaoConsultarHub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        botaoConsultarHub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoConsultarHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoHistoricoHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        botaoHistoricoHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoHistoricoHub.setText("Histórico");
        botaoHistoricoHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoHistoricoHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoHistoricoHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoHistoricoHubMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelEsquerdoLayout = new javax.swing.GroupLayout(painelEsquerdo);
        painelEsquerdo.setLayout(painelEsquerdoLayout);
        painelEsquerdoLayout.setHorizontalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoCadastroHub, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addComponent(botaoConsultarHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoHistoricoHub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelEsquerdoLayout.setVerticalGroup(
            painelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsquerdoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(botaoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastroHub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoConsultarHub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoHistoricoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("Consultar ou Excluir Doador");

        labelConsultaDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        labelConsultaDoador.setText("CPF Doador");

        txtCpfDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtCpfDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfDoadorActionPerformed(evt);
            }
        });

        botaoConsultarDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoConsultarDoador.setText("Consultar");
        botaoConsultarDoador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoConsultarDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarDoadorActionPerformed(evt);
            }
        });

        botaoExcluirDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoExcluirDoador.setText("Excluir");
        botaoExcluirDoador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoExcluirDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirDoadorActionPerformed(evt);
            }
        });

        comboBoxDoador.setMaximumRowCount(2);
        comboBoxDoador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF Doador", "ID Doador" }));
        comboBoxDoador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDoadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoConsultarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(botaoExcluirDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelConsultaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelConsultaDoador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluirDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel9.setText("Consultar ou Excluir Doação");

        labelConsultarDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        labelConsultarDoacao.setText("ID Doacao");

        txtIdDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtIdDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDoacaoActionPerformed(evt);
            }
        });

        botaoConsultarDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoConsultarDoacao.setText("Consultar");
        botaoConsultarDoacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoConsultarDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarDoacaoActionPerformed(evt);
            }
        });

        botaoExcluirDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoExcluirDoacao.setText("Excluir");
        botaoExcluirDoacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoExcluirDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirDoacaoActionPerformed(evt);
            }
        });

        comboBoxDoacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Doacao", "CPF Doador" }));
        comboBoxDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDoacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelConsultarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoConsultarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoExcluirDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelConsultarDoacao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1, 458));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        tabelaConsultaDoador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDoador", "cpfDoador", "nomeDoador", "endereco", "telefone", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tabelaConsultaDoador);

        tabelaConsultaDoacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDoacao", "nomeDoacao", "quantidade", "peso", "descricao", "cpfDoador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaConsultaDoacao);

        javax.swing.GroupLayout painelAbaLayout = new javax.swing.GroupLayout(painelAba);
        painelAba.setLayout(painelAbaLayout);
        painelAbaLayout.setHorizontalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAbaLayout.createSequentialGroup()
                    .addGap(513, 513, 513)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(514, Short.MAX_VALUE)))
        );
        painelAbaLayout.setVerticalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAbaLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout painelFundoTotalLayout = new javax.swing.GroupLayout(painelFundoTotal);
        painelFundoTotal.setLayout(painelFundoTotalLayout);
        painelFundoTotalLayout.setHorizontalGroup(
            painelFundoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoTotalLayout.createSequentialGroup()
                .addComponent(painelEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelAba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFundoTotalLayout.setVerticalGroup(
            painelFundoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoTotalLayout.createSequentialGroup()
                .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelFundoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FrameLayout = new javax.swing.GroupLayout(Frame);
        Frame.setLayout(FrameLayout);
        FrameLayout.setHorizontalGroup(
            FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(painelFundoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        FrameLayout.setVerticalGroup(
            FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(painelFundoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDeslogarMouseClicked
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoDeslogarMouseClicked

    private void botaoTemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoTemaMouseClicked
        if(temaClaro.getTemaClaro() == true){
            painelFundoTotal.setBackground(new java.awt.Color(0, 0, 0));
            painelSuperior.setBackground(new java.awt.Color(20, 20, 20));
            logoSado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SADO LOGO ORIGINAL.png"))); 
            botaoDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon sair branco.png")));
            botaoTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lampada icon.png")));
            painelEsquerdo.setBackground(new java.awt.Color(100, 100, 100));
            painelAba.setBackground(new java.awt.Color(150,150,150));
            botaoInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255),2));
            botaoInicio.setForeground(new java.awt.Color(255,255,255));
            botaoCadastroHub.setForeground(new java.awt.Color(255,255,255));
            botaoConsultarHub.setForeground(new java.awt.Color(255,255,255));
            botaoHistoricoHub.setForeground(new java.awt.Color(255,255,255));
            temaClaro.setTemaClaro(false);
            
            }else{
            painelFundoTotal.setBackground(new java.awt.Color(255, 255, 255));
            painelSuperior.setBackground(new java.awt.Color(153, 153, 153));
            logoSado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SADO LOGO ORIGINAL PRETA.png"))); 
            botaoDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Sair preto.png")));
            botaoTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luz.png")));
            painelEsquerdo.setBackground(new java.awt.Color(204, 204, 204));
            painelAba.setBackground(new java.awt.Color(255,255,255));
            botaoInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0),2));
            botaoInicio.setForeground(new java.awt.Color(0,0,0));
            botaoCadastroHub.setForeground(new java.awt.Color(0,0,0));
            botaoConsultarHub.setForeground(new java.awt.Color(0,0,0));
            botaoHistoricoHub.setForeground(new java.awt.Color(0,0,0));
            temaClaro.setTemaClaro(true);
            }
    }//GEN-LAST:event_botaoTemaMouseClicked

    private void botaoInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInicioMouseClicked
        new TelaInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoInicioMouseClicked

    private void botaoCadastroHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastroHubMouseClicked
        new TelaCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastroHubMouseClicked

    private void botaoHistoricoHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoHistoricoHubMouseClicked
        new TelaHistorico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHistoricoHubMouseClicked

    private void txtCpfDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfDoadorActionPerformed

    private void botaoConsultarDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarDoadorActionPerformed
        doador.setResposta(txtCpfDoador.getText());
        
        if(comboBoxDoador.getSelectedItem().toString().equals("CPF Doador")){
            doador.setSql("SELECT * FROM doador WHERE cpfDoador="+doador.getResposta());
        }else if(comboBoxDoador.getSelectedItem().toString().equals("ID Doador")){
            doador.setSql("SELECT * FROM doador WHERE idDoador="+doador.getResposta());
        }
       
        doadorToDB = new DoadorToDB();
        doadorToDB.listarConsultaDoador(doador);
        listarDoador();
        txtCpfDoador.setText("");
        
    }//GEN-LAST:event_botaoConsultarDoadorActionPerformed

    private void txtIdDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDoacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDoacaoActionPerformed

    private void botaoConsultarDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarDoacaoActionPerformed
        doacao.setResposta(txtIdDoacao.getText());
    
        if(comboBoxDoacao.getSelectedItem().toString().equals("CPF Doador")){
            doacao.setSQL("SELECT * FROM doacao WHERE Doador_cpfDoador="+doacao.getResposta());
        }else if(comboBoxDoacao.getSelectedItem().toString().equals("ID Doacao")){
            doacao.setSQL("SELECT * FROM doacao WHERE idDoacao="+doacao.getResposta());
        }
          
        doacaoToDB = new DoacaoToDB();
        doacaoToDB.listarConsultaDoacao(doacao);
        listarDoacao();
        txtIdDoacao.setText("");
    }//GEN-LAST:event_botaoConsultarDoacaoActionPerformed

    private void botaoExcluirDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirDoacaoActionPerformed
       doacao.setResposta(txtIdDoacao.getText());
       
       if(comboBoxDoacao.getSelectedItem().toString().equals("CPF Doador")){
            doacao.setSQL("DELETE FROM doacao WHERE Doador_cpfDoador="+doacao.getResposta());
            
        }else if(comboBoxDoacao.getSelectedItem().toString().equals("ID Doacao")){
            doacao.setSQL("DELETE FROM doacao WHERE idDoacao="+doacao.getResposta());
        }
       
       doacaoToDB = new DoacaoToDB();
       doacaoToDB.deletarDoacao(doacao);
       txtIdDoacao.setText("");
    }//GEN-LAST:event_botaoExcluirDoacaoActionPerformed

    private void botaoExcluirDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirDoadorActionPerformed
        doador.setResposta(txtCpfDoador.getText());
        
        if(comboBoxDoador.getSelectedItem().toString().equals("CPF Doador")){
            doador.setSql("DELETE FROM doador WHERE cpfDoador="+doador.getResposta());
             System.out.println("");
        }else if(comboBoxDoador.getSelectedItem().toString().equals("ID Doador")){
            doador.setSql("DELETE FROM doador WHERE idDoador="+doador.getResposta());
        }
         
        doadorToDB = new DoadorToDB();
        doadorToDB.deletarDoador(doador);
        txtCpfDoador.setText("");
    }//GEN-LAST:event_botaoExcluirDoadorActionPerformed

    private void comboBoxDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDoadorActionPerformed
        labelConsultaDoador.setText(comboBoxDoador.getSelectedItem().toString());
    }//GEN-LAST:event_comboBoxDoadorActionPerformed

    private void comboBoxDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDoacaoActionPerformed
        labelConsultarDoacao.setText(comboBoxDoacao.getSelectedItem().toString());
    }//GEN-LAST:event_comboBoxDoacaoActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TelaConsulta().setVisible(true);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Frame;
    private javax.swing.JLabel botaoCadastroHub;
    private javax.swing.JButton botaoConsultarDoacao;
    private javax.swing.JButton botaoConsultarDoador;
    private javax.swing.JLabel botaoConsultarHub;
    private javax.swing.JLabel botaoDeslogar;
    private javax.swing.JButton botaoExcluirDoacao;
    private javax.swing.JButton botaoExcluirDoador;
    private javax.swing.JLabel botaoHistoricoHub;
    private javax.swing.JLabel botaoInicio;
    private javax.swing.JLabel botaoTema;
    private javax.swing.JComboBox<String> comboBoxDoacao;
    private javax.swing.JComboBox<String> comboBoxDoador;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelConsultaDoador;
    private javax.swing.JLabel labelConsultarDoacao;
    private javax.swing.JLabel logoSado;
    private javax.swing.JPanel painelAba;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JPanel painelFundoTotal;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JTable tabelaConsultaDoacao;
    private javax.swing.JTable tabelaConsultaDoador;
    private javax.swing.JTextField txtCpfDoador;
    private javax.swing.JTextField txtIdDoacao;
    // End of variables declaration//GEN-END:variables
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/IconExe.png")));
    }
}
