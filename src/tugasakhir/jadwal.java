/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
import java.awt.CardLayout;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Realfi
 */
public class jadwal extends javax.swing.JFrame {
String periode,kdmatkul,nmmatkul,waktu,ruang,pengajar,kelas,tglAwal,tglAkhir,tanggal;
Connection con;
PreparedStatement pst;
Statement stm;
ResultSet rs;
SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
    /**
     * Creates new form jadwal
     */
    public jadwal() {
        initComponents();
        cbMatkul();
        cbKelas();
        cbPengajar();
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
        menutama = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnInputLp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Step1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbPeriode = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbKdMatkul = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbNmMatkul = new javax.swing.JComboBox<>();
        btnNextSt1 = new javax.swing.JButton();
        btnBackMenu = new javax.swing.JButton();
        jdcAwal = new com.toedter.calendar.JDateChooser();
        jdcAkhir = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        Step2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbKelas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbWaktu = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbRuang = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbPengajar = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnBackSt2 = new javax.swing.JButton();
        MilihEdit = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbJadwal = new javax.swing.JTable();
        Hapus = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        root.setBackground(new java.awt.Color(172, 226, 219));
        root.setLayout(new java.awt.CardLayout());

        menutama.setBackground(new java.awt.Color(172, 226, 219));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel24.setText("Welcome, Silakan Pilih ");

        btnInputLp.setText("Input");
        btnInputLp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputLpActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");

        jButton3.setText("Delete");

        jButton4.setText("Cetak");

        javax.swing.GroupLayout menutamaLayout = new javax.swing.GroupLayout(menutama);
        menutama.setLayout(menutamaLayout);
        menutamaLayout.setHorizontalGroup(
            menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutamaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menutamaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menutamaLayout.createSequentialGroup()
                        .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(btnInputLp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(286, 286, 286)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        menutamaLayout.setVerticalGroup(
            menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutamaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24)
                .addGap(156, 156, 156)
                .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputLp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        root.add(menutama, "menuUtama");

        Step1.setBackground(new java.awt.Color(172, 226, 219));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel2.setText("- Step 1 of 2");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel3.setText("Input Data ");

        jLabel1.setText("Periode");

        cbPeriode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Kode Matakuliah");

        cbKdMatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Tanggal Mulai");

        jLabel6.setText("Nama Matakuliah");

        cbNmMatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNextSt1.setText("Next");
        btnNextSt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSt1ActionPerformed(evt);
            }
        });

