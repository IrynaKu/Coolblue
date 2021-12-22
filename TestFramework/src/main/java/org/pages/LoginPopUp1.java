package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPopUp1 extends BasicPage {

    public LoginPopUp1(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginButton(){
        return baseDriver.findElement(By.xpath("//div[3]/button"));
    }
}
