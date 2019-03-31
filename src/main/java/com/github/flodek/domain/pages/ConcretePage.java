package com.github.flodek.domain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConcretePage extends Page {

    @FindBy(css = "#contact-link")
    WebElement contactLink;

    public void click() {
        contactLink.click();
    }

}
