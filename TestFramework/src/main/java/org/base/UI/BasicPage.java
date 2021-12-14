package org.base.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasicPage {
    @Autowired
    protected WebDriver baseDriver;

    public WebElement logo = baseDriver.findElement(By.xpath("//*[@title='Coolblue home']"));

}
