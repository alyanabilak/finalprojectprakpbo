/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.DatabaseHelper;
import view.PrintView;
import view.PrintView.JLabel2Listener;
import view.PrintView.JLabel3Listener;
import view.PrintView.JPanel3Listener;
import view.PrintView.JTable1Listener;
import view.PrintView.btnJadwal2Listener;
import java.text.MessageFormat;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import view.MenuView;
import view.PrintView.btnEditListener;
import view.PrintView.btnHapusListener;
import view.PrintView.btnJadwal3Listener;
import view.PrintView.btnJadwal5Listener;

/**
 *
 * @author Lisbeth
 */
public class PrintController extends JFrame{
    private PrintView printView;
    private DatabaseHelper databaseHelper;
    private int xx, xy;
    private Connection connection;
    
    public PrintController(PrintView printView){
        this.printView = printView;
        this.databaseHelper = databaseHelper;
        // jPanel3
        printView.setjPanel3Listener(new JPanel3Listener(){
            @Override
            public void onDragged(java.awt.event.MouseEvent evt){
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                printView.setLocation(x - xx, y - xy);
            }

            @Override
            public void onPressed(java.awt.event.MouseEvent evt) {
                xx = evt.getX();
                xy = evt.getY();
            }
        });
        
        // jLabel2
        printView.setjLabel2Listener(new JLabel2Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                printView.dispose();
            }
        });
        
        // jLabel3
        printView.setjLabel3Listener(new JLabel3Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                printView.setState(JFrame.ICONIFIED);
            }
        });
        
        // jTable1
        printView.setJTable1Listener(new JTable1Listener() {
            @Override
            public void onClicked() {
                int row = printView.getJTable1SelectedRow();
                if (row == -1) {
                    return;
                }
                int idTicket = printView.getIdTicketAtRow(row);
            }
        });
        
        // btnJadwal2
        printView.setBtnJadwal2Listener(new btnJadwal2Listener(){
            @Override
            public void onClicked(){
                MessageFormat header = new MessageFormat("Ticket Waterpark");
                MessageFormat footer = new MessageFormat("Page {0}");
                try {
                    printView.printTable(header, footer);
                } catch (PrinterException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });
        
        // btnJadwal3
        printView.setBtnJadwal3Listener(new btnJadwal3Listener(){
            @Override
            public void onClicked(){
                printView.dispose();
            }
        });
        
        // btnJadwal5
        printView.setBtnJadwal5Listener(new btnJadwal5Listener(){
            @Override
            public void onClicked(){
                MenuView menuView = new MenuView();
                MenuController menuController = new MenuController(menuView);
                menuView.setVisible(true);
                printView.dispose();;
            }
        });
        
        // btnHapus
        printView.setBtnHapusListener(new btnHapusListener(){
            @Override
            public void onClicked(){
                hapusData();
            }
        });
        
        
        // btnEdit
        printView.setBtnEditListener(new btnEditListener(){
            @Override
            public void onClicked(){
                int row = printView.getJTable1SelectedRow();
                if (row == -1) {
                    return;
                }
                editData(row);
            }
        });
        printView.setReadDataListener(new PrintView.readDataListener() {
            @Override
            public void readData() {
                printView.readData();
            }
        });

        printView.readData(); // Call readData() to initially populate the table

    }
    
    private void hapusData(){
        databaseHelper = new DatabaseHelper();
        int row = printView.getJTable1SelectedRow();
        int idTicket = printView.getIdTicketAtRow(row);
        String query = "DELETE FROM ticket WHERE id=?";    
        try {
            connection = databaseHelper.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idTicket);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(printView, "Data berhasil dihapus!");
            printView.readData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(printView, "Error saat delete data, silahkan coba lagi!");
        } finally {
        }
    }
    
    private void editData(int row){
        databaseHelper = new DatabaseHelper();
        String query = "UPDATE ticket SET nama = ?, tanggal = ?, jumlah_tiket = ?, harga = ?, total_harga = ? WHERE id = ?";

        try {
            connection = databaseHelper.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            int id = Integer.parseInt((String) printView.getTable().getValueAt(row, 0));
            String nama = (String) printView.getTable().getValueAt(row, 1);
            String tanggal = (String) printView.getTable().getValueAt(row, 2);
            int jumlah_tiket = Integer.parseInt((String) printView.getTable().getValueAt(row, 3));
            double harga = Double.parseDouble((String) printView.getTable().getValueAt(row, 4));
            double total_harga = Double.parseDouble((String) printView.getTable().getValueAt(row, 5));

            statement.setString(1, nama);
            statement.setString(2, tanggal);
            statement.setInt(3, jumlah_tiket);
            statement.setDouble(4, harga);
            statement.setDouble(5, total_harga);
            statement.setInt(6, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
}
