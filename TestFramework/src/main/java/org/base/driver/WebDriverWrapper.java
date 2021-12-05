package org.base.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverWrapper {
    protected WebDriver baseDriverWrapper;
    
    public WebDriverWrapper(WebDriver baseDriverWrapper){
        this.baseDriverWrapper = baseDriverWrapper;
        baseDriverWrapper.manage().window().maximize();
        baseDriverWrapper.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public WebElement findElement(By by){
        return baseDriverWrapper.findElement(by);
    }

    public List<WebElement> findElements(By by){
        return baseDriverWrapper.findElements(by);
    }

    public void quit(){
        baseDriverWrapper.close();
    }
}
