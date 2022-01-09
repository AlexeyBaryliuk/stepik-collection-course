package com.stepik.collection;

import java.util.*;

public class Task2_17 {

    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "Hi_b");
        map.put("d", "Hi_b");
        map.put("e", "Hi_b");
        map.put("r", "Hi_b");
        map.put("c", "Hi");
//        System.out.println(mapShare(map).entrySet());

        printMap(wordCount(new String[]{"a", "b", "c", "a"}));
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

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        TreeMap<String, Integer> map = new TreeMap<>();

        Arrays.stream(strings).forEach(el -> {

            if (map.containsKey(el)){
                Integer v = map.get(el);
                v++;
                map.replace(el, v);
            } else {
                map.put(el, 1);
            }
        });
        return map;
    }
    //====================================================================================
 /*   public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> result = new TreeMap<>();
        Arrays.asList(strings).forEach(x -> result.put(x, result.containsKey(x) ? result.get(x) + 1 : 1));
        return result;
   }
*/
    //====================================================================================
/*
public static SortedMap<String, Integer> wordCount(String[] strings) {
    return new TreeMap<>(Arrays.stream(strings).collect(Collectors.toMap(k -> k, v -> 1, Integer::sum)));
}
 */

    public static void printMap(Map<String, Integer> map){
        map.forEach((k, v) -> System.out.println(k + " : " + v));
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
