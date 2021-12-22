package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPopUp2 extends BasicPage {

    public LoginPopUp2(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField(){
        return baseDriver.findElement(By.id("header_menu_emailaddress"));
    }

    public WebElement getPasswordField(){
        return baseDriver.findElement(By.id("header_menu_password"));
    }

    public WebElement getSubmitButton(){
        return baseDriver.findElement(By.xpath("//form//button[contains(text(),'Inloggen')]"));
    }
}
