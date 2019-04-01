package com.github.flodek.adapter;

import org.openqa.selenium.support.PageFactory;

public class PageFactoryWrapper extends PageFactory {

    public PageFactoryWrapper() {
        super();
    }

    public static void initElements(Object page) {
        initElements(WebDriverManager.getWebDriverWrapper().getDriver(), page);
    }
}
