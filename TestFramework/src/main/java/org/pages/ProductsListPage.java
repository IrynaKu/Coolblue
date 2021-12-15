package org.pages;

import org.base.UI.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductsListPage extends BasicPage {

    public ProductsListPage(WebDriver driver) {
        super(driver);
    }

    public List <WebElement> getAddButtonsList(){
        List <WebElement> laptopsList = baseDriver.findElements(By.xpath("//a[contains(@class, 'js-add-to-cart-button')]"));
        return laptopsList;
    }
}
