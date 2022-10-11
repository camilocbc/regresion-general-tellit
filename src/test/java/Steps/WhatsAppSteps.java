package Steps;

import PageObjects.WhatsAppPageObject;
import net.thucydides.core.annotations.Step;


import java.io.IOException;

public class WhatsAppSteps {

    WhatsAppPageObject WApo;

    @Step
    public void WhatsAppCampanaRapida(String lineaA, String numCel,String plantilla) throws IOException {
        WApo.clickWhatsApp();
        WApo.selectLineaA(lineaA);
        WApo.txtNumCel(numCel);
        WApo.selectPlantilla(plantilla);
        WApo.clickProcesar();
    }
    //1 Seleccionar Archivo
    @Step
    public void WhatsAppCampanaMasiva(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion) throws IOException {
        WApo.clickWhatsApp();
        WApo.clickCampanaMasiva();
        WApo.selectfuenteD(archivo);
        WApo.selectPlantilla(plantilla);
        WApo.cargarArchivo(doc);
        WApo.selectSeparador(separador);
        WApo.selectDelimitador(delimitador);
        WApo.selectCodPais(codPais);
        WApo.selectNumCel(selectNum);
        WApo.selectIdCorrelacion(idCorrelacion);
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppCampanaMasivaDocArc(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion,String arcAdj,String docAdj) throws IOException {
        WApo.clickWhatsApp();
        WApo.clickCampanaMasiva();
        WApo.selectfuenteD(archivo);
        WApo.selectPlantilla(plantilla);
        WApo.cargarArchivo(doc);
        WApo.selectSeparador(separador);
        WApo.selectDelimitador(delimitador);
        WApo.selectCodPais(codPais);
        WApo.selectNumCel(selectNum);
        WApo.selectIdCorrelacion(idCorrelacion);
        WApo.selectArcAdjunto(arcAdj);
        WApo.cargarDocumento(docAdj);
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppCampanaMasivaDoc(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion,String arcAdj) throws IOException {
        WApo.clickWhatsApp();
        WApo.clickCampanaMasiva();
        WApo.selectfuenteD(archivo);
        WApo.selectPlantilla(plantilla);
        WApo.cargarArchivo(doc);
        WApo.selectSeparador(separador);
        WApo.selectDelimitador(delimitador);
        WApo.selectCodPais(codPais);
        WApo.selectNumCel(selectNum);
        WApo.selectIdCorrelacion(idCorrelacion);
        WApo.selectArcAdjunto(arcAdj);
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppCampanaMasivaUrl(String archivo,String plantilla,String doc,String separador,String delimitador,String codPais, String selectNum, String idCorrelacion,String arcAdj,String urlMedia) throws IOException {
        WApo.clickWhatsApp();
        WApo.clickCampanaMasiva();
        WApo.selectfuenteD(archivo);
        WApo.selectPlantilla(plantilla);
        WApo.cargarArchivo(doc);
        WApo.selectSeparador(separador);
        WApo.selectDelimitador(delimitador);
        WApo.selectCodPais(codPais);
        WApo.selectNumCel(selectNum);
        WApo.selectIdCorrelacion(idCorrelacion);
        WApo.selectArcAdjunto(arcAdj);
        WApo.txtURL(urlMedia);
        WApo.clickSiguiente();
    }

    //2 Informacion de Campaña
    @Step
    public void WhatsAppInformacionChampSimple(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampProgramada(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickFecha();
        WApo.horaFecha();
        WApo.clickGuardarF();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampRecurrente(String nombreCamp, String numRepeticion, String rutina,String finDespues) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickCampanaRecurrente();
        WApo.txtNumRepeticion(numRepeticion);
        WApo.selectRutina(rutina);
        WApo.txtFinalizarDespues(finDespues);
        WApo.clickGuardarRC();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampDependiente(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampETitulo(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaTitulo();
        WApo.clickEtiquetaTitulo1();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampEPlantilla(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaPlantilla();
        WApo.clickEtiquetaPlantilla1();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampETyP(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaTitulo();
        WApo.clickEtiquetaTitulo1();
        WApo.clickEtiquetaPlantilla();
        WApo.clickEtiquetaPlantilla1();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampProgramadaETitulo(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaTitulo();
        WApo.clickEtiquetaTitulo1();
        WApo.clickFecha();
        WApo.horaFecha();
        WApo.clickGuardarF();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampProgramadaEPlantilla(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaPlantilla();
        WApo.clickEtiquetaPlantilla1();
        WApo.clickFecha();
        WApo.horaFecha();
        WApo.clickGuardarF();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampProgramadaETyP(String nombreCamp) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaPlantilla();
        WApo.clickEtiquetaPlantilla1();
        WApo.clickEtiquetaTitulo();
        WApo.clickEtiquetaTitulo1();
        WApo.clickFecha();
        WApo.horaFecha();
        WApo.clickGuardarF();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampRecurrenteETitulo(String nombreCamp, String numRepeticion, String rutina,String finDespues) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickCampanaRecurrente();
        WApo.txtNumRepeticion(numRepeticion);
        WApo.selectRutina(rutina);
        WApo.txtFinalizarDespues(finDespues);
        WApo.clickGuardarRC();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampRecurrenteEPlantilla(String nombreCamp, String numRepeticion, String rutina,String finDespues) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaPlantilla();
        WApo.clickEtiquetaPlantilla1();
        WApo.clickCampanaRecurrente();
        WApo.txtNumRepeticion(numRepeticion);
        WApo.selectRutina(rutina);
        WApo.txtFinalizarDespues(finDespues);
        WApo.clickGuardarRC();
        WApo.clickSiguiente();
    }
    @Step
    public void WhatsAppInformacionChampRecurrenteETyP(String nombreCamp, String numRepeticion, String rutina,String finDespues) throws IOException {
        WApo.txtNomCampana(nombreCamp);
        WApo.clickEtiquetaTitulo();
        WApo.clickEtiquetaTitulo1();
        WApo.clickEtiquetaPlantilla();
        WApo.clickEtiquetaPlantilla1();
        WApo.clickCampanaRecurrente();
        WApo.txtNumRepeticion(numRepeticion);
        WApo.selectRutina(rutina);
        WApo.txtFinalizarDespues(finDespues);
        WApo.clickGuardarRC();
        WApo.clickSiguiente();
    }
    // Resumen de Campaña
    @Step
    public void EnvioCampanaMasiva() throws IOException {
        WApo.clickEnviar();
    }
    @Step
    public void EnvioCampanaMasivaMuestra(String numMuestras, String tipoM, String numCel) throws IOException {
        WApo.clickMuestra();
        WApo.txtNMuestras(numMuestras);
        WApo.selectTipoM(tipoM);
        WApo.txtNumCelMuestra(numCel);
        WApo.clickEnviarM();
        WApo.clickEnviar();
    }
}
