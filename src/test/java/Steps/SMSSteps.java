package Steps;

import PageObjects.SMSPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SMSSteps {
    SMSPageObject smsPo;

    @Step
    public void enviarSMS(String numCel, String tipoMensaje, String contenidoMensaje,String firma) throws IOException {
        smsPo.clickSMS();
        smsPo.txtNumCel(numCel);
        smsPo.optionTipoMensaje(tipoMensaje);
        smsPo.txtContenidoMensaje(contenidoMensaje);
        smsPo.txtFirma(firma);
        smsPo.btnProcesar();
        smsPo.btnEnviar();
    }

    @Step
    public void enviarSMSPlantilla(String numCel, String tipoMensaje, String plantilla, String firma) throws IOException {
        smsPo.clickSMS();
        smsPo.txtNumCel(numCel);
        smsPo.optionTipoMensaje(tipoMensaje);
        smsPo.selectPlantilla(plantilla);
        smsPo.txtFirma(firma);
        smsPo.btnProcesar();
        smsPo.btnEnviar();
    }

    @Step
    public void crearPlantillaSMS(String numCel, String tipoMensaje, String contenidoMensaje,String nomPlantilla,String firma) throws IOException {
        smsPo.clickSMS();
        smsPo.txtNumCel(numCel);
        smsPo.optionTipoMensaje(tipoMensaje);
        smsPo.txtContenidoMensaje(contenidoMensaje);
        smsPo.btnCrearPlantilla();
        smsPo.txtNombrePlantilla(nomPlantilla);
        smsPo.btnGuardar();
        smsPo.txtFirma(firma);
        smsPo.btnProcesar();
        smsPo.btnEnviar();
    }

    @Step
    public void editarPlantilla(String numCel, String tipoMensaje, String plantilla, String nomPlantilla,String contenidoMensaje, String firma) throws IOException {
        smsPo.clickSMS();
        smsPo.txtNumCel(numCel);
        smsPo.optionTipoMensaje(tipoMensaje);
        smsPo.selectPlantilla(plantilla);
        smsPo.btnCrearPlantilla();
        //smsPo.txtNombrePlantilla(nomPlantilla);
        smsPo.txtContenidoPlantilla(contenidoMensaje);
        smsPo.btnGuardar();
        smsPo.txtFirma(firma);
        smsPo.btnProcesar();
        smsPo.btnEnviar();

    }

    @Step
    public void validarEnvio() throws IOException {

        smsPo.validarEnvio();
    }

    //Campana Mavisa
    @Step
    public void campanaMasivaselectArchivoSimpleconEncabezado(String fuente, String tipoMensaje,String separador, String numTelefono,String archivo) throws IOException {
        smsPo.clickSMS();
        smsPo.clickCampanaMasiva();
        smsPo.selectFuente(fuente);
        smsPo.selectTipoMensaje(tipoMensaje);
        smsPo.cargarArchivo(archivo);
        smsPo.selectSeparador(separador);
       // smsPo.selectDelimitador(delimitador);
        smsPo.selectNumeroTelefono(numTelefono);
     /*   smsPo.selectIdentificarCorrelacion(idCorrelacion);
        smsPo.selectColumnaFyH(FyH);
        smsPo.clickURLCorta();
        smsPo.selectTipoUrl(selectURL);
        smsPo.txtUrl();
        smsPo.clickSMSWP();
        smsPo.txtNumWp(numWP);
        smsPo.txtMensajeWP(mensajeWP);*/
        smsPo.btnSiguiente();
    }
    @Step
    public void campanaMasivaselectArchivoColumnas(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH,String archivo) throws IOException {
        smsPo.clickSMS();
        smsPo.clickCampanaMasiva();
        smsPo.selectFuente(fuente);
        smsPo.selectTipoMensaje(tipoMensaje);
        smsPo.cargarArchivo(archivo);
        smsPo.selectSeparador(separador);
        smsPo.selectDelimitador(delimitador);
        smsPo.selectNumeroTelefono(numTelefono);
        smsPo.selectIdentificarCorrelacion(idCorrelacion);
        smsPo.selectColumnaFyH(FyH);
     /*   smsPo.clickURLCorta();
        smsPo.selectTipoUrl(selectURL);
        smsPo.txtUrl();
        smsPo.clickSMSWP();
        smsPo.txtNumWp(numWP);
        smsPo.txtMensajeWP(mensajeWP);*/
        smsPo.btnSiguiente();
    }
    @Step
    public void campanaMasivaselectArchivoUrlCorta(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH, String selectURL, String url,String archivo) throws IOException {

        smsPo.clickSMS();
        smsPo.clickCampanaMasiva();
        smsPo.selectFuente(fuente);
        smsPo.selectTipoMensaje(tipoMensaje);
        smsPo.cargarArchivo(archivo);
        smsPo.selectSeparador(separador);
        smsPo.selectDelimitador(delimitador);
        smsPo.selectNumeroTelefono(numTelefono);
        smsPo.selectIdentificarCorrelacion(idCorrelacion);
        smsPo.selectColumnaFyH(FyH);
        smsPo.clickURLCorta();
        smsPo.selectTipoUrl(selectURL);
        smsPo.txtUrl(url);
      /*  smsPo.clickSMSWP();
        smsPo.txtNumWp(numWP);
        smsPo.txtMensajeWP(mensajeWP);*/
        smsPo.btnSiguiente();
    }
    @Step
    public void campanaMasivaselectArchivoWhatsapp(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH, String numWP, String mensajeWP,String archivo) throws IOException {
        smsPo.clickSMS();
        smsPo.clickCampanaMasiva();
        smsPo.selectFuente(fuente);
        smsPo.selectTipoMensaje(tipoMensaje);
        smsPo.cargarArchivo(archivo);
        smsPo.selectSeparador(separador);
        smsPo.selectDelimitador(delimitador);
        smsPo.selectNumeroTelefono(numTelefono);
        smsPo.selectIdentificarCorrelacion(idCorrelacion);
        smsPo.selectColumnaFyH(FyH);
     /*   smsPo.clickURLCorta();
        smsPo.selectTipoUrl(selectURL);
        smsPo.txtUrl();*/
        smsPo.clickSMSWP();
        smsPo.txtNumWp(numWP);
        smsPo.txtMensajeWP(mensajeWP);
        smsPo.btnSiguiente();
    }
    @Step
    public void campanaMasivaInfoSimpleSinFechaPlantilla(String nomCampana, String plantilla, String firma) throws IOException {
        smsPo.txtNombreCampana(nomCampana);
        smsPo.selectPlantilla(plantilla);
        smsPo.clickEtiquetaUrl();
       /* smsPo.txtContCampana(contCampana);
        smsPo.clickFechaCampana();
        smsPo.fechayHoraCampana(fecha);
        smsPo.horaFechaM(hora);
        smsPo.clickGuardar();
        smsPo.clickCampanaRecurrente();
        smsPo.txtRepetirCada(numRep);
        smsPo.selectRutina(rutina);
        smsPo.txtFinalizarDespues(numOcurrencias);
        smsPo.clickGuardarRecurrencia();
        smsPo.clickVelocidadCampana();
        smsPo.selectTiempoCampana(numRepeticion);
        smsPo.selectTiempoMinoHoras(minoHora);
        smsPo.selectCantidadMensajes(cantMensajes);
        smsPo.clickGuardarVelocidadC();*/
        smsPo.txtFirma(firma);
        smsPo.clickSiguienteInfoCampana();

    }
    @Step
    public void campanaMasivaInfo(String nomCampana, String plantilla, String contCampana, String fecha, String hora,String numRep, String rutina,String numOcurrencias, String numRepeticion, String minoHora,String cantMensajes) throws IOException {
        smsPo.txtNombreCampana(nomCampana);
        smsPo.selectPlantilla(plantilla);
        smsPo.txtContCampana(contCampana);
        smsPo.clickFechaCampana();
        smsPo.fechayHoraCampana(fecha);
        smsPo.horaFechaM();
        smsPo.clickGuardar();
       /* smsPo.clickCampanaRecurrente();
        smsPo.txtRepetirCada(numRep);
        smsPo.selectRutina(rutina);
        smsPo.txtFinalizarDespues(numOcurrencias);
        smsPo.clickGuardarRecurrencia();
        smsPo.clickVelocidadCampana();
        smsPo.selectTiempoCampana(numRepeticion);
        smsPo.selectTiempoMinoHoras(minoHora);
        smsPo.selectCantidadMensajes(cantMensajes);
        smsPo.clickGuardarVelocidadC();*/

        smsPo.clickSiguienteInfoCampana();

    }
    @Step
    public void resumenCampanaMavisa() throws IOException {

        smsPo.clickEnvia();
    }
    @Step
    public void muestraCampanaMavisa(String numMuestra,String tipoM,String numDestinatario) throws IOException {
        smsPo.clickMuestraCampanaM();
        smsPo.txtNumMuestrasTotales(numMuestra);
        smsPo.selectTipoMuestra(tipoM);
        smsPo.txtNumDestinatarioM(numDestinatario);
        smsPo.clickEnviaMuestra();
        smsPo.clickEnvia();
    }

    @Step
    public void campanaMasivaInfoDigitandoMJ(String nomCampana, String contCampana,String firma) throws IOException {
        smsPo.txtNombreCampana(nomCampana);
      //  smsPo.selectPlantilla(plantilla);
        smsPo.txtContCampana(contCampana);
        smsPo.clickEtiqueta();
        smsPo.clickEtiquetaCel();
        smsPo.clickEtiquetaUrl();
    /*    smsPo.clickFechaCampana();
        smsPo.fechayHoraCampana(fecha);
        smsPo.horaFechaM(hora);
        smsPo.clickGuardar();
        smsPo.clickCampanaRecurrente();
        smsPo.txtRepetirCada(numRep);
        smsPo.selectRutina(rutina);
        smsPo.txtFinalizarDespues(numOcurrencias);
        smsPo.clickGuardarRecurrencia();
        smsPo.clickVelocidadCampana();
        smsPo.selectTiempoCampana(numRepeticion);
        smsPo.selectTiempoMinoHoras(minoHora);
        smsPo.selectCantidadMensajes(cantMensajes);
        smsPo.clickGuardarVelocidadC();*/
        smsPo.txtFirma(firma);
        smsPo.clickSiguienteInfoCampana();

    }
    @Step
    public void CampanaMasivaInfoMismoDocAd(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH,String archivo,String docAdjunto) throws IOException {
        smsPo.clickSMS();
        smsPo.clickCampanaMasiva();
        smsPo.selectFuente(fuente);
        smsPo.selectTipoMensaje(tipoMensaje);
        smsPo.cargarArchivo(archivo);
        smsPo.selectSeparador(separador);
        smsPo.selectDelimitador(delimitador);
        smsPo.selectNumeroTelefono(numTelefono);
        smsPo.selectIdentificarCorrelacion(idCorrelacion);
        smsPo.selectColumnaFyH(FyH);
        smsPo.selectTipoArchivo("Mismo adjunto para todos");
        smsPo.cargarDocAdjunto(docAdjunto);
     /*   smsPo.clickURLCorta();
        smsPo.selectTipoUrl(selectURL);
        smsPo.txtUrl();
        smsPo.clickSMSWP();
        smsPo.txtNumWp(numWP);
        smsPo.txtMensajeWP(mensajeWP);*/
        smsPo.btnSiguiente();
    }
    @Step
    public void CampanaMasivaInfoDiferenteDocAd(String fuente, String tipoMensaje,String separador,String delimitador, String numTelefono, String idCorrelacion, String FyH,String archivo,String docAdjunto) throws IOException {
        smsPo.clickSMS();
        smsPo.clickCampanaMasiva();
        smsPo.selectFuente(fuente);
        smsPo.selectTipoMensaje(tipoMensaje);
        smsPo.cargarArchivo(archivo);
        smsPo.selectSeparador(separador);
        smsPo.selectDelimitador(delimitador);
        smsPo.selectNumeroTelefono(numTelefono);
        smsPo.selectIdentificarCorrelacion(idCorrelacion);
        smsPo.selectColumnaFyH(FyH);
        smsPo.selectTipoArchivo(" Adjunto personal para cada destino");
        smsPo.cargarDocAdjunto(docAdjunto);
     /*   smsPo.clickURLCorta();
        smsPo.selectTipoUrl(selectURL);
        smsPo.txtUrl();
        smsPo.clickSMSWP();
        smsPo.txtNumWp(numWP);
        smsPo.txtMensajeWP(mensajeWP);*/
        smsPo.btnSiguiente();
    }

    @Step
        public void campanaMasivaProgramada(String nomCampana, String plantilla, String firma) throws IOException {
        smsPo.txtNombreCampana(nomCampana);
        smsPo.selectPlantilla(plantilla);
        smsPo.clickEtiquetaUrl();
       // smsPo.txtContCampana(contCampana);
        smsPo.clickFechaCampana();
        //smsPo.fechayHoraCampana(fecha);
        smsPo.horaFechaM();
        smsPo.clickGuardar();
        /*smsPo.clickCampanaRecurrente();
        smsPo.txtRepetirCada(numRep);
        smsPo.selectRutina(rutina);
        smsPo.txtFinalizarDespues(numOcurrencias);
        smsPo.clickGuardarRecurrencia();
        smsPo.clickVelocidadCampana();
        smsPo.selectTiempoCampana(numRepeticion);
        smsPo.selectTiempoMinoHoras(minoHora);
        smsPo.selectCantidadMensajes(cantMensajes);
        smsPo.clickGuardarVelocidadC();*/
        smsPo.txtFirma(firma);
        smsPo.clickSiguienteInfoCampana();

    }
    @Step
        public void campanaMasivaDepentiente(String nomCampana, String plantilla,String firma) throws IOException {
        smsPo.txtNombreCampana(nomCampana);
        smsPo.selectPlantilla(plantilla);
        smsPo.clickEtiquetaUrl();
        smsPo.clickCampanaDepentiente();
        smsPo.clickSelectCampanaP();
        smsPo.clickGuardarCP();
        smsPo.txtFirma(firma);
        smsPo.clickSiguienteInfoCampana();

    }

    @Step
    public void campanaMasivaRecurrente(String nomCampana, String plantilla,String numRep, String  rutina,String numOcurrencias,String firma) throws IOException {
        smsPo.txtNombreCampana(nomCampana);
        smsPo.selectPlantilla(plantilla);
        smsPo.clickEtiquetaUrl();
        // smsPo.txtContCampana(contCampana);
       // smsPo.clickFechaCampana();
       // //smsPo.fechayHoraCampana(fecha);
       // smsPo.horaFechaM();
       // smsPo.clickGuardar();
        smsPo.clickCampanaRecurrente();
        smsPo.txtRepetirCada(numRep);
        smsPo.selectRutina(rutina);
        smsPo.txtFinalizarDespues(numOcurrencias);
        smsPo.clickGuardarRecurrencia();
     /*   smsPo.clickVelocidadCampana();
        smsPo.selectTiempoCampana(numRepeticion);
        smsPo.selectTiempoMinoHoras(minoHora);
        smsPo.selectCantidadMensajes(cantMensajes);
        smsPo.clickGuardarVelocidadC();*/
        smsPo.txtFirma(firma);
        smsPo.clickSiguienteInfoCampana();

    }
}
