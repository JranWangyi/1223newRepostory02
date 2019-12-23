package com.jiuya.demo1216A;

public class Father {
    static {
        System.out.println("父类静态代码块执行了");
    }

    {
        System.out.println("父类构造代码块执行了");
    }

    private String name;

    public Father() {
        System.out.println("无参构造执行了");
    }

    public Father(String name) {
        System.out.println("父类有参构造执行了");
        this.name = name;
    }


}
