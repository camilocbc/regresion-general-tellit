package PageObjects;

import Utilities.Utilities;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ReportsPageObject extends PageObject {

    Utilities utilidades;

    private String btn_reportes = "//h2[normalize-space()='Informe con las respectivas gráficas y tablas de la campaña enviada.']";
    private String btn_reports = "//h2[normalize-space()='Sent campaign report with its graphs and tables.']";
    private String btn_estadisticas = "//p[normalize-space()='Estadísticas']";
    private String btn_statistics = "//p[normalize-space()='Statistics']";
    private String btn_campanas = "//p[normalize-space()='Campañas']";
    private String btn_campaigns = "//p[normalize-space()='Campaigns']";
    private String btn_detallados = "//p[normalize-space()='Detallados']";
    private String btn_detailed = "//p[normalize-space()='Detailed']";
    private String btn_interacciones = "//p[normalize-space()='Interacciones']";
    private String btn_interactions = "//p[normalize-space()='Interactions']";
    private String btn_inicio = "//*[@id='Reportes']/li[1]/a/span";
    private String btn_SMS = "//a[normalize-space()='SMS']";
    private String select_fecha ="dateRangeSelect";
    private String btn_usuario = "//*[@id='multiSelectUser']/div/div[1]/span";
    private String btn_todosUsuario = "//*[@id='multiSelectUser']/div/div[2]/ul[1]/li[1]";
    private By  btn_buscar = By.xpath("//button[normalize-space()='Buscar']");
    private By  lbl_totalSmsEnviados = By.xpath("//*[@id='container-sms-statistics']/div[3]/div[1]/div/div/h4");
    private By  btn_menuHamburgesa = By.xpath("//app-header/header/nav/div[1]/a/i");
    private By  btn_mHSMS = By.xpath("//*[@id='mainSubMenu']/li[2]");
    private By  btn_mHDetallado = By.xpath("//*[@id='SmsSubMenu']/li[3]/a");
    private By  btn_cargarFiltros = By.xpath("//div[2]/div[1]/div[2]/div/form/div[1]/div[6]/p");
    private By  btn_columna = By.xpath("//*[@id='multiSelectColumnOptions']/div/div[1]/span");
    private By  btn_estado = By.xpath("//*[@id='multiSelectGroupStatus']/div/div[1]/span");
    private By  btn_seleccionarTodosColumnas = By.xpath("//*[@id='multiSelectColumnOptions']/div/div[2]/ul[1]/li[1]/div");
    private By  btn_seleccionarTodosEstados = By.xpath("//*[@id='multiSelectGroupStatus']/div/div[2]/ul[1]/li[1]");
    private By  btn_descargaDetallado = By.xpath("//div[2]/div[2]/div/div[2]/div/button");
    private By  btn_campana = By.id("bell-notifications");
    private By  btn_descargardesdeCampana = By.xpath("//div[3]/div/ul/li[1]/ul/li/ul/li[1]/div[2]/div/a[2]/i");
    private String txt_buscarUsuario = "//*[@id='multiSelectUser']/div/div[2]/ul[1]/li[2]/input";
    private String txt_referencia = "//*[@formcontrolname='reference']";
    private String btn_search = "//button[normalize-space()='Search']";

    public void clickReports (){
        try {
            $(By.xpath(btn_reportes)).click();
        }catch (Exception e){
            $(By.xpath(btn_reports)).click();
        }

    }
    public void clickInicio (){
        $(By.xpath(btn_inicio)).click();
    }
    public void clickSMS(){
        $(By.xpath(btn_SMS)).click();
    }
    public void clickSMSreportesEstadistica(){
                try {
                    $(By.xpath(btn_estadisticas)).click();
                }catch (Exception e){
                    $(By.xpath(btn_statistics)).click();
                }
    }
    public void clickSMSreportesCampanas(){
                try {
                    $(By.xpath(btn_campanas)).click();
                }catch (Exception e){
                    $(By.xpath(btn_campaigns)).click();
                }
    }
    public void clickSMSreportesDetallados(){
                try {
                    $(By.xpath(btn_detallados)).click();
                }catch (Exception e){
                    $(By.xpath(btn_detailed)).click();
                }
    }
    public void clickSMSreportesInteracciones(){
                try {
                    $(By.xpath(btn_interacciones)).click();
                }catch (Exception e){
                    $(By.xpath(btn_interactions)).click();
                }
    }

    public void selectFecha(String fecha){
        Select list = new Select($(By.id(select_fecha)));
        switch (fecha) {
            case "Hoy":
                list.selectByValue("0");
                break;
            case "Semana":
                list.selectByValue("1");
            break;
            case "Mes":
                list.selectByValue("2");
            break;
            case "selecionarFecha":
                list.selectByValue("3");
            break;
            default:
                list.selectByValue("0");
                break;

        }
    }
    public void clickUsuario(){
        $(By.xpath(btn_usuario)).click();
    }
    public void selectUsuario(String usuario){
        if (usuario.equals("TODOS") ){

        }else if (usuario.contains(",")){
            clickTodos();
            int nUsuarios = 0;
            char temp;
            for (int i = 0; i < usuario.length(); i++) {
                temp = usuario.charAt(i);
                if (temp ==  ','){
                    nUsuarios++;
                }

            }
            String[] usuarios = new String[nUsuarios];
            for (int f = 0; f == nUsuarios; f++) {
                usuarios[f]=usuario.split(",")[f];
                $(By.xpath(txt_buscarUsuario)).type(usuarios[f]);
                clickUsuario();
                $(By.xpath(txt_buscarUsuario)).type(usuarios[f]);
                $(By.xpath("//ul[normalize-space()='"+usuarios[f]+"']")).click();
                $(By.xpath(txt_buscarUsuario)).click();



                System.out.println(usuarios[f]);
            }
        }else{
            clickTodos();
            $(By.xpath(txt_buscarUsuario)).type(usuario);
            clickUsuario();
            $(By.xpath(txt_buscarUsuario)).type(usuario);
            $(By.xpath("//ul[normalize-space()='"+usuario+"']")).click();
            $(By.xpath(txt_buscarUsuario)).click();
        }

    }
    public void clickTodos(){
            $(By.xpath(btn_todosUsuario)).click();
    }
    public void txtReferencia(String referencia){
        $(By.xpath(txt_referencia)).type(referencia);
    }




    public void clickBuscar(){
        try {
            $(btn_buscar).click();
        }catch (Exception e){
            $(btn_search).click();
        }

    }

    public void getTotalSMSEnviados(){
        utilidades.espera(2000);
      String total =  $(lbl_totalSmsEnviados).getText();
        System.out.println(total);
    }
    public void clickMenuHamburguesa(){
        $(btn_menuHamburgesa).click();
    }
    public void clickMHSMS(){
        $(btn_mHSMS).click();
    }
    public void clickMHDetallado(){
        $(btn_mHDetallado).click();
    }
    public void clickCargarMasFiltros(){
        $(btn_cargarFiltros).click();
    }
    public void clickColumnas(){
        $(btn_columna).click();
    }
    public void clickEstados(){
        $(btn_estado).click();
    }

    public void clickSeleccionarTodosColumnas(){
        $(btn_seleccionarTodosColumnas).click();
    }
    public void clickSeleccionarTodosEstados(){
        $(btn_seleccionarTodosEstados).click();
    }
    public void clickDescargar(){
        utilidades.espera(5000);
        try {
            utilidades.scrollWebelement($(btn_descargaDetallado));
            $(btn_descargaDetallado).click();
        }catch (Exception e){
            $(btn_descargaDetallado).click();
        }

    }
    public void clickCampana(){
        utilidades.espera(3000);
        $(btn_campana).click();
    }
    public void clickDescargardesdeCampana(){
        $(btn_descargardesdeCampana).click();
    }

    public void detalladoReporte(){
        String cantidad = $(By.xpath("//*[@id='table-responsive-content']/tbody")).getAttribute("tr");
        System.out.println(cantidad);
        for (int i = 1; i < 10; i++){
            String xpath = "//*[@id='table-responsive-content']/tbody/tr[1]/td[1]";
        }
    }

}
