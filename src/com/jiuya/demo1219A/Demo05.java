package com.jiuya.demo1219A;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Demo05 {
    public static void main(String[] args) {
        Demo05 d5 = new Demo05();
        System.out.println(d5.tribonacci(25));
    }


    public int tribonacci(int n) {
            if (n==0) {
                return 0;
            }
            int T1 = 0;
            int T2 = 1;
            int T3 = 1;
            for (int i = 4; i <= n+1; i++) {
                int T4 = T1 + T2 + T3;
                T1 = T2;
                T2 = T3;
                T3 = T4;
            }
            return T3;
    }
}
