package org.base.UI;

import org.openqa.selenium.WebElement;

public abstract class BaseWebElement {
    protected WebElement coreElement;

    public BaseWebElement(WebElement coreElement){
        this.coreElement = coreElement;
    }

    public boolean isExist(){
        return coreElement.isEnabled() || coreElement.isDisplayed() ;
    }
}
