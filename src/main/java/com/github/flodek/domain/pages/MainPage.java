package com.github.flodek.domain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(css = "#contact-link")
    WebElement contactUsLink;

    @FindBy(css = ".login")
    WebElement signInLink;

    public ContactPage openContactUsPage() {
        contactUsLink.click();
        return PageContainer.getContactPage();
    }

    public SignInPage openSignInPage() {
        signInLink.click();
        return PageContainer.getSignInPage();
    }

}
