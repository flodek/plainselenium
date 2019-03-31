package com.github.flodek.domain.pages;
import com.github.flodek.adapter.PageFactoryWrapper;

public abstract class Page {

    Page() {
        PageFactoryWrapper.initElements(this);
    }
}
