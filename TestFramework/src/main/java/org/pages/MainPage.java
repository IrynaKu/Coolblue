package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasicPage{

    public WebElement ComputersAndTablets = baseDriver.findElement(By.xpath("//a[@href='/computers-tablets']"));
}
