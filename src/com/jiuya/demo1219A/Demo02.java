package com.jiuya.demo1219A;

import java.util.*;

public class Demo02 {

    public static void main(String[] args) {
        Demo02 d2 = new Demo02();
        System.out.println(d2.frequencySort("cccaaab"));
    }

    public String frequencySort(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            if (!map.containsKey(s1)) {
                map.put(s1, 1);
            } else {
                map.put(s1, map.get(s1) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(entries);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<list.size() ; i++){
            for(int j = 0 ; j<list.get(i).getValue() ; j++){
                sb.append(list.get(i).getKey());
            }
        }
        return sb.toString();
    }
}
