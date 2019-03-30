package com.github.flodek.adapter;

public class WebDriverFactory {

    public static WebDriverWrapper getWebDriver(BrowserType browser) {

        WebDriverWrapper webDriverWrapper;

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

        return webDriverWrapper;
    }

}
