package com.github.flodek.domain.pages;

import com.github.flodek.adapter.PageFactoryWrapper;

abstract class BasePage {

    BasePage() {
        PageFactoryWrapper.initElements(this);
    }
}
