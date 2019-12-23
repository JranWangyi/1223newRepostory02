package com.jiuya.demo1220A;

public class Demo04 {

    public static void main(String[] args) {
        Demo04 d4 = new Demo04();
        int nums[] = {1, 2, 3, 4};
        System.out.println(d4.numberOfArithmeticSlices(nums));
    }

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 2; i < A.length; i++) {
            result += isEqualsDiffer(A,i);
        }
        return result;
    }

    public static int isEqualsDiffer(int[] A, int endIndex) {
        int count = 0;
            if(endIndex < A.length){
            if (A[endIndex] - A[endIndex - 1] == A[endIndex - 1] - A[endIndex - 2]) {
                count ++ ;
                count += isEqualsDiffer(A,endIndex+1);
            }
        }
        return count;
    }
}
