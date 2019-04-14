package com.github.flodek.tests;

import org.testng.annotations.Test;

import static com.github.flodek.domain.pages.PageContainer.getMainPage;
import static org.testng.Assert.assertThrows;

public class SimpleTest extends BaseTest {

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
