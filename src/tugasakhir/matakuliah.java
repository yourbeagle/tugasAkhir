package tugasakhir;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Realfi
 */
public class matakuliah extends javax.swing.JFrame {
String kdMatkul,periode,nmMatkul;
Connection con;
PreparedStatement pst;
Statement stm;
ResultSet rs;
    public matakuliah() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMatkul = new javax.swing.JTextField();
        btInputt = new javax.swing.JButton();
        txtPeriode = new javax.swing.JTextField();
        cbMatkul = new javax.swing.JComboBox<>();
        btInputt1 = new javax.swing.JButton();
        MilehEdit = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEdit = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        btEditt = new javax.swing.JButton();
        MilehHapus = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHapus = new javax.swing.JTable();
        btHapuss = new javax.swing.JButton();
        btHapuss1 = new javax.swing.JButton();
        edit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMatkul1 = new javax.swing.JTextField();
        bteditlan = new javax.swing.JButton();
        txtPeriode1 = new javax.swing.JTextField();
        cbMatkul1 = new javax.swing.JComboBox<>();
        bteditlan1 = new javax.swing.JButton();

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
        jLabel24.setText("Welcome, Silakan Pilih ");

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
                .addContainerGap(238, Short.MAX_VALUE))
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
        jLabel1.setText("Kode Matakuliah");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Periode");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nama Matakuliah");

        txtMatkul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btInputt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInputt.setText("Finish");
        btInputt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputtActionPerformed(evt);
            }
        });

        txtPeriode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbMatkul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "Sistem Operasi", "Analisis dan Desain Berorientasi Object", "Computer Graphic", "Arsitektur Komputer", "Jaringan Komputer", "Sistem Berkas", "Basis Data", "Pemrograman Bahasa X", "Pemrograman Jaringan", "Pemrograman Web", "User Interface Design" }));

        btInputt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInputt1.setText("Home");
        btInputt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputt1ActionPerformed(evt);
            }
        });

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
                        .addContainerGap(762, Short.MAX_VALUE))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btInputt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputLayout.createSequentialGroup()
                                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inputLayout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(txtMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(inputLayout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btInputt1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(139, 139, 139)
                                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cbMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(btInputt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLayout.createSequentialGroup()
                        .addComponent(btInputt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
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

        btEditt.setText("Lanjutkan");
        btEditt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEdittActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MilehEditLayout = new javax.swing.GroupLayout(MilehEdit);
        MilehEdit.setLayout(MilehEditLayout);
        MilehEditLayout.setHorizontalGroup(
            MilehEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilehEditLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(MilehEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MilehEditLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27))
                    .addComponent(jLabel26))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MilehEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEditt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
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
                .addGap(18, 18, 18)
                .addComponent(btEditt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

        btHapuss.setText("Hapus");
        btHapuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapussActionPerformed(evt);
            }
        });

        btHapuss1.setText("Home");
        btHapuss1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapuss1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MilehHapusLayout = new javax.swing.GroupLayout(MilehHapus);
        MilehHapus.setLayout(MilehHapusLayout);
        MilehHapusLayout.setHorizontalGroup(
            MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MilehHapusLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MilehHapusLayout.createSequentialGroup()
                        .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MilehHapusLayout.createSequentialGroup()
                                .addComponent(btHapuss1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(615, 615, 615)
                                .addComponent(btHapuss, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MilehHapusLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel28)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MilehHapusLayout.createSequentialGroup()
                        .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        MilehHapusLayout.setVerticalGroup(
            MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MilehHapusLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(MilehHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapuss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHapuss1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        root.add(MilehHapus, "milehhapus");

        edit.setBackground(new java.awt.Color(172, 226, 219));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel5.setText("Edit Data ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kode Matakuliah");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Periode");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nama Matakuliah");

        txtMatkul1.setEditable(false);
        txtMatkul1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bteditlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bteditlan.setText("Edit");
        bteditlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditlanActionPerformed(evt);
            }
        });

        txtPeriode1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbMatkul1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMatkul1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "Sistem Operasi", "Analisis dan Desain Berorientasi Object", "Computer Graphic", "Arsitektur Komputer", "Jaringan Komputer", "Sistem Berkas", "Basis Data", "Pemrograman Bahasa X", "Pemrograman Jaringan", "Pemrograman Web", "User Interface Design" }));

        bteditlan1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bteditlan1.setText("Home");
        bteditlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditlan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addContainerGap(778, Short.MAX_VALUE))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bteditlan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editLayout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(txtMatkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(editLayout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bteditlan1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbMatkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(139, 139, 139)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPeriode1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtMatkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPeriode1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cbMatkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bteditlan1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteditlan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        root.add(edit, "edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void load_tbEdit() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Matakuliah");
        model.addColumn("Periode");
        model.addColumn("Nama Matakuliah");

        try {
         
            String sql = "select * from matakuliah";
            con = (Connection) config.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(
                new Object[] {
                    rs.getString("kdMatkul"),rs.getString("periode"),rs.getString("nmMatkul")
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
        model.addColumn("Kode Matakuliah");
        model.addColumn("Periode");
        model.addColumn("Nama Matakuliah");

        try {
         
            String sql = "select * from matakuliah";
            con = (Connection) config.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(
                new Object[] {
                   rs.getString("kdMatkul"),rs.getString("periode"),rs.getString("nmMatkul")
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
        txtMatkul.setText("");
        txtMatkul1.setText("");
        txtPeriode.setText("");
        txtPeriode1.setText("");
        cbMatkul.setSelectedItem("Pilih Salah Satu");
        cbMatkul1.setSelectedItem("Pilih Salah Satu");
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

    private void btInputtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputtActionPerformed
        kdMatkul = txtMatkul.getText().toString();
        periode = txtPeriode.getText().toString();
        nmMatkul = cbMatkul.getSelectedItem().toString();
        String sql="insert into matakuliah(kdMatkul,periode,nmMatkul) values (?,?,?)";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sql);
            pst.setString(1, kdMatkul);
            pst.setString(2, periode);
            pst.setString(3, nmMatkul);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(root, "Berhasil input data");
            backhome();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(root, e);
        }
    }//GEN-LAST:event_btInputtActionPerformed

    private void btInputt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputt1ActionPerformed
        backhome();
    }//GEN-LAST:event_btInputt1ActionPerformed

    private void btEdittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEdittActionPerformed
        int index = tbEdit.getSelectedRow();
        String id = tbEdit.getValueAt(index, 0).toString();
        String idp = tbEdit.getValueAt(index, 1).toString();
        String idn = tbEdit.getValueAt(index, 2).toString();
        txtMatkul1.setText(id);
        txtPeriode1.setText(idp);
        cbMatkul1.setSelectedItem(idn);
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "edit");
    }//GEN-LAST:event_btEdittActionPerformed

    private void bteditlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditlanActionPerformed
        kdMatkul = txtMatkul1.getText();
        periode = txtPeriode1.getText();
        nmMatkul = cbMatkul1.getSelectedItem().toString();
        
        String sqle="UPDATE `matakuliah` SET `periode`=?,`nmMatkul`=? WHERE `kdMatkul`=?";
        try {
            con = config.configDB();
            pst = con.prepareStatement(sqle);
            pst.setString(1, periode);
            pst.setString(2, nmMatkul);
            pst.setString(3, kdMatkul);
             pst.executeUpdate();
            JOptionPane.showMessageDialog(root, "Berhasil input data");
            backhome();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(root, e);
        }
    }//GEN-LAST:event_bteditlanActionPerformed

    private void bteditlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditlan1ActionPerformed
       backhome();
    }//GEN-LAST:event_bteditlan1ActionPerformed

    private void btHapussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapussActionPerformed
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(root, "Sure To Delete??", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = tbHapus.getSelectedRow();
            String id = tbHapus.getValueAt(index, 0).toString();
            String sqld="DELETE FROM `matakuliah` WHERE `kdMatkul`=?";
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
    }//GEN-LAST:event_btHapussActionPerformed

    private void btHapuss1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapuss1ActionPerformed
        backhome();
    }//GEN-LAST:event_btHapuss1ActionPerformed

    private void btHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapus1ActionPerformed
      //  this.dispose();
        landingpage lp = new landingpage();
        lp.setVisible(true);
    }//GEN-LAST:event_btHapus1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matakuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MilehEdit;
    private javax.swing.JPanel MilehHapus;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btEditt;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btHapus1;
    private javax.swing.JButton btHapuss;
    private javax.swing.JButton btHapuss1;
    private javax.swing.JButton btInput;
    private javax.swing.JButton btInputt;
    private javax.swing.JButton btInputt1;
    private javax.swing.JButton bteditlan;
    private javax.swing.JButton bteditlan1;
    private javax.swing.JComboBox<String> cbMatkul;
    private javax.swing.JComboBox<String> cbMatkul1;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menutama;
    private javax.swing.JPanel root;
    private javax.swing.JTable tbEdit;
    private javax.swing.JTable tbHapus;
    private javax.swing.JTextField txtMatkul;
    private javax.swing.JTextField txtMatkul1;
    private javax.swing.JTextField txtPeriode;
    private javax.swing.JTextField txtPeriode1;
    // End of variables declaration//GEN-END:variables
}
