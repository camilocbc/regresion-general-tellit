package PageObjects;


import Utilities.Utilities;
import Utilities.BaseUtil;
import io.cucumber.java.Scenario;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


import org.openqa.selenium.By;


import java.io.IOException;


import static org.junit.Assert.assertEquals;


@DefaultUrl("page:webdriver.base.url")

public class loginPageObject extends PageObject {
    Utilities utilidades;

 private String txt_user = "username";
 private String txt_password = "password";
 private String btn_Ingresar = "//button[contains(text(),'Ingresar')]";
 private String lbl_productos = "//app-home/div/div[1]/div/div[1]/h2";
    private String btn_entiendo = "//button[contains(text(),'Entendido')]";
    private By btn_aceptarP = By.xpath("//*[@id='modalTerms']/div/div/div[3]/button[2]");

 public void txtUsername (String username) throws IOException {

     $(By.id(txt_user)).sendKeys(username);
    utilidades.tomaEvidencia("Ingreso usuario");

 }

 public void txtPassword(String password) throws IOException {

     $(By.id(txt_password)).sendKeys(password);
     utilidades.tomaEvidencia("Ingreso contraseña");

 }

 public void clickIngresar() throws IOException {

     $(By.xpath(btn_Ingresar)).click();


     utilidades.tomaEvidencia("Dar click en Ingresar");

 }
 public void clickAceptarP() throws IOException {
if ($(btn_aceptarP).isVisible()) {
    $(btn_aceptarP).click();


    utilidades.tomaEvidencia("Dar click en Aceptar Politicas");
}
 }

 public void validarIngreso(String mensaje){
     String text = $(By.xpath(lbl_productos)).getText();
     assertEquals(mensaje, text);
 }
 public void clickEntiendo() throws IOException {
     if ($(By.xpath(btn_entiendo)).isVisible()) {

         $(By.xpath(btn_entiendo)).click();
         utilidades.tomaEvidencia("Dar Click Entiendo");
         utilidades.leerExcel();

     }

 }



}
