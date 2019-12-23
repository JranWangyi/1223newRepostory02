package com.jiuya.demo1216A;

public class Children extends Father {

    public Children(){
        System.out.println("子类的无参构造执行了");
    }

    public Children(String name) {
        System.out.println("子类的有参构造执行了");
    }

    public static void main(String[] args) {
        Children c = new Children("张三");
    }

}
