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
public class updateHarga extends javax.swing.JFrame {

    /**
     * Creates new form isiTanki
     */
    public updateHarga() {
        initComponents();
    }
    
    public JTextField getHargaField(){
        
        return txtInputHarga;
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
        txtInputHarga = new javax.swing.JTextField();
        btn_update_harga = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(44, 148, 230));

        Label_nama_keuntungan4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Label_nama_keuntungan4.setForeground(new java.awt.Color(255, 255, 255));
        Label_nama_keuntungan4.setText("Ubah Harga Per Galon");

        txtInputHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputHargaActionPerformed(evt);
            }
        });
        txtInputHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputHargaKeyTyped(evt);
            }
        });

        btn_update_harga.setText("Ubah");
        btn_update_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_update_harga)
                            .addComponent(txtInputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Label_nama_keuntungan4)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Label_nama_keuntungan4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update_harga)
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

    private void txtInputHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputHargaActionPerformed

    private void btn_update_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_hargaActionPerformed
            // TODO add your handling code here:
        
        getHargaField();
        PenjualanVIew penjualan = new PenjualanVIew();
        penjualan.updateHarga(getHargaField().getText());
        this.setVisible(false);
    }//GEN-LAST:event_btn_update_hargaActionPerformed

    private void txtInputHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputHargaKeyTyped
        // TODO add your handling code here:
         char ketikan = evt.getKeyChar();
        if (!(Character.isDigit(ketikan))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInputHargaKeyTyped
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_nama_keuntungan4;
    private javax.swing.JButton btn_update_harga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtInputHarga;
    // End of variables declaration//GEN-END:variables
}