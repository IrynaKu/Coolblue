package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllLaptopsPage extends BasicPage {

    public WebElement getFirstAddButton(){
        List<WebElement>laptopsList = baseDriver.findElements(By.xpath("//a[contains(@class, 'js-add-to-cart-button')]"));
        return laptopsList.get(0);
    }



}
