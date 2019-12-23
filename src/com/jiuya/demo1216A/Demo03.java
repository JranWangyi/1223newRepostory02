package com.jiuya.demo1216A;

import java.util.ArrayList;
import java.util.List;

/**
 * 33人围成一圈，从 1 至N 开始顺时针一直递增报数；
 * 报 N 者退出，下一位从 1 开始重新报数。
 * 当 N 为 2 时，最后留下者是第几人。
 * 假设最先报数的人编号是 1，其他人编号按顺时针方向递增
 */
public class Demo03 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        numberOff(list,2);
    }

    public static void numberOff(List list, int m) {
        while (list.size() > 1) {
            for (int i = 0; i < m - 1; i++) {
/**
 * remove(int index)用来清除集合中制定索引位置的对象，后面的元素自动全部向前移动
 * void add(int index, E element) index - 要在其中插入指定元素处的索引    element - 要插入的元素
 * index可省略 ，但是添加元素的时候，需要添加到已有数据的后面*/
                list.add(list.remove(0));
            }
            list.remove(0);
        }
        System.out.println("剩下最后一个人：" + list);
    }
}
