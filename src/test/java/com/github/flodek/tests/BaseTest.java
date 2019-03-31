package com.github.flodek.tests;

import com.github.flodek.adapter.BrowserType;
import com.github.flodek.adapter.WebDriverManager;
import com.github.flodek.adapter.WebDriverWrapperUtil;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeTest(alwaysRun = true)
    @Parameters("browser")
    public void beforeTest(String browser) {
        WebDriverManager.initWebDriverManager(BrowserType.valueOf(browser));

        WebDriverWrapperUtil.deleteAllCookies();
        WebDriverWrapperUtil.get("http://automationpractice.com/index.php");
        WebDriverWrapperUtil.maximizeWindow();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        WebDriverManager.quitWebDriver();
    }
}
