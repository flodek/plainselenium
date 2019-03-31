package com.github.flodek.adapter;

import org.openqa.selenium.WebDriver;

public final class WebDriverWrapperUtil {

    private WebDriverWrapperUtil() {
    }

    private static WebDriver getWebDriver() {
        return WebDriverManager.getWebDriverWrapper().getDriver();
    }

    public static void get(String url) {
        getWebDriver().get(url);
    }

    public static void deleteAllCookies() {
        getWebDriver().manage().deleteAllCookies();
    }

    public static void maximizeWindow() {
        getWebDriver().manage().window().maximize();
    }

}
