package com.jiuya.demo1220A;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {

    public static void main(String[] args) {
        Demo02 d2 = new Demo02();
        int nums[] = {1, 2, 3};
        System.out.println(d2.permute(nums));


    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
//                list1.add()
            }
        }

        return null;
    }

}
