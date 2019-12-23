package com.jiuya.demo1217A;

public class Demo03 {

    public static void main(String[] args) {
        Demo03 d3 = new Demo03();
        System.out.println(d3.countPrimes(10));
    }

    public int countPrimes(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j != 0){
                    break;
                }
            }
        }
        return result;
    }

}
