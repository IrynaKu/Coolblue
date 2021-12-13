package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryLaptop extends BasicPage {
    public WebElement getAllLaptops(){
        return baseDriver.findElement(By.xpath("//a[@href='https://www.coolblue.nl/laptops/filter']"));
    }
}
