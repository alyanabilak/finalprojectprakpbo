package view;

import javax.swing.*;

public class BookingView extends JFrame{
    private javax.swing.JButton btnJadwal;
    private javax.swing.JButton btnJadwal1;
    private javax.swing.JButton btnJadwal2;
    private javax.swing.JButton btnJadwal3;
    private javax.swing.JButton btnJadwal4;
    private javax.swing.JButton btnJadwal5;
    private javax.swing.JButton btnJadwal6;
    private javax.swing.JButton btnJadwal7;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private JPanel3Listener jPanel3Listener;
    private JLabel2Listener jLabel2Listener;
    private JLabel3Listener jLabel3Listener;
    private btnJadwalListener btnJadwalListener;
    private btnJadwal1Listener btnJadwal1Listener;
    private btnJadwal2Listener btnJadwal2Listener;
    private btnJadwal3Listener btnJadwal3Listener;
    private btnJadwal4Listener btnJadwal4Listener;
    private btnJadwal5Listener btnJadwal5Listener;
    private btnJadwal6Listener btnJadwal6Listener;
    private btnJadwal7Listener btnJadwal7Listener;
    private btnRegister1Listener btnRegister1Listener;
    public BookingView(){
        initComponents();
    }
    
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnJadwal = new javax.swing.JButton();
        btnJadwal1 = new javax.swing.JButton();
        btnJadwal2 = new javax.swing.JButton();
        btnJadwal3 = new javax.swing.JButton();
        btnJadwal4 = new javax.swing.JButton();
        btnJadwal5 = new javax.swing.JButton();
        btnJadwal6 = new javax.swing.JButton();
        btnJadwal7 = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(175, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(70, 130, 180));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if (jPanel3Listener != null) {
                    jPanel3Listener.onDragged(evt);
                }
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (jPanel3Listener != null) {
                    jPanel3Listener.onPressed(evt);
                }
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Close_20px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jLabel2Listener != null) {
                    jLabel2Listener.onClicked(evt);
                }
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_minimize_window_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jLabel3Listener != null) {
                    jLabel3Listener.onClicked(evt);
                }
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 130, 180));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Booking");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 450, -1));

        btnJadwal.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal.setText("Selasa, 2023-06-13, 15.00"); // NOI18N
        btnJadwal.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (btnJadwalListener != null){
                    btnJadwalListener.onClicked();
                }
            }
        });
        jPanel1.add(btnJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, -1));

        btnJadwal1.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal1.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal1.setText("<html> <p>Senin - Jumat : 15.00 - 18.00 -> 40.000</p> <p>Minggu : 07.00 - 17.00 -> 50.000</p> </html>"); // NOI18N
        btnJadwal1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal1Listener != null){
                   btnJadwal1Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, 40));

        btnJadwal2.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal2.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal2.setText("Minggu, 2023-06-18, 07.00 - 17.00"); // NOI18N
        btnJadwal2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal2Listener != null){
                   btnJadwal2Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 250, -1));

        btnJadwal3.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal3.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal3.setText("Senin, 2023-06-12, 15.00"); // NOI18N
        btnJadwal3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal3Listener != null){
                   btnJadwal3Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, -1));

        btnJadwal4.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal4.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal4.setText("Rabu, 2023-06-14, 15.00"); // NOI18N
        btnJadwal4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal4Listener != null){
                   btnJadwal4Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, -1));

        btnJadwal5.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal5.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal5.setText("Kamis, 2023-06-15, 15.00"); // NOI18N
        btnJadwal5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal5Listener != null){
                   btnJadwal5Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 190, -1));

        btnJadwal6.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal6.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal6.setText("Sabtu, 2023-06-17, 15.00"); // NOI18N
        btnJadwal6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal6Listener != null){
                   btnJadwal6Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, -1));

        btnJadwal7.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal7.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal7.setText("Jum'at, 2023-06-16, 15.00"); // NOI18N
        btnJadwal7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if (btnJadwal7Listener != null){
                   btnJadwal7Listener.onClicked();
               }
            }
        });
        jPanel1.add(btnJadwal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, -1));

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
        jPanel1.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(451, 403));
        setLocationRelativeTo(null);
    }
    
    // jPanel
    public void setjPanel3Listener(JPanel3Listener listener) {
        this.jPanel3Listener = listener;
    }

    public interface JPanel3Listener {

        void onPressed(java.awt.event.MouseEvent evt);
        void onDragged(java.awt.event.MouseEvent evt);
    }

    // jLabel2
    public void setjLabel2Listener(JLabel2Listener listener) {
        this.jLabel2Listener = listener;
    }

    public interface JLabel2Listener {

        void onClicked(java.awt.event.MouseEvent evt);
    }

    // jLabel3
    public void setjLabel3Listener(JLabel3Listener listener) {
        this.jLabel3Listener = listener;
    }

    public interface JLabel3Listener {

        void onClicked(java.awt.event.MouseEvent evt);
    }
    
    // btnJadwal
    public void setBtnJadwalListener(btnJadwalListener listener){
        this.btnJadwalListener = listener;
    }
    public interface btnJadwalListener{
        void onClicked();
    }
    
    // btnJadwal1
    public void setBtnJadwal1Listener(btnJadwal1Listener listener){
        this.btnJadwal1Listener = listener;
    }
    public interface btnJadwal1Listener{
        void onClicked();
    }
    
    // btnJadwal2
    public void setBtnJadwal2Listener(btnJadwal2Listener listener){
        this.btnJadwal2Listener = listener;
    }
    public interface btnJadwal2Listener{
        void onClicked();
    }
    
    // btnJadwal3
    public void setBtnJadwal3Listener(btnJadwal3Listener listener){
        this.btnJadwal3Listener = listener;
    }
    public interface btnJadwal3Listener{
        void onClicked();
    }
    
    // btnJadwal4
    public void setBtnJadwal4Listener(btnJadwal4Listener listener){
        this.btnJadwal4Listener = listener;
    }
    public interface btnJadwal4Listener{
        void onClicked();
    }
    
    // btnJadwal5
    public void setBtnJadwal5Listener(btnJadwal5Listener listener){
        this.btnJadwal5Listener = listener;
    }
    public interface btnJadwal5Listener{
        void onClicked();
    }
    
    // btnJadwal6
    public void setBtnJadwal6Listener(btnJadwal6Listener listener){
        this.btnJadwal6Listener = listener;
    }
    public interface btnJadwal6Listener{
        void onClicked();
    }
    
    // btnJadwal7
    public void setBtnJadwal7Listener(btnJadwal7Listener listener){
        this.btnJadwal7Listener = listener;
    }
    public interface btnJadwal7Listener{
        void onClicked();
    }
    
    // btnRegister1
    public void setBtnRegister1Listener(btnRegister1Listener listener){
        this.btnRegister1Listener = listener;
    }
    public interface btnRegister1Listener{
        void onClicked();
    }
}
