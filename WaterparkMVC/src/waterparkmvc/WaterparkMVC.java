
package waterparkmvc;

import view.LoginView;
import controller.LoginController;

public class WaterparkMVC {

    public static void main(String[] args) {
        // TODO code application logic here
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView);
        loginView.setVisible(true);
    }
    
}
