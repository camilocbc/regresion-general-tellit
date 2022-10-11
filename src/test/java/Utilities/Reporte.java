package Utilities;

import Definitions.Hooks;
import Models.testExcel;
import PageObjects.loginPageObject;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTabJc;


import java.io.*;
import java.math.BigInteger;
import java.nio.file.FileSystems;
import java.util.*;

public class Reporte extends PageObject {

    static BaseUtil baseUtil;
    static XWPFDocument docx = new XWPFDocument();
    static XWPFRun run = docx.createParagraph().createRun();
    public static String USER_DIR = "user.dir";

    public static int numeroScreen = 1;
    public static Date fechaPrueba;
    public static String nombreImagen;
    public static String []nombreimagen = new String[1000];
    public static int contador = 0;

    public static WebDriver driver = Serenity.getDriver();

    private String rutaEvidencia ;

    public static void capturaDispositivo(String descripcion) throws IOException {


        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File targetFile = new File(
                System.getProperty("RutaEvidencias") + File.separator + numeroScreen + "_" + descripcion + ".png");
        nombreImagen = numeroScreen + "_" + descripcion;
        nombreimagen [contador]= nombreImagen;
        numeroScreen++;


        FileUtils.copyFile(srcFile, targetFile);
        contador++;

    }





    public static void generarReporte(String ruta, String nombreEscenario, String estadoCaso, String tiempo
    )
            throws InvalidFormatException, FileNotFoundException, IOException {
        fechaPrueba = new Date();
        Map<String, File> keyImagenes = new HashMap<String, File>();

        try {
            /*
             * DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy"); Calendar cal =
             * Calendar.getInstance(); String date=dateFormat.format(cal.getTime());
             */
            XWPFDocument document = new XWPFDocument();

            XWPFParagraph paragraphSix = document.createParagraph();
            paragraphSix.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paragraphFourRunOne = paragraphSix.createRun();
            paragraphFourRunOne.setBold(true);
            // paragraphFourRunOne.setUnderline(UnderlinePatterns.SINGLE);
            paragraphFourRunOne.setFontSize(15);
            paragraphFourRunOne.setFontFamily("Verdana");
            paragraphFourRunOne.setColor("000070");
            paragraphFourRunOne.addBreak();
            paragraphFourRunOne.setText("REPORTE DE EJECUCIÓN");/////////// step name or image name
            paragraphFourRunOne.addBreak();

            XWPFParagraph paragraphOne = document.createParagraph();
            paragraphOne.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paragraph1RunOne = paragraphOne.createRun();
            paragraph1RunOne.setBold(true);
            paragraph1RunOne.setFontSize(14);
            paragraph1RunOne.setFontFamily("Verdana");
            paragraph1RunOne.setColor("000070");
            paragraph1RunOne.setText("-----------------------------------------------------------------");////////////////////
            // paragraph1RunOne.addBreak();

            XWPFParagraph paragraphTwo = document.createParagraph();
            paragraphTwo.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paragraphOneRunOne = paragraphTwo.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setFontSize(15);
            paragraphOneRunOne.setFontFamily("Verdana");
            paragraphOneRunOne.setColor("000070");
            paragraphOneRunOne.setText(nombreEscenario);/////////

            XWPFParagraph paragraphThree = document.createParagraph();
            paragraphThree.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paragraphThreeRunOne = paragraphThree.createRun();
            paragraphThreeRunOne.setBold(false);
            paragraphThreeRunOne.setFontSize(12);
            paragraphThreeRunOne.setFontFamily("Verdana");
            paragraphThreeRunOne.setColor("000070");
            paragraphThreeRunOne.setText("" + new java.util.Date());////////////////////
            // paragraphThreeRunOne.addBreak();

            XWPFParagraph paragraphFour = document.createParagraph();
            paragraphFour.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paragraphsixRunOne = paragraphFour.createRun();
            paragraphsixRunOne.setBold(true);
            paragraphsixRunOne.setFontSize(14);
            paragraphsixRunOne.setFontFamily("Verdana");
            paragraphsixRunOne.setColor("000070");
            paragraphsixRunOne.setText("Estado de Ejecución:");////////////////////

            if (estadoCaso.equals("PASSED")) {

                paragraphsixRunOne.setColor("0BA20B");
                paragraphsixRunOne.setText(" " + estadoCaso);////////////////////
            } else {
                paragraphsixRunOne.setColor("EF1111");
                paragraphsixRunOne.setText(" " + estadoCaso);////////////////////
            }
            paragraphFour = document.createParagraph();
            paragraphFour.setAlignment(ParagraphAlignment.LEFT);
            paragraphsixRunOne = paragraphFour.createRun();
            paragraphsixRunOne.setBold(true);
            paragraphsixRunOne.setFontSize(14);
            paragraphsixRunOne.setFontFamily("Verdana");
            paragraphsixRunOne.setColor("000070");
            paragraphsixRunOne.setText("Tiempo de Ejecución: " + tiempo);



            XWPFParagraph paragraphFive = document.createParagraph();
            paragraphFive.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paragraph7RunOne = paragraphFive.createRun();
            paragraph7RunOne.setBold(true);
            paragraph7RunOne.setFontSize(14);
            paragraph7RunOne.setFontFamily("Verdana");
            paragraph7RunOne.setColor("000070");
            paragraph7RunOne.setText("-----------------------------------------------------------------");////////////////////
            paragraph7RunOne.addBreak();

            InputStream pic = null;
//            try {
//                pic = new FileInputStream("d:\\1.JPG");
//            } catch (FileNotFoundException e1) {
//                e1.printStackTrace();
//            }

            File file = new File(ruta);
            File[] files = file.listFiles();

            for (File f : files) {
                if (f.getName().contains(".png")) {
                    String posicion = f.getName().split("_")[0];
                    System.out.println(posicion);
                    keyImagenes.put(posicion, f);
                }
            }

//			for (int x = 1; x <= keyImagenes.size(); x++) {
            for (int x = 1; x <= keyImagenes.size(); x++) {
                File f = keyImagenes.get(x + "");
                try {
                    if (f.getName().contains(".png")) {
                        System.out.println(f.getName());
                        try {
                            pic = new FileInputStream(ruta + FileSystems.getDefault().getSeparator() + f.getName());
                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                            terminarEvidencia(document, ruta, nombreEscenario, estadoCaso);
                        }

                        try {

                            XWPFParagraph paragraphSeven = document.createParagraph();
                            paragraphSeven.setAlignment(ParagraphAlignment.LEFT);
                            XWPFRun paragraphThreeRunOne5 = paragraphSeven.createRun();
                            // paragraphThreeRunOne.setBold(true);
                            paragraphThreeRunOne5.setFontSize(12);
                            paragraphThreeRunOne5.setFontFamily("Verdana");
                            paragraphThreeRunOne5.setColor("000070");
                            paragraphThreeRunOne5.setText("Paso: " + f.getName().replaceAll(".png", ""));////////////////////
                            // paragraphThreeRunOne5.addBreak();

                            XWPFParagraph paragraphEight = document.createParagraph();
                            paragraphEight.setAlignment(ParagraphAlignment.CENTER);
                            XWPFRun paragraphFiveRunOne = paragraphEight.createRun();
                            int numeroImagen = Integer.parseInt(f.getName().split("_")[0]);
                      //      if (f.getName().contains("web")||f.getName().contains("Web")) {
                                paragraphFiveRunOne.addPicture(pic, XWPFDocument.PICTURE_TYPE_JPEG,
                                        ruta + FileSystems.getDefault().getSeparator() + f.getName(), Units.toEMU(500), Units.toEMU(300));
                         /*   } else {
                                paragraphFiveRunOne.addPicture(pic, XWPFDocument.PICTURE_TYPE_JPEG,
                                        ruta + FileSystems.getDefault().getSeparator() + f.getName(), Units.toEMU(200), Units.toEMU(360));
                          }*/
                            if (!(f.getName().split("_")[0]).equals("1") && (numeroImagen % 2 == 0)) {
                                // paragraphEight.setPageBreak(true);
                                paragraphSeven.setPageBreak(true);
                            }

                        } catch (InvalidFormatException e1) {
                            e1.printStackTrace();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }}catch (Exception ex) {
                    ex.printStackTrace();
                }
                pic.close();
            }
            terminarEvidencia(document, ruta, nombreEscenario, estadoCaso);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void terminarEvidencia(XWPFDocument document, String ruta, String nombreEscenario,
                                         String estadoCaso) {
        XWPFParagraph paragraph8 = document.createParagraph();
        paragraph8.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun paragraph8RunOne = paragraph8.createRun();
        paragraph8RunOne.setBold(true);
        paragraph8RunOne.setFontSize(14);
        paragraph8RunOne.setFontFamily("Verdana");
        paragraph8RunOne.setColor("000070");
        paragraph8.setPageBreak(true);
        paragraph8RunOne.setText("---------------------------Caso finalizado---------------------");////////////////////

        // create header start
        CTSectPr sectPr = document.getDocument().getBody().addNewSectPr();
        XWPFHeaderFooterPolicy headerFooterPolicy = new XWPFHeaderFooterPolicy(document, sectPr);

        XWPFHeader header = headerFooterPolicy.createHeader(XWPFHeaderFooterPolicy.DEFAULT);

        XWPFParagraph paragraph = header.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.LEFT);

        CTTabStop tabStop = paragraph.getCTP().getPPr().addNewTabs().addNewTab();
        tabStop.setVal(STTabJc.RIGHT);
        int twipsPerInch = 1440;
        tabStop.setPos(BigInteger.valueOf(6 * twipsPerInch));

        XWPFRun run = paragraph.createRun();
        run.setText("Informe de evidencia de prueba de Aldeamo");
        run.addTab();

        run = paragraph.createRun();

        String imgFile = "src/test/resources/images/logo_aldeamo.png";// System.getProperty(USER_DIR)+
        // File.separator+"lib\\logo_Davivienda.png";
        try {
            run.addPicture(new FileInputStream(imgFile), XWPFDocument.PICTURE_TYPE_JPEG, imgFile, Units.toEMU(50),
                    Units.toEMU(50));
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        // create footer start
        XWPFFooter footer = headerFooterPolicy.createFooter(XWPFHeaderFooterPolicy.DEFAULT);

        paragraph = footer.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);

        run = paragraph.createRun();
        run.setText("Aldeamo | Confidencial");

        FileOutputStream outStream = null;
        try {
            ruta = ruta + FileSystems.getDefault().getSeparator() + "Evidencias_" + nombreEscenario.split("_")[0] + "_" + estadoCaso + "_"
                    + Utilities.formatDateInforme("yyyy-MM-dd_HH-mm-ss", fechaPrueba) + ".docx";
            outStream = new FileOutputStream(ruta);

        } catch (FileNotFoundException e) {
            System.out.println("First Catch");
            e.printStackTrace();
        }
        try {
            document.write(outStream);
            outStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Second Catch");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Third Catch");
            e.printStackTrace();
        }
    }

    public static String homologarEstadoCaso(String estado) {
        String estadoHomologado = "";
        if (estado.toUpperCase().equals("PASSED")) {
            estadoHomologado = "Passed";
        } else {
            estadoHomologado = "Failed";
        }
        return estadoHomologado;
    }

    public String getRuta(String ruta) {
        return ruta;
    }

    public static void eliminarImagenes(String ruta) {

        File file = new File(ruta);
        File[] files = file.listFiles();
        for (File f : files) {
            // || f.getName().contains(".docx")
            if (f.getName().contains(".png") || f.getName().contains(".png") || f.getName().contains(".gif")) {
                f.delete();
            }
        }
    }


}
