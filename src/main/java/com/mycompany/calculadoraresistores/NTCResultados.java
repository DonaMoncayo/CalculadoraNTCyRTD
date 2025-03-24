/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.calculadoraresistores;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class NTCResultados extends javax.swing.JPanel {
private ProgramaResistivos parent;
     
    public NTCResultados(ProgramaResistivos parent) {
        
        initComponents();  
        this.parent = parent;  // Guarda referencia del JFrame
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Vo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        jjj = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ntc0 = new javax.swing.JLabel();
        ntc100 = new javax.swing.JLabel();
        btnRegresa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jVi = new javax.swing.JLabel();
        jVin = new javax.swing.JLabel();
        jR22 = new javax.swing.JLabel();
        jR33 = new javax.swing.JLabel();
        jR1 = new javax.swing.JLabel();
        jR3 = new javax.swing.JLabel();
        jR2 = new javax.swing.JLabel();
        jRNTC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jntc0 = new javax.swing.JLabel();
        jntc100 = new javax.swing.JLabel();

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vin");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 120, 37, 30);

        Vo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Vo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Vo);
        Vo.setBounds(60, 150, 80, 30);

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("R1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 50, 130, 30);

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("R3");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 190, 120, 25);

        R2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        R2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R2);
        R2.setBounds(290, 80, 100, 30);

        jjj.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jjj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jjj.setText("R2");
        jPanel1.add(jjj);
        jjj.setBounds(280, 50, 120, 30);

        R1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        R1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R1);
        R1.setBounds(160, 80, 100, 30);

        R3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        R3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(R3);
        R3.setBounds(160, 220, 100, 30);

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NTC");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 130, 130, 50);

        ntc0.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ntc0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ntc0);
        ntc0.setBounds(280, 190, 90, 30);

        ntc100.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ntc100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ntc100);
        ntc100.setBounds(280, 220, 90, 30);

        btnRegresa.setBackground(new java.awt.Color(190, 213, 235));
        btnRegresa.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnRegresa.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresa.setText("Regresar");
        btnRegresa.setBorderPainted(false);
        btnRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresa);
        btnRegresa.setBounds(290, 320, 110, 42);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados NTC", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Candara Light", 1, 18))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Voltaje de alimentación del circuito:");

        jVi.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jVi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jVin.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jVin.setText("El valor de la resistencia R1 es:");

        jR22.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jR22.setText("El valor de la resistencia R2 es:");

        jR33.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jR33.setText("El valor de la resistencia R3 es:");

        jR1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jR3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jR3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jR2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        jR2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jRNTC.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRNTC.setText("El valor de NTC a 0°C es:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("El valor de NTC a 100°C es:");

        jntc0.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jntc0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jntc0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jntc100.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jntc100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jntc100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jVin)
                    .addComponent(jR22, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jR33, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRNTC, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jntc0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jntc100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jR3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jVin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jR22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jR33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jR1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jR3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jR2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jntc0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRNTC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jntc100, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48))))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        parent.showPanel("CalculadoraRTD");
    }//GEN-LAST:event_btnRegresaActionPerformed

    public void setResultado(Float vi, Float r1, Float r2, Float r3, Float ntc1, Float ntc2) {
        Vo.setText(String.format("%.0f V", vi));
        jVi.setText(String.format("%.0f V", vi));
        R1.setText(String.format("%.0f Ω", r1));
        jR1.setText(String.format("%.0f Ω", r1));
        R2.setText(String.format("%.0f Ω", r2));
        jR2.setText(String.format("%.0f Ω", r3));
        R3.setText(String.format("%.0f Ω", r3));
        jR3.setText(String.format("%.0f Ω", r2));
        ntc0.setText(String.format("%.0f Ω", ntc1));
        jntc0.setText(String.format("%.0f Ω", ntc1)); 
        ntc100.setText(String.format("%.0f Ω", ntc2));
        jntc100.setText(String.format("%.0f Ω", ntc2)); 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel Vo;
    private javax.swing.JButton btnRegresa;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jR1;
    private javax.swing.JLabel jR2;
    private javax.swing.JLabel jR22;
    private javax.swing.JLabel jR3;
    private javax.swing.JLabel jR33;
    private javax.swing.JLabel jRNTC;
    private javax.swing.JLabel jVi;
    private javax.swing.JLabel jVin;
    private javax.swing.JLabel jjj;
    private javax.swing.JLabel jntc0;
    private javax.swing.JLabel jntc100;
    private javax.swing.JLabel ntc0;
    private javax.swing.JLabel ntc100;
    // End of variables declaration//GEN-END:variables

}
