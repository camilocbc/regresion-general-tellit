package Steps;

import PageObjects.ReportsPageObject;
import Utilities.Utilities;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class ReportsSteps {

    ReportsPageObject reportPO;
    Utilities utilidades;

    @Step
    public void validarSMSReporteD(String fecha, String usuario){
        reportPO.clickReports();
        reportPO.clickInicio();
        reportPO.clickSMSreportesDetallados();
        reportPO.selectFecha(fecha);
        reportPO.clickUsuario();
        reportPO.selectUsuario(usuario);
        reportPO.detalladoReporte();
    }
    @Step
    public void validarSMSReporteEstadistico(String fecha){
        reportPO.clickReports();
        reportPO.clickSMSreportesEstadistica();
        reportPO.selectFecha(fecha);
        reportPO.clickBuscar();
        reportPO.getTotalSMSEnviados();
    }

    @Step
    public void validarSMSReporteCampañaMenuHamburguesa(String fecha) throws IOException {
        reportPO.clickMenuHamburguesa();
        reportPO.clickMHSMS();
        reportPO.clickMHDetallado();
        reportPO.selectFecha(fecha);
        reportPO.clickBuscar();
        reportPO.clickDescargar();
        reportPO.clickCampana();
        reportPO.clickDescargardesdeCampana();
        utilidades.leerExcel();

    }
    @Step
    public void validarSMSReporteDetalladoMenuHamburguesa(String fecha) throws IOException {
       // reportPO.clickMenuHamburguesa();
      //  reportPO.clickMHSMS();
        reportPO.clickMHDetallado();
        reportPO.selectFecha(fecha);
        reportPO.clickCargarMasFiltros();
        reportPO.clickEstados();
        reportPO.clickSeleccionarTodosEstados();
        reportPO.clickBuscar();
        reportPO.clickDescargar();
        reportPO.clickCampana();
        reportPO.clickDescargardesdeCampana();
        utilidades.leerExcel();

    }


}
