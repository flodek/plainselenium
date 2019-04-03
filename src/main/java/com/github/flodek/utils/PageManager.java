package com.github.flodek.utils;

import com.github.flodek.domain.pages.Page;

import java.util.HashMap;
import java.util.Map;

public class PageManager {

    private static final ThreadLocal<Map<Class, Object>> PAGES = ThreadLocal.withInitial(HashMap::new);

    private PageManager() {
    }

    @SuppressWarnings("unchecked")
    public static <T extends Page> T getPage(Class<? extends Page> tClass) {
        try {
            if (!PAGES.get().containsKey(tClass)) {
                PAGES.get().put(tClass, tClass.getDeclaredConstructor().newInstance());
            }

            return (T) PAGES.get().get(tClass);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
