package org.base.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.TimeUnit;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = { "org.base.config" })
//Add application properties @PropertySource({"classpath:application.properties"})
public class SpringConfiguration {
    private WebDriver webDriverWrapper = null;

    @Bean
    public WebDriver webDriver(){
        if(webDriverWrapper != null){
            return webDriverWrapper;
        }
        switch (Configuration.getProperty("browser")){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                webDriverWrapper = new ChromeDriver();
                break;
            case "Firefox":
                webDriverWrapper = new FirefoxDriver();
                break;
            case "Edge":
                webDriverWrapper = new InternetExplorerDriver();
                break;
            default:
                System.err.println("No such browser type found! Please check config file");
        }
        webDriverWrapper.manage().window().maximize();
        webDriverWrapper.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return webDriverWrapper;
    }
}
