package com.github.flodek.adapter;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverWrapper {
    WebDriver driver;

    abstract protected void createDriver();

    public WebDriver getDriver() {

        if(driver == null) {
            createDriver();
        }

        return driver;
    }

    public void quitDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }

}
