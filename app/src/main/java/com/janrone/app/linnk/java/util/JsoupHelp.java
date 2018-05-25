package com.janrone.app.linnk.java.util;

import java.util.Map;

public class JsoupHelp {

    private static final JsoupHelp ourInstance = new JsoupHelp();

    public static JsoupHelp getInstance() {
        return ourInstance;
    }

    private JsoupHelp() {
    }

    public Map<String, String> cookies;

    public Map<String, String> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, String> cookies) {
        this.cookies = cookies;
    }
}
