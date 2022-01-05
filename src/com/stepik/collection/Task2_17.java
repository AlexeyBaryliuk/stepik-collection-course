package com.stepik.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task2_17 {

    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "Hi_b");
        map.put("d", "Hi_b");
        map.put("e", "Hi_b");
        map.put("r", "Hi_b");
        map.put("c", "Hi");
        System.out.println(mapShare(map).entrySet());
    }
    public static Map<String, String> mapShare(Map<String, String> map) {
        String a = map.get("a");

        if(Objects.nonNull(map.get("a"))){
            map.put("b", a);
            map.remove("c");
        };

        System.out.println(map.containsKey("c"));
        return map;
    }
}

//    public static Map<String, String> mapShare(Map<String, String> map) {
//        map.remove("c");
//        map.computeIfPresent("a", (k, v) -> {
//            map.replace("b", v);
//            return v;
//        });
//        return map;
//    }
