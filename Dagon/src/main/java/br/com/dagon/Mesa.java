
package br.com.dagon;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Mesa extends javax.swing.JFrame {

    public Mesa() {
        initComponents();
        sortearCartas();
        trilhaGame();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Vida2 = new javax.swing.JLabel();
        textos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Acoes = new javax.swing.JLabel();
        Acoes1 = new javax.swing.JLabel();
        Acoes3 = new javax.swing.JLabel();
        Acoes2 = new javax.swing.JLabel();
        carta002 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        carta001 = new javax.swing.JLabel();
        Vida1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(255, 153, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        nome.setBackground(new java.awt.Color(255, 204, 51));
        nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 160, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("AVATAR");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 80));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001_1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 70, 80));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001_3.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 80));

        jButton10.setBackground(new java.awt.Color(255, 153, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("SALVAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, 50));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 100));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 60, 10));

        jDialog1.getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(874, 580));
        setMinimumSize(new java.awt.Dimension(874, 580));
        setPreferredSize(new java.awt.Dimension(890, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vida2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Vida2.setForeground(new java.awt.Color(0, 255, 0));
        Vida2.setText("I I I I I I I I I I");
        getContentPane().add(Vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, 20));

        textos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 300, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(110, 187));
        jButton2.setMinimumSize(new java.awt.Dimension(110, 187));
        jButton2.setPreferredSize(new java.awt.Dimension(110, 187));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(110, 187));
        jButton4.setMinimumSize(new java.awt.Dimension(110, 187));
        jButton4.setPreferredSize(new java.awt.Dimension(110, 187));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(110, 170));
        jButton3.setMinimumSize(new java.awt.Dimension(110, 170));
        jButton3.setPreferredSize(new java.awt.Dimension(110, 187));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(110, 187));
        jButton5.setMinimumSize(new java.awt.Dimension(110, 187));
        jButton5.setPreferredSize(new java.awt.Dimension(110, 187));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(110, 187));
        jButton6.setMinimumSize(new java.awt.Dimension(110, 187));
        jButton6.setPreferredSize(new java.awt.Dimension(110, 187));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        Acoes.setBackground(new java.awt.Color(255, 0, 51));
        Acoes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Acoes.setForeground(new java.awt.Color(255, 0, 51));
        Acoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        Acoes.setToolTipText("");
        getContentPane().add(Acoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, 40));

        Acoes1.setBackground(new java.awt.Color(255, 0, 51));
        Acoes1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Acoes1.setForeground(new java.awt.Color(255, 0, 51));
        Acoes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acoes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        Acoes1.setToolTipText("");
        getContentPane().add(Acoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, 40));

        Acoes3.setBackground(new java.awt.Color(255, 0, 51));
        Acoes3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Acoes3.setForeground(new java.awt.Color(255, 0, 51));
        Acoes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acoes3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        Acoes3.setToolTipText("");
        getContentPane().add(Acoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, 40));

        Acoes2.setBackground(new java.awt.Color(255, 0, 51));
        Acoes2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Acoes2.setForeground(new java.awt.Color(255, 0, 51));
        Acoes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acoes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        Acoes2.setToolTipText("");
        getContentPane().add(Acoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 40));

        carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        getContentPane().add(carta002, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/X-0001.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Jogador");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 30));

        carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png"))); // NOI18N
        getContentPane().add(carta001, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        Vida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Vida1.setForeground(new java.awt.Color(0, 255, 0));
        Vida1.setText("I I I I I I I I I I");
        getContentPane().add(Vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, 20));

        jLabel11.setBackground(new java.awt.Color(255, 102, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001.png"))); // NOI18N
        getContentPane().add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Oponente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 30));

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 100, 20));

        jLabel12.setBackground(new java.awt.Color(255, 102, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, 20));

        jLabel7.setBackground(new java.awt.Color(255, 102, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        jLabel14.setBackground(new java.awt.Color(255, 102, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 30));

        jLabel15.setBackground(new java.awt.Color(255, 102, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Oponente");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 20));

        jLabel16.setBackground(new java.awt.Color(255, 102, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("0");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("0");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAIR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 70, 20));

        jButton11.setBackground(new java.awt.Color(255, 0, 51));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("AVATAR");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 70, -1));

        jButton12.setBackground(new java.awt.Color(255, 0, 51));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("CARTAS");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 70, -1));

        jLabel10.setBackground(new java.awt.Color(255, 102, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 100, 20));

        jLabel9.setBackground(new java.awt.Color(255, 102, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MESA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MESA.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        somCarta();
        jogarCarta(dano5);
        Timer timer = new Timer(900,e ->{
            receberCarta();
        });
        timer.setRepeats(false);
        timer.start();
        Timer timer1 = new Timer(1900,e ->{
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            textos.setText("");

        });
        timer1.setRepeats(false);
        timer1.start();
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
        jButton2.setEnabled(false);
        jogada++;
        conferir();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        somCarta();
        jogarCarta(dano1);
        Timer timer = new Timer(900,e ->{
            receberCarta();
        });
        timer.setRepeats(false);
        timer.start();
        Timer timer1 = new Timer(1900,e ->{
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            textos.setText("");

        });
        timer1.setRepeats(false);
        timer1.start();
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
        jButton3.setEnabled(false);
        jogada++;
        conferir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        somCarta();
        jogarCarta(dano2);
        Timer timer = new Timer(900,e ->{
            receberCarta();
        });
        timer.setRepeats(false);
        timer.start();
        timer.start();
        Timer timer1 = new Timer(1900,e ->{
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            textos.setText("");

        });
        timer1.setRepeats(false);
        timer1.start();
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
        jButton4.setEnabled(false);
        jogada++;
        conferir();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        somCarta();
        jogarCarta(dano3);
        Timer timer = new Timer(900,e ->{
            receberCarta();
        });
        timer.setRepeats(false);
        timer.start();
        timer.start();
        Timer timer1 = new Timer(1900,e ->{
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            textos.setText("");

        });
        timer1.setRepeats(false);
        timer1.start();
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
        jButton5.setEnabled(false);
        jogada++;
        conferir();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        somCarta();
        jogarCarta(dano4);
        Timer timer = new Timer(900,e ->{
            receberCarta();
        });
        timer.setRepeats(false);
        timer.start();
        timer.start();
        Timer timer1 = new Timer(1900,e ->{
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            textos.setText("");

        });
        timer1.setRepeats(false);
        timer1.start();
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
        jButton6.setEnabled(false);
        jogada++;
        conferir();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       jDialog1.pack();
       jDialog1.setLocationRelativeTo(this);
       jDialog1.setModal(true);
       jDialog1.setVisible(true); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001.png")));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001_1.png")));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OponenteBase-0001_3.png")));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jLabel18.setText(nome.getText());
        jDialog1.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);
            }
        });
    }
    
    public int dano1 = 0;
    public int dano2 = 0;
    public int dano3 = 0;
    public int dano4 = 0;
    public int dano5 = 0;
    public int vitorias = 0;
    public int derrotas = 0;
    public int jogada = 0;
    
    
    public Jogador jogador = new Jogador();
    public Jogador boss = new Jogador();
    private Clip trilha;

    
    
    
    public void sortearCartas(){
        
        int[] opcoes = {1, 2,3,4,5,6};
        int carta1 = opcoes[(int)(Math.random() * opcoes.length)];
        int carta2 = opcoes[(int)(Math.random() * opcoes.length)];
        int carta3 = opcoes[(int)(Math.random() * opcoes.length)];
        int carta4 = opcoes[(int)(Math.random() * opcoes.length)];
        int carta5 = opcoes[(int)(Math.random() * opcoes.length)];
        
        //carta 1
        
        if(carta1 == 1){
             jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
             dano1 = 3;
             
        }
        else if(carta1 == 2){
             jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png")));
             dano1 = 1;
        }
        else if(carta1 == 3){
             jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png")));
        }
        else if(carta1 == 4){
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
            dano1 = 5;
        }
        else if(carta1 == 5){
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
            dano1 = 8;
        }
        else if(carta1 == 6){
             jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
             dano1 = 2;
        }
        
        //carta 2
        
        if(carta2 == 1){
             jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
             dano2 = 3;
        }
        else if(carta2 == 2){
             jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png")));  
             dano2 = 1;
        }
        else if(carta2 == 3){
             jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png")));  
        }
        else if(carta2 == 4){
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
            dano2 = 5;
        }
        else if(carta2 == 5){
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
            dano2 = 8;
        }
        else if(carta2 == 6){
             jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
             dano2 = 2;
        }
        
        // carta 3
        
        if(carta3 == 1){
             jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
             dano3 = 3;
        }
        else if(carta3 == 2){
             jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png"))); 
             dano3 = 1;
        }
        else if(carta3 == 3){
             jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png"))); 
        }
        else if(carta3 == 4){
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
             dano3 = 5;
        }
        else if(carta3 == 5){
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
             dano3 = 8;
        }
        else if(carta3 == 6){
             jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
              dano3 = 2;
        }  
        
        // carta 4
        
        if(carta4 == 1){
             jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
              dano4 = 3;
        }
        else if(carta4 == 2){
             jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png")));
              dano4 = 1;
        }
        else if(carta4 == 3){
             jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png")));            
        }
        else if(carta4 == 4){
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
             dano4 = 5;
        }
        else if(carta4 == 5){
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
             dano4 = 8;
        }
        else if(carta4 == 6){
             jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
              dano4 = 2;
        }
        
        // carta 5
        
        if(carta5 == 1){
             jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
              dano5 = 3;
        }
        else if(carta5 == 2){
             jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png")));
              dano5 = 1;
        }
        else if(carta5 == 3){
             jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png")));             
        }
        else if(carta5 == 4){
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
             dano5 = 5;
        }
        else if(carta5 == 5){
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
             dano5 = 8;
        }
        else if(carta5 == 6){
             jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
              dano5 = 2;
        }        
    }
    
    public void jogarCarta(int dano){
        if (dano == 1){
            boss.setVida(jogador.getVida()-1);
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png")));
            textos.setText("Oponente fica fedendo(1 de dano)");
        }
        else if (dano == 2){
            boss.setVida(jogador.getVida()-2);
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
            textos.setText("oponente cego(2 de dano)");
        }
        else if (dano == 3){
            boss.setVida(jogador.getVida()-3);
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
            textos.setText("gatinho malvado(3 de dano)");
        }
        else if (dano == 5){
            boss.setVida(jogador.getVida()-5);
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
            textos.setText("Oponente analfabeto(5 de dano)");
        }
        else if (dano == 8){
            boss.setVida(jogador.getVida()-8);
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
            textos.setText("oponente ferido(8 de dano)");            
        }
        else if (dano == 0){
            jogador.setVida(jogador.getVida()+ 4);
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png")));
            
        }
        else{
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
        }
    }
    
    public void receberCarta(){
        
        int[] opcoes = {1, 2,3,4,5,6};    
        int dano = opcoes[(int)(Math.random() * opcoes.length)];
            
        if (dano == 1){
            jogador.setVida(jogador.getVida()-1);
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPeixe-export.png")));
            textos.setText("Voce fica fedendo(1 de dano)");
        }
        else if (dano == 2){
            jogador.setVida(jogador.getVida()-2);
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaOlho.png")));
            textos.setText("Voce fica cego(2 de dano)");
        }
        else if (dano == 3){
            jogador.setVida(jogador.getVida()-3);
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaGato-export.png")));
            textos.setText("aiai ele me arranhou(3 de dano)");
        }
        else if (dano == 5){
            jogador.setVida(jogador.getVida()-5);
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaLivro-export.png")));
            textos.setText("Voce não sabe ler(5 de dano)");
        }
        else if (dano == 8){
            jogador.setVida(jogador.getVida()-8);
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaPolvo-export.png")));
            textos.setText("xuxulo te intimida(8 de dano)");
        }
        else{
            boss.setVida(boss.getVida()+ 4);
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaCoracao-export.png")));
            textos.setText("oponente regenerou 4 de vida");
        }
    }
    
    public void conferir(){
        
          if(jogador.getVida()>=10){
                Vida1.setText("I I I I I I I I I I");
            }
            if(jogador.getVida()== 9){
                Vida1.setText("I I I I I I I I I");
            }
            if(jogador.getVida()== 8){
                Vida1.setText("I I I I I I I I");
            }
            if(jogador.getVida()== 7){
                Vida1.setText("I I I I I I I");
            }
            if(jogador.getVida()== 6){
                Vida1.setText("I I I I I I");
            }
            if(jogador.getVida()== 5){
                Vida1.setText("I I I I I");
            }
            if(jogador.getVida()== 4){
                Vida1.setText("I I I I");
            }
            if(jogador.getVida()== 3){
                Vida1.setText("I I I");
            }
            if(jogador.getVida()== 2){
                Vida1.setText("I I");
            }
            if(jogador.getVida()== 1){
                Vida1.setText("I");
            }
            if(jogador.getVida()<= 0 ){
                Vida1.setText("");
                resetar();
                derrotas++;
                jLabel21.setText(String.valueOf(derrotas));
                JOptionPane.showMessageDialog(null, "Voce perdeu a rodada");

                
            }
            
            // Boss
            
            if(boss.getVida()>=10){
                Vida2.setText("I I I I I I I I I I");
            }
            if(boss.getVida()== 9){
                Vida2.setText("I I I I I I I I I");
            }
            if(boss.getVida()== 8){
                Vida2.setText("I I I I I I I I");
            }
            if(boss.getVida()== 7){
                Vida2.setText("I I I I I I I");
            }
            if(boss.getVida()== 6){
                Vida2.setText("I I I I I I");
            }
            if(boss.getVida()== 5){
                Vida2.setText("I I I I I");
            }
            if(boss.getVida()== 4){
                Vida2.setText("I I I I");
            }
            if(boss.getVida()== 3){
                Vida2.setText("I I I");
            }
            if(boss.getVida()== 2){
                Vida2.setText("I I");
            }
            if(boss.getVida()== 1){
                Vida2.setText("I");
            }
            if(boss.getVida()<= 0 ){
                Vida2.setText("");
                resetar();
                vitorias++;
                jLabel20.setText(String.valueOf(vitorias));
                JOptionPane.showMessageDialog(null, "Voce ganhou a rodada!");
            }
            
            //
            
            if(vitorias == 5){
                JOptionPane.showMessageDialog(null, "Voce ganhou o jogo!");
                resetar();
                vitorias = 0;
                derrotas = 0;
            }
            if(derrotas==5){
                JOptionPane.showMessageDialog(null, "Voce perdeu o jogo!");
                resetar();
                vitorias = 0;
                derrotas = 0;
            }
            
            if(jogada==5){
                if(jogador.getVida()< boss.getVida()){
                JOptionPane.showMessageDialog(null, "Voce perdeu o jogo!");
                resetar();
                derrotas++;
                jogada = 0;
                resetar();
                }
                else if(jogador.getVida()> boss.getVida()){
                  JOptionPane.showMessageDialog(null, "Voce ganhou o jogo!");
                  vitorias++;
                  jogada = 0;
                  resetar();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Empate!!!");
                    jogada = 0;
                    resetar();
                }
            }
    }
    
    public void resetar(){
        
            jButton6.setEnabled(true);
            jButton5.setEnabled(true);
            jButton4.setEnabled(true);
            jButton3.setEnabled(true);
            jButton2.setEnabled(true);
            
            carta001.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            carta002.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CartaBase.png")));
            Vida1.setText("I I I I I I I I I I");
            Vida2.setText("I I I I I I I I I I");

            
            boss.setVida(10);
            jogador.setVida(10);
            conferir();
            
            sortearCartas();
              
    }
    
    public void somCarta(){
           try {

        AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource("/tick.wav"));

        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();

    } catch (Exception e) {

        System.out.println("Erro ");
        e.printStackTrace();

    }
    }

    public void trilhaGame(){
        
        try{
            AudioInputStream musica = AudioSystem.getAudioInputStream(getClass().getResource("/trilha.wav"));
            trilha = AudioSystem.getClip();
            trilha.open(musica);
            trilha.loop(Clip.LOOP_CONTINUOUSLY);
            trilha.start();
        }
        catch (Exception e){
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acoes;
    private javax.swing.JLabel Acoes1;
    private javax.swing.JLabel Acoes2;
    private javax.swing.JLabel Acoes3;
    private javax.swing.JLabel Vida1;
    private javax.swing.JLabel Vida2;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel carta001;
    private javax.swing.JLabel carta002;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel textos;
    // End of variables declaration//GEN-END:variables
}
