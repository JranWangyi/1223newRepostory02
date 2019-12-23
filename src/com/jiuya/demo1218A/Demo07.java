package com.jiuya.demo1218A;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo07 {

    int initSize;

    LinkedHashMap<Integer, Integer> map;

    public Demo07(int initSize) {
        this.initSize = initSize;
        map = new LinkedHashMap<Integer, Integer>(initSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return map.size() > initSize;
            }
        };
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
}
