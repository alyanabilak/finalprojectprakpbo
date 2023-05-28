/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import helper.DatabaseHelper;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PrintView extends JFrame{
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnJadwal2;
    private javax.swing.JButton btnJadwal3;
    private javax.swing.JButton btnJadwal5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private JPanel3Listener jPanel3Listener;
    private JLabel3Listener jLabel3Listener;
    private JLabel2Listener jLabel2Listener;
    private btnJadwal3Listener btnJadwal3Listener;
    private btnJadwal2Listener btnJadwal2Listener;
    private btnJadwal5Listener btnJadwal5Listener;
    private btnHapusListener btnHapusListener;
    private btnEditListener btnEditListener;
    public readDataListener readDataListener;
    private JTable1Listener jTable1Listener;
    private int id_ticket;
    private JTable jTable1;
    private DefaultTableModel tableModel;
    private DatabaseHelper databaseHelper;
    private Connection connection;
    
    public PrintView(){
        initComponents();
        databaseHelper = new DatabaseHelper();
        connection = databaseHelper.getConnection();
        initTable();
    }
     
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnJadwal2 = new javax.swing.JButton();
        btnJadwal3 = new javax.swing.JButton();
        btnJadwal5 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

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
                .addContainerGap(502, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 130, 180));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Data Ticket");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 550, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Tanggal", "Jumlah Tiket", "Harga", "Total Harga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jTable1Listener != null){
                    jTable1Listener.onClicked();
                }
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 90));

        btnJadwal2.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal2.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal2.setText("Print"); // NOI18N
        btnJadwal2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnJadwal2Listener != null){
                    btnJadwal2Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnJadwal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, -1));

        btnJadwal3.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal3.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal3.setText("Exit"); // NOI18N
        btnJadwal3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnJadwal3Listener != null){
                    btnJadwal3Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnJadwal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 60, -1));

        btnJadwal5.setBackground(new java.awt.Color(70, 130, 180));
        btnJadwal5.setForeground(new java.awt.Color(255, 245, 238));
        btnJadwal5.setText("Menu"); // NOI18N
        btnJadwal5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnJadwal5Listener != null){
                    btnJadwal5Listener.onClicked();
                }
            }
        });
        jPanel1.add(btnJadwal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 60, -1));

        btnHapus.setBackground(new java.awt.Color(70, 130, 180));
        btnHapus.setForeground(new java.awt.Color(255, 245, 238));
        btnHapus.setText("Hapus"); // NOI18N
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnHapusListener != null){
                    btnHapusListener.onClicked();
                }
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 70, -1));

        btnEdit.setBackground(new java.awt.Color(70, 130, 180));
        btnEdit.setForeground(new java.awt.Color(255, 245, 238));
        btnEdit.setText("Edit"); // NOI18N
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnEditListener != null){
                    btnEditListener.onClicked();
                }
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(560, 303));
        setLocationRelativeTo(null);
    }
    
    
    // id tiket
    
    // jTable1    
    public void setJTable1Listener(JTable1Listener listener) {
        this.jTable1Listener = listener;
    }

    public interface JTable1Listener {
        void onClicked();
    }

    public int getJTable1SelectedRow() {
        return jTable1.getSelectedRow();
    }

    public int getIdTicketAtRow(int row) {
        return Integer.parseInt((String) tableModel.getValueAt(row, 0));
    }

    public void clearTableModel() {
        tableModel.setRowCount(0);
    }

    public void addRowToTableModel(Object[] rowData) {
        tableModel.addRow(rowData);
    }

    public TableModel getTable() {
        return tableModel;
    }
    
    
    // btnJadwal2
    public void setBtnJadwal2Listener(btnJadwal2Listener listener){
        this.btnJadwal2Listener = listener;
    }
    
    public interface btnJadwal2Listener {
        void onClicked();
    }
    public void printTable(MessageFormat header, MessageFormat footer) throws PrinterException {
        jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
    }
    
    // btnJadwal3
    public void setBtnJadwal3Listener(btnJadwal3Listener listener){
        this.btnJadwal3Listener = listener;
    }
    
    public interface btnJadwal3Listener {
        void onClicked();
    }
    
    //btnJadwal5
    public void setBtnJadwal5Listener (btnJadwal5Listener listener){
        this.btnJadwal5Listener = listener;
    }
    public interface btnJadwal5Listener {
        void onClicked();
    }
    
    // btnHapus
    public void setBtnHapusListener (btnHapusListener listener){
        this.btnHapusListener = listener;
    }
    public interface btnHapusListener{
        void onClicked();
    }
    
    // btnEdit 
    public void setBtnEditListener (btnEditListener listener){
        this.btnEditListener = listener;
    }
    public interface btnEditListener{
        void onClicked();
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
    
    private void initTable(){
        tableModel = new DefaultTableModel();
        jTable1.setModel(tableModel);
        tableModel.addColumn("Id");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Jumlah Tiket");
        tableModel.addColumn("Harga");
        tableModel.addColumn("Total Harga");
    }
    
    public void setReadDataListener(readDataListener listener){
        this.readDataListener = listener;
    }
    
    public interface readDataListener{
        void readData();
    }
    
    
    public void readData() {
        databaseHelper = new DatabaseHelper();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();

        try {
            clearTableModel();
            connection = databaseHelper.getConnection();
            String query = "SELECT * FROM ticket";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Object[] ticket = new Object[6];
                ticket[0] = resultSet.getString("id");
                ticket[1] = resultSet.getString("nama");
                ticket[2] = resultSet.getString("tanggal");
                ticket[3] = resultSet.getString("jumlah_tiket");
                ticket[4] = resultSet.getString("harga");
                ticket[5] = resultSet.getString("total_harga");

                tableModel.addRow(ticket);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
