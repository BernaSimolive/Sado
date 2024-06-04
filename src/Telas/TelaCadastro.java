package Telas;


import Objetos.Doacao;
import Objetos.Doador;
import Objetos.Tema;
import Principal.ConexaoDB;
import Principal.DoacaoToDB;
import Principal.DoadorToDB;
import java.awt.Toolkit;


/**
 *
 * @author berna
 */
public class TelaCadastro extends javax.swing.JFrame {
    Tema temaClaro = new Tema(); 
    Doador doador = new Doador();
    Doacao doacao = new Doacao();
    ConexaoDB conexao = new ConexaoDB();
    DoadorToDB doadorToDB;
    DoacaoToDB doacaoToDB;
    
    
    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null); 
        setTitle("Sado - Cadastro");
        setIcon();
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
        jLabel1 = new javax.swing.JLabel();
        txtNomeDoador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpfDoador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCpfDoadorDoacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNomeAlimento = new javax.swing.JTextField();
        botaoCadastrarDoador = new javax.swing.JButton();
        botaoCadastrarDoacao = new javax.swing.JButton();
        botaoAlterarDoador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botaoAlterarDoacao = new javax.swing.JButton();
        txtIdDoacao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 965, Short.MAX_VALUE)
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

        botaoCadastroHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 20)); // NOI18N
        botaoCadastroHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoCadastroHub.setText("Cadastrar");
        botaoCadastroHub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        botaoCadastroHub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoCadastroHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoConsultarHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        botaoConsultarHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoConsultarHub.setText("Consultar");
        botaoConsultarHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConsultarHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConsultarHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConsultarHubMouseClicked(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setText("Cadastro da Doação");

        txtNomeDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtNomeDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoadorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome Completo");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setText("CPF");

        txtCpfDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtCpfDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfDoadorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel4.setText("Endereço");

        txtEndereco.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel5.setText("Telefone ");

        txtTelefone.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel6.setText("Email");

        txtEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel7.setText("Cadastro do Doador");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel8.setText("CPF Doador");

        txtCpfDoadorDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtCpfDoadorDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfDoadorDoacaoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel9.setText("Quantidade");

        txtQuantidade.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel10.setText("Peso(Kg/uni)");

        txtPeso.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel11.setText("Descrição");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel12.setText("Nome Alimento");

        txtNomeAlimento.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtNomeAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlimentoActionPerformed(evt);
            }
        });

        botaoCadastrarDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoCadastrarDoador.setText("Cadastrar");
        botaoCadastrarDoador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoCadastrarDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarDoadorActionPerformed(evt);
            }
        });

        botaoCadastrarDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoCadastrarDoacao.setText("Cadastrar");
        botaoCadastrarDoacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoCadastrarDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarDoacaoActionPerformed(evt);
            }
        });

        botaoAlterarDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoAlterarDoador.setText("Alterar");
        botaoAlterarDoador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoAlterarDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarDoadorActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        botaoAlterarDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botaoAlterarDoacao.setText("Alterar");
        botaoAlterarDoacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoAlterarDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarDoacaoActionPerformed(evt);
            }
        });

        txtIdDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txtIdDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDoacaoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel13.setText("ID Doação");

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel14.setText("*Preencher apenas para alterar");

        javax.swing.GroupLayout painelAbaLayout = new javax.swing.GroupLayout(painelAba);
        painelAba.setLayout(painelAbaLayout);
        painelAbaLayout.setHorizontalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(painelAbaLayout.createSequentialGroup()
                        .addComponent(botaoCadastrarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(botaoAlterarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtCpfDoador)
                    .addComponent(txtEndereco)
                    .addComponent(txtTelefone)
                    .addComponent(txtEmail)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeDoador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaLayout.createSequentialGroup()
                            .addComponent(botaoCadastrarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(botaoAlterarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115))
                        .addGroup(painelAbaLayout.createSequentialGroup()
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(painelAbaLayout.createSequentialGroup()
                        .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfDoadorDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelAbaLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addGroup(painelAbaLayout.createSequentialGroup()
                                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdDoacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))
                        .addGap(115, 115, 115))))
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
        );
        painelAbaLayout.setVerticalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAbaLayout.createSequentialGroup()
                                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfDoadorDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelAbaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelAbaLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botaoCadastrarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoAlterarDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1)))
                    .addGroup(painelAbaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCadastrarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAlterarDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(63, 63, 63))
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
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(painelFundoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        FrameLayout.setVerticalGroup(
            FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(painelFundoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
            botaoCadastroHub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255),2));
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
            botaoCadastroHub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0),2));
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

    private void botaoConsultarHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConsultarHubMouseClicked
        new TelaConsulta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoConsultarHubMouseClicked

    private void botaoHistoricoHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoHistoricoHubMouseClicked
        new TelaHistorico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHistoricoHubMouseClicked

    private void txtNomeDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDoadorActionPerformed

    private void txtCpfDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfDoadorActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCpfDoadorDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfDoadorDoacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfDoadorDoacaoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtNomeAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlimentoActionPerformed

    private void botaoCadastrarDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarDoadorActionPerformed
        doador.setNome(txtNomeDoador.getText());
        doador.setCpfDoador(txtCpfDoador.getText());
        doador.setEndereco(txtEndereco.getText());
        doador.setTelefone(txtTelefone.getText());
        doador.setEmail(txtEmail.getText());
        System.out.println(doador.getNome()+doador.getCpfDoador()+doador.getEndereco()+doador.getTelefone()+doador.getEmail());
        
        doadorToDB = new DoadorToDB();
        doadorToDB.cadastrarDoador(doador);
        
        txtNomeDoador.setText("");
        txtCpfDoador.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        
        
    }//GEN-LAST:event_botaoCadastrarDoadorActionPerformed

    private void botaoCadastrarDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarDoacaoActionPerformed
        doacao.setCpfDoador(txtCpfDoadorDoacao.getText());
        doacao.setNome(txtNomeAlimento.getText());
        doacao.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        doacao.setPeso(Double.parseDouble(txtPeso.getText()));
        doacao.setDescricao(txtDescricao.getText());
        System.out.println(doacao.getCpfDoador()+doacao.getNome()+doacao.getQuantidade()+doacao.getQuantidade()+doacao.getDescricao());
        
        doacaoToDB = new DoacaoToDB();
        doacaoToDB.cadastrarDoacao(doacao);
        
        txtCpfDoadorDoacao.setText("");
        txtNomeAlimento.setText("");
        txtQuantidade.setText("");
        txtPeso.setText("");
        txtDescricao.setText("");
        txtIdDoacao.setText("");
    }//GEN-LAST:event_botaoCadastrarDoacaoActionPerformed

    private void botaoAlterarDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarDoadorActionPerformed
        doador.setNome(txtNomeDoador.getText());
        doador.setCpfDoador(txtCpfDoador.getText());
        doador.setEndereco(txtEndereco.getText());
        doador.setTelefone(txtTelefone.getText());
        doador.setEmail(txtEmail.getText());
        
        doadorToDB = new DoadorToDB();
        doadorToDB.alterarDoador(doador);
        
        txtNomeDoador.setText("");
        txtCpfDoador.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_botaoAlterarDoadorActionPerformed

    private void botaoAlterarDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarDoacaoActionPerformed
        doacao.setCodigo(Integer.parseInt(txtIdDoacao.getText()));
        doacao.setCpfDoador(txtCpfDoadorDoacao.getText());
        doacao.setNome(txtNomeAlimento.getText());
        doacao.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        doacao.setPeso(Double.parseDouble(txtPeso.getText()));
        doacao.setDescricao(txtDescricao.getText());
        
        doacaoToDB = new DoacaoToDB();
        doacaoToDB.alterarDoacao(doacao);
        
        txtCpfDoadorDoacao.setText("");
        txtNomeAlimento.setText("");
        txtQuantidade.setText("");
        txtPeso.setText("");
        txtDescricao.setText("");
        txtIdDoacao.setText("");
    }//GEN-LAST:event_botaoAlterarDoacaoActionPerformed

    private void txtIdDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDoacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDoacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        new TelaCadastro().setVisible(true);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Frame;
    private javax.swing.JButton botaoAlterarDoacao;
    private javax.swing.JButton botaoAlterarDoador;
    private javax.swing.JButton botaoCadastrarDoacao;
    private javax.swing.JButton botaoCadastrarDoador;
    private javax.swing.JLabel botaoCadastroHub;
    private javax.swing.JLabel botaoConsultarHub;
    private javax.swing.JLabel botaoDeslogar;
    private javax.swing.JLabel botaoHistoricoHub;
    private javax.swing.JLabel botaoInicio;
    private javax.swing.JLabel botaoTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoSado;
    private javax.swing.JPanel painelAba;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JPanel painelFundoTotal;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JTextField txtCpfDoador;
    private javax.swing.JTextField txtCpfDoadorDoacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdDoacao;
    private javax.swing.JTextField txtNomeAlimento;
    private javax.swing.JTextField txtNomeDoador;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/IconExe.png")));
    }
}
