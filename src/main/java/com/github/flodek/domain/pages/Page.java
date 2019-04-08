package com.github.flodek.domain.pages;

import com.github.flodek.adapter.PageFactoryWrapper;

abstract class Page {

    Page() {
        PageFactoryWrapper.initElements(this);
    }
}
