package com.stepik.collection;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task2_18 {
    public static void main(String[] args) {
       NavigableMap<Integer, Integer> nmap =  new TreeMap<>();

       nmap.put(2,1);
       nmap.put(3,1);
       nmap.put(4,1);
       nmap.put(5,1);
       nmap.put(6,1);
       nmap.put(7,1);
       nmap.put(8,1);
       nmap.put(9,1);
       nmap.put(10,1);
       nmap.put(11,1);
       nmap.put(12,1);
       nmap.put(13,1);
       nmap.put(14,1);

getSubMap(nmap).forEach((k, v) -> {
    System.out.println(k + " : " + v);
});
    }

    public static NavigableMap<Integer, Integer> getSubMap(NavigableMap<Integer, Integer> map){
        "123".chars().forEach(System.out::println);
        return map.firstKey() % 2 != 0
                ? map.subMap(map.firstKey(), true, map.firstKey() + 4, true).descendingMap()
                : map.subMap(map.lastKey() - 4, true, map.lastKey(), true).descendingMap();

    }
}
