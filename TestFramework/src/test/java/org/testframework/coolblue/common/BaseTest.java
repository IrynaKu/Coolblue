package org.testframework.coolblue.common;

import org.base.config.SpringConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@ContextConfiguration(classes = {SpringConfiguration.class})
public abstract class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    public WebDriver driver;

    @Autowired
    public void setWebDriver(WebDriver driver){
        this.driver = driver;
    }

    @BeforeClass
    public void Set() throws Exception {
        super.springTestContextBeforeTestClass();
    }

    @AfterClass
    public void cleanup() {
        driver.close();
    }
}
