package com.github.flodek.adapter;

import org.openqa.selenium.WebDriver;

abstract class WebDriverWrapper {

    private WebDriver driver;

    abstract protected void createDriver();

    void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }

        return driver;
    }

    void quitDriver() {
        driver.quit();
        driver = null;
    }
}
