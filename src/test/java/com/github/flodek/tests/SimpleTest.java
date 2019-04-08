package com.github.flodek.tests;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static com.github.flodek.domain.pages.Pages.getMainPage;
import static org.testng.Assert.assertThrows;

public class SimpleTest extends BaseTest {
    private final static Logger logger = Logger.getLogger(SimpleTest.class);

    @Test(description = "Contact Page")
    public void contactPageTest() {
        getMainPage().openContactUsPage();

        assertThrows(() -> {
            throw new UnsupportedOperationException("Not implemented yet");
        });
    }

    @Test(description = "Sign In Page")
    public void signInPageTest() {
        getMainPage().openSignInPage();

        assertThrows(() -> {
            throw new UnsupportedOperationException("Not implemented yet");
        });
    }
}
