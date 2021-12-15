package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryLaptopDesktopMonitor extends BasicPage {

    public CategoryLaptopDesktopMonitor(WebDriver driver) {
        super(driver);
    }

    public WebElement getLaptopsFilter(){
        return baseDriver.findElement(By.xpath("//a[@href='/laptops']"));
    }
}
