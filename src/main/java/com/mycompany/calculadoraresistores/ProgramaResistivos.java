/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadoraresistores;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ProgramaResistivos extends javax.swing.JFrame {
CardLayout cardLayout;
public NTCResultados Rntc;
public RTDResultados Rrtd;
    /**
     * Creates new form CalculoNTC
     */
public ProgramaResistivos() {
        initComponents();
        URL imgURL = getClass().getResource("/img/h2.png");
        if(imgURL != null) {
            ImageIcon icono = new ImageIcon(imgURL);
            jMENU.setIcon(icono);
        } else {
            System.err.println("Error: No se encontró la imagen.");
        }
        
        URL imgURL2 = getClass().getResource("/img/ntcc.png");
        if(imgURL2 != null) {
            ImageIcon icono = new ImageIcon(imgURL2);
            ButtonInicio.setIcon(icono);
        } else {
            System.err.println("Error: No se encontró la imagen.");
        }
        
        URL imgURL3 = getClass().getResource("/img/rtd.png");
        if(imgURL3 != null) {
            ImageIcon icono = new ImageIcon(imgURL3);
            btnRTD.setIcon(icono);
        } else {
            System.err.println("Error: No se encontró la imagen.");
        }
        
        cardLayout = new CardLayout();  // Inicializa CardLayout
        content.setLayout(cardLayout);  // Asigna CardLayout al contenedor
       
        // Crear paneles y agregar al contenedor
        CalculadoraNTC Cntc = new CalculadoraNTC(this);
        Rntc = new NTCResultados(this);
        CalculadoraRTD Crtd = new CalculadoraRTD(this);
        Rrtd = new RTDResultados(this);
        
        content.add(Cntc, "CalculadoraNTC");
        content.add(Rntc, "NTCResultados");
        content.add(Crtd, "CalculadoraRTD");
        content.add(Rrtd, "RTDResultados");        
                  
        cardLayout.show(content, "NTCGrafica"); // Muestra el primer panel
    }
    
    // Método para cambiar de panel
    public void showPanel(String panelName) {
        cardLayout.show(content, panelName);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        btnRTD = new javax.swing.JButton();
        ButtonInicio = new javax.swing.JButton();
        jMENU = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(java.awt.SystemColor.activeCaption);
        Menu.setForeground(new java.awt.Color(0, 102, 102));
        Menu.setPreferredSize(new java.awt.Dimension(140, 600));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRTD.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnRTD.setForeground(new java.awt.Color(255, 255, 255));
        btnRTD.setText("RTD");
        btnRTD.setBorderPainted(false);
        btnRTD.setContentAreaFilled(false);
        btnRTD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRTD.setVerifyInputWhenFocusTarget(false);
        btnRTD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRTD.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnRTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRTDActionPerformed(evt);
            }
        });
        Menu.add(btnRTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 120, 110));

        ButtonInicio.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        ButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInicio.setText("NTC");
        ButtonInicio.setBorderPainted(false);
        ButtonInicio.setContentAreaFilled(false);
        ButtonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonInicio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ButtonInicio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInicioActionPerformed(evt);
            }
        });
        Menu.add(ButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 120, 100));

        jMENU.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jMENU.setForeground(new java.awt.Color(255, 255, 255));
        jMENU.setText("MENU");
        jMENU.setBorder(null);
        jMENU.setBorderPainted(false);
        jMENU.setContentAreaFilled(false);
        jMENU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMENU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jMENU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Menu.add(jMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 90));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 900));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(230, 520));
        content.setLayout(new java.awt.CardLayout());
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 430, 1400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        setSize(new java.awt.Dimension(565, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInicioActionPerformed
        showPanel("CalculadoraNTC");
    }//GEN-LAST:event_ButtonInicioActionPerformed

    private void btnRTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRTDActionPerformed
        showPanel("CalculadoraRTD"); // Cambia al panel NTCResultados
    }//GEN-LAST:event_btnRTDActionPerformed


    /**
     * @param args the command line arguments-Ñ
     */
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
            java.util.logging.Logger.getLogger(ProgramaResistivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaResistivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaResistivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaResistivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgramaResistivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonInicio;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnRTD;
    private javax.swing.JPanel content;
    private javax.swing.JButton jMENU;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
