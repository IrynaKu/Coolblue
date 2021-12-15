package org.pages;

import com.gargoylesoftware.htmlunit.Page;
import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Bean;

public class MainPage extends BasicPage{
    MainPage page;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getComputersAndTabletsLink() {
        return  baseDriver.findElement(By.xpath("//li/button[contains(@class, 'navigation-button') and contains(text(), 'Computers & tablets')]"));
    }

    public WebElement getLaptopDesktopsMonitorsLink() {
        return  baseDriver.findElement(By.xpath("//a[@href='/laptops-desktops-monitoren']"));
    }

}
