package Definitions;

import Steps.WhatsAppSteps;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class WhatsAppDefinitions {
    @Steps
    WhatsAppSteps WAstep;

    @When("ingreso a WhatsApp y envio mensaje con plantilla {string}{string} {string}")
    public void ingreso_a_whats_app_y_envio_mensaje_con_plantilla(String lineaA, String numCel,String plantilla) throws IOException {
        WAstep.WhatsAppCampanaRapida(lineaA,numCel,plantilla);
    }
    @When("ingreso a WhatsApp y envio Campana Masiva {string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingresoAWhatsAppYEnvioCampanaMasiva(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion) throws IOException {
        WAstep.WhatsAppCampanaMasiva( archivo, plantilla, doc, separador, delimitador, codPais,  selectNum,  idCorrelacion);
    }
    @When("ingreso informacion de campana {string}")
    public void ingresoInformacionDeCampana(String nombreCamp) throws IOException {
        WAstep.WhatsAppInformacionChampSimple(nombreCamp);
    }
    @When("Envio Campana Masiva WhatsApp")
    public void ingresoInformacionDeCampana() throws IOException {
        WAstep.EnvioCampanaMasiva();
    }
    @When("ingreso a WhatsApp y envio Campana Masiva Doc en archivo{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingresoAWhatsAppYEnvioCampanaMasiva(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion,String arcAdj) throws IOException {
    WAstep.WhatsAppCampanaMasivaDoc( archivo, plantilla, doc, separador, delimitador, codPais,  selectNum,  idCorrelacion, arcAdj);
    }
    @When("ingreso a WhatsApp y envio Campana Masiva Digito URL {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingresoAWhatsAppYEnvioCampanaMasivaDigitoURL(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion,String arcAdj,String urlMedia) throws IOException {
    WAstep.WhatsAppCampanaMasivaUrl( archivo, plantilla, doc, separador, delimitador, codPais,  selectNum,  idCorrelacion, arcAdj, urlMedia);
    }
    @When("ingreso a WhatsApp y envio Campana Masiva selecciono imagen {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void ingresoAWhatsAppYEnvioCampanaMasivaSeleccionoImagen(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion,String arcAdj,String docAdj) throws IOException {
        WAstep.WhatsAppCampanaMasivaDocArc( archivo, plantilla, doc, separador, delimitador, codPais,  selectNum,  idCorrelacion, arcAdj, docAdj);
    }
}
