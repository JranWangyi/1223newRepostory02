package com.jiuya.demo1219A;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> list = null;
    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        return list.size() == 0;
    }

}
