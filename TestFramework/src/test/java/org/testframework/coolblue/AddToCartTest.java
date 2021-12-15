package org.testframework.coolblue;

import org.base.config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.*;
import org.testframework.coolblue.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    private MainPage mainPage;
    private CategoryLaptopDesktopMonitor categoryLaptopDesktopMonitor;
    private CategoryLaptop categoryLaptop;
    private ProductsListPage productsListPage;
    private AlmostYoursPage almostYoursPage;

    @Test(groups = "Smoke")
    public void addToCartTest(){
        mainPage = new MainPage(driver);
        categoryLaptopDesktopMonitor = new CategoryLaptopDesktopMonitor(driver);
        categoryLaptop = new CategoryLaptop(driver);
        productsListPage = new ProductsListPage(driver);
        almostYoursPage = new AlmostYoursPage(driver);

        driver.get(Configuration.getProperty("url"));
        //Accept cookie
        WebElement acceptCookieButton = driver.findElement(By.name("accept_cookie"));
        acceptCookieButton.click();
        //Click on the Computer & Tablets link
        mainPage.getComputersAndTabletsLink().click();
        //Click on the Laptops, desktops & monitoren link
        mainPage.getLaptopDesktopsMonitorsLink().click();
        //Click on the Laptops
        categoryLaptopDesktopMonitor.getLaptopsFilter().click();
        //Click on the Alle laptops
        categoryLaptop.getAllLaptopsFilter().click();
        //Get the add to cart button on the first product (laptop) on the page
        productsListPage.getAddButtonsList().get(0).click();
        //Assert the next page is Bijna Van Jou
        Assert.assertTrue(almostYoursPage.getCartButton().isDisplayed());
    }
}
