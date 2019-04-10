package com.github.flodek.adapter;

import org.openqa.selenium.firefox.FirefoxDriver;

class FirefoxDriverWrapper extends WebDriverWrapper {

    @Override
    protected void createDriver() {
        setDriver(new FirefoxDriver());
    }
}
