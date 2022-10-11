package PageObjects;

import Utilities.Utilities;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SMSPageObject extends PageObject {
    Utilities utilidades;

    private String btn_SMSEs = "//h1[contains(text(),'Enhance communications with')]";//id sms
    private String btn_SMSEn = "//h1[contains(text(),'Potencia las comunicaciones con cliente a')]";
    private String txt_numCel = "//*[@id='inputGsmList']";
    private String btn_envioNormalEs = "//label[normalize-space()='Enví\u00ADo normal']";
    private String btn_envioNormalEn = "//label[normalize-space()='Normal shipping']";
    private String btn_envioFlashEs = "//label[normalize-space()='Enví\u00ADo flash']";
    private String btn_envioFlashEn = "//label[normalize-space()='Flash shipping']";
    private String btn_envioPremiumEs = "//label[normalize-space()='Enví\u00ADo premium']";
    private String btn_envioPremiumEn = "//label[normalize-space()='Premium shipping']";
    private String txt_contenidoMensaje = "txtMessage";
    private String btn_procesar = "buttonProcess";
    private String select_plantilla = "selectTemplate";
    private String btn_enviar = "buttonSend";
    private String btn_crearPlantilla = "//*[@id='content-send-fast']/div[2]/div/form/div[4]/div[2]/a[2]/span";
    private String txt_nombrePlantilla = "templateTitle";
    private String btn_guardar = "//*[@id='template']/div/div/div[3]/button[2]";
    private String txt_editContenidoM = "templateModalContent";
    private String lbl_envioExitoso = "//*[@id='toast-container']/div";

    //Campana Masiva
    private String btn_campanaMasiva = "navSendArchive";
    private String select_fuente = "addresseeSourceSelect";
    private String select_TipoMensaje = "messageTypeSelect";
    private String checkbox_encabezado = "fileHasHeadersCheckBox";
    private String btn_cargarArchivo = "//input[@type='file']";
    private String select_separador = "fileSeparatorSelect";
    private String select_delimitador = "fileTextDelimiterSelect";
    private String select_telefono = "fileGsmColumnSelect";
    private String select_idCorrelacion = "fileCorrelationColumnSelect";
    private String select_horayFecha = "fileDateToSendColumnSelect";
    private String btn_UrlCorta = "shortUrlCheckBox";
    private String select_tipoURl = "uniqueUrlCheckBox";
    private String txt_url = "inputUrl";
    private String btn_whatsapp = "smsToWhatsappCheckBox";
    private String txt_numWP = "inputGsmSmsWhatsapp";
    private String txt_mensajeWP = "inputTextSmsWhatsapp";
    private By select_tipoArchivo = By.id("attachmentFileTypeSelect");
    private By btn_cargarDocAdjunto = By.xpath("//*[@id='step-1']/form/div[5]/div[2]/div[1]/div/div[2]/div/div[2]/div/a/input");
    private String btn_siguiente = "stepOneNextBtn";
    private String txt_nomCampana = "campaignNameInput";
    private String txt_contCampana = "campaignContent";
    private String btn_fechaCampana = "//*[@id='step-2']/form/div[5]/div[1]/div/div[1]/div[2]/div/div";
    private String date_fecha = "//*[@title='Select month']";
    private String date_ano = "//*[@title='Select year']";
    private String date_dia = "//div[2]/div/ngb-datepicker-month-view";
    private String txt_hora = "//fieldset/div/div[1]/input";
    private String txt_min = "//div/div[3]/input";
    private String btn_guardarFecha = "buttonSaveDate";
    private String btn_campanaRecurrente = "//*[@id='step-2']/form/div[5]/div[1]/div/div[2]/div[1]/div/div/div";
    private String txt_numRepticion = "//*[@id='recurrentCampaignModal']/div/div/div[2]/form/div/div[1]/div[2]/input";
    private By select_Rutina = By.id("recurrencePeriod");
    private By txt_finalizarDespues = By.xpath("//*[@formcontrolname='recurrenceEndCounter']");
    private String btn_guardarRC = "saveReccurrenceBtn";
    private By btn_dependiente = By.xpath("//*[@id='envioDependientes']/span/i");
    private By btn_selectCamProgramada = By.xpath("//*[@id='campanaDependiente']/div/div/div[2]/div[2]/table/tbody/tr/td[1]/label/span/i");
    private By btn_GuardarCP = By.id("saveDependentBtn");
    private String btn_velocidadCampana = "//*[@id='step-2']/form/div[4]/div[2]/div/div/div[1]";
    private String select_numRepeticion = "progressiveRecurrence";
    private String select_minoHoras = "progressivePeriod";
    private String select_cantMensajes = "progressiveFetch";
    private String btn_guardarVelocidadC = "saveSpeedBtn";
    private String btn_siguienteInfoCampana = "stepTwoNextBtn";
    //resumen campana
    private String btn_muestraCampanaM = "goToSample";
    private String txt_numMuestrasTotales = "totalSamples";
    private String select_tipoMuestra = "typeSample";
    private String txt_numDestinatario = "receiverSMSSample";
    private String btn_salirMuestra = "goToSendSamples";
    private String btn_enviarMavisa = "//*[@id='step-3']/form/div[2]/button[3]";
    private By btn_etiqueta = By.xpath("//*[@id='step-2']/form/div[3]/div/div[1]/div/div/button");
    private By btn_etiCel = By.xpath("//a[contains(text(),' [CELULAR] ')]");
    private By btn_etiUrl = By.xpath("//*[@id='step-2']/form/div[3]/div/div[1]/div[2]/span/button");
    private By txt_firma = By.id("inputClientSignature");
    public void clickSMS() throws IOException {
        if ($(By.xpath(btn_SMSEs)).isVisible()) {
            $(By.xpath(btn_SMSEs)).click();
        } else {
            $(By.xpath(btn_SMSEn)).click();
        }
        utilidades.tomaEvidencia("Dar click en iSMS");
    }

    public void txtNumCel(String numCel) throws IOException {

        $(By.xpath(txt_numCel)).type(numCel);
        utilidades.tomaEvidencia("Digitar numero de Celular");
    }

    public void optionTipoMensaje(String tipoMensaje) throws IOException {


        switch (tipoMensaje) {
            case "normal":
                if ($(By.xpath(btn_envioNormalEs)).isVisible()) {
                    if ($(By.xpath(btn_envioNormalEs)).isSelected()){

                    }else {
                        $(By.xpath(btn_envioNormalEs)).click();
                    }

                } else {
                    $(By.xpath(btn_envioNormalEn)).click();
                }
                break;
            case "fast":

                if ($(By.xpath(btn_envioFlashEs)).isVisible()) {
                    $(By.xpath(btn_envioFlashEs)).click();
                } else {
                    $(By.xpath(btn_envioFlashEn)).click();
                }

                break;
            case "premium":
                if ($(By.xpath(btn_envioPremiumEs)).isVisible()) {
                    $(By.xpath(btn_envioPremiumEs)).click();
                } else {
                    $(By.xpath(btn_envioPremiumEn)).click();
                }

                break;
            default:
                if ($(By.id(btn_envioNormalEs)).isVisible()) {
                    $(By.id(btn_envioNormalEs)).click();
                } else {
                    $(By.id(btn_envioNormalEn)).click();
                }
                break;
        }

        utilidades.tomaEvidencia("Seleccionar Tipo de Mensaje");

    }

    public void txtContenidoMensaje(String contenidoMensaje) throws IOException {

       $(By.id(txt_contenidoMensaje)).clear();
        utilidades.espera(5000);
        $(By.id(txt_contenidoMensaje)).type(contenidoMensaje);
        utilidades.tomaEvidencia("Digitar contenido del mensaje");
    }

    public void btnProcesar() throws IOException {
        utilidades.espera(2000);
        $(By.id(btn_procesar)).click();
        utilidades.tomaEvidencia("Dar click en Procesar");
    }

    public void btnEnviar() throws IOException {

        $(By.id(btn_enviar)).click();
        utilidades.tomaEvidencia("Dar click en Enviar");
    }

    public void selectPlantilla(String plantilla) throws IOException {

        Select list = new Select($(By.id(select_plantilla)));
        utilidades.espera(5000);
        list.selectByVisibleText(plantilla);
        utilidades.espera(5000);
        list.selectByVisibleText(plantilla);

        utilidades.tomaEvidencia("Seleccionar Plantilla");

    }

    public void btnCrearPlantilla() throws IOException {

        $(By.xpath(btn_crearPlantilla)).click();
        utilidades.tomaEvidencia("Dar click en crear plantilla");

    }

    public void txtNombrePlantilla(String nomPlantilla) throws IOException {
        Random random = new Random();



        if ( $(By.xpath("//option[contains(text(),'"+nomPlantilla.trim()+"')]")).isVisible()){


            $(By.id(txt_nombrePlantilla)).clear();
            $(By.id(txt_nombrePlantilla)).type(nomPlantilla +" "+ random.nextInt(1000));
        }else {
            btnCrearPlantilla();
            $(By.id(txt_nombrePlantilla)).clear();
            $(By.id(txt_nombrePlantilla)).type(nomPlantilla);

        }

        utilidades.tomaEvidencia("Digitar el nombre de la plantilla creada");

    }

    public void txtContenidoPlantilla(String contenidoPlantilla) throws IOException {


        $(By.id(txt_editContenidoM)).clear();


        $(By.id(txt_editContenidoM)).type(contenidoPlantilla);

        utilidades.tomaEvidencia("Digitar el el nuevo contenido de la plantilla");
    }

    public void btnGuardar() throws IOException {

        $(By.xpath(btn_guardar)).click();
        utilidades.tomaEvidencia("Dar click en guardar");

    }

    public void validarEnvio() throws IOException {

        String mensajeEnvio = $(By.xpath(lbl_envioExitoso)).getText();
        System.out.println("mensaje " + mensajeEnvio);
        assertEquals("Exito", mensajeEnvio);
        utilidades.tomaEvidencia("Valido Envio");


    }

    // Campana Masiva
    public void clickCampanaMasiva() throws IOException {
        $(By.id(btn_campanaMasiva)).click();
        utilidades.tomaEvidencia("Dar click en Campaña Masiva");

    }

    public void selectFuente(String fuente) throws IOException {
        Select list = new Select($(By.id(select_fuente)));
        utilidades.espera(2000);
        list.selectByVisibleText(fuente);
        utilidades.tomaEvidencia("Seleccionar Fuente");

    }

    public void selectTipoMensaje(String tipoMensaje) throws IOException {
        Select list = new Select($(By.id(select_TipoMensaje)));
        utilidades.espera(2000);
        list.selectByVisibleText(tipoMensaje);
        utilidades.tomaEvidencia("Seleccionar tipo de Mensaje");

    }

    public void clickArchivoEncabezado() throws IOException {

        $(By.id(checkbox_encabezado)).click();
        utilidades.tomaEvidencia("Dar click archivo encabezado");


    }


    public void cargarArchivo(String archivo) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader("config.properties"));
        switch (archivo) {
            case "xlsx":
                archivo = props.getProperty("pathFileXlsx");
                break;
            case "csv":
                archivo = props.getProperty("pathFileCsv");
                break;
            case "txt":
                archivo = props.getProperty("pathFileTxt");
                break;
        }
        System.out.println("path del archivo "+ archivo);
        upload(archivo).to($(By.xpath(btn_cargarArchivo)));



        utilidades.tomaEvidencia("Cargar Archivo");


    }

    public void selectSeparador(String separador) throws IOException {



    if ($(By.id(select_separador)).isVisible()){
        Select list = new Select($(By.id(select_separador)));
        utilidades.espera(2000);
        switch (separador){
            case "Coma":
                list.selectByValue("1");
                break;
            case "Punto y coma":
                list.selectByValue("2");
                break;
            case "Espacio":
                list.selectByValue("3");
                break;
        }
    }


        utilidades.tomaEvidencia("Seleccionar tipo de separador");



    }

    public void selectDelimitador(String delimitador) throws IOException {
        if ($(By.id(select_delimitador)).isVisible()) {
            Select list = new Select($(By.id(select_delimitador)));
            utilidades.espera(2000);
            list.selectByVisibleText(delimitador);

            utilidades.tomaEvidencia("Seleccionar Delimitador");
        }
    }
    public void selectNumeroTelefono(String columnaCel) throws IOException {
        Select list = new Select($(By.id(select_telefono)));
        utilidades.espera(2000);
        list.selectByVisibleText(columnaCel);
        utilidades.tomaEvidencia("Seleccionar campo del Telefono");

    }
    public void selectIdentificarCorrelacion(String Identificador) throws IOException {
        Select list = new Select($(By.id(select_idCorrelacion)));
        utilidades.espera(2000);
        list.selectByVisibleText(Identificador);
        utilidades.tomaEvidencia("Seleccionar identificador correlacion");
    }

    public void selectColumnaFyH(String fechayhora) throws IOException {
        Select list = new Select($(By.id(select_horayFecha)));
        utilidades.espera(2000);
        list.selectByVisibleText(fechayhora);
        utilidades.tomaEvidencia("Seleccionar Fecha y Hora");

    }

    public void clickURLCorta() throws IOException {
        $(By.id(btn_UrlCorta)).click();
        utilidades.tomaEvidencia("Dar click URL corta");

    }
    public void selectTipoUrl(String tipoURL) throws IOException {
        Select list = new Select($(By.id(select_tipoURl)));
        utilidades.espera(2000);
        list.selectByVisibleText(tipoURL);
        utilidades.tomaEvidencia("Seleccionar tipo de url");


    }
    public void txtUrl(String url) throws IOException {
        $(By.name(txt_url)).type(url);
        utilidades.tomaEvidencia("Digitar url");

    }
    public void clickSMSWP() throws IOException {
        $(By.id(btn_whatsapp)).click();
        utilidades.tomaEvidencia("Dar click en SMS Whatsapp");

    }

    public void txtNumWp(String numWP) throws IOException {
        $(By.name(txt_numWP)).type(numWP);
        utilidades.tomaEvidencia("Digitar Numero de Whatsapp");

    }

    public void txtMensajeWP(String mensajeWP) throws IOException {
        $(By.id(txt_mensajeWP)).type(mensajeWP);
        utilidades.tomaEvidencia("Digitar numero de Celular");
    }
    public void selectTipoArchivo(String tipoArc) throws IOException {
        Select list = new Select($(select_tipoArchivo));
        utilidades.espera(2000);
        list.selectByVisibleText(tipoArc);
        utilidades.tomaEvidencia("Seleccionar tipo de Archivo");
    }
    public void cargarDocAdjunto(String docAdjunto) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader("config.properties"));
        switch (docAdjunto) {
            case "PNG":
                docAdjunto = props.getProperty("pathDocPng");
                break;
            case "csv":
                docAdjunto = props.getProperty("pathFileCsv");
                break;
            case "txt":
                docAdjunto = props.getProperty("pathFileTxt");
                break;
        }

        System.out.println("path del archivo 2"+ docAdjunto);
        upload(docAdjunto).to($(btn_cargarDocAdjunto));



        utilidades.tomaEvidencia("Cargar Documento Adjunto");


    }
    public void btnSiguiente() throws IOException {
        $(By.id(btn_siguiente)).click();
        utilidades.tomaEvidencia("Dar click en Siguiente");

    }
    public void txtNombreCampana(String nomCampana) throws IOException {
        $(By.id(txt_nomCampana)).type(nomCampana);
        utilidades.tomaEvidencia("Digitar nombre de la campañna");
    }

    public void txtContCampana(String contCampana) throws IOException {
        $(By.id(txt_contCampana)).type(contCampana+" ");
        utilidades.tomaEvidencia("Digitar contenido de la campaña");

    }
    public void clickEtiqueta() throws IOException {
        $(btn_etiqueta).click();
        utilidades.tomaEvidencia("Dar Click en Etiqueta");

    }
    public void clickEtiquetaCel() throws IOException {

        //*[@id="step-2"]/form/div[3]/div/div[1]/div/div/div
        utilidades.espera(2000);
        $(btn_etiCel).click();
        utilidades.tomaEvidencia("Dar click en etiqueta de celular");
            }
    public void clickEtiquetaUrl() throws IOException {
        if ($(btn_etiUrl).isVisible()) {
            $(btn_etiUrl).click();
            utilidades.tomaEvidencia("Dar click en etiqueta de Url");
        }
    }
    public void txtFirma(String firma) throws IOException {
        utilidades.espera(2000);
        if ($(txt_firma).isVisible()){
            $(txt_firma).clear();
            $(txt_firma).type(firma);
            utilidades.tomaEvidencia("Digitar Firma");
        }

    }

    public void clickFechaCampana() throws IOException {
        $(By.xpath(btn_fechaCampana)).click();
        utilidades.tomaEvidencia("Dar click en fecha de la campaña");

    }

    public void fechayHoraCampana(String fecha) throws IOException {
        String diaInicio = fecha.split("-")[0];
        String mesInicio = fecha.split("-")[1];
        String anoInicio = fecha.split("-")[2];

        Select list = new Select($(By.xpath(date_fecha)));
        utilidades.espera(2000);
        list.selectByVisibleText(mesInicio);
        list = $(By.xpath(date_ano));
        list.selectByVisibleText(anoInicio);

        List<WebElementFacade> dia = findAll(date_dia);
        for (WebElementFacade e : dia){
            System.out.println(e.getAttribute("data-day").trim());//pendiente
            if (e.getAttribute("data-day").trim().equals(diaInicio)){
                e.click();
                break;
            }
        }

        utilidades.tomaEvidencia("Seleccionar Fecha de la campaña");



    }

    public void horaFechaM() throws IOException {
      //  String hora = Hora.split(":")[0];
       // String min = Hora.split(":")[1];
     //   $(By.xpath(txt_hora)).clear();
      //  $(By.xpath(txt_hora)).type(hora);
         String min = $(By.xpath(txt_min)).getValue();
        System.out.println("min ");
         int ent = Integer.parseInt(min);
         ent = ent+ 15;
         min = String.valueOf(ent);
        System.out.println(min);
        $(By.xpath(txt_min)).clear();
        $(By.xpath(txt_min)).type(min);
        utilidades.tomaEvidencia("Digitar Hora de la campaña");
    }

    public void clickGuardar() throws IOException {
        $(By.id(btn_guardarFecha)).click();
        utilidades.tomaEvidencia("Dar click en Guardar");

    }
    public void clickCampanaRecurrente() throws IOException {
        $(By.xpath(btn_campanaRecurrente)).click();
        utilidades.tomaEvidencia("Dar click en Campaña Recurente");

    }

    public void txtRepetirCada(String numRep) throws IOException {
        $(By.xpath(txt_numRepticion)).clear();
        $(By.xpath(txt_numRepticion)).type(numRep);
        utilidades.tomaEvidencia("Digitar cantidad de repeticiones");

    }
    public void selectRutina(String rutina) throws IOException {

        Select list = new Select($(select_Rutina));
        utilidades.espera(2000);
        switch (rutina){
            case "Dia":
                list.selectByValue("1");
                break;
            case "Semana":
                list.selectByValue("2");
                break;
            case "Mes":
                list.selectByValue("3");
                break;
            default:
                list.selectByValue("1");
                break;
        }
        utilidades.tomaEvidencia("Seleccionar Rutina");

    }
    public void txtFinalizarDespues(String numOcurrencias) throws IOException {
        $(txt_finalizarDespues).clear();
        $(txt_finalizarDespues).type(numOcurrencias);
        utilidades.tomaEvidencia("Digitar el numero de ocurrencias");

    }
    public void clickGuardarRecurrencia() throws IOException {
        $(By.id(btn_guardarRC)).click();
        utilidades.tomaEvidencia("Dar click en Guardar");
    }
