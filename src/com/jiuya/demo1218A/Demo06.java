package com.jiuya.demo1218A;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo06 {
    public static void main(String[] args) {
        Test t = new Test(2);
        t.put(1,"刘一");
        t.put(2,"陈二");
        t.put(3,"张三");
        t.put(4,"李四");
        t.put(5,"王五");
        t.put(6,"赵六");
        t.put(7,"孙七");
        t.put(8,"周八");
        t.put(9,"吴九");
        t.put(10,"郑十");
        System.out.println(t.get(11));
    }

}

class Test {
    int capacity;
    LinkedHashMap<Integer, String> map;

    public Test(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<Integer, String>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return map.size() > capacity;
            }
        };
    }

    public void put(int key, String value) {
        map.put(key, value);
    }

    public String get(int key) {
        return map.getOrDefault(key,"没有找到");
    }

    public void getAllValue(){
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> s : entries){
            System.out.println("key="+s.getKey()+",vavlue="+s.getValue());
        }
    }


}
