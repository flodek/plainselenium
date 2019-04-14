package com.github.flodek.adapter;

public class WebDriverManager {

    private static final ThreadLocal<WebDriverWrapper> WEB_DRIVER_WRAPPER = new ThreadLocal<>();
    private static BrowserType browserType;

    public static void setBrowserType(BrowserType browserType) {
        WebDriverManager.browserType = browserType;
    }

    static WebDriverWrapper getWebDriverWrapper() {

        if (WEB_DRIVER_WRAPPER.get() == null) {
            initWebDriverWrapper();
        }

        return WEB_DRIVER_WRAPPER.get();
    }

    private static void initWebDriverWrapper() {

        switch (browserType) {
            case CHROME:
                WEB_DRIVER_WRAPPER.set(new ChromeDriverWrapper());
                break;

            case FIREFOX:
                WEB_DRIVER_WRAPPER.set(new FirefoxDriverWrapper());
                break;

            default:
                throw new IllegalArgumentException("Unknown browser type: " + browserType);
        }
    }

    public static void quitWebDriver() {
        getWebDriverWrapper().quitDriver();
        WEB_DRIVER_WRAPPER.remove();
    }

}