// Campana Dependiente

    public void clickCampanaDepentiente() throws IOException {
        $(btn_dependiente).click();
        utilidades.tomaEvidencia("Dar click en Campaña Depentiente");
    }
    public void clickSelectCampanaP() throws IOException {
        $(btn_selectCamProgramada).click();
        utilidades.tomaEvidencia("Dar click en Campaña Pogramada");
    }
    public void clickGuardarCP() throws IOException {
        $(btn_GuardarCP).click();
        utilidades.tomaEvidencia("Dar click en Campaña Pogramada");
    }

    public void clickVelocidadCampana() throws IOException {
        $(By.xpath(btn_velocidadCampana)).click();
        utilidades.tomaEvidencia("Dar click en Velocidad de Campaña");
    }
    public void selectTiempoCampana(String numRepeticion) throws IOException {
        Select list = new Select($(By.id(select_numRepeticion)));
        utilidades.espera(2000);
        list.selectByVisibleText(numRepeticion);
        utilidades.tomaEvidencia("Seleccionar numero de repeciones de campaña");
    }
    public void selectTiempoMinoHoras(String minoHora) throws IOException {
        Select list = new Select($(By.id(select_minoHoras)));
        utilidades.espera(2000);
        switch (minoHora){
            case "Minutos":
                list.selectByValue("5");
                break;
            case "Horas":
                list.selectByValue("6");
                break;
        }
        utilidades.tomaEvidencia("Seleccionar tiempo en min o Horas");
    }
    public void selectCantidadMensajes(String cantMensajes) throws IOException {
        Select list = new Select($(By.id(select_cantMensajes)));
        utilidades.espera(2000);
        list.selectByVisibleText(cantMensajes);
        utilidades.tomaEvidencia("Seleccionar cantidad de mensajes");

    }

    public void clickGuardarVelocidadC() throws IOException {
        $(By.id(btn_guardarVelocidadC)).click();
        utilidades.tomaEvidencia("Dar click en Guardar");
    }
    public void clickSiguienteInfoCampana() throws IOException {
        $(By.id(btn_siguienteInfoCampana)).click();
        utilidades.tomaEvidencia("Dar click en Siguiente");

    }
    //resumen campana
    public void clickMuestraCampanaM() throws IOException {
        $(By.id(btn_muestraCampanaM)).click();
        utilidades.tomaEvidencia("Dar click en Muestra");

    }
    public void txtNumMuestrasTotales(String numMuestra) throws IOException {
        $(By.id(txt_numMuestrasTotales)).type(numMuestra);
        utilidades.tomaEvidencia("Digitar numero de muestras totales");

    }
    public void selectTipoMuestra(String tipoM) throws IOException {
        Select list = new Select($(By.id(select_tipoMuestra)));
        utilidades.espera(2000);
        switch (tipoM){
            case "Primero":
                list.selectByValue("1");
                break;
            case "Ultimo":
                list.selectByValue("2");
                break;
            case "Aleatorio":
                list.selectByValue("3");
                break;
            default:

                break;
        }
        utilidades.tomaEvidencia("Seleccionar tipo de muestra");

    }

    public void txtNumDestinatarioM(String numDestinatario) throws IOException {
        $(By.id(txt_numDestinatario)).clear();
        $(By.id(txt_numDestinatario)).type(numDestinatario);
        utilidades.tomaEvidencia("Digitar numero destinatario");

    }

    public void clickEnviaMuestra() throws IOException {
        $(By.id(btn_salirMuestra)).click();
        utilidades.tomaEvidencia("Dar click en enviar Muestra");

    }
    public void clickEnvia() throws IOException {
        $(By.xpath(btn_enviarMavisa)).click();
        utilidades.tomaEvidencia("Dar click en Enviar");

    }
}
