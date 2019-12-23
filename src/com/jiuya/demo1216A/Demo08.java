package com.jiuya.demo1216A;

import java.util.ArrayList;
import java.util.List;

public class Demo08 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String remove = list.remove(1);
        System.out.println("remove==="+remove);

    }
}
