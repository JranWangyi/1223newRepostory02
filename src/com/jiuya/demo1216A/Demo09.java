package com.jiuya.demo1216A;

import java.util.ArrayList;
import java.util.List;

public class Demo09 {

    public static void main(String[] args) {

        System.out.println("最后剩下的人的编号为:"+func(33,2));
    }

    public static int func(int num1 , int num2){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<= num1 ; i++){
            list.add(i);
        }

        while(list.size() > 1){
            for(int i = 0 ; i<num2-1 ; i++){
                list.add(list.remove(0));
            }
            list.remove(0);
        }
        return list.get(0);
    }
}
