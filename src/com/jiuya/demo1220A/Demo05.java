package com.jiuya.demo1220A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo05 {

    public static void main(String[] args) {
        Demo05 d5 = new Demo05();
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(d5.dailyTemperatures(nums)));
    }


    public int[] dailyTemperatures(int[] T) {
        int result[] = new int[T.length];
        for (int i = 0; i < T.length - 1; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}
