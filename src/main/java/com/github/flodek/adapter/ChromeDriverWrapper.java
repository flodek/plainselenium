package com.github.flodek.adapter;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

class ChromeDriverWrapper extends WebDriverWrapper {

    @Override
    protected void createDriver() {
        setDriver(new ChromeDriver());
    }

    protected void startService() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
