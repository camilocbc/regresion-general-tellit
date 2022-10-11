package Definitions;

import Steps.loginSteps;


import Utilities.Credentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginDefinitions {

    Credentials credentials;
    @Steps
    loginSteps ls;
    @Given("^Abrir navegador$")
    public void abrirNavegador()  {

        ls.iniciarNavegador();
    }


    @When("^ingreso usuario y clave \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresoUsuarioYClave(String usermane, String password) throws Exception {
        boolean user = Boolean.parseBoolean(credentials.userProperty("uniqueUser"));

        if (user){
            ls.login(credentials.userProperty("web.tellit.user"),credentials.userProperty("web.tellit.password"));
        }else{
            ls.login(usermane,password);
        }

    }

    @Then("^Validar login correcto \"([^\"]*)\"$")
    public void validarLoginCorrecto(String mensaje){

        ls.validarLogin(mensaje);
    }
}
