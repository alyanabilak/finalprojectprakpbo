package controller;

import helper.DatabaseHelper;
import javax.swing.*;
import view.BookingView;
import view.BookingTicketView;
import view.MenuView;

public class BookingController extends JFrame{
    private BookingView bookingView;
    private DatabaseHelper databaseHelper;
    public BookingController(BookingView bookingView){
        this.bookingView = bookingView;
        this.databaseHelper = databaseHelper;
        
        // btnJadwal
        bookingView.setBtnJadwalListener(new BookingView.btnJadwalListener(){
            @Override
            public void onClicked(){
                
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Selasa");
                bookingTicketView.getTxtTanggal().setText("13-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        //btnJadwal1
        bookingView.setBtnJadwal1Listener(new BookingView.btnJadwal1Listener(){
            @Override
            public void onClicked(){
                
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Selasa");
                bookingTicketView.getTxtTanggal().setText("13-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        // btnJadwal2
        bookingView.setBtnJadwal2Listener(new BookingView.btnJadwal2Listener(){
            @Override
            public void onClicked(){
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Minggu");
                bookingTicketView.getTxtTanggal().setText("18-06-2023");
                bookingTicketView.getTxtJam().setText("07.00 - 17.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
         
        // btnJadwal3
        bookingView.setBtnJadwal3Listener(new BookingView.btnJadwal3Listener(){
            @Override
            public void onClicked(){
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Senin");
                bookingTicketView.getTxtTanggal().setText("12-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        // btnJadwal4
        bookingView.setBtnJadwal4Listener(new BookingView.btnJadwal4Listener(){
            @Override
            public void onClicked(){
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Rabu");
                bookingTicketView.getTxtTanggal().setText("14-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        // btnJadwal5
        bookingView.setBtnJadwal5Listener(new BookingView.btnJadwal5Listener(){
            @Override
            public void onClicked(){
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Kamis");
                bookingTicketView.getTxtTanggal().setText("15-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        // btnJadwal6
        bookingView.setBtnJadwal6Listener(new BookingView.btnJadwal6Listener(){
            @Override
            public void onClicked(){
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Sabtu");
                bookingTicketView.getTxtTanggal().setText("17-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        // btnJadwal7
        bookingView.setBtnJadwal7Listener(new BookingView.btnJadwal7Listener(){
            @Override
            public void onClicked(){
                BookingTicketView bookingTicketView = new BookingTicketView();
                BookingTicketController bookingTicketController = new BookingTicketController(bookingTicketView);
                bookingTicketView.getTxtHari().setText("Jum'at");
                bookingTicketView.getTxtTanggal().setText("16-06-2023");
                bookingTicketView.getTxtJam().setText("15.00");
                bookingTicketView.setVisible(true);
                bookingView.dispose();
            }
        });
        
        // btnRegister1
        bookingView.setBtnRegister1Listener(new BookingView.btnRegister1Listener(){
            @Override
            public void onClicked(){
                MenuView menuView = new MenuView();
                MenuController menuController = new MenuController(menuView);
                menuView.setVisible(true);
                bookingView.dispose();
            }
        });
    }
}
