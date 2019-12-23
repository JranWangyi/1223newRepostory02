package com.jiuya.demo1217A;


import com.jiuya.demo1218A.Demo08;

public class Test {

    public static void main(String[] args) {
        Demo08 d8 = new Demo08();
        String encode = d8.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println(d8.decode(encode));

        System.out.println("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".length());

    }
}
