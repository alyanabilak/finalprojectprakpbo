package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuView extends JFrame {
    
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btnRegister2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private JPanel3Listener jPanel3Listener;
    private JLabel3Listener jLabel3Listener;
    private JLabel2Listener jLabel2Listener;
    private BtnRegister1Listener btnRegister1Listener;
    private BtnRegister2Listener btnRegister2Listener;
    public MenuView(){
        initComponents();
    }
    
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegister1 = new javax.swing.JButton();
        btnRegister2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
                if(jPanel3Listener != null){
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

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 245, 238));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Menu");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 400, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 245, 238));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Data Ticket");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, -1));

        btnRegister1.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister1.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister1.setText("Data Ticket");
        btnRegister1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnRegister1Listener != null){
                    btnRegister1Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 100, 140));

        btnRegister2.setBackground(new java.awt.Color(70, 130, 180));
        btnRegister2.setForeground(new java.awt.Color(255, 245, 238));
        btnRegister2.setText("BOOKING");
        btnRegister2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnRegister2Listener != null){
                    btnRegister2Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnRegister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, 140));


        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 245, 238));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Booking");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bg menu.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

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

        setSize(new java.awt.Dimension(410, 300));
        setLocationRelativeTo(null);
    }                                      
    
    // btnRegister1
    public void setBtnRegister1Listener(BtnRegister1Listener listener){
        this.btnRegister1Listener = listener;
    }
    
    public interface BtnRegister1Listener{
        void onClicked();
    }
    
    // btnRegister2
    public void setBtnRegister2Listener(BtnRegister2Listener listener){
        this.btnRegister2Listener = listener;
    }
    
    public interface BtnRegister2Listener{
        void onClicked();
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
}
