package MainProgram;

import Controller.LoginController;
import View.LoginView;
public class Driver6PM {
    public static void main(String[] args){
        LoginView menuLogin = new LoginView();
        LoginController controlLogin = new LoginController(menuLogin);
        menuLogin.setVisible(true);
    }
}
