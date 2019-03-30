package com.github.flodek.tests;

import com.github.flodek.adapter.BrowserType;
import com.github.flodek.adapter.WebDriverFactory;
import com.github.flodek.adapter.WebDriverWrapper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    WebDriverWrapper driver;

    @BeforeTest
    @Parameters("browser")
    public void beforeTest(String browser) {
        driver = WebDriverFactory.getWebDriver(BrowserType.valueOf(browser));
    }

    @AfterTest
    public void afterTest() {
        driver.quitDriver();
    }
}
