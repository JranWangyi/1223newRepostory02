package com.jiuya.demo1216A;

public class Demo10 {

    public static void main(String[] args) {
        System.out.println(func1());
    }

    public static User func1(){
        int i = 10;
        User u = new User(1,"张三",24);
        try{
           i = i/0;
        }catch(Exception e){
            return u;
        }finally{
            u.setName("拉拉泵");
        }
        return u;
    }
}
