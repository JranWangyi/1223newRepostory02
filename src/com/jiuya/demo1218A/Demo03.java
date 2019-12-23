package com.jiuya.demo1218A;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        Demo03 d3 = new Demo03();
        int[] arr = {2, 1, 2};
        System.out.println(d3.largestPerimeter(arr));
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i++) {
            if(A[i] < (A[i-1] + A[i-2])){
                return (A[i] + A[i-1] +A[i-2]);
            }
        }
        return 0;
    }


}
