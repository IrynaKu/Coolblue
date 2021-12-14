package org.testframework.coolblue;

import org.base.config.Configuration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testframework.coolblue.common.BaseTest;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartTest(){
        driver.get(Configuration.getProperty("url"));
        //Accept cookie
        WebElement acceptCookieButton = driver.findElement(By.name("accept_cookie"));
        acceptCookieButton.click();
        //Click on the Computer & Tablets link
        pageStorage.mainPage.getComputersAndTabletsLink().click();
        //Click on the Laptops, desktops & monitoren link
        pageStorage.mainPage.getLaptopDesktopsMonitorsLink().click();
        //Click on the Laptops
        pageStorage.laptopDesktopMonitorCategoryPage.getLaptopsFilter().click();
        //Click on the Alle laptops
        pageStorage.laptopCategoryPage.getAllLaptopsFilter().click();
        //Get the add to cart button on the first product (laptop) on the page
        pageStorage.productsListPage.getAddButtonsList().get(0).click();
        //Assert the next page is Bijna Van Jou
        Assert.assertTrue(pageStorage.almostYoursPage.getCartButton().isDisplayed());


    }
}
