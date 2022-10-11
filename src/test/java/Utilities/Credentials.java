package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Credentials {
    static final Properties prop = new Properties();
    public static String userProperty(String propiedad){

        try {
            prop.load(new FileInputStream("credentials.properties"));
        } catch (Exception e) {

            e.printStackTrace();
        }
    return prop.getProperty(propiedad);

    }
}
