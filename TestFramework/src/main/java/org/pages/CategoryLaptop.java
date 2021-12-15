package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryLaptop extends BasicPage {
    public CategoryLaptop(WebDriver driver) {
        super(driver);
    }

    public WebElement getAllLaptopsFilter(){
        return baseDriver.findElement(By.xpath("//a[contains (., 'Alle laptops')]"));
    }
}
