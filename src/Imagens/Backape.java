
package Imagens;

import Objetos.Administrador;
import Telas.TelaLogin;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author berna
 */
public class Backape extends javax.swing.JFrame {
    
    boolean temaClaro;
    
    public Backape() {
        initComponents();
        setLocationRelativeTo(null); 
        temaClaro=true;
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

        botaoConsultarHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        botaoConsultarHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoConsultarHub.setText("Consultar");
        botaoConsultarHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConsultarHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoHistoricoHub.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        botaoHistoricoHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botaoHistoricoHub.setText("Histórico");
        botaoHistoricoHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoHistoricoHub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout painelAbaLayout = new javax.swing.GroupLayout(painelAba);
        painelAba.setLayout(painelAbaLayout);
        painelAbaLayout.setHorizontalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelAbaLayout.setVerticalGroup(
            painelAbaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        if(temaClaro == true){
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
            temaClaro = false;
            
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
            temaClaro = true;
            }
    }//GEN-LAST:event_botaoTemaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        new Backape().setVisible(true);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Frame;
    private javax.swing.JLabel botaoCadastroHub;
    private javax.swing.JLabel botaoConsultarHub;
    private javax.swing.JLabel botaoDeslogar;
    private javax.swing.JLabel botaoHistoricoHub;
    private javax.swing.JLabel botaoInicio;
    private javax.swing.JLabel botaoTema;
    private javax.swing.JLabel logoSado;
    private javax.swing.JPanel painelAba;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JPanel painelFundoTotal;
    private javax.swing.JPanel painelSuperior;
    // End of variables declaration//GEN-END:variables
}
