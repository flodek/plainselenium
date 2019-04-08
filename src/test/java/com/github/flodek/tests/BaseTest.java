package com.github.flodek.tests;

import com.github.flodek.adapter.BrowserType;
import com.github.flodek.adapter.WebDriverManager;
import com.github.flodek.adapter.WebDriverWrapperUtil;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    private static final String SITE_URL = "http://automationpractice.com/index.php";

    @BeforeTest(alwaysRun = true)
    @Parameters("browser")
    public void beforeTest(String browser) {
        WebDriverManager.initWebDriverWrapper(BrowserType.valueOf(browser));

        WebDriverWrapperUtil.deleteAllCookies();
        WebDriverWrapperUtil.maximizeWindow();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        WebDriverWrapperUtil.get(SITE_URL);
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        WebDriverManager.quitWebDriver();
    }
}
