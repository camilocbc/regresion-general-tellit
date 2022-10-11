package PageObjects;

import Utilities.Utilities;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class WhatsAppPageObject extends PageObject {
    Utilities utilidades;

    private By btn_WhatsAppEs = By.xpath("//h1[contains(text(),'Ensure effective interaction with your users ')]");
    private By btn_WhatsAppEn = By.xpath("//h1[contains(text(),'Asegura la interacción efectiva con tus usuarios a')]");
    private By selectLineaA =By.id("selectLineOrigin");
    private By txt_numCel =By.id("inputGsmList");
    private By seletcPlantilla = By.id("selectTemplate");
    private By btn_procesar = By.id("buttonProcess");
    private By btn_campanaMas = By.id("navSendArchive");
    private By selectfuenteD = By.id("addresseeSourceSelect");
    private By selectPlantilla = By.xpath("//*[@formcontrolname='templateId']");
    private By btn_encabezado = By.id("fileHasHeadersCheckBox");
    private By btn_archivo = By.xpath("//*[@id='tab-1-panel']/app-select/div/form/div[3]/div/div[1]/div[2]/div[2]/div/a/input");
    private By selectSeparador = By.id("fileSeparatorSelect");
    private By selectDelimitador = By.id("fileTextDelimiterSelect");
    private By selectCodPais = By.xpath("//*[@formcontrolname='codeCountryFileColumnSelect']");
    private By selectNumCel = By.xpath("//*[@formcontrolname='gsmFileColumnSelect']");
    private By selectIdCorrelacion = By.id("fileCorrelationColumnSelect");
    private By selectArcAdjunto = By.xpath("//*[@formcontrolname='attachmentFileColumnSelect']");
    private By txt_url = By.id("url");
    private By  btn_cargarArchivo = By.xpath("//*[@id='tab-1-panel']/app-select/div/form/div[5]/div/div/div[2]/div/div[2]/div/a/input");
    private By  btn_siguiente = By.id("stepOneNextBtn");
    // Informacion Campaña Mavisa
    private By  txt_nomCampana = By.id("campaignNameInput");
    private By  btn_etiquetaTitulo = By.xpath("//*[@id='headerWhatsapp1']/div/div[1]/span");
    private By  btn_etiquetaTitulo1 = By.xpath("//*[@id='headerWhatsapp1']/div/div[2]/ul[2]/li[1]/div");
    private By  btn_etiquetaPlantilla = By.xpath("//*[@id='headerWhatsapp2']/div/div[1]/span");
    private By  btn_etiquetaPlantilla1 = By.xpath("//*[@id='headerWhatsapp1']/div/div[2]/ul[2]/li[1]/div");
    private By  btn_etiquetaPlantilla2 = By.xpath("//*[@id='headerWhatsapp1']/div/div[2]/ul[2]/li[2]/div");
    private By  btn_fechaE = By.xpath("//*[@id='tab-2-panel']/app-info/div/form/div[4]/div/div/app-calendar/div[2]/div");
    //elementos de hora y fecha pendiente

    private By txt_min = By.xpath("//*[@aria-label='Minutes']");
    private By  btn_guardarF = By.id("buttonSaveDate");
    //campanaRecurrente
    private By btn_campanaRecurrente = By.xpath("//*[@id='tab-2-panel']/app-info/div/form/div[4]/div/div/div/div[1]/div/div/div/span");
    private By txt_numRepeticion = By.xpath("//*[@formcontrolname='recurrence']");
    private By select_Rutina = By.id("recurrencePeriod");
    private By txt_finalizarDespues = By.xpath("//*[@formcontrolname='recurrenceEndCounter']");
    private By btn_guardarRC = By.xpath("//app-programcampaigndialog/div[3]/button[2]");
    //campaña Programada
    private By btn_dependiente = By.xpath("//*[@id='envioDependientes']/span/i");
    private By btn_selectCamProgramada = By.xpath("//*[@id='campanaDependiente']/div/div/div[2]/div[2]/table/tbody/tr/td[1]/label/span/i");
    private By btn_aceptarCP = By.xpath("//app-dependentcampaigndialog/div[3]/button[2]");
    //Resumen de Campaña
    private By btn_muestra = By.id("goToSample");
    private By txt_nMuestras = By.id("totalSamples");

    private By select_tipoMuestra = By.id("typeSample");
    private By txt_numCelMuestra = By.id("inputGsmList");
    private By btn_enviarM = By.xpath("//app-sampledialog/div[3]/button[2]");
    private By btn_enviar = By.xpath("//*[@id='tab-3-panel']/app-summary/block-ui/div/form/div[2]/button[3]");

    public void clickWhatsApp() throws IOException {
        if ($(btn_WhatsAppEs).isVisible()){
            $(btn_WhatsAppEs).click();
        }else {
            $(btn_WhatsAppEn).click();
        }


        utilidades.tomaEvidencia("dar click en WhatsApp");
    }
    public void selectLineaA(String linea) throws IOException {
        $(selectLineaA).selectByVisibleText(linea);
        utilidades.tomaEvidencia("Seleccionar Linea WhatsApp");
    }
    public void txtNumCel(String numCel) throws IOException {
        $(txt_numCel).clear();
        $(txt_numCel).type(numCel);
        utilidades.tomaEvidencia("Digitar numero de celular");
    }

    public void seletcPlantilla(String plantilla) throws IOException {
        $(seletcPlantilla).selectByVisibleText(plantilla);
        utilidades.tomaEvidencia("Seleccionar Plantilla");
    }
    public void clickProcesar() throws IOException {
        $(btn_procesar).click();
        utilidades.tomaEvidencia("dar click en Procesar");
    }
    public void clickCampanaMasiva() throws IOException {
        $(btn_campanaMas).click();
        utilidades.tomaEvidencia("dar click en Campaña Mavisa");
    }
    public void selectfuenteD(String fuenteD) throws IOException {
        $(selectfuenteD).selectByVisibleText(fuenteD);

        utilidades.tomaEvidencia("Seleccionar Fuente destinatarios");

    }
    public void selectPlantilla(String plantilla) throws IOException {
        $(selectPlantilla).selectByVisibleText(plantilla);

        utilidades.tomaEvidencia("Seleccionar Plantilla");

    }
    public void clickEncabezado() throws IOException {
        $(btn_encabezado).click();

        utilidades.tomaEvidencia("Seleccionar Plantilla");

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
        upload(archivo).to($(btn_archivo));

        utilidades.tomaEvidencia("Cargar Archivo");
    }
    public void selectSeparador(String separador) throws IOException {
        Select list = new Select ($(selectSeparador));

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

        utilidades.tomaEvidencia("Seleccionar Separador");

    }
    public void selectDelimitador(String delimitador) throws IOException {
        if (!delimitador.equals("")){
            $(selectDelimitador).selectByVisibleText(delimitador);

            utilidades.tomaEvidencia("Seleccionar Delimitador");
        }else{

        }


    }
    public void selectCodPais(String CodPais) throws IOException {

        Select list = new Select($(selectCodPais));

        list.selectByVisibleText(CodPais);



        utilidades.tomaEvidencia("Seleccionar codigo pais");

    }
    public void selectNumCel(String NumCel) throws IOException {
        $(selectNumCel).selectByVisibleText(NumCel);

        utilidades.tomaEvidencia("Seleccionar numero de celular");

    }
    public void selectIdCorrelacion(String idCorrelacion) throws IOException {
        if(!idCorrelacion.equals("")) {
            $(selectIdCorrelacion).selectByVisibleText(idCorrelacion);

            utilidades.tomaEvidencia("Seleccionar Identificador Correlacion");
        }
    }

    public void selectTituloDoc(){

    }
    public void selectArcAdjunto(String ArcAdjunto) throws IOException {
        System.out.println(ArcAdjunto);
        $(selectArcAdjunto).selectByVisibleText(ArcAdjunto);

        utilidades.tomaEvidencia("Seleccionar la fuente del archivo adjunto");

    }
    public void txtURL(String url) throws IOException {
        $(txt_url).clear();
        $(txt_url).type(url);

        utilidades.tomaEvidencia("Digitar URL adjunto");

    }
    //Configurar Adecuadamente
    public void cargarDocumento(String docAdj) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader("config.properties"));
        switch (docAdj) {
            case "png":
                docAdj = props.getProperty("pathDocPng");
                break;
            case "pdf":
                docAdj = props.getProperty("pathDocPdf");
                break;
            case "mp4":
                docAdj = props.getProperty("pathDocMp4");
                break;
        }
        System.out.println("path del Documento "+ docAdj);
        upload(docAdj).to($(btn_cargarArchivo));



        utilidades.tomaEvidencia("Cargar Archivo");



    }

    public void clickSiguiente() throws IOException {
        $(btn_siguiente).click();

        utilidades.tomaEvidencia("Dar click en Siguiente");

    }
    public void txtNomCampana(String nomCampana) throws IOException {
        $(txt_nomCampana).clear();
        $(txt_nomCampana).type(nomCampana);

        utilidades.tomaEvidencia("Digitar nombre de campaña");

    }
    public void clickEtiquetaTitulo() throws IOException {
        $(btn_etiquetaTitulo).click();

        utilidades.tomaEvidencia("Dar click en Etiqueta Titulo");

    }
    public void clickEtiquetaTitulo1() throws IOException {
        $(btn_etiquetaTitulo1).click();

        utilidades.tomaEvidencia("Dar click en Etiqueta para el Titulo");

    }public void clickEtiquetaPlantilla() throws IOException {
        $(btn_etiquetaPlantilla).click();

        utilidades.tomaEvidencia("Dar click en Etiqueta Plantilla");

    }public void clickEtiquetaPlantilla1() throws IOException {
        if ($(btn_etiquetaPlantilla1).isSelected()) {
            $(btn_etiquetaPlantilla1).click();
        }else {
            $(btn_etiquetaPlantilla2).click();
        }
        utilidades.tomaEvidencia("Dar click en Etiqueta para la  Plantilla");

    }
    public void clickFecha() throws IOException {
        $(btn_fechaE).click();

        utilidades.tomaEvidencia("Dar click en Fecha");

    }
    public void horaFecha() throws IOException {
        String min = $(txt_min).getValue();
        System.out.println("min ");
        int ent = Integer.parseInt(min);
        ent = ent+ 15;
        min = String.valueOf(ent);
        System.out.println(min);
        $(txt_min).clear();
        $(txt_min).type(min);
        utilidades.tomaEvidencia("Digitar Hora de la campaña");
    }
    public void clickGuardarF() throws IOException {
        $(btn_guardarF).click();

        utilidades.tomaEvidencia("Dar click en Guardar Fecha");

    }
    public void clickCampanaRecurrente() throws IOException {
        $(btn_campanaRecurrente).click();

        utilidades.tomaEvidencia("Dar click en Campana Recurrente");

    }
    public void txtNumRepeticion(String numRepeticion) throws IOException {
        $(txt_numRepeticion).clear();
        $(txt_numRepeticion).type(numRepeticion);

        utilidades.tomaEvidencia("Digitar el Numero Repeticion");

    }
    public void selectRutina(String selectR) throws IOException {



        switch (selectR) {
            case "Dia":
                $(select_Rutina).selectByVisibleText("1");
                break;
            case "Semana":
                $(select_Rutina).selectByVisibleText("2");
                break;
            case "Mes":
                $(select_Rutina).selectByVisibleText("3");
                break;
            default:
                $(select_Rutina).selectByVisibleText("1");
                break;
        }
        utilidades.tomaEvidencia("Seleccionar Rutina");

    }

    public void txtFinalizarDespues(String finalizarD) throws IOException {
        $(txt_finalizarDespues).type(finalizarD);

        utilidades.tomaEvidencia("Digitar el Finalizar despues");
    }

    public void clickGuardarRC() throws IOException {
        $(btn_guardarRC).click();

        utilidades.tomaEvidencia("Dar click en Guardar Repeticion");
    }
    public void clickDependiente() throws IOException {
        $(btn_dependiente).click();

        utilidades.tomaEvidencia("Dar click en Dependiente");
    }
    public void clickSelectCamProgramada() throws IOException {
        $(btn_selectCamProgramada).click();

        utilidades.tomaEvidencia("Dar click en Seleccionar Campaña Programada");
    }
    public void clickAceptarCP() throws IOException {
        $(btn_aceptarCP).click();

        utilidades.tomaEvidencia("Dar click en Aceptar Campaña Programada");
    }
    public void clickMuestra() throws IOException {
        $(btn_muestra).click();

        utilidades.tomaEvidencia("Dar click en Aceptar Campaña Programada");
    }
    public void txtNMuestras(String numMuestras) throws IOException {
        $(txt_nMuestras).clear();
        $(txt_nMuestras).type(numMuestras);

        utilidades.tomaEvidencia("Digitar Numero de Muestras");
    }
    public void selectTipoM(String tipo) throws IOException {
        $(select_tipoMuestra).selectByVisibleText(tipo);
        utilidades.tomaEvidencia("Seleccionar Tipo de Muestras");
    }
    public void txtNumCelMuestra(String numCelM) throws IOException {
        $(txt_numCelMuestra).clear();
        $(txt_numCelMuestra).type(numCelM);

        utilidades.tomaEvidencia("Digitar Numero de Celular para la muestras");
    }
    public void clickEnviarM() throws IOException {

        $(btn_enviarM).click();

        utilidades.tomaEvidencia("Dar click en enviar Muestrar");
    }
    public void clickEnviar() throws IOException {

        $(btn_enviar).click();

        utilidades.tomaEvidencia("Dar click en enviar WhatsApp Campaña Mavisa");
    }





}
