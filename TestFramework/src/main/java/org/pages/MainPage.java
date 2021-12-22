package org.pages;

import com.gargoylesoftware.htmlunit.Page;
import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage extends BasicPage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getComputersAndTabletsLink() {
        return  baseDriver.findElement(By.xpath("//li/button[contains(@class, 'navigation-button') and contains(text(), 'Computers & tablets')]"));
    }

    public WebElement getLaptopDesktopsMonitorsLink() {
        return  baseDriver.findElement(By.xpath("//a[@href='/laptops-desktops-monitoren']"));
    }

    public WebElement getLoginIcon(){
        return baseDriver.findElement(By.id("cross-icon"));
    }

    public WebElement getWelcomeText(){
        return baseDriver.findElement(By.xpath("//a/div[contains(text(), 'Welkom')]"));
    }
}
