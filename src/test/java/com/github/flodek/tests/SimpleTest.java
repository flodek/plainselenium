package com.github.flodek.tests;

import com.github.flodek.adapter.BrowserType;
import com.github.flodek.adapter.WebDriverFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class SimpleTest {
    private final static Logger logger = Logger.getLogger(SimpleTest.class);

    @Test(description = "It's a simple test")
    public void simpleTest() {
        WebDriverFactory.getWebDriver(BrowserType.Chrome).getDriver().get("https://translate.google.com/");
    }
}
