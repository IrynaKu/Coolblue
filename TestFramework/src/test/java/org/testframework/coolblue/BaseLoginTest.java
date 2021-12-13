package org.testframework.coolblue;

import org.base.config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testframework.coolblue.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseLoginTest extends BaseTest {

    @Test(groups = "Smoke")
    public void loginTest(){
        driver.get(Configuration.getProperty("url"));

        WebElement acceptCookieButton = driver.findElement(By.name("accept_cookie"));
        acceptCookieButton.click();

        WebElement loginIcon = driver.findElement(By.id("cross-icon"));
        loginIcon.click();

        WebElement inloggenButton = driver.findElement(By.xpath("//div[3]/button"));
        inloggenButton.click();

        WebElement emailField = driver.findElement(By.id("header_menu_emailaddress"));
        emailField.sendKeys(Configuration.getProperty("user"));

        WebElement passwordField = driver.findElement(By.id("header_menu_password"));
        passwordField.sendKeys(Configuration.getProperty("password"));

        WebElement submitButton = driver.findElement(By.xpath("//form//button[contains(text(),'Inloggen')]"));
        submitButton.click();

        Assert.assertTrue(driver.findElement(By.xpath("//a/div[contains(text(), 'Welkom')]")).isDisplayed());
    }


}
