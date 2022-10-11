package Definitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.ReportsSteps;

import java.io.IOException;


public class   ReportsDefinitions {

    @Steps
    ReportsSteps ReportST;

    @When("ingreso en reporte y valido informacion")
    public void ingresoEnReporteYValidoInformacion() throws IOException {
        ReportST.validarSMSReporteEstadistico("Hoy");
        ReportST.validarSMSReporteCampañaMenuHamburguesa("Hoy");
        ReportST.validarSMSReporteDetalladoMenuHamburguesa("Hoy");
    }

}
