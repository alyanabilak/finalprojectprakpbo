package controller;

import view.LoginView;
import view.LoginView.LoginListener;
import view.RegisterView;
import view.LoginView.RegisterViewListener;
import helper.DatabaseHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import view.LoginView.JLabel2Listener;
import view.LoginView.JPanel3Listener;
import view.LoginView.JLabel3Listener;
import view.MenuView;

public class LoginController extends JFrame{
    private LoginView loginView;
    private DatabaseHelper databaseHelper;
    private static int xx, xy;
    
    public LoginController(LoginView loginView){
        this.loginView = loginView;
        this.databaseHelper = new DatabaseHelper();
        
        // jPanel3
        loginView.setjPanel3Listener(new JPanel3Listener(){
            @Override
            public void onDragged(java.awt.event.MouseEvent evt){
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                loginView.setLocation(x - xx, y - xy);
            }

            @Override
            public void onPressed(java.awt.event.MouseEvent evt) {
                xx = evt.getX();
                xy = evt.getY();
            }
        });
        
        // jLabel2
        loginView.setjLabel2Listener(new JLabel2Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                loginView.dispose();
            }
        });
        
        // jLabel3
        loginView.setjLabel3Listener(new JLabel3Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                loginView.setState(JFrame.ICONIFIED);
            }
        });
        
        // btnLogin
        loginView.setLoginListener(new LoginListener(){
            @Override
            public void onLogin(String username, String password){
                String getUsername = loginView.getTxtUsername().getText();
                String getPassword = new String(loginView.getTxtPassword().getPassword());
                if (getUsername.equals("")) {
                    JOptionPane.showMessageDialog(loginView, "Username can't be empty");
                } else if (getPassword.equals("")) {
                    JOptionPane.showMessageDialog(loginView, "Password can't be empty");
                }
                if(validateLogin(username, password)){
                    JOptionPane.showMessageDialog(loginView, "Login Succesfully!");
                    MenuView menuView = new MenuView();
                    MenuController menuController = new MenuController(menuView);
                    menuView.setVisible(true);
                    loginView.dispose();
                } else {
                    JOptionPane.showMessageDialog(loginView, "Invalid username or password");
                }
            }
        });
        
        //Register
        loginView.setRegisterViewListener(new RegisterViewListener(){
            @Override
            public void onRegisterViewRequested(){
                RegisterView registerView = new RegisterView();
                RegisterController registerController = new RegisterController(registerView);
                registerView.setVisible(true);
                loginView.dispose();
            }
        });
    }
    private boolean validateLogin(String username, String password) {        
        String query = "SELECT * FROM user WHERE username = ? AND password = ?";
        try {
            PreparedStatement statement = databaseHelper.getConnection().prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            // Mengembalikan true jika hasil query mengandung baris pengguna dengan username dan password yang sesuai
            return resultSet.next();
        } catch (SQLException e) {
            System.err.println("Failed to validate login: " + e.getMessage());
        }
        return false;
    }
}
