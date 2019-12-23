package com.jiuya.demo1217A;

import java.util.*;

public class Demo02 {

    public static void main(String[] args) {
        int[] ints = {1,2,1};
        Demo02 d2 = new Demo02();
        System.out.println(d2.func(ints));

    }

    public int func(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }


    public int largestPerimeter(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add((A[i]));
        }
//        System.out.println("list=" + list);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = null;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (j != i) {
                    for (int k = 0; k < list.size(); k++) {
                        if (k != j && k != i) {
                            list3 = new ArrayList<>();
                            list3.add(list.get(i));
                            list3.add(list.get(j));
                            list3.add(list.get(k));
                            Collections.sort(list3, new Comparator<Integer>() {
                                @Override
                                public int compare(Integer o1, Integer o2) {
                                    return o1 - o2;
                                }
                            });
//                        System.out.println("list3="+list3);
                            Integer i1 = list3.get(0);
                            Integer i2 = list3.get(1);
                            Integer i3 = list3.get(2);
//                        System.out.println("i1=" + i1 + ",i2=" + i2 + ",i3=" + i3);

                            if ((i1 + i2) > i3) {
                                list2.add(i1 + i2 + i3);
                            }
                        }
                    }
                }

            }
        }
        if (list2.size() == 0) {
            return 0;
        } else {
            Collections.sort(list2, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            return list2.get(0);
        }

    }
}
