package com.janrone.app.linnk.java.util;

public class demo {
    private static final demo ourInstance = new demo();

    public static demo getInstance() {
        return ourInstance;
    }

    private demo() {
    }
}
