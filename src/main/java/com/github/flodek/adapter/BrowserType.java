package com.github.flodek.adapter;

public enum BrowserType {
    Firefox("Firefox"),
    Chrome("Chrome");

    private String textRepresentation;

    BrowserType(String browser) {
        textRepresentation = browser;
    }

    @Override
    public String toString() {
        return textRepresentation;
    }

}
