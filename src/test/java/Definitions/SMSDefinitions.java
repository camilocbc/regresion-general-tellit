package Definitions;

import Steps.SMSSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;
public class SMSDefinitions {
    @Steps
    SMSSteps smsSteps;
    @When("ingreso a SMSi y envio mensaje escrito {string}{string} {string}{string}")
    public void ingresoASMSiIngreso(String numCel, String tipoMensaje, String contenidoMensaje,String firma) throws IOException {
        smsSteps.enviarSMS(numCel,tipoMensaje,contenidoMensaje,firma);
    }
    @When("ingreso a SMSi y envio mensaje plantilla {string}{string}{string}{string}")
    public void ingresoASMSiYEnvioMensajePlantilla(String numCel, String tipoMensaje, String plantilla,String firma) throws IOException {
        smsSteps.enviarSMSPlantilla(numCel,tipoMensaje,plantilla,firma);
    }
    @When("ingreso a SMSi creo plantilla y envio mensaje {string}{string}{string}{string}{string}")
    public void ingresoASMSiCreoPlantillaYEnvioMensaje(String numCel, String tipoMensaje, String contenidoMensaje,String nomPlantilla,String firma) throws IOException {
        smsSteps.crearPlantillaSMS(numCel, tipoMensaje, contenidoMensaje, nomPlantilla,firma);
    }
    @When("ingreso a SMSi edito plantilla y envio mensaje {string}{string}{string}{string}{string}{string}")
    public void ingresoASMSiEditoPlantillaYEnvioMensaje(String numCel, String tipoMensaje, String plantilla, String nomPlantilla,String contenidoMensaje,String firma) throws IOException {
        smsSteps.editarPlantilla( numCel, tipoMensaje, plantilla, nomPlantilla, contenidoMensaje,firma);
    }
    @When("ingreso a SMSi y creo Campana masiva Simple {string}{string}{string}{string}{string}")
    public void ingresoASMSiYCreoCampanaMasivaSimple(String fuente, String tipoMensaje,String separador, String numTelefono,String archivo) throws IOException {


       smsSteps.campanaMasivaselectArchivoSimpleconEncabezado(fuente,tipoMensaje,separador,numTelefono,archivo);
    }
    @When("Completo informacion de Campana Masiva plantilla simple {string}{string}{string}")
    public void completoInformacionDeCampanaMasivaDatosSimple(String nomCampana, String plantilla, String firma) throws IOException {
       smsSteps.campanaMasivaInfoSimpleSinFechaPlantilla(nomCampana,plantilla, firma);
    }
    @When("Envio Campana Masiva")
    public void envioCampanaMasiva() throws IOException {
        smsSteps.resumenCampanaMavisa();
    }
    @When("ingreso a SMSi y creo Campana masiva todas las columnas {string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingreso_a_sm_si_y_creo_campana_masiva_todas_las_columnas(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH,String archivo) throws IOException {


        smsSteps.campanaMasivaselectArchivoColumnas(fuente, tipoMensaje,separador,delimitador, numTelefono, idCorrelacion, FyH,archivo);
    }
    @When("ingreso a SMSi y creo Campana masiva con Url corta {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingreso_a_sm_si_y_creo_campana_masiva_con_url_corta_archivo(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH, String selectURL, String url,String archivo) throws IOException {


        smsSteps.campanaMasivaselectArchivoUrlCorta( fuente, tipoMensaje,separador,delimitador,numTelefono, idCorrelacion, FyH, selectURL, url,archivo);
    }
    @When("ingreso a SMSi y creo Campana masiva con Whatsapp {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingreso_a_sm_si_y_creo_campana_masiva_con_whatsapp(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH, String numWP, String mensajeWP,String archivo) throws IOException {


        smsSteps.campanaMasivaselectArchivoWhatsapp( fuente, tipoMensaje, separador, delimitador, numTelefono, idCorrelacion, FyH, numWP, mensajeWP,archivo);
    }
    @When("Completo informacion de Campana Masiva Digitando mensaje {string}{string}{string}")
    public void completoInformacionDeCampanaMasivaDigitandoMensaje(String nomCampana, String contCampana, String firma) throws IOException {
        smsSteps.campanaMasivaInfoDigitandoMJ(nomCampana,contCampana, firma);

    }
    @When("ingreso a SMSi y creo Campana masiva Doc Adjunto {string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingresoASMSiYCreoCampanaMasivaDocAdjunto(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH,String archivo,String docAdjunto) throws IOException {
        smsSteps.CampanaMasivaInfoMismoDocAd( fuente,  tipoMensaje, separador, delimitador,  numTelefono,  idCorrelacion,  FyH, archivo, docAdjunto);
    }
    @When("Completo informacion de Campana Masiva Programada {string}{string}{string}")
    public void completoInformacionDeCampanaMasivaProgramada(String nomCampana, String plantilla,String firma) throws IOException {
        smsSteps.campanaMasivaProgramada(nomCampana,plantilla,firma);
    }
    @When("Completo informacion de Campana Masiva Dependiente {string}{string}{string}")
    public void completoInformacionDeCampanaMasivaDependiente(String nomCampana, String plantilla,String firma) throws IOException {
        smsSteps.campanaMasivaDepentiente(nomCampana,plantilla, firma);
    }
    @When("Completo informacion de Campana Masiva Recurrente {string}{string}{string}{string}{string}{string}")
    public void completoInformacionDeCampanaMasivaRecurrente(String nomCampana, String plantilla,String numRep, String  rutina,String numOcurrencias, String firma) throws IOException {
       smsSteps.campanaMasivaRecurrente(nomCampana,plantilla,numRep,rutina,numOcurrencias,firma);
    }
    @Then("Validar envio SMSi")
    public void validarEnvioSMSi() throws IOException {
        smsSteps.validarEnvio();
    }
}
