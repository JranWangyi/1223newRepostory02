package com.jiuya.demo1216A;

import java.util.Arrays;
import java.util.List;

public class Demo12 {

    public static void main(String[] args) {
        System.out.println("答案是:" + myAtoi("-91283472332"));
    }

    public static int myAtoi(String str) {
        String newStr = str.trim().replaceAll(" ", "");
        Character[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        List<Character> charactersList = Arrays.asList(ch);
        if (newStr.startsWith("-") || newStr.startsWith("+")) {
            for (int i = 1; i < newStr.length(); i++) {
                if (!charactersList.contains(newStr.toCharArray()[i])) {
                    String numStr = newStr.substring(1, i);
                    int result1 = 0;
                    try {
                        result1 = Integer.parseInt(numStr);
                    } catch (Exception e) {
                        if (newStr.startsWith("-")) {
                            result1 = -(1 << 31);
                        } else {
                            result1 = (2 << 31) - 1;
                        }
                    }
                    return result1;
                } else {
                    int result2 = 0;
                    try {
                        result2 = Integer.parseInt(newStr.substring(1, newStr.length()));
                    } catch (Exception e) {
                        if (newStr.startsWith("-")) {
                            result2 = -(2 << 31);
                        } else {
                            result2 = (2 << 31) - 1;
                        }
                    }
                    return result2;
                }
            }
        } else if (charactersList.contains(newStr.toCharArray()[0])) {
            for (int i = 0; i < newStr.length(); i++) {
                if (!charactersList.contains(newStr.toCharArray()[i])) {
                    String numStr = newStr.substring(0, i);
                    System.out.println("numStr=" + numStr);
                    return Integer.parseInt(numStr);
                }
            }
        }
        return 0;
    }

}
