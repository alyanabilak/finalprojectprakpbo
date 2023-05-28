package controller;

import helper.DatabaseHelper;
import javax.swing.*;
import view.BookingView;
import view.MenuView;
import view.PrintView;

public class MenuController extends JFrame{
    private MenuView menuView;
    private DatabaseHelper databaseHelper;
    private int xx, xy;
    
    public MenuController(MenuView menuView){
        this.menuView = menuView;
        this.databaseHelper = databaseHelper;
        
        // btnRegister1
        menuView.setBtnRegister1Listener(new MenuView.BtnRegister1Listener(){
            @Override
            public void onClicked(){
                PrintView printView = new PrintView();
                PrintController printController = new PrintController(printView);
                printView.setVisible(true);
                menuView.dispose();
            }
        });
        
        // btnRegister2
        menuView.setBtnRegister2Listener(new MenuView.BtnRegister2Listener(){
            @Override
            public void onClicked(){
                BookingView bookingView = new BookingView();
                BookingController bookingController = new BookingController(bookingView);
                bookingView.setVisible(true);
                menuView.dispose();
            }
        });
        
        // jPanel3
        menuView.setjPanel3Listener(new MenuView.JPanel3Listener(){
            @Override
            public void onDragged(java.awt.event.MouseEvent evt){
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                menuView.setLocation(x - xx, y - xy);
            }

            @Override
            public void onPressed(java.awt.event.MouseEvent evt) {
                xx = evt.getX();
                xy = evt.getY();
            }
        });
        
        // jLabel2
        menuView.setjLabel2Listener(new MenuView.JLabel2Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                menuView.dispose();
            }
        });
        
        // jLabel3
        menuView.setjLabel3Listener(new MenuView.JLabel3Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                menuView.setState(JFrame.ICONIFIED);
            }
        });
    }
}
