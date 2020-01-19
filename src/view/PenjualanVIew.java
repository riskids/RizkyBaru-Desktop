/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Canvas;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import controller.PenjualanController;
import database.RizkyBaruDatabase;
import static database.RizkyBaruDatabase.getConnection;
import entity.Penjualan;
import error.PenjualanException;
import event.PenjualanListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import model.PenjualanModel;
import model.TabelPenjualanModel;
import service.PenjualanDao;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Rizki Adam Kurniawan
 */
public class PenjualanVIew extends javax.swing.JPanel implements PenjualanListener, ListSelectionListener {

    private TabelPenjualanModel tabelModel;
    private PenjualanModel model;
    private PenjualanController controller;
    private Object jLabel;

    public PenjualanVIew() {
        tabelModel = new TabelPenjualanModel();

        model = new PenjualanModel();
        model.setListener(this);

        controller = new PenjualanController();
        controller.setModel(model);

        initComponents();
        tablePenjualan.getSelectionModel().addListSelectionListener(this);

        tablePenjualan.setModel(tabelModel);
        
        tampilUntung();
        
        txtTgl.setVisible(false);
        
       
    }

    public JTable getTablePenjualan() {
        return tablePenjualan;
    }

    public JTextField getTxtGalon() {
        return txtGalon;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtTgl() {
        return txtTgl;
    }

    public JTextField getTxtJumlah() {
        return txtJumlah;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        PanelUtama = new javax.swing.JPanel();
        PanelUntungBulan = new javax.swing.JPanel();
        Label_tampiUntung = new javax.swing.JLabel();
        Label_nama_keuntungan = new javax.swing.JLabel();
        Label_tampiUntung2 = new javax.swing.JLabel();
        PanelUntungBulan1 = new javax.swing.JPanel();
        Label_tampiUntung1 = new javax.swing.JLabel();
        Label_nama_keuntungan1 = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        txtTgl = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtGalon = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Label_nama_keuntungan2 = new javax.swing.JLabel();
        tanggal = new org.jdesktop.swingx.JXDatePicker();
        PanelTabel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenjualan = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        Label_nama_keuntungan3 = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        Label_nama_keuntungan4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(542, 448));

        PanelUtama.setBackground(new java.awt.Color(219, 236, 248));

        PanelUntungBulan.setBackground(new java.awt.Color(255, 255, 255));

        Label_tampiUntung.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Label_tampiUntung.setText("tampiluntung()");
        Label_tampiUntung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_tampiUntungMouseClicked(evt);
            }
        });
        Label_tampiUntung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Label_tampiUntungKeyPressed(evt);
            }
        });

        Label_nama_keuntungan.setText("Keuntungan Bulan Ini");

        Label_tampiUntung2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Label_tampiUntung2.setText("Rp.");
        Label_tampiUntung2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_tampiUntung2MouseClicked(evt);
            }
        });
        Label_tampiUntung2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Label_tampiUntung2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelUntungBulanLayout = new javax.swing.GroupLayout(PanelUntungBulan);
        PanelUntungBulan.setLayout(PanelUntungBulanLayout);
        PanelUntungBulanLayout.setHorizontalGroup(
            PanelUntungBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUntungBulanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUntungBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUntungBulanLayout.createSequentialGroup()
                        .addComponent(Label_nama_keuntungan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelUntungBulanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Label_tampiUntung2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_tampiUntung)
                        .addGap(48, 48, 48))))
        );
        PanelUntungBulanLayout.setVerticalGroup(
            PanelUntungBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUntungBulanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_nama_keuntungan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelUntungBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_tampiUntung, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_tampiUntung2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        PanelUntungBulan1.setBackground(new java.awt.Color(255, 255, 255));

        Label_tampiUntung1.setText("tampiluntung()");
        Label_tampiUntung1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_tampiUntung1MouseClicked(evt);
            }
        });
        Label_tampiUntung1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Label_tampiUntung1KeyPressed(evt);
            }
        });

        Label_nama_keuntungan1.setText("Keuntungan Bulan Ini");

        javax.swing.GroupLayout PanelUntungBulan1Layout = new javax.swing.GroupLayout(PanelUntungBulan1);
        PanelUntungBulan1.setLayout(PanelUntungBulan1Layout);
        PanelUntungBulan1Layout.setHorizontalGroup(
            PanelUntungBulan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUntungBulan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_nama_keuntungan1)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUntungBulan1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_tampiUntung1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelUntungBulan1Layout.setVerticalGroup(
            PanelUntungBulan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUntungBulan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_nama_keuntungan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Label_tampiUntung1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        PanelInput.setBackground(new java.awt.Color(255, 255, 255));
        PanelInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        PanelInput.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        PanelInput.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        txtTgl.setEditable(false);
        txtTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglActionPerformed(evt);
            }
        });
        PanelInput.add(txtTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 30, -1));

        txtJumlah.setEditable(false);
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });
        PanelInput.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 242, 23));

        txtGalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGalonActionPerformed(evt);
            }
        });
        txtGalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGalonKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGalonKeyTyped(evt);
            }
        });
        PanelInput.add(txtGalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 242, 23));

        txtId.setEditable(false);
        PanelInput.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 121, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ID :");
        PanelInput.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 101, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tgl :");
        PanelInput.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 101, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Jumlah Galon:");
        PanelInput.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 101, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Jumlah :");
        PanelInput.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 101, -1));

        Label_nama_keuntungan2.setText("Ubah Data Penjualan");
        PanelInput.add(Label_nama_keuntungan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        tanggal.setName(""); // NOI18N
        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });
        PanelInput.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 240, 23));

        PanelTabel.setBackground(new java.awt.Color(255, 255, 255));

        tablePenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "null"
            }
        ));
        jScrollPane1.setViewportView(tablePenjualan);
        if (tablePenjualan.getColumnModel().getColumnCount() > 0) {
            tablePenjualan.getColumnModel().getColumn(0).setPreferredWidth(12);
        }

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        Label_nama_keuntungan3.setText("Tabel Penjualan");

        javax.swing.GroupLayout PanelTabelLayout = new javax.swing.GroupLayout(PanelTabel);
        PanelTabel.setLayout(PanelTabelLayout);
        PanelTabelLayout.setHorizontalGroup(
            PanelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTabelLayout.createSequentialGroup()
                .addGroup(PanelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTabelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHapus)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelTabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_nama_keuntungan3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelTabelLayout.setVerticalGroup(
            PanelTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_nama_keuntungan3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapus)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout PanelUtamaLayout = new javax.swing.GroupLayout(PanelUtama);
        PanelUtama.setLayout(PanelUtamaLayout);
        PanelUtamaLayout.setHorizontalGroup(
            PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUtamaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUtamaLayout.createSequentialGroup()
                        .addComponent(PanelUntungBulan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelUntungBulan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        PanelUtamaLayout.setVerticalGroup(
            PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUtamaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelUntungBulan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelUntungBulan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(PanelUtama);

        PanelMenu.setBackground(new java.awt.Color(44, 148, 230));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_nama_keuntungan4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Label_nama_keuntungan4.setForeground(new java.awt.Color(255, 255, 255));
        Label_nama_keuntungan4.setText("RizkyBaru");
        PanelMenu.add(Label_nama_keuntungan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        PanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Input Penjualan");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        PanelMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 253, 170, 26));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ubah Harga");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        PanelMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 307, 167, 26));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Beranda");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setContentAreaFilled(false);
        PanelMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 199, 167, 26));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Beli Air Tangki");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        PanelMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 361, 167, 26));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Logout");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setContentAreaFilled(false);
        PanelMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 167, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        controller.deletePenjualan(this);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void Label_tampiUntungKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Label_tampiUntungKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Label_tampiUntungKeyPressed

    private void Label_tampiUntungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_tampiUntungMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Label_tampiUntungMouseClicked

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // TODO add your handling code here:
        char ketikan = evt.getKeyChar();
        if (!(Character.isDigit(ketikan))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtGalonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGalonKeyTyped
        // TODO add your handling code here:
        char ketikan = evt.getKeyChar();
        if (!(Character.isDigit(ketikan))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtGalonKeyTyped

    private void txtGalonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGalonKeyReleased
        // TODO add your handling code here:
        Integer ketikGalon,jumlah;
        Integer hargaGalon = 3500;

        ketikGalon = Integer.parseInt(txtGalon.getText());
        jumlah = ketikGalon * hargaGalon;
        txtJumlah.setText(Integer.toString(jumlah));
    }//GEN-LAST:event_txtGalonKeyReleased

    private void txtGalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGalonActionPerformed

    private void txtTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
        Calendar cals = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tanggal.setFormats(dateFormat);
        DateFormat sysDate = new SimpleDateFormat("yyyy-MM-dd");
        String date_to_store = sysDate.format(tanggal.getDate());
        txtTgl.setText(date_to_store);
    }//GEN-LAST:event_tanggalActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        controller.insertPenjualan(this);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        controller.updatePenjualan(this);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void Label_tampiUntung1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_tampiUntung1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_tampiUntung1MouseClicked

    private void Label_tampiUntung1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Label_tampiUntung1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_tampiUntung1KeyPressed

    private void Label_tampiUntung2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_tampiUntung2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_tampiUntung2MouseClicked

    private void Label_tampiUntung2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Label_tampiUntung2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_tampiUntung2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_nama_keuntungan;
    private javax.swing.JLabel Label_nama_keuntungan1;
    private javax.swing.JLabel Label_nama_keuntungan2;
    private javax.swing.JLabel Label_nama_keuntungan3;
    private javax.swing.JLabel Label_nama_keuntungan4;
    private javax.swing.JLabel Label_tampiUntung;
    private javax.swing.JLabel Label_tampiUntung1;
    private javax.swing.JLabel Label_tampiUntung2;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelTabel;
    private javax.swing.JPanel PanelUntungBulan;
    private javax.swing.JPanel PanelUntungBulan1;
    private javax.swing.JPanel PanelUtama;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePenjualan;
    private org.jdesktop.swingx.JXDatePicker tanggal;
    private javax.swing.JTextField txtGalon;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtTgl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(PenjualanModel model) {
        txtId.setText(model.getId() + "");
        txtTgl.setText(String.valueOf(model.getTgl()));
        txtGalon.setText(String.valueOf(model.getGalon()));
        txtJumlah.setText(String.valueOf(model.getJumlah()));
    }

    @Override
    public void onInsert(Penjualan Penjualan) {

        tabelModel.add(Penjualan);
    }

    @Override
    public void onUpdate(Penjualan Penjualan) {
        int index = tablePenjualan.getSelectedRow();
        tabelModel.set(index, Penjualan);

    }

    @Override
    public void onDelete() {
        int index = tablePenjualan.getSelectedRow();
        tabelModel.remove(index);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            Penjualan model = tabelModel.get(tablePenjualan.getSelectedRow());
            txtId.setText(model.getId() + "");
            txtTgl.setText(model.getTgl());
            txtTgl.setText(String.valueOf(model.getTgl()));
            txtGalon.setText(String.valueOf(model.getGalon()));
            txtJumlah.setText(String.valueOf(model.getJumlah()));
        } catch (IndexOutOfBoundsException exception) {
        }

    }

    public void loadDatabase() throws SQLException, PenjualanException {
        PenjualanDao dao = RizkyBaruDatabase.getPenjualanDao();
        tabelModel.setList(dao.selectAllPenjualan());
    }

    private String format(JXDatePicker tanggal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
private Connection con;


    private void tampilUntung() {
        
        this.con=con;
        String selectUntung = "SELECT SUM(Jumlah) FROM `Penjualan` WHERE Tgl LIKE '"+ hariIni()+"%' " ;
        Statement statement = null;
        String untung;
        try {
            
            statement = getConnection().createStatement();

            ResultSet result = statement.executeQuery(selectUntung);
            result.next();
            untung = result.getString("SUM(Jumlah)");
            
            Label_tampiUntung.setText(untung);
        } 
        
        
        catch (SQLException exception) {
            showMessageDialog(null, exception);
            
        }

    }

    private String hariIni() {
        Calendar cals = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM");
       
        String hari_ini = formater.format(cals.getTime());
        return hari_ini;
    }
}

