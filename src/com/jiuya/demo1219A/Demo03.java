package com.jiuya.demo1219A;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo03 {


    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        Iterator<Integer> iterator = q1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(q1);
    }


}
