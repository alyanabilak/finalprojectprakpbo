package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame{
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    
    private LoginListener loginListener;
    private RegisterViewListener registerListener;
    private JLabel2Listener jLabel2Listener;
    private JPanel3Listener jPanel3Listener;
    private JLabel3Listener jLabel3Listener;
    
    public LoginView(){
        initComponents();
    }
   
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                .addContainerGap(342, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 245, 238));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 245, 238));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kingdom Waterpark");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 400, -1));

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 245, 238));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 90, 30));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 130, 180)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 30));

        btnLogin.setBackground(new java.awt.Color(70, 130, 180));
        btnLogin.setForeground(new java.awt.Color(255, 245, 238));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                
                if (loginListener != null){
                    loginListener.onLogin(username, password);
                }
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 130, 180));
        jLabel6.setText("<html>\n<style>\na {\ncolor: rgb(255, 245, 238);\n}\n</style>\n<a href=\"\">Register now</a>\n</html>\n");
        
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (registerListener != null){
                    registerListener.onRegisterViewRequested();
                }
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 130, -1));

        jLabel7.setForeground(new java.awt.Color(255, 245, 238));
        jLabel7.setText("Don't  have account ?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bg register login.PNG"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 270));

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

        setSize(new java.awt.Dimension(400, 284));
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
    
    // Login
    public void setLoginListener(LoginListener listener) {
        this.loginListener = listener;
    }
    
    public interface LoginListener {
        void onLogin(String username, String password);
    }
    
    //Register
    public void setRegisterViewListener(RegisterViewListener listener){
        this.registerListener = listener;
    }
    
    public interface RegisterViewListener {
        void onRegisterViewRequested();
    }
    
    // getter
    public JTextField getTxtUsername(){
        return txtUsername;
    }
    
    public JPasswordField getTxtPassword(){
        return txtPassword;
    }
}
