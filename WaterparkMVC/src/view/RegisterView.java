package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame {

    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtKonfPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    String gender = "";
    private JPanel3Listener jPanel3Listener;
    private JLabel2Listener jLabel2Listener;
    private JLabel3Listener jLabel3Listener;
    private JLabel6Listener jLabel6Listener;
    private RegisterListener registerListener;

    public RegisterView() {
        initComponents();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioMale);
        buttonGroup.add(radioFemale);

        radioMale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioMale.isSelected()) {
                    gender = "Male";
                }
            }
        });

        radioFemale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioFemale.isSelected()) {
                    gender = "Female";
                }
            }
        });
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKonfPassword = new javax.swing.JPasswordField();
        txtFullname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

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
        jLabel1.setForeground(new java.awt.Color(255, 245, 238));
        jLabel1.setText("Fullname");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 245, 238));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kingdom Waterpark");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 400, -1));

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));

        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 245, 238));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 90, 30));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, 30));

        btnRegister.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullname = txtFullname.getText();
                String username = txtUsername.getText();
                String phone = txtPhone.getText();
                boolean isNumeric = phone.matches("\\d+");
                String konfPassword = new String(txtKonfPassword.getPassword());
                String password = new String(txtPassword.getPassword());

                if (registerListener != null) {
                    registerListener.registerUser(username, password, konfPassword, fullname, phone, isNumeric, gender);
                }
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 130, 180));
        jLabel6.setText("<html>\n<style>\na {\ncolor: rgb(255, 245, 238);\n}\n</style>\n<a href=\"\">Login</a>\n</html>\n");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jLabel6Listener != null) {
                    jLabel6Listener.onClicked(evt);
                }
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, -1));

        jLabel7.setForeground(new java.awt.Color(255, 245, 238));
        jLabel7.setText("Already have an account ?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 150, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 245, 238));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 245, 238));
        jLabel9.setText("Phone");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 90, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 245, 238));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 90, 30));

        txtKonfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtKonfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 30));

        txtFullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));

        jPanel1.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 245, 238));
        jLabel11.setText("Confirm Pw");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, 30));

        radioMale.setForeground(new java.awt.Color(255, 245, 238));
        radioMale.setText("Male");
        jPanel1.add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 30));

        radioFemale.setForeground(new java.awt.Color(255, 245, 238));
        radioFemale.setText("Female");
        jPanel1.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bg register login.PNG"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 430));

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

        setSize(new java.awt.Dimension(410, 432));
        setLocationRelativeTo(null);
    }

    // btnRegister
    public void setRegisterListener(RegisterListener listener) {
        this.registerListener = listener;
    }

    public interface RegisterListener {
        void registerUser(String username, String password, String konfPassword, String fullname, String phone, boolean isNumeric, String gender);
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

    // jLabel6
    public void setjLabel6Listener(JLabel6Listener listener) {
        this.jLabel6Listener = listener;
    }

    public interface JLabel6Listener {

        void onClicked(java.awt.event.MouseEvent evt);
    }
}
