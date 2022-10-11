package Utilities;


import Models.testExcel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Utilities extends PageObject {
    Reporte reporte;
    public static WebDriver driver = Serenity.getDriver();

    public static void espera(int miliseg){
        try {
            Thread.sleep(miliseg);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static String formatDateInforme(String formato, Date fecha) {
        String dateString = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat(formato);
            dateString = format.format(fecha);
            // date = format.parse("2009-12-31");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateString;
    }
    public void tomaEvidencia(String detalle) throws IOException {
        reporte.capturaDispositivo(detalle);
    }

    public static final String SEPARATOR=",";
    public static final String QUOTE="\"";


    public static void leerExcel() throws IOException {
        Properties props = new Properties();
        props.load(new FileReader("config.properties"));
        String filePath = props.getProperty("pathFileCsv");

        List<testExcel> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            int cont = 0;
            while (null != line) {
                String[] fields = line.split(SEPARATOR);
               // System.out.println(Arrays.toString(fields));

                fields = removeTrailingQuotes(fields);
                System.out.println(Arrays.toString(fields));



                line = br.readLine();
                System.out.println(fields[cont]);
                System.out.println(line);
                cont++;
            }
        }catch (Exception e){

        }
    }
    private static String[] removeTrailingQuotes(String[] fields) {

        String result[] = new String[fields.length];

        for (int i=0;i<result.length;i++){
            result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
        }
        return result;
    }


    public static void scrollWebelement(WebElement Element){

        Actions actions = new Actions(driver);
        actions.moveToElement( Element);
        actions.perform();
    }

}