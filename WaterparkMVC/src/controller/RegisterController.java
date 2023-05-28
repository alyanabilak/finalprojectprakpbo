package controller;

import helper.DatabaseHelper;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import view.LoginView;
import view.RegisterView;
import view.RegisterView.JLabel6Listener;

public class RegisterController extends JFrame {

    private final RegisterView registerView;
    private final DatabaseHelper databaseHelper;
    private int xx, xy;
    
    public RegisterController(RegisterView registerView){
        this.registerView = registerView;
        this.databaseHelper = new DatabaseHelper();
        
        registerView.setRegisterListener(new RegisterView.RegisterListener(){
            @Override
            public void registerUser(String username, String password, String konfPassword, String fullname, String phone, boolean isNumeric, String gender){
                if(fullname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fullname can't be empty");
                    return;
                } else if(username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username can't be empty");
                    return;
                } else if(phone.equals("")) {
                    JOptionPane.showMessageDialog(null, "Phone can't be empty");
                    return;
                } else if(phone.length() > 20) {
                    JOptionPane.showMessageDialog(null, "Phone number is too long");
                    return;
                } else if(!isNumeric) {
                    JOptionPane.showMessageDialog(null, "Phone number must be number");
                    return;
                } else if(password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password can't be empty");
                    return;
                } else if(!password.equals(konfPassword)) {
                    JOptionPane.showMessageDialog(null, "Password must be the same");
                    return;
                } else if(gender.equals("")) {
                    JOptionPane.showMessageDialog(null, "Gender can't be empty");
                    return;
                }
                
                if (saveUser(username, password, fullname, phone, isNumeric, gender)){
                    LoginView loginView = new LoginView();
                    LoginController loginController = new LoginController(loginView);
                    loginView.setVisible(true);
                    registerView.dispose();
                } else {
                    JOptionPane.showMessageDialog(registerView, "Registration Failed");
                }
            }
        });
        // jPanel3
        registerView.setjPanel3Listener(new RegisterView.JPanel3Listener(){
            @Override
            public void onDragged(java.awt.event.MouseEvent evt){
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                registerView.setLocation(x - xx, y - xy);
            }

            @Override
            public void onPressed(java.awt.event.MouseEvent evt) {
                xx = evt.getX();
                xy = evt.getY();
            }
        });
        
        // jLabel2
        registerView.setjLabel2Listener(new RegisterView.JLabel2Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                registerView.dispose();
            }
        });
        
        // jLabel3
        registerView.setjLabel3Listener(new RegisterView.JLabel3Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                registerView.setState(JFrame.ICONIFIED);
            }
        });
        
        // jLabel6
        registerView.setjLabel6Listener(new JLabel6Listener(){
            @Override
            public void onClicked(java.awt.event.MouseEvent evt){
                LoginView loginView = new LoginView();
                LoginController loginController = new LoginController(loginView);
                loginView.setVisible(true);
                registerView.dispose();
            }
        });
    }
    
    private boolean saveUser(String username, String password, String fullname, String phone, boolean isNumeric, String gender) {
        
        String sql = "INSERT INTO user VALUES(NULL, ?, ?, ?, ?, ?)";
        try { 
            PreparedStatement p = databaseHelper.getConnection().prepareStatement(sql);
            p.setString(1, fullname);
            p.setString(2, phone);
            p.setString(3, username);
            p.setString(4, password);
            p.setString(5, gender);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(registerView, "Registration Successfully! Login Please!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(registerView, e.getMessage());
        }
        
        return true;
    }
}
