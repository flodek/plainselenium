package com.github.flodek.tests;

import com.github.flodek.domain.pages.ConcretePage;
import com.github.flodek.utils.PageManager;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class SimpleTest extends BaseTest {
    private final static Logger logger = Logger.getLogger(SimpleTest.class);

    @Test(description = "It's a simple test")
    public void simpleTest() {

        ConcretePage concretePage = PageManager.getPage(ConcretePage.class);
        concretePage.clickContactLink();
    }
}
