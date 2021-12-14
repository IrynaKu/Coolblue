package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasicPage{


    public WebElement getComputersAndTabletsLink() {
        return  baseDriver.findElement(By.xpath("//li/button[contains(@class, 'navigation-button') and contains(text(), 'Computers & tablets')]"));
    }

    public WebElement getLaptopDesktopsMonitorsLink() {
        return  baseDriver.findElement(By.xpath("//a[@href='/laptops-desktops-monitoren']"));
    }

}
