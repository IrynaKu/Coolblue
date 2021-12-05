package org.base.UI;

import org.openqa.selenium.WebElement;

public  class WebElementWrapper {
    protected WebElement coreElement;

    public WebElementWrapper(WebElement coreElement){
        this.coreElement = coreElement;
    }

    public boolean isExist(){
        return coreElement.isEnabled() || coreElement.isDisplayed() ;
    }
}
