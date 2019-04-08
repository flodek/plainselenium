package com.github.flodek.domain.pages;

public class Pages {

    private Pages() {
    }

    public static MainPage getMainPage() {
        return PageManager.getPage(MainPage.class);
    }

    public static ContactPage getContactPage() {
        return PageManager.getPage(ContactPage.class);
    }

    public static SignInPage getSignInPage() {
        return PageManager.getPage(SignInPage.class);
    }

}
