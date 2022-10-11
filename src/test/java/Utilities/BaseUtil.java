package Utilities;

import org.openqa.selenium.WebDriver;

public class BaseUtil {
    private WebDriver webDriver;

    public WebDriver getWebDriver(){
        return webDriver;
    }
    public void setWebDriver(WebDriver webDriver){
        this.webDriver= webDriver;
    }
}
