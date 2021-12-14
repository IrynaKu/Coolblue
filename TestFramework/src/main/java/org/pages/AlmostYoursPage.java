package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlmostYoursPage extends BasicPage {

    public WebElement getCartButton(){
        return baseDriver.findElement(By.xpath("//a[@href='/winkelmandje']"));
    }
}
