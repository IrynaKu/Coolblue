package org.base.driver;

public class DriverFactory {

    public static BaseDriver getDriver(){
        return new BaseDriver();
    }
}
