package com.stepik.collection_two;

import java.util.*;
import java.util.stream.Collectors;

public class Task2_8 {

    public static void main(String[] args) {


        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }


        //*** change this code which raises ConcurrentModificationException
//        delList.stream()
//                .filter(el -> el > 10)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);


        Iterator iterator = delList.listIterator();

        while (iterator.hasNext()){
            Integer current = (Integer) iterator.next();
            if (current <= 10){
                iterator.remove();
            }
        }

      //  delList.removeIf(integer -> integer < 10);

//        for (Integer i:
//             delList) {
//            System.out.println(i);
//        }


        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);


        map.forEach((k,v) -> System.out.println(k + "=" + v));

        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        String[] strArray = (String[]) nameList.toArray();
    }
}
