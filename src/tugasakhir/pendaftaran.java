/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Realfi
 */
public class pendaftaran extends javax.swing.JFrame {
    JFileChooser jfc;
    File file;
    Connection con;
    PreparedStatement pst;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form pendaftaran
     */
    public pendaftaran() {
        initComponents();
        cekcok();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        showname = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNamaMhs = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbNrpMhs = new javax.swing.JLabel();
        lbDospenMhs = new javax.swing.JLabel();
        lbIpkMhs = new javax.swing.JLabel();
        lbProdiMhs = new javax.swing.JLabel();
        lbJudulMhs = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbnrp = new javax.swing.JLabel();
        lbPhoto = new javax.swing.JLabel();
        isifoto = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBackS4 = new javax.swing.JButton();
        lbImage = new javax.swing.JLabel();
        btnPilih = new javax.swing.JButton();
        cek = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbNamaMhsCek = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbNrpMhsCek = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbStatusMhsCek = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        lbImageMhs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        root.setLayout(new java.awt.CardLayout());

        showname.setBackground(new java.awt.Color(172, 226, 219));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 44)); // NOI18N
        jLabel2.setText("PENDAFTARAN WISUDA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama");

        lbNamaMhs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNamaMhs.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("NRP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Prodi");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Dosen Pembimbing");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("IPK");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Judul TA");

        lbNrpMhs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNrpMhs.setText("Nama");

        lbDospenMhs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDospenMhs.setText("Nama");

        lbIpkMhs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbIpkMhs.setText("Nama");

        lbProdiMhs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbProdiMhs.setText("Nama");

        lbJudulMhs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbJudulMhs.setText("Nama");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbnrp.setText("jLabel25");

        lbPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout shownameLayout = new javax.swing.GroupLayout(showname);
        showname.setLayout(shownameLayout);
        shownameLayout.setHorizontalGroup(
            shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shownameLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(lbnrp))
                .addGap(56, 56, 56)
                .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shownameLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(289, Short.MAX_VALUE))
                    .addGroup(shownameLayout.createSequentialGroup()
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJudulMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIpkMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDospenMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNrpMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdiMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shownameLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        shownameLayout.setVerticalGroup(
            shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shownameLayout.createSequentialGroup()
                .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shownameLayout.createSequentialGroup()
                        .addContainerGap(70, Short.MAX_VALUE)
                        .addComponent(lbnrp)
                        .addGap(28, 28, 28)
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbNamaMhs))
                        .addGap(32, 32, 32)
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbNrpMhs))
                        .addGap(37, 37, 37)
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbProdiMhs))
                        .addGap(32, 32, 32)
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbDospenMhs))
                        .addGap(31, 31, 31)
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbIpkMhs))
                        .addGap(39, 39, 39)
                        .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJudulMhs)
                            .addComponent(jLabel9))
                        .addGap(81, 81, 81))
                    .addGroup(shownameLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(lbPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(shownameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        root.add(showname, "showName");

        isifoto.setBackground(new java.awt.Color(172, 226, 219));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel21.setText("Bukti Pembayaran Wisuda");

        txtFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Finish");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBackS4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBackS4.setText("Back");
        btnBackS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackS4ActionPerformed(evt);
            }
        });

        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnPilih.setText("Pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isifotoLayout = new javax.swing.GroupLayout(isifoto);
        isifoto.setLayout(isifotoLayout);
        isifotoLayout.setHorizontalGroup(
            isifotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isifotoLayout.createSequentialGroup()
                .addGroup(isifotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isifotoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel21))
                    .addGroup(isifotoLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(isifotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isifotoLayout.createSequentialGroup()
                                .addComponent(txtFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(isifotoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnBackS4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        isifotoLayout.setVerticalGroup(
            isifotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isifotoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel21)
                .addGap(57, 57, 57)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(isifotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(isifotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackS4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        root.add(isifoto, "isiFoto");

        cek.setBackground(new java.awt.Color(172, 226, 219));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nama");

        lbNamaMhsCek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNamaMhsCek.setText("Nama");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("NRP");

        lbNrpMhsCek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNrpMhsCek.setText("Nama");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Status");

        lbStatusMhsCek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbStatusMhsCek.setText("belum/diterima/pending");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 44)); // NOI18N
        jLabel23.setText("CEK WISUDA");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel24.setText("*jika ada kesalahan input siklakan hubungi admin");

        lbImageMhs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout cekLayout = new javax.swing.GroupLayout(cek);
        cek.setLayout(cekLayout);
        cekLayout.setHorizontalGroup(
            cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cekLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cekLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cekLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(81, 81, 81)
                                .addComponent(lbNrpMhsCek, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cekLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(69, 69, 69)
                                .addComponent(lbNamaMhsCek, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(cekLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbStatusMhsCek, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(lbImageMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cekLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        cekLayout.setVerticalGroup(
            cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cekLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel23)
                .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cekLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNamaMhsCek)
                            .addComponent(jLabel16))
                        .addGap(32, 32, 32)
                        .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNrpMhsCek)
                            .addComponent(jLabel18))
                        .addGap(27, 27, 27)
                        .addGroup(cekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lbStatusMhsCek))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cekLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbImageMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        root.add(cek, "cekWisuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ikicekdatacok()
    {
        String sql = "select namamhs,nrp,status,foto from pendaftaran where nrp=?";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);
            pst.setString(1, lbnrp.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                String nama, nrp, status, foto;
                nama = rs.getString("namamhs");
                nrp = rs.getString("nrp");
                status = rs.getString("status");
                foto = rs.getString("foto");
                lbNamaMhsCek.setText(nama);
                lbNrpMhsCek.setText(nrp);
                lbStatusMhsCek.setText(status);
                try {
                    Toolkit toolkit=Toolkit.getDefaultToolkit();

                    String path=new File(".").getCanonicalPath();
                    Image image=toolkit.getImage(path+"/image/"+foto); 
                    Image imagedResized=image.getScaledInstance(lbImageMhs.getWidth(), lbImageMhs.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon icon=new ImageIcon(imagedResized);
                    lbImageMhs.setIcon(icon); 
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }
    
    public void cekcok()
    {
        String sql = "select status,buktipembayaran from pendaftaran where nrp =?";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);
            pst.setString(1, lbnrp.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                if(rs.getString("status") == null && rs.getString("buktipembayaran") == null)
                {
                    CardLayout cl = (CardLayout) root.getLayout();
                    cl.show(root,"showName");
                }
                else if(rs.getString("status") != null && rs.getString("buktipembayaran") != null)
                {
                    CardLayout cl = (CardLayout) root.getLayout();
                    cl.show(root,"cekWisuda");
                }
            }
        } catch (Exception e) {
        }
    }
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String sql = "update pendaftaran set buktipembayaran=?, status=? where nrp =?";
        try {
           CardLayout cl = (CardLayout) root.getLayout();
           con = config.configDB();
           pst = con.prepareStatement(sql);
           pst.setString(1, txtFile.getText());
           pst.setString(2, "Pending");
           pst.setString(3, lbNrpMhs.getText());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Berhasil Input Data");
           String path = new File(".").getCanonicalPath();
           FileUtils.copyFileToDirectory(file, new File(path+"/image"));
           cl.show(root, "cekWisuda");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackS4ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "showName");
    }//GEN-LAST:event_btnBackS4ActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        // TODO add your handling code here:
        jfc = new JFileChooser();
        if (jfc.showOpenDialog(lbImage) == JFileChooser.APPROVE_OPTION)
        {
            Toolkit tk = Toolkit.getDefaultToolkit();
            Image img = tk.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imgRsz = img.getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon imgIcon = new ImageIcon(imgRsz);

            lbImage.setIcon(imgIcon);
            txtFile.setText(jfc.getSelectedFile().getName());
            file = new File(jfc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnPilihActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        cekcok();
        ikicekdatacok();
        String sql = "select * from pendaftaran where nrp=?";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);
            pst.setString(1, lbnrp.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                String nama,nrp,prodi,dospen,ipk,judul, foto;
                nama = rs.getString("namamhs");
                nrp = rs.getString("nrp");
                prodi = rs.getString("prodi");
                dospen = rs.getString("namadosen");
                ipk = rs.getString("ipk");
                judul = rs.getString("judul");
                foto = rs.getString("foto");
                lbNamaMhs.setText(nama);
                lbNrpMhs.setText(nrp);
                lbProdiMhs.setText(prodi);
                lbDospenMhs.setText(dospen);
                lbIpkMhs.setText(ipk);
                lbJudulMhs.setText(judul);
                try {
                    Toolkit toolkit=Toolkit.getDefaultToolkit();

                    String path=new File(".").getCanonicalPath();
                    Image image=toolkit.getImage(path+"/image/"+foto); 
                    Image imagedResized=image.getScaledInstance(lbPhoto.getWidth(), lbPhoto.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon icon=new ImageIcon(imagedResized);
                    lbPhoto.setIcon(icon); 
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "isiFoto");
    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        login lp = new login();
        lp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        login lp = new login();
        lp.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackS4;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel cek;
    private javax.swing.JPanel isifoto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDospenMhs;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbImageMhs;
    private javax.swing.JLabel lbIpkMhs;
    private javax.swing.JLabel lbJudulMhs;
    private javax.swing.JLabel lbNamaMhs;
    private javax.swing.JLabel lbNamaMhsCek;
    private javax.swing.JLabel lbNrpMhs;
    private javax.swing.JLabel lbNrpMhsCek;
    private javax.swing.JLabel lbPhoto;
    private javax.swing.JLabel lbProdiMhs;
    private javax.swing.JLabel lbStatusMhsCek;
    public static javax.swing.JLabel lbnrp;
    private javax.swing.JPanel root;
    private javax.swing.JPanel showname;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
}