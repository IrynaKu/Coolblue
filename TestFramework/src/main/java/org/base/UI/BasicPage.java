package org.base.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class BasicPage {
    protected WebDriver baseDriver;

    public BasicPage(WebDriver driver)
    {
        this.baseDriver = driver;
    }

    public WebElement getLogo()
    {
        return baseDriver.findElement(By.xpath("//*[@title='Coolblue home']"));
    }

}
