package org.testframework.coolblue;

import org.base.config.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.LoginPopUp1;
import org.pages.LoginPopUp2;
import org.pages.MainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testframework.coolblue.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseLoginTest extends BaseTest {
    @Autowired
    private MainPage mainPage;
    @Autowired
    private LoginPopUp1 loginPopUp1;
    @Autowired
    private LoginPopUp2 loginPopUp2;


    @Test(groups = "Smoke")
    public void loginTest() {

        driver.get(Configuration.getProperty("url"));
        //accept cookies
        WebElement acceptCookieButton = driver.findElement(By.name("accept_cookie"));
        acceptCookieButton.click();
        //click on the login icon
        mainPage.getLoginIcon().click();
        //click on the login button in the pop-up
        loginPopUp1.getLoginButton().click();
        //enter existing user's email in the email field
        loginPopUp2.getEmailField().sendKeys(Configuration.getProperty("user"));
        //enter password in the password field
        loginPopUp2.getPasswordField().sendKeys(Configuration.getProperty("password"));
        //click on the submit button
        loginPopUp2.getSubmitButton().click();
        //assert that "Welcome" text appeared in the header of the main page
        Assert.assertTrue(mainPage.getWelcomeText().isDisplayed());
    }
}
