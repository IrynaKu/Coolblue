package org.testframework.coolblue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.base.config.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testframework.coolblue.common.BaseTest;

import java.util.concurrent.TimeUnit;

public class BaseLoginTest extends BaseTest {




    @Test
    public void loginTest(){
        driver.get(Configuration.getProperty("url"));

        WebElement acceptCookieButton = driver.findElement(By.name("accept_cookie"));
        acceptCookieButton.click();

        WebElement loginIcon = driver.findElement(By.id("cross-icon"));
        loginIcon.click();

        WebElement emailField = driver.findElement(By.id("header_menu_emailaddress"));
        emailField.sendKeys("irakumka@mail.ru");

        WebElement passwordField = driver.findElement(By.id("header_menu_password"));
        passwordField.sendKeys("Password");

        WebElement submitButton = driver.findElement(By.xpath("//form//button[contains(text(),'Inloggen')]"));
        submitButton.click();

       Assert.assertTrue(driver.findElement(By.xpath("//a/div[contains(text(), 'Welkom')]")).isDisplayed());
    }


}
