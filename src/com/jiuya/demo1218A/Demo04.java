package com.jiuya.demo1218A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo04 {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3,3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4,4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));      // 返回  3
        System.out.println(cache.get(4));       // 返回  4
    }

}

class LRUCache {
    private int capacity;
    private List<Integer> list = new ArrayList<>();
    private Map<Integer, Integer> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer result = map.get(key);
        if (result == null) {
            return -1;
        }
        list.remove(Integer.valueOf(key));
        list.add(key);
        return result;
    }

    public void put(int key, int value) {
        if(list.contains(key)){
            list.remove(Integer.valueOf(key));
            list.add(key);
            map.put(key,value);
        }else{
            if (list.size() == this.capacity) {
                map.remove(list.get(0));
                list.add(list.remove(0));
                map.put(key, value);
            } else {
                list.add(key);
                map.put(key, value);
            }
        }
    }
}
