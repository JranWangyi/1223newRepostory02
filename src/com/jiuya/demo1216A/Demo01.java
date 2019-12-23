package com.jiuya.demo1216A;

public class Demo01 {

    static{
        System.out.println("静态代码块执行了");
    }

    public static int id = 9527;

    private String name = "王毅";

    public Demo01(){
        System.out.println("无参构造执行了");
    }

    public Demo01(String name){
        System.out.println("有参构造执行了");
    }

    public static void main(String[] args) {
        System.out.println("哈哈哈哈");
    }

}
