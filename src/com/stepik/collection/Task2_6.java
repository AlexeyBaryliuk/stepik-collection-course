package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");

        List<Integer> helpList = getList(strings);
        //add elements from strings to set

        Set<Integer> set = new HashSet<>(helpList);
        //add elements from helpList to set

        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    private static List<Integer> getList(String[] str) {
        return Arrays.stream(str).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
        //put your code here
        return set.stream().filter(el -> el <= 10).collect(Collectors.toSet());
    }
//3 14 16 5 13 2 20 10 6 9; 2 4 6 8 10 12 14 16 18 20
    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> mainSet = new HashSet<>();
        mainSet.addAll(set1);
        mainSet.retainAll(set2);
        set2.retainAll(set1);

        mainSet.addAll(set2);
        mainSet.forEach(el -> System.out.println(" " + el));
        return mainSet;
    }

    public static Set<Integer> symDifference2(Set<Integer> set1, Set<Integer> set2){

        return Stream.concat(set1.stream(), set2.stream())
                .filter(i -> set1.contains(i) ^ set2.contains(i))
                .collect(Collectors.toCollection(HashSet::new));
    }
}
