package org.base.UI;

import org.base.driver.WebDriverWrapper;
import org.base.driver.DriverFactory;
import org.openqa.selenium.By;

public abstract class BasicPage {
    protected WebDriverWrapper baseDriver = DriverFactory.getDriver();

    public WebElementWrapper logo = new WebElementWrapper(baseDriver.findElement(By.xpath("//*[@title='Coolblue home']")));

}
