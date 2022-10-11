package Steps;

import PageObjects.loginPageObject;
import net.thucydides.core.annotations.Step;


import java.io.IOException;

public class loginSteps {

    loginPageObject lp;
    @Step
    public void iniciarNavegador(){
        lp.open();
    }
    @Step
    public void login(String username,String password) throws IOException {

        lp.txtUsername(username);
        lp.txtPassword(password);
        lp.clickIngresar();
        lp.clickAceptarP();
        lp.clickEntiendo();
    }


    @Step
    public void validarLogin(String mensaje){
        lp.validarIngreso(mensaje);
    }
}
