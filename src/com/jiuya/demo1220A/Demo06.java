package com.jiuya.demo1220A;

import java.util.HashMap;
import java.util.Map;

public class Demo06 {


    public static void main(String[] args) {
        Demo06 d6 = new Demo06();
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        System.out.println(d6.fourSumCountNew(A, B, C, D));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    for (int l = 0; l < D.length; l++) {
                        if (A[i] + B[j] + C[k] + D[l] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public int fourSumCountNew(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int key = C[i] + D[j];
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int key = A[i] + B[j];
                if(map.containsKey(-key) && map.get(-key)!=0){
                    count += map.get(-key);
                }
            }
        }
        return count;
    }

}
