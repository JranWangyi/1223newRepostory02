package com.jiuya.demo1220A;

public class Demo01 {

    public static void main(String[] args) {
        Demo01 d1 = new Demo01();
        int nums[] = {1,2};
        System.out.println(d1.findPoisonedDuration(nums, 2));
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            result+= (timeSeries[i]-timeSeries[i-1]>duration?duration:timeSeries[i]-timeSeries[i-1]);
        }
        return result+duration;
    }

}
