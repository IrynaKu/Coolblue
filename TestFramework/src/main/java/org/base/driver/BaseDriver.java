package org.base.driver;

import org.base.config.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseDriver {
    protected WebDriver baseDriverWrapper;
    
    public BaseDriver(){
        switch (Configuration.getProperty("browser")){
            case "Chrome":
                baseDriverWrapper = new ChromeDriver();
                break;
            case "Firefox":
                baseDriverWrapper = new FirefoxDriver();
                break;
            case "Edge":
                baseDriverWrapper = new InternetExplorerDriver();
                break;
            default:
                System.err.println("No such browser type found! Please check config file");
                baseDriverWrapper.manage().window().maximize();
        }
    }
}
