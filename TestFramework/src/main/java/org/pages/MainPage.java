package org.pages;

import org.base.UI.BasicPage;
import org.base.UI.WebElementWrapper;
import org.openqa.selenium.By;

public class MainPage extends BasicPage{

    public WebElementWrapper ComputersAndTablets = new WebElementWrapper(baseDriver.findElement(By.xpath("//a[@href='/computers-tablets']")));
}
