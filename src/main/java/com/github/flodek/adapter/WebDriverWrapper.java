package com.github.flodek.adapter;

import org.openqa.selenium.WebDriver;

abstract class WebDriverWrapper {

    private static WebDriver driver;

    abstract protected void createDriver();

    void setDriver(WebDriver driver) {
        WebDriverWrapper.driver = driver;
    }

    WebDriver getDriver() {

        if (driver == null) {
            createDriver();
        }

        return driver;
    }

    void quitDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }

}
