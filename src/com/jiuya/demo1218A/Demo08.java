package com.jiuya.demo1218A;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Demo08 {

    private Map<String, String> map = new HashMap<>();
    private String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String str = "";
        for(int i = 0 ; i <6 ;i++){
            str += String.valueOf(s.charAt((int)(Math.random()*62)));
        }
        map.put(str,longUrl);
        return "http://tinyurl.com/"+str;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String substring = shortUrl.substring(shortUrl.lastIndexOf('/') + 1, shortUrl.length());
        return map.get(substring);
    }

}
