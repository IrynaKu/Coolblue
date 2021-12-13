package org.testframework.coolblue;

import org.base.config.Configuration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pages.MainPage;
import org.testframework.coolblue.common.BaseTest;

public class AddToCartTest extends BaseTest {

    @Test

    public void addToCartTest(){
        driver.get(Configuration.getProperty("url"));
        WebElement acceptCookieButton = driver.findElement(By.name("accept_cookie"));
        acceptCookieButton.click();
        pageStorage.mainPage.getComputersAndTablets().click();
        pageStorage.mainPage.getComputersAndTabletsLink().click();
        pageStorage.laptopDesktopMonitorCategoryPage.getLaptops().click();
        pageStorage.laptopCategoryPage.getAllLaptops().click();
        pageStorage.allLaptopsPage.getFirstAddButton().click();

        Assert.assertTrue(pageStorage.bijnaVanJouPage.getCartButton().isDisplayed());


    }
}
