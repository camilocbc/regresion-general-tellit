package Definitions;

import Utilities.Reporte;
import Utilities.Cronometro;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.pages.PageObject;
import java.io.File;
import java.io.IOException;



public class Hooks extends PageObject {
    Reporte reporte;
    Cronometro crono = new Cronometro();
   // private WebDriver driver = Serenity.getDriver();

    @Before
    public void initTests(Scenario scenario) {


            System.setProperty("RutaEvidencias", System.getProperty("user.dir") + File.separator + "target"+File.separator+"Evidencias"
                    + File.separator + scenario.getName());
            new File(System.getProperty("user.dir") + File.separator + "target"+ File.separator + "Evidencias" + File.separator
                    + scenario.getName()).mkdirs();
            reporte.eliminarImagenes(System.getProperty("RutaEvidencias"));
            System.out.println("Ruta Evidencia "+System.getProperty("RutaEvidencias") );
            crono.iniciarCronometro();
            String nameScenario = scenario.getName();
            System.setProperty("idScenario", nameScenario);

    }

    @After
    public void finishTest(Scenario scenario) {
        System.out.println(scenario.getStatus());
        if (scenario.isFailed()) {
            try {
                reporte.capturaDispositivo("Se presento un error");

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
       /* try {
            reporte.generarReporte(System.getProperty("RutaEvidencias"), scenario.getName(),
                    scenario.getStatus().toString(), crono.pararCronometro()
            );

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        reporte.numeroScreen = 1;

    }
}
