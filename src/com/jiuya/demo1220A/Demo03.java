package com.jiuya.demo1220A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo03 {

    public static void main(String[] args) {
        Demo03 d3 = new Demo03();
        String[] nums = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(d3.findWords(nums)));
    }

    public String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String c = String.valueOf(words[i].toLowerCase().charAt(0));
            String word = words[i].toLowerCase();
            if (str1.contains(c)) {
                String line1 = isLine1(word);
                if (line1 != null) {
                    result.add(words[i]);
                }
            } else if (str2.contains(c)) {
                String line2 = isLine2(word);
                if (line2 != null) {
                    result.add(words[i]);
                }
            } else {
                String line3 = isLine3(word);
                if (line3 != null) {
                    result.add(words[i]);
                }
            }
        }
        String [] arrResult = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrResult[i] = result.get(i);
        }
        return arrResult;
    }

    public String isLine1(String word) {
        String str1 = "qwertyuiop";
        for (int i = 0; i < word.length(); i++) {
            if (!str1.contains(String.valueOf(word.charAt(i)))) {
                return null;
            }
        }
        return word;
    }

    public String isLine2(String word) {
        String str2 = "asdfghjkl";
        for (int i = 0; i < word.length(); i++) {
            if (!str2.contains(String.valueOf(word.charAt(i)))) {
                return null;
            }
        }
        return word;
    }

    public String isLine3(String word) {
        String str3 = "zxcvbnm";
        for (int i = 0; i < word.length(); i++) {
            if (!str3.contains(String.valueOf(word.charAt(i)))) {
                return null;
            }
        }
        return word;
    }
}
