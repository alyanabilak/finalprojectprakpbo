package controller;

import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.*;
import view.BookingTicketView;
import view.BookingTicketView.JLabel2Listener;
import view.BookingTicketView.JLabel3Listener;
import view.BookingTicketView.JPanel3Listener;
import view.BookingTicketView.btnBookListener;
import view.BookingTicketView.btnRegister1Listener;
import view.BookingTicketView.btnRegister2Listener;
import view.BookingTicketView.btnRegister3Listener;
import view.BookingTicketView.btnRegisterListener;
import view.BookingTicketView.txtHargaListener;
import view.BookingTicketView.txtJumlahTiketListener;
import view.BookingTicketView.txtMouseExitedListener;
import view.BookingView;
import view.PrintView;

public class BookingTicketController extends JFrame {
    private BookingTicketView bookingTicketView;
    private DatabaseHelper databaseHelper;
    private Connection connection;
    private int xx, xy;
    
    public BookingTicketController(BookingTicketView bookingTicketView){
        this.bookingTicketView = bookingTicketView;
        this.databaseHelper = databaseHelper;
        // jPanel3
        bookingTicketView.setjPanel3Listener(new JPanel3Listener(){
            @Override
            public void onDragged(java.awt.event.MouseEvent evt){
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                bookingTicketView.setLocation(x - xx, y - xy);
            }

            @Override
            public void onPressed(java.awt.event.MouseEvent evt) {
                xx = evt.getX();
                xy = evt.getY();
            }
        });
        
        // jLabel2
        bookingTicketView.setjLabel2Listener(new JLabel2Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                bookingTicketView.dispose();
            }
        });
        
        // jLabel3
        bookingTicketView.setjLabel3Listener(new JLabel3Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                bookingTicketView.setState(JFrame.ICONIFIED);
            }
        });
        
        // txtMouse
        bookingTicketView.setTxtMouseExitedListener(new txtMouseExitedListener(){
            @Override
            public void onExited(){
                setHarga();
            }
        });
        
        // txtJumlahTiket
        bookingTicketView.setTxtJumlahTiketListener(new txtJumlahTiketListener(){
            @Override
            public void onChanged(){
                setTotalHarga();
            }
        });
        
        // btnRegister
        bookingTicketView.setBtnRegisterListener(new btnRegisterListener(){
            @Override
            public void onClicked(){
                if(bookingTicketView.getTxtTotalHarga().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Harap Isi Total Harga");
                return;
            }

            if(bookingTicketView.getTxtUangBayar().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Harap Isi Uang Pembayaran");
                return;
            }

            double totalHarga = Double.parseDouble(bookingTicketView.getTxtTotalHarga().getText());
            double uangBayar = Double.parseDouble(bookingTicketView.getTxtUangBayar().getText());

            if(uangBayar < totalHarga) {
                JOptionPane.showMessageDialog(null, "Gagal melakukan perhitungan, uang yang anda bayarkan kurang!");
                return;
            }

            double uangKembali = uangBayar - totalHarga;
            bookingTicketView.getTxtUangKembali().setText(String.valueOf(uangKembali));
            }
        });
        
        // btnRegister1
        bookingTicketView.setBtnRegister1Listener(new btnRegister1Listener(){
            @Override
            public void onClicked(){
                BookingView bookingView = new BookingView();
                BookingController bookingController = new BookingController(bookingView);
                bookingView.setVisible(true);
                bookingTicketView.dispose();
            }
        });
        
        // btnRegister2
        bookingTicketView.setBtnRegister2Listener(new btnRegister2Listener(){
            @Override
            public void onClicked(){
                bookingTicketView.getTxtNamaPengunjung().setText("");
                bookingTicketView.getTxtHari().setText("");
                bookingTicketView.getTxtTanggal().setText("");
                bookingTicketView.getTxtJam().setText("");
                bookingTicketView.getTxtJumlahTiket().setValue((int) 0);
                bookingTicketView.getTxtHarga().setText("");
                bookingTicketView.getTxtTotalHarga().setText("");
                bookingTicketView.getTxtUangBayar().setText("");
                bookingTicketView.getTxtUangKembali().setText("");
            }
        });
        
        // btnRegister3
        bookingTicketView.setBtnRegister3Listener(new btnRegister3Listener(){
            @Override
            public void onClicked(){
                DatabaseHelper databaseHelper = new DatabaseHelper();
                String nama = bookingTicketView.getTxtNamaPengunjung().getText();
                String tanggal = bookingTicketView.getTxtTanggal().getText();
                int jumlah_tiket = (int) bookingTicketView.getTxtJumlahTiket().getValue();
                double harga = Double.parseDouble(bookingTicketView.getTxtHarga().getText());
                double total_harga = Double.parseDouble(bookingTicketView.getTxtTotalHarga().getText());

                if(nama.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
                    return;
                } else if(!tanggal.matches("\\d{2}-\\d{2}-\\d{4}")) {
                    JOptionPane.showMessageDialog(null, "Tanggal salah format, harusnya DD-MM-YYYY");
                    return;
                } else if(jumlah_tiket <= 0) {
                    JOptionPane.showMessageDialog(null, "Jumlah tiket harus lebih besar dari 0");
                    return;
                } else if(harga <= 0) {
                    JOptionPane.showMessageDialog(null, "Harga harus lebih besar dari 0");
                    return;
                }
                connection = databaseHelper.getConnection();
                String query = "INSERT INTO ticket (nama, tanggal, jumlah_tiket, harga, total_harga) VALUES (?,?,?,?,?)";
                try{
                    PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
                    statement.setString(1, nama);
                    statement.setString(2, tanggal);
                    statement.setInt(3, jumlah_tiket);
                    statement.setDouble(4, harga);
                    statement.setDouble(5, total_harga);
                    statement.executeUpdate();
                } catch (SQLException e){
                    JOptionPane.showMessageDialog(bookingTicketView, "Kesalahan input data");
                } finally {
                    PrintView printView = new PrintView();
                    PrintController printController = new PrintController(printView);
                    printView.setVisible(true);
                    bookingTicketView.dispose();
                }
            }
        });
        
        // txtHarga
        bookingTicketView.setTxtHargaListener(new txtHargaListener(){
            @Override
            public void onExited(){
                setTotalHarga();
            }
        });
        
        // btnBook
        bookingTicketView.setBtnBookListener(new btnBookListener(){
            @Override
            public void onClicked(){
                if(bookingTicketView.getTxtUangKembali().getText().equals("")) {
                    JOptionPane.showMessageDialog(bookingTicketView, "Harap Hitung uang kembalian!");
                    return;
                }
            }
        });
    }

    private void setHarga() {
        String hari = bookingTicketView.getTxtHari().getText().toLowerCase();

        switch (hari) {
            case "senin":
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                bookingTicketView.getTxtHarga().setText("40000");
                break;
            case "sabtu":
            case "minggu":
                 bookingTicketView.getTxtHarga().setText("50000");
                break;
            case "":
                 bookingTicketView.getTxtHarga().setText("");
                break;
            default:
                 bookingTicketView.getTxtHarga().setText("Hari tidak valid");
                break;
        }
    }
    
    private void setTotalHarga() {
        int jumlah_tiket = (int) bookingTicketView.getTxtJumlahTiket().getValue();
        String hargaText = bookingTicketView.getTxtHarga().getText();

        if (hargaText.equals("")) {
            bookingTicketView.getTxtTotalHarga().setText("");
            return;
        }

        try{
            double harga = Double.parseDouble(hargaText);
            double totalHarga = jumlah_tiket * harga;

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedTotalHarga = decimalFormat.format(totalHarga);

            if (totalHarga == Math.floor(totalHarga)) {
                formattedTotalHarga = decimalFormat.format(totalHarga);
            }

            bookingTicketView.getTxtTotalHarga().setText(formattedTotalHarga);
        }catch (Exception e){
            bookingTicketView.getTxtTotalHarga().setText("");
        }
    }
}
