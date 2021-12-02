package org.base.UI;

import org.base.driver.BaseDriver;
import org.base.driver.DriverFactory;

public abstract class BasicPage {
    protected BaseDriver baseDriver = DriverFactory.getDriver();

}