        btnBackMenu.setText("Kembali");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });

        jLabel13.setText("Tanggal Akhir");

        javax.swing.GroupLayout Step1Layout = new javax.swing.GroupLayout(Step1);
        Step1.setLayout(Step1Layout);
        Step1Layout.setHorizontalGroup(
            Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Step1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Step1Layout.createSequentialGroup()
                        .addComponent(btnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNextSt1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Step1Layout.createSequentialGroup()
                        .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(Step1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1)
                            .addComponent(cbKdMatkul, 0, 308, Short.MAX_VALUE)
                            .addComponent(cbPeriode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(cbNmMatkul, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Step1Layout.createSequentialGroup()
                                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jdcAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                        .addGap(128, 128, 128))))
        );
        Step1Layout.setVerticalGroup(
            Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Step1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jdcAwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPeriode))
                .addGap(50, 50, 50)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNmMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKdMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(Step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextSt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        root.add(Step1, "step1");

        Step2.setBackground(new java.awt.Color(172, 226, 219));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel9.setText("Input Data ");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel10.setText("- Step 2 of 2");

        jLabel7.setText("Kelas");

        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Waktu");

        cbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Waktu", "07:00 - 09:00", "09:30 - 10:30", "11:00 - 12:00", "13:00 - 15:00", "15:30 - 17:00" }));

        jLabel11.setText("Ruang");

        cbRuang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Pengajar");

        cbPengajar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBackSt2.setText("Back");
        btnBackSt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Step2Layout = new javax.swing.GroupLayout(Step2);
        Step2.setLayout(Step2Layout);
        Step2Layout.setHorizontalGroup(
            Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Step2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Step2Layout.createSequentialGroup()
                        .addComponent(btnBackSt2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(Step2Layout.createSequentialGroup()
                        .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(Step2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(cbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbWaktu, 0, 295, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(cbRuang, 0, 317, Short.MAX_VALUE)
                            .addComponent(cbPengajar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(123, 123, 123))))
        );
        Step2Layout.setVerticalGroup(
            Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Step2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(64, 64, 64)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRuang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPengajar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(Step2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnBackSt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        root.add(Step2, "step2");

        MilihEdit.setBackground(new java.awt.Color(172, 226, 219));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel26.setText("Edit Entry Data");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Pilih Data");

        tbJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbJadwal);

        javax.swing.GroupLayout MilihEditLayout = new javax.swing.GroupLayout(MilihEdit);
        MilihEdit.setLayout(MilihEditLayout);
        MilihEditLayout.setHorizontalGroup(
            MilihEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilihEditLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(MilihEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(MilihEditLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(MilihEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        MilihEditLayout.setVerticalGroup(
            MilihEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilihEditLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        root.add(MilihEdit, "milihEdit");

        Hapus.setBackground(new java.awt.Color(172, 226, 219));

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel28.setText("Hapus Data");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Pilih Data");

        javax.swing.GroupLayout HapusLayout = new javax.swing.GroupLayout(Hapus);
        Hapus.setLayout(HapusLayout);
        HapusLayout.setHorizontalGroup(
            HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HapusLayout.createSequentialGroup()
                .addGroup(HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HapusLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel29))
                    .addGroup(HapusLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel28)))
                .addGap(851, 851, 851))
        );
        HapusLayout.setVerticalGroup(
            HapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HapusLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addGap(398, 398, 398))
        );

        root.add(Hapus, "menuHapus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void load_table()
    {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Periode");
        model.addColumn("Tanggal");
        model.addColumn("Kode Matkul");
        model.addColumn("Nama Matkul");
        model.addColumn("Kelas");
        model.addColumn("Waktu");
        model.addColumn("Ruang");
        model.addColumn("Pengajar");
        
        
        
        try {
            int no = 1;
            String sql = "select * from jadwal";
            con = (Connection) config.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next())
            {
                model.addRow(
                new Object[]
                {
                    no++,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)
                }
                );
            }
            tbJadwal.setModel(model);
//            tbMahasiswaHps.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void btnNextSt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSt1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) root.getLayout();
        periode = cbPeriode.getSelectedItem().toString();
        kdmatkul = cbKdMatkul.getSelectedItem().toString();
        nmmatkul = cbNmMatkul.getSelectedItem().toString();
        if(jdcAwal.getDate() == null || jdcAkhir.getDate() == null)
        {
            JOptionPane.showMessageDialog(null, "Harap Isi Tanggal Terlebih Dahulu");
        }
        else
        {
            tglAwal = sdf.format(jdcAwal.getDate());
            tglAkhir = sdf.format(jdcAkhir.getDate());
            cl.show(root, "step2");
        }
        
        
    }//GEN-LAST:event_btnNextSt1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String sql ="insert into jadwal(periode,tanggal,kdmatkul,nmmatkul,kelas,waktu,ruang,pengajar) values (?,?,?,?,?,?,?,?)";
        try {
            
            
            kelas = cbKelas.getSelectedItem().toString();
            ruang = cbRuang.getSelectedItem().toString();
            pengajar = cbPengajar.getSelectedItem().toString();
            waktu = cbWaktu.getSelectedItem().toString();
            
            tanggal = tglAwal+" s/d "+tglAkhir;
            pst = con.prepareStatement(sql);
            pst.setString(1, periode);
            pst.setString(2, tanggal);
            pst.setString(3, kdmatkul);
            pst.setString(4, nmmatkul);
            pst.setString(5, kelas);
            pst.setString(6, waktu);
            pst.setString(7, ruang);
            pst.setString(8, pengajar);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil Input Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackSt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSt2ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "step1");
        cbPeriode.setSelectedItem(periode);
    }//GEN-LAST:event_btnBackSt2ActionPerformed

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "menuUtama");
    }//GEN-LAST:event_btnBackMenuActionPerformed

    private void tbJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbJadwalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJadwalMouseClicked

    private void btnInputLpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputLpActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "step1");
    }//GEN-LAST:event_btnInputLpActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void cbMatkul()
    {
        try{
            con = config.configDB();
            String sql = "select * from matakuliah";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            cbPeriode.removeAllItems();
            cbKdMatkul.removeAllItems();
            cbNmMatkul.removeAllItems();
            cbPeriode.addItem("Pilih Periode");
            cbKdMatkul.addItem("Pilih Kode Matkul");
            cbNmMatkul.addItem("Pilih Nama Matkul");
            while(rs.next())
            {
                String kdMatkul = rs.getString("kdMatkul");
                String periode = rs.getString("periode");
                String nmMatkul = rs.getString("nmMatkul");
                cbPeriode.addItem(periode);
                cbKdMatkul.addItem(kdMatkul);
                cbNmMatkul.addItem(nmMatkul);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void cbKelas()
    {
        try {
            con = config.configDB();
            String sql = "select * from kelas";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            cbKelas.removeAllItems();
            cbRuang.removeAllItems();
            cbKelas.addItem("Pilih Kelas");
            cbRuang.addItem("Pilih Ruang");
            while(rs.next())
            {
                String kelas = rs.getString("kelas");
                String ruang = rs.getString("ruang");
                cbKelas.addItem(kelas);
                cbRuang.addItem(ruang);
                
            }
        } catch (Exception e) {
        }
    }
    
    public void cbPengajar()
    {
        try {
            con = config.configDB();
            String sql = "select * from dosen";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            cbPengajar.removeAllItems();
            cbPengajar.addItem("Pilih Pengajar");
            while(rs.next())
            {
                String nama = rs.getString("nmDosen");
                cbPengajar.addItem(nama);
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hapus;
    private javax.swing.JPanel MilihEdit;
    private javax.swing.JPanel Step1;
    private javax.swing.JPanel Step2;
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnBackSt2;
    private javax.swing.JButton btnInputLp;
    private javax.swing.JButton btnNextSt1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbKdMatkul;
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JComboBox<String> cbNmMatkul;
    private javax.swing.JComboBox<String> cbPengajar;
    private javax.swing.JComboBox<String> cbPeriode;
    private javax.swing.JComboBox<String> cbRuang;
    private javax.swing.JComboBox<String> cbWaktu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcAkhir;
    private com.toedter.calendar.JDateChooser jdcAwal;
    private javax.swing.JPanel menutama;
    private javax.swing.JPanel root;
    private javax.swing.JTable tbJadwal;
    // End of variables declaration//GEN-END:variables
}
