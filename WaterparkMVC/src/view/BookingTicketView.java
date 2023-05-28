package view;

import javax.swing.*;

public class BookingTicketView extends JFrame{
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btnRegister2;
    private javax.swing.JButton btnRegister3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtJam;
    private javax.swing.JSpinner txtJumlahTiket;
    private javax.swing.JTextField txtNamaPengunjung;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtUangBayar;
    private javax.swing.JTextField txtUangKembali;
    private JLabel2Listener jLabel2Listener;
    private JLabel3Listener jLabel3Listener;
    private JPanel3Listener jPanel3Listener;
    private txtMouseExitedListener txtMouseExitedListener;
    private btnRegisterListener btnRegisterListener;
    private txtJumlahTiketListener txtJumlahTiketListener;
    private btnRegister1Listener btnRegister1Listener;
    private btnRegister2Listener btnRegister2Listener;
    private btnRegister3Listener btnRegister3Listener;
    private txtHargaListener txtHargaListener;
    private btnBookListener btnBookListener;
    
    public BookingTicketView(){
        initComponents();
    }
    
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUangKembali = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNamaPengunjung = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtJumlahTiket = new javax.swing.JSpinner();
        btnRegister1 = new javax.swing.JButton();
        btnRegister2 = new javax.swing.JButton();
        btnRegister3 = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        txtJam = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        txtUangBayar = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(175, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(70, 130, 180));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if (jPanel3Listener != null){
                    jPanel3Listener.onDragged(evt);
                }
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (jPanel3Listener != null){
                    jPanel3Listener.onPressed(evt);
                }
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Close_20px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jLabel2Listener != null){
                    jLabel2Listener.onClicked(evt);
                }
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_minimize_window_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jLabel3Listener != null){
                    jLabel3Listener.onClicked(evt);
                }
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 130, 180));
        jLabel1.setText("Nama Pengunjung");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 130, 180));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Booking Ticket");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 410, -1));

        txtHari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtHari.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (txtMouseExitedListener != null){
                    txtMouseExitedListener.onExited();
                }
            }
        });
        jPanel1.add(txtHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 130, 180));
        jLabel5.setText("Hari");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        btnRegister.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister.setText("Hitung");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (btnRegisterListener != null){
                    btnRegisterListener.onClicked();
                }
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 70, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 130, 180));
        jLabel8.setText("Jam");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 30));

        txtUangKembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtUangKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 90, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 130, 180));
        jLabel9.setText("Tanggal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 130, 180));
        jLabel10.setText("Uang Kembali");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 30));

        txtNamaPengunjung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));

        jPanel1.add(txtNamaPengunjung, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 130, 180));
        jLabel11.setText("Jumlah Tiket");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(70, 130, 180));
        jLabel12.setText("Harga");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 130, 180));
        jLabel13.setText("Total Harga");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 130, 180));
        jLabel14.setText("Uang Bayar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, 30));

        txtJumlahTiket.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                if (txtJumlahTiketListener != null){
                    txtJumlahTiketListener.onChanged();
                }
            }
        });
        jPanel1.add(txtJumlahTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 30));

        btnRegister1.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister1.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister1.setText("Back");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (btnRegister1Listener != null){
                    btnRegister1Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 60, -1));

        btnRegister2.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister2.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister2.setText("Reset");
        btnRegister2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (btnRegister2Listener != null){
                    btnRegister2Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnRegister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 70, -1));

        btnRegister3.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister3.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister3.setText("Print");
        btnRegister3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (btnRegister3Listener != null){
                    btnRegister3Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 70, -1));

        txtTanggal.setText("DD-MM-YYYY");
        txtTanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));

        jPanel1.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, 30));

        txtJam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, 30));

        txtHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        txtHarga.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (txtHargaListener != null){
                    txtHargaListener.onExited();
                }
            }
        });
        
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        txtTotalHarga.setEditable(false);
        txtTotalHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));

        jPanel1.add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 170, 30));

        txtUangBayar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));

        jPanel1.add(txtUangBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 170, 30));

        btnBook.setBackground(new java.awt.Color(70, 130, 180));
        btnBook.setForeground(new java.awt.Color(255, 245, 238));
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (btnBookListener != null){
                    btnBookListener.onClicked();
                }
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(410, 529));
        setLocationRelativeTo(null);
    }
    
    // jLabel2
    public void setjLabel2Listener(JLabel2Listener listener){
        this.jLabel2Listener = listener;
    }
    
    public interface JLabel2Listener {
        void onClicked(java.awt.event.MouseEvent evt);
    }
    
    // jLabel3

    public void setjLabel3Listener(JLabel3Listener listener){
        this.jLabel3Listener = listener;
    }
    
    public interface JLabel3Listener{
        void onClicked(java.awt.event.MouseEvent evt);
    }
    
    // jPanel3
    public void setjPanel3Listener(JPanel3Listener listener){
        this.jPanel3Listener = listener;
    }
    
    public interface JPanel3Listener {
        void onPressed(java.awt.event.MouseEvent evt);
        void onDragged(java.awt.event.MouseEvent evt);
    }
    
    // txtMouse
    
    public void setTxtMouseExitedListener(txtMouseExitedListener listener){
        this.txtMouseExitedListener = listener;
    }
    public interface txtMouseExitedListener{
        void onExited();
    }
    
    
    // getter
    public JTextField getTxtHarga(){
        return txtHarga;
    }
    
    public JTextField getTxtHari(){
        return txtHari;
    }
    public JTextField getTxtTotalHarga(){
        return txtTotalHarga;
    }
    public JSpinner getTxtJumlahTiket(){
        return txtJumlahTiket;
    }
    public JTextField getTxtJam(){
        return txtJam;
    }
    public JTextField getTxtNamaPengunjung(){
        return txtNamaPengunjung;
    }
    public JTextField getTxtTanggal(){
        return txtTanggal;
    }
    public JTextField getTxtUangBayar(){
        return txtUangBayar;
    }
    public JTextField getTxtUangKembali(){
        return txtUangKembali;
    }
    
    // btnRegister
    public void setBtnRegisterListener(btnRegisterListener listener){
        this.btnRegisterListener = listener;
    }
    public interface btnRegisterListener{
        void onClicked();
    }
    
    // btnRegister1
    public void setBtnRegister1Listener(btnRegister1Listener listener){
        this.btnRegister1Listener = listener;
    }
    public interface btnRegister1Listener{
        void onClicked();
    }
    
    // btnRegister2
    public void setBtnRegister2Listener(btnRegister2Listener listener){
        this.btnRegister2Listener = listener;
    }
    public interface btnRegister2Listener{
        void onClicked();
    }
    
    // btnRegister3
    public void setBtnRegister3Listener(btnRegister3Listener listener){
        this.btnRegister3Listener = listener;
    }
    public interface btnRegister3Listener{
        void onClicked();
    }
            
    // txtJumlahTiket
    public void setTxtJumlahTiketListener(txtJumlahTiketListener listener){
        this.txtJumlahTiketListener = listener;
    }
    public interface txtJumlahTiketListener{
        void onChanged();
    }
    
    // txtHarga
    public void setTxtHargaListener(txtHargaListener listener){
        this.txtHargaListener = listener;
    }
    public interface txtHargaListener{
        void onExited();
    }
    
    // btnBook
    public void setBtnBookListener(btnBookListener listener){
        this.btnBookListener = listener;
    }
    public interface btnBookListener{
        void onClicked();
    }
    
}
