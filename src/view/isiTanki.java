/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTextField;
import view.PenjualanVIew;
/**
 *
 * @author Riski Dwi
 */
public class isiTanki extends javax.swing.JFrame {

    /**
     * Creates new form isiTanki
     */
    public isiTanki() {
        initComponents();
    }
    
    public JTextField getTankiField(){
        
        return txtInputTanki;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_nama_keuntungan4 = new javax.swing.JLabel();
        txtInputTanki = new javax.swing.JTextField();
        btn_simpan_Tanki = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        Label_nama_keuntungan4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Label_nama_keuntungan4.setForeground(new java.awt.Color(255, 255, 255));
        Label_nama_keuntungan4.setText("Masukan Harga Air Per Tanki");

        txtInputTanki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputTankiActionPerformed(evt);
            }
        });
        txtInputTanki.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputTankiKeyTyped(evt);
            }
        });

        btn_simpan_Tanki.setText("Simpan");
        btn_simpan_Tanki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpan_TankiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(Label_nama_keuntungan4)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_simpan_Tanki)
                    .addComponent(txtInputTanki, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Label_nama_keuntungan4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtInputTanki, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_simpan_Tanki)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputTankiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputTankiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputTankiActionPerformed

    private void btn_simpan_TankiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan_TankiActionPerformed
            // TODO add your handling code here:
        
        getTankiField();
        PenjualanVIew penjualan = new PenjualanVIew();
        penjualan.isiTanki(getTankiField().getText());
    }//GEN-LAST:event_btn_simpan_TankiActionPerformed

    private void txtInputTankiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputTankiKeyTyped
        // TODO add your handling code here:
         char ketikan = evt.getKeyChar();
        if (!(Character.isDigit(ketikan))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInputTankiKeyTyped
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_nama_keuntungan4;
    private javax.swing.JButton btn_simpan_Tanki;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtInputTanki;
    // End of variables declaration//GEN-END:variables
}
