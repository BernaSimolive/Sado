package Telas;


import Objetos.Doacao;
import Objetos.Doador;
import Objetos.Tema;
import Principal.DoacaoToDB;
import Principal.DoadorToDB;
import java.awt.Toolkit;
/**
 *
 * @author berna
 */
public class TelaInicio extends javax.swing.JFrame {
    Tema temaClaro = new Tema();
    DoadorToDB doadorToDB = new DoadorToDB();
    DoacaoToDB doacaoToDB = new DoacaoToDB();
    Doacao doacao = new Doacao();
    Doador doador = new Doador();
    
    
    
    public TelaInicio() {
        initComponents();
        setLocationRelativeTo(null); 
        setTitle("Sado - Início");
       setIcon();
       doadorToDB.mostrarTotal(doador);
       doacaoToDB.mostrarTotalDoacao(doacao);
       labelTotalDoador.setText(String.valueOf(doador.getTotalDoador()));
       labelTotalDoacao.setText(String.valueOf(doacao.getTotalDoacao()));
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
        labelTotalDoacao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelTotalDoador = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        botaoInicio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 20)); // NOI18N
        botaoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoInicio.setText("Início");
        botaoInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        botaoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                .addContainerGap(327, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTotalDoacao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48)); // NOI18N
        labelTotalDoacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Total de Doações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTotalDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(labelTotalDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1, 458));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Total de Doadores");

        labelTotalDoador.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48)); // NOI18N
        labelTotalDoador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTotalDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(labelTotalDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAbaLayout = new javax.swing.GroupLayout(painelAba);
        painelAba.setLayout(painelAbaLayout);
        painelAbaLayout.setHorizontalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAbaLayout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(583, Short.MAX_VALUE)))
        );
        painelAbaLayout.setVerticalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAbaLayout.createSequentialGroup()
                .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAbaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAbaLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbaLayout.createSequentialGroup()
                    .addContainerGap(151, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)))
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
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(painelFundoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void botaoCadastroHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastroHubMouseClicked
        new TelaCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastroHubMouseClicked

    private void botaoConsultarHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConsultarHubMouseClicked
        new TelaConsulta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoConsultarHubMouseClicked

    private void botaoHistoricoHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoHistoricoHubMouseClicked
        new TelaHistorico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHistoricoHubMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TelaInicio().setVisible(true);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Frame;
    private javax.swing.JLabel botaoCadastroHub;
    private javax.swing.JLabel botaoConsultarHub;
    private javax.swing.JLabel botaoDeslogar;
    private javax.swing.JLabel botaoHistoricoHub;
    private javax.swing.JLabel botaoInicio;
    private javax.swing.JLabel botaoTema;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelTotalDoacao;
    private javax.swing.JLabel labelTotalDoador;
    private javax.swing.JLabel logoSado;
    private javax.swing.JPanel painelAba;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JPanel painelFundoTotal;
    private javax.swing.JPanel painelSuperior;
    // End of variables declaration//GEN-END:variables
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/IconExe.png")));
    }
}
