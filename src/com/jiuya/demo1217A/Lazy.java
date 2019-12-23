package com.jiuya.demo1217A;

public class Lazy {
    private static Lazy lazy = null;

    private Lazy() {
    }

    public static Lazy getInstace() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
