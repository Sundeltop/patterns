package com.example.factory;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private final DriverFactory driverFactory;

    public DriverManager(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
    }

    public WebDriver createDriver(DriverType driver) {
        return driverFactory.getDriver(driver);
    }
}
