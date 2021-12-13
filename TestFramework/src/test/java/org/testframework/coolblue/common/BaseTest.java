package org.testframework.coolblue.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.base.driver.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.PageStorage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String baseUrl;
    public PageStorage pageStorage;

    @Before
    public void Set() {
        driver = DriverFactory.getDriver().baseDriverWrapper;
        pageStorage = new PageStorage();
    }

    @After
    public void cleanup() {
        driver.close();
    }
}
