package com.jiuya.demo1217A;

import java.util.*;

public class Demo01 {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Demo01 d1 = new Demo01();
        System.out.println(Arrays.toString(d1.intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }
        List<Integer> list3 = new ArrayList<>(list1);
        for (int i = 0; i < list3.size(); i++) {
            if (list2.contains(list3.get(i))) {
                listResult.add(list3.get(i));
                list1.remove(Integer.valueOf(list3.get(i)));
                list2.remove(Integer.valueOf(list3.get(i)));
            }
        }
        int[] resultArray = new int[listResult.size()];
        for (int i = 0; i < listResult.size(); i++) {
            resultArray[i] = listResult.get(i);
        }
        return resultArray;
    }

}
