package org.testframework.coolblue.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.base.driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String baseUrl;

    @Before
    public void Set() {
        driver = DriverFactory.getDriver().baseDriverWrapper;
    }

    @After
    public void cleanup() {
        driver.close();
    }
}
