package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2_9 {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] sets = reader.readLine().split(";");
//
//        Set<Integer> set1 = getSet(sets[0]);
//        //your code(add elements to set1 from sets[0])
//
//        Set<Integer> set2 = getSet(sets[1]);;
//        //your code(add elements to set2 from sets[1])
//
//        Set<Integer> set3  = getSet(sets[2]);;
//        //your code(add elements to set3 from sets[2])
//
//        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);
//
//        resultTreeSet.forEach(System.out::println);
        //print elements of resultTreeSet(using System.out.printLn()) below

        LinkedHashSet lhs = new LinkedHashSet();
        TreeSet set = new TreeSet();
        LinkedList linkedList = new LinkedList<>();
        set.lower(0);
        Object obj = new Object();
        int i = 10;
        //lhs.lower(1);
        lhs.forEach(System.out::println);
        lhs.add(obj);
        //lhs.first();
        lhs.add(i);
        lhs.contains(10);

    }

    private static Set<Integer> getSet(String str) {
        return Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toSet());
    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3){
        TreeSet<Integer> resultSet = new TreeSet<>();

        new ArrayList<Set<Integer>>(){{
            add(set1);
            add(set2);
            add(set3);
        }}.forEach(el -> resultSet.add(maxValue(el)));
        return (TreeSet<Integer>) resultSet.descendingSet();
    }

    private static Integer maxValue(Set<Integer> set1) {
        return set1.stream().max(Comparator.naturalOrder()).get();
    }
}
//    public static void main(String[] args) throws IOException {
//        new BufferedReader(new InputStreamReader(System.in)).lines()
//                .map(string -> string.split(";"))
//                .flatMap(Arrays::stream)
//                .map(string -> string.split(" "))
//                .map(Arrays::asList)
//                .map(x -> x.stream().map(Integer::parseInt).collect(Collectors.toList()))
//                .map(Collections::max)
//                .collect(Collectors.toCollection(() -> new TreeSet<>(Collections.reverseOrder())))
//                .forEach(System.out::println);
//    }
