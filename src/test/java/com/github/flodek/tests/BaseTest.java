package com.github.flodek.tests;

import com.github.flodek.adapter.BrowserType;
import com.github.flodek.adapter.WebDriverManager;
import com.github.flodek.adapter.WebDriverWrapperUtil;
import com.github.flodek.domain.pages.PageContainer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    private static final String SITE_URL = "http://automationpractice.com/index.php";

    @BeforeTest(alwaysRun = true)
    @Parameters("browser")
    public void beforeTest(String browser) {
        WebDriverManager.setBrowserType(BrowserType.valueOf(browser.toUpperCase()));
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        WebDriverWrapperUtil.deleteAllCookies();
        WebDriverWrapperUtil.maximizeWindow();
        WebDriverWrapperUtil.get(SITE_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        PageContainer.removePages();
        WebDriverManager.quitWebDriver();
    }
}
