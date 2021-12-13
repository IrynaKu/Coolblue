package org.pages;

import org.base.UI.BasicPage;
import org.graalvm.compiler.phases.BasePhase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryLaptopDesktopMonitor extends BasicPage {

    public WebElement getLaptops(){
        return baseDriver.findElement(By.xpath("//a[@href='/laptops']"));
    }


}
