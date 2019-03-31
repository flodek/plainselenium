package com.github.flodek.adapter;

public class WebDriverManager {

    private static WebDriverWrapper webDriverWrapper;

    static WebDriverWrapper getWebDriverWrapper() {

        if(webDriverWrapper == null) {
            throw new NullPointerException("WebDriverWrapper is not initialized");
        }

        return webDriverWrapper;
    }

    public static void initWebDriverManager(BrowserType browser) {

        switch (browser) {
            case Chrome:
                webDriverWrapper = new ChromeDriverWrapper();
                break;

            case Firefox:
                webDriverWrapper = new ChromeDriverWrapper();
                break;

            default:
                throw new IllegalArgumentException("Unknown browser type: " + browser);

        }

    }

    public static void quitWebDriver() {
        WebDriverManager.getWebDriverWrapper().quitDriver();
    }

}
