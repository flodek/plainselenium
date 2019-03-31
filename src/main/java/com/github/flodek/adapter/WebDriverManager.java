package com.github.flodek.adapter;

public class WebDriverManager {

    private static final ThreadLocal<WebDriverWrapper> WEB_DRIVER_WRAPPER = new ThreadLocal<>();

    static WebDriverWrapper getWebDriverWrapper() {

        if(WEB_DRIVER_WRAPPER.get() == null) {
            throw new NullPointerException("WebDriverWrapper is not initialized");
        }

        return WEB_DRIVER_WRAPPER.get();
    }

    public static void initWebDriverManager(BrowserType browser) {

        switch (browser) {
            case Chrome:
                WEB_DRIVER_WRAPPER.set(new ChromeDriverWrapper());
                break;

            case Firefox:
                WEB_DRIVER_WRAPPER.set(new ChromeDriverWrapper());
                break;

            default:
                throw new IllegalArgumentException("Unknown browser type: " + browser);

        }

    }

    public static void quitWebDriver() {
        getWebDriverWrapper().quitDriver();
        WEB_DRIVER_WRAPPER.remove();
    }

}
