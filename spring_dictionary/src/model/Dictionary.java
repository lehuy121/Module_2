package model;

import java.util.HashMap;
import java.util.Map;
public class Dictionary {
    public static Map<String, String> stores() {
        Map<String, String> dicMap = new HashMap<>();
        dicMap.put("hello", "xin chao");
        dicMap.put("welcome", "chao mung");
        dicMap.put("love", "yeu");
        dicMap.put("hate", "ghet");
        dicMap.put("smile", "cuoi");
        dicMap.put("happy", "vui ve, hanh phuc");
        return dicMap;
    }
}
