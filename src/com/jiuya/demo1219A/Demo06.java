package com.jiuya.demo1219A;

import java.util.*;

public class Demo06 {

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] chars1 = s.toCharArray();
            char[] chars2 = t.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            return Arrays.equals(chars1,chars2);
        }
    }
}
