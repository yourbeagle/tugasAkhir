package tugasakhir;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Realfi
 */
public class Kelas extends javax.swing.JFrame {
String kdKelas,kelas,pertemuan,tgl,ruang,jam;
Connection con;
PreparedStatement pst;
Statement stm;
ResultSet rs;
SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-mm-dd");
java.util.Date tgll;

    public Kelas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        menutama = new javax.swing.JPanel();
        btInput = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btHapus1 = new javax.swing.JButton();
        input = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPertemuan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        tbSimpan = new javax.swing.JButton();
        txtRuang = new javax.swing.JTextField();
        cbKelas = new javax.swing.JComboBox<>();
        tbSimpan1 = new javax.swing.JButton();
        chDate = new com.toedter.calendar.JDateChooser();
        cbJam = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        MilehEdit = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEdit = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        btEditlanjur = new javax.swing.JButton();
        MilehHapus = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHapus = new javax.swing.JTable();
        btHapusss = new javax.swing.JButton();
        btHapusss1 = new javax.swing.JButton();
        edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chDate1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtPertemuan1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKode1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRuang1 = new javax.swing.JTextField();
        cbKelas1 = new javax.swing.JComboBox<>();
        tbSimpan2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tbEditReal = new javax.swing.JButton();
        cbJam1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        root.setLayout(new java.awt.CardLayout());

        menutama.setBackground(new java.awt.Color(172, 226, 219));

        btInput.setText("input");
        btInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel24.setText("Kelas, Silakan Pilih ");

