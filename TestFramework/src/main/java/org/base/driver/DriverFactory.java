package org.base.driver;

import org.base.config.Configuration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    private static WebDriverWrapper webDriverWrapper = null;

    public static WebDriverWrapper getDriver(){
        if(webDriverWrapper != null){
            return webDriverWrapper;
        }
        switch (new Configuration().getProperty("browser")){
            case "Chrome":
                webDriverWrapper = new WebDriverWrapper(new ChromeDriver());
                break;
            case "Firefox":
                webDriverWrapper = new WebDriverWrapper( new FirefoxDriver());
                break;
            case "Edge":
                webDriverWrapper = new WebDriverWrapper(new InternetExplorerDriver());
                break;
            default:
                System.err.println("No such browser type found! Please check config file");
        }
        return webDriverWrapper;
    }
}
