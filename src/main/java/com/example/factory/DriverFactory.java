package com.example.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class DriverFactory {

    public DriverFactory() {
    }

    public WebDriver getDriver(DriverType driver) {
        return switch (driver) {
            case CHROME_DRIVER -> {
                final ChromeOptions options = new ChromeOptions();
                yield new ChromeDriver(options);
            }
            case EDGE_DRIVER -> {
                final EdgeOptions options = new EdgeOptions();
                yield new EdgeDriver(options);
            }
            case SAFARI_DRIVER -> {
                final SafariOptions options = new SafariOptions();
                yield new SafariDriver(options);
            }
        };
    }
}