        btHapus1.setText("Menu Utama");
        btHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menutamaLayout = new javax.swing.GroupLayout(menutama);
        menutama.setLayout(menutamaLayout);
        menutamaLayout.setHorizontalGroup(
            menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutamaLayout.createSequentialGroup()
                .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menutamaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel24))
                    .addGroup(menutamaLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btInput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menutamaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        menutamaLayout.setVerticalGroup(
            menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutamaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel24)
                .addGap(154, 154, 154)
                .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        root.add(menutama, "menu");

        input.setBackground(new java.awt.Color(172, 226, 219));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel3.setText("Input Data ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kode Kelas");

        txtPertemuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Waktu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pertemuan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Kelas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Jam");

        txtKode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbSimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbSimpan.setText("Add");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });

        txtRuang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbKelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "LAB 1", "LAB 2", "LAB3" }));

        tbSimpan1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbSimpan1.setText("Home");
        tbSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpan1ActionPerformed(evt);
            }
        });

        chDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00:00", "07:30:00", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00", "20:30:00", "21:00:00" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Ruang");

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addContainerGap())
                    .addGroup(inputLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(385, 385, 385)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPertemuan, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5))
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(inputLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRuang, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chDate, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbJam, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(0, 127, Short.MAX_VALUE))))))
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chDate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbJam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtPertemuan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14))
                        .addGap(19, 19, 19)
                        .addComponent(txtRuang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        root.add(input, "input");

        MilehEdit.setBackground(new java.awt.Color(172, 226, 219));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel26.setText("Edit Entry Data");

        tbEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NRP", "Nama", "Agama", "Jenis Kelamin", "Alamat", "Email", "Nomer Hp", "Prodi", "Status", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ));
        jScrollPane1.setViewportView(tbEdit);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Pilih Data");

        btEditlanjur.setText("Lanjutkan");
        btEditlanjur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditlanjurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MilehEditLayout = new javax.swing.GroupLayout(MilehEdit);
        MilehEdit.setLayout(MilehEditLayout);
        MilehEditLayout.setHorizontalGroup(
            MilehEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MilehEditLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btEditlanjur, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(MilehEditLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(MilehEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MilehEditLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27))
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        MilehEditLayout.setVerticalGroup(
            MilehEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilehEditLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btEditlanjur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        root.add(MilehEdit, "milehedit");

        MilehHapus.setBackground(new java.awt.Color(172, 226, 219));

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel28.setText("Hapus Data");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Pilih Data");

        tbHapus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NRP", "Nama", "Agama", "Jenis Kelamin", "Alamat", "Email", "Nomer Hp", "Prodi", "Status", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ));
        jScrollPane2.setViewportView(tbHapus);

        btHapusss.setText("Hapus");
        btHapusss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusssActionPerformed(evt);
            }
        });

        btHapusss1.setText("Hapus");
        btHapusss1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusss1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MilehHapusLayout = new javax.swing.GroupLayout(MilehHapus);
        MilehHapus.setLayout(MilehHapusLayout);
        MilehHapusLayout.setHorizontalGroup(
            MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilehHapusLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(MilehHapusLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MilehHapusLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btHapusss1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHapusss, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        MilehHapusLayout.setVerticalGroup(
            MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MilehHapusLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MilehHapusLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MilehHapusLayout.createSequentialGroup()
                        .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btHapusss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHapusss1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );

        root.add(MilehHapus, "milehhapus");

        edit.setBackground(new java.awt.Color(172, 226, 219));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kode Kelas");

        chDate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ruang");

        txtPertemuan1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal");

        txtKode1.setEditable(false);
        txtKode1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pertemuan");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Kelas");

        txtRuang1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbKelas1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbKelas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "LAB 1", "LAB 2", "LAB3" }));

        tbSimpan2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbSimpan2.setText("Home");
        tbSimpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpan2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel12.setText("Edit Data ");

        tbEditReal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbEditReal.setText("Edit");
        tbEditReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditRealActionPerformed(evt);
            }
        });

        cbJam1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00:00", "07:30:00", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00", "20:30:00", "21:00:00" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Jam");

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbSimpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtKode1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPertemuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbKelas1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10))
                        .addGap(87, 87, 87)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tbEditReal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtRuang1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbJam1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 111, Short.MAX_VALUE))))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addGroup(editLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(370, 370, 370)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13)))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(jLabel9)))
                        .addContainerGap())))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16)
                        .addComponent(txtKode1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKelas1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJam1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtPertemuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbSimpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbEditReal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(editLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtRuang1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        root.add(edit, "edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void load_tbEdit() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Kelas");
        model.addColumn("Kelas");
        model.addColumn("Pertemuan");
        model.addColumn("Waktu");
        model.addColumn("Ruangan");

        try {
         
            String sql = "select * from kelas";
            con = (Connection) config.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(
                new Object[] {
                    rs.getString("kdKelas"),rs.getString("kelas"),rs.getString("pertemuan"),rs.getString("waktu"),rs.getString("ruang")
                }
                );
            }
            tbEdit.setModel(model);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(root, e);
        }
    }
    
    public void load_tbHapus() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Kelas");
        model.addColumn("Kelas");
        model.addColumn("Pertemuan");
        model.addColumn("Waktu");
        model.addColumn("Ruangan");
        try {
         
            String sql = "select * from kelas";
            con = (Connection) config.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(
                new Object[] {
                   rs.getString("kdKelas"),rs.getString("kelas"),rs.getString("pertemuan"),rs.getString("waktu"),rs.getString("ruang")
                }
                );
            }
            tbHapus.setModel(model);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void backhome(){
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "menu");
        txtKode.setText("");
        txtPertemuan.setText("");
        txtRuang.setText("");
        cbKelas.setSelectedItem("Pilih Salah Satu");
        txtKode1.setText("");
        txtPertemuan1.setText("");
        txtRuang1.setText("");
        cbKelas1.setSelectedItem("Pilih Salah Satu");
        
    }
    
    private void btInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputActionPerformed
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "input");
    }//GEN-LAST:event_btInputActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        load_tbEdit();
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "milehedit");
    }//GEN-LAST:event_btEditActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        load_tbHapus();
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "milehhapus");
    }//GEN-LAST:event_btHapusActionPerformed

    private void btHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapus1ActionPerformed
        this.dispose();
        landingpage lp = new landingpage();
        lp.setVisible(true);
    }//GEN-LAST:event_btHapus1ActionPerformed

    private void tbSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpan1ActionPerformed
        backhome();
    }//GEN-LAST:event_tbSimpan1ActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        kdKelas = txtKode.getText();
        kelas = (String) cbKelas.getSelectedItem();
        pertemuan = txtPertemuan.getText();
        ruang = txtRuang.getText();
        tgl=""+Date_Format.format(chDate.getDate());
        jam = (String) cbJam.getSelectedItem();
        tgl +=" "+jam;
        
        String sql="INSERT INTO `kelas`(`kdKelas`, `kelas`, `pertemuan`, `waktu`, `ruang`) VALUES (?,?,?,?,?)";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);
            pst.setString(1, kdKelas);
            pst.setString(2, kelas);
            pst.setString(3, pertemuan);
            pst.setString(4, tgl);
            pst.setString(5, ruang);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(root, "Berhasil input data");
            backhome();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(root, e);
        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbSimpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpan2ActionPerformed
        backhome();
    }//GEN-LAST:event_tbSimpan2ActionPerformed

    private void tbEditRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditRealActionPerformed
        kdKelas = txtKode1.getText();
        kelas = (String) cbKelas1.getSelectedItem();
        pertemuan = txtPertemuan1.getText();
        ruang = txtRuang1.getText();
        tgl=""+Date_Format.format(chDate1.getDate());
        jam = (String) cbJam1.getSelectedItem();
        tgl +=" "+jam;
        
        String sql="UPDATE `kelas` SET `kelas`=?,`pertemuan`=?,`waktu`=?,`ruang`=? WHERE `kdKelas`=?";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);       
            pst.setString(1, kelas);
            pst.setString(2, pertemuan);
            pst.setString(3, tgl);
            pst.setString(4, ruang);
            pst.setString(5, kdKelas);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(root, "Berhasil Edit data");
            backhome();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(root, e);
        }
    }//GEN-LAST:event_tbEditRealActionPerformed

    private void btEditlanjurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditlanjurActionPerformed
        int index = tbEdit.getSelectedRow();
        String kd = tbEdit.getValueAt(index, 0).toString();
        String kel = tbEdit.getValueAt(index, 1).toString();
        String per = tbEdit.getValueAt(index, 2).toString();
        String ruang = tbEdit.getValueAt(index, 4).toString();
        txtKode1.setText(kd);
        txtPertemuan1.setText(per);
        txtRuang1.setText(ruang);
        cbKelas1.setSelectedItem(kel);
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "edit");
    }//GEN-LAST:event_btEditlanjurActionPerformed

    private void btHapusssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusssActionPerformed
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(root, "Sure To Delete??", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = tbHapus.getSelectedRow();
            String id = tbHapus.getValueAt(index, 0).toString();
            String sqld="DELETE FROM `kelas` WHERE `kdKelas`=?";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sqld);
            pst.setString(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(root, "Berhasil Dihapus");
            load_tbHapus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(root, e);
            } 
        } else {
            JOptionPane.showMessageDialog(root, "Not Deleted");
        }    
    }//GEN-LAST:event_btHapusssActionPerformed

    private void btHapusss1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusss1ActionPerformed
        backhome();
    }//GEN-LAST:event_btHapusss1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MilehEdit;
    private javax.swing.JPanel MilehHapus;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btEditlanjur;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btHapus1;
    private javax.swing.JButton btHapusss;
    private javax.swing.JButton btHapusss1;
    private javax.swing.JButton btInput;
    private javax.swing.JComboBox<String> cbJam;
    private javax.swing.JComboBox<String> cbJam1;
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JComboBox<String> cbKelas1;
    private com.toedter.calendar.JDateChooser chDate;
    private com.toedter.calendar.JDateChooser chDate1;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menutama;
    private javax.swing.JPanel root;
    private javax.swing.JTable tbEdit;
    private javax.swing.JButton tbEditReal;
    private javax.swing.JTable tbHapus;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbSimpan1;
    private javax.swing.JButton tbSimpan2;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKode1;
    private javax.swing.JTextField txtPertemuan;
    private javax.swing.JTextField txtPertemuan1;
    private javax.swing.JTextField txtRuang;
    private javax.swing.JTextField txtRuang1;
    // End of variables declaration//GEN-END:variables
}
