/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

/**
 *
 * @author Realfi
 */
public class isipendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form isipendaftaran
     */
    public isipendaftaran() {
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

        root = new javax.swing.JPanel();
        menutama = new javax.swing.JPanel();
        btInput = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btHapus1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        input = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btInputt = new javax.swing.JButton();
        cbMatkul = new javax.swing.JComboBox<>();
        btInputt1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        input1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btInputt2 = new javax.swing.JButton();
        btInputt3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
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
        jLabel24.setText("Wisuda, Silakan Pilih ");

        btHapus1.setText("Menu Utama");
        btHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapus1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cetak Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Halaman Wisuda");

        javax.swing.GroupLayout menutamaLayout = new javax.swing.GroupLayout(menutama);
        menutama.setLayout(menutamaLayout);
        menutamaLayout.setHorizontalGroup(
            menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menutamaLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
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
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menutamaLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel25)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        menutamaLayout.setVerticalGroup(
            menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutamaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel24)
                .addGap(73, 73, 73)
                .addComponent(jLabel25)
                .addGap(52, 52, 52)
                .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(menutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        root.add(menutama, "menu");

        input.setBackground(new java.awt.Color(172, 226, 219));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel3.setText("Input Data ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("NRP");

        btInputt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInputt.setText("Next");
        btInputt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputtActionPerformed(evt);
            }
        });

        cbMatkul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "Sistem Operasi", "Analisis dan Desain Berorientasi Object", "Computer Graphic", "Arsitektur Komputer", "Jaringan Komputer", "Sistem Berkas", "Basis Data", "Pemrograman Bahasa X", "Pemrograman Jaringan", "Pemrograman Web", "User Interface Design" }));

        btInputt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInputt1.setText("Home");
        btInputt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputt1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel22.setText("- Step 1 of 2");

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btInputt1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btInputt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
            .addGroup(inputLayout.createSequentialGroup()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel7))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(cbMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel22))
                .addGap(161, 161, 161)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(cbMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInputt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInputt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        root.add(input, "input");

        input1.setBackground(new java.awt.Color(172, 226, 219));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel4.setText("Input Data ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NRP");

        btInputt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInputt2.setText("Finish");
        btInputt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputt2ActionPerformed(evt);
            }
        });

        btInputt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInputt3.setText("Home");
        btInputt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputt3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel23.setText("- Step 2 of 2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("IPK");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("JUDUL");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField1");

        javax.swing.GroupLayout input1Layout = new javax.swing.GroupLayout(input1);
        input1.setLayout(input1Layout);
        input1Layout.setHorizontalGroup(
            input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(input1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btInputt3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                        .addComponent(btInputt2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(input1Layout.createSequentialGroup()
                        .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(input1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23))
                            .addGroup(input1Layout.createSequentialGroup()
                                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(70, 70, 70)
                                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        input1Layout.setVerticalGroup(
            input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel23))
                .addGap(33, 33, 33)
                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(input1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInputt2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInputt3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        root.add(input1, "input");

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
                .addContainerGap(75, Short.MAX_VALUE))
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
                .addContainerGap(108, Short.MAX_VALUE))
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
                        .addGap(0, 64, Short.MAX_VALUE))))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String jrmxlFile ="src/Report/reportmatakuliah.jrxml";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa_sakti", "root", "");
            HashMap param = new HashMap();
            JasperReport jspR = JasperCompileManager.compileReport(jrmxlFile);
            JasperPrint JPrint = JasperFillManager.fillReport(jspR, param, con);
            JasperViewer.viewReport(JPrint,false);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btInputtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputtActionPerformed
        kdMatkul = txtMatkul.getText().toString();
        periode = cbPeriode.getSelectedItem().toString();
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
        cbPeriode1.setSelectedItem(idp);
        cbMatkul1.setSelectedItem(idn);
        CardLayout cl = (CardLayout) root.getLayout();
        cl.show(root, "edit");
    }//GEN-LAST:event_btEdittActionPerformed

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

    private void btInputt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInputt2ActionPerformed

    private void btInputt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInputt3ActionPerformed

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
            java.util.logging.Logger.getLogger(isipendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(isipendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(isipendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(isipendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new isipendaftaran().setVisible(true);
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
    private javax.swing.JButton btInputt2;
    private javax.swing.JButton btInputt3;
    private javax.swing.JComboBox<String> cbMatkul;
    private javax.swing.JPanel input;
    private javax.swing.JPanel input1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel menutama;
    private javax.swing.JPanel root;
    private javax.swing.JTable tbEdit;
    private javax.swing.JTable tbHapus;
    // End of variables declaration//GEN-END:variables
}
