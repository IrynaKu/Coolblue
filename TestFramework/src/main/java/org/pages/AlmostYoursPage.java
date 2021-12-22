package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlmostYoursPage extends BasicPage {


    public AlmostYoursPage(WebDriver driver) {
        super(driver);
    }



    public WebElement getCartButton(){
        return baseDriver.findElement(By.xpath("//a[@href='/winkelmandje']"));
    }
}
