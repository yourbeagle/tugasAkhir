/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Realfi
 */
public class landingpage extends javax.swing.JFrame {
Connection con;
Statement stm;
PreparedStatement pst;
ResultSet rs;
    /**
     * Creates new form landing page
     */
    public landingpage() {
        initComponents();
        
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
        jLabel1 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnMhwa = new javax.swing.JMenu();
        mnKelas = new javax.swing.JMenu();
        mnDosen = new javax.swing.JMenu();
        mnMatakuliah = new javax.swing.JMenu();
        mnWisuda = new javax.swing.JMenu();
        mnLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 216, 176));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.-cover (Custom).jpg"))); // NOI18N

        lbUser.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        lbUser.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/STIKI3.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rsz_img_1645 (Custom).jpg"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(235, 216, 176));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pmb (Custom).jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel4.setText("Wellcome, ");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("IT Profesional Start Here");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setText("STIKI Malang, ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(152, 152, 152))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 168, 82));
        jMenuBar2.setForeground(new java.awt.Color(255, 168, 82));

        mnMhwa.setBackground(new java.awt.Color(255, 168, 82));
        mnMhwa.setText("Mahasiswa");
        mnMhwa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnMhwaMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnMhwa);

        mnKelas.setBackground(new java.awt.Color(255, 168, 82));
        mnKelas.setText("Kelas");
        mnKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnKelasMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnKelas);

        mnDosen.setBackground(new java.awt.Color(255, 168, 82));
        mnDosen.setText("Dosen");
        mnDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDosenMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnDosen);

        mnMatakuliah.setBackground(new java.awt.Color(255, 168, 82));
        mnMatakuliah.setText("Matakuliah");
        mnMatakuliah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnMatakuliahMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnMatakuliah);

        mnWisuda.setText("Pendaftaran Wisuda");
        mnWisuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnWisudaMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnWisuda);

        mnLogout.setText("Logout");
        mnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLogoutMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnLogout);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       // ceklogin();
    }//GEN-LAST:event_formWindowActivated

    private void mnKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKelasMouseClicked
        this.dispose();
        Kelas lp = new Kelas();
        lp.setVisible(true);
    }//GEN-LAST:event_mnKelasMouseClicked

    private void mnDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDosenMouseClicked
        this.dispose();
        dosen lp = new dosen();
        lp.setVisible(true);
    }//GEN-LAST:event_mnDosenMouseClicked

    private void mnMatakuliahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnMatakuliahMouseClicked
        this.dispose();
        matakuliah lp = new matakuliah();
        lp.setVisible(true);
    }//GEN-LAST:event_mnMatakuliahMouseClicked

    private void mnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLogoutMouseClicked
        this.dispose();
        lbUser.setText("");
        login lp = new login();
        lp.setVisible(true);
    }//GEN-LAST:event_mnLogoutMouseClicked

    private void mnMhwaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnMhwaMouseClicked
        // TODO add your handling code here:
        this.dispose();
        mahasiswa mhw = new mahasiswa();
        mhw.setVisible(true);
    }//GEN-LAST:event_mnMhwaMouseClicked

    private void mnWisudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnWisudaMouseClicked
        this.dispose();
        isipendaftaran mhw = new isipendaftaran();
        mhw.setVisible(true);
    }//GEN-LAST:event_mnWisudaMouseClicked

    
    /**
     * @param args the command line arguments
     */
    
    public void ceklogin()
    {
        String sql = "select * from admin where nmAdmin=? ";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);
            String name = lbUser.getText();
            pst.setString(1, name);
            rs = pst.executeQuery();
            if(rs.next())
            {
                this.setVisible(true);
            }
            else{
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(landingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbUser;
    private javax.swing.JMenu mnDosen;
    private javax.swing.JMenu mnKelas;
    private javax.swing.JMenu mnLogout;
    private javax.swing.JMenu mnMatakuliah;
    private javax.swing.JMenu mnMhwa;
    private javax.swing.JMenu mnWisuda;
    // End of variables declaration//GEN-END:variables
}
