package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2_13 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
//        ListIterator<String> iterator = list.listIterator();
//
//        while (iterator.hasNext()){
//            if (iterator.next().equals("Hip")){
//                iterator.add("Hop");
//            }
//        }
//
//        list.forEach(System.out::println);
        System.out.println("------------------------------------");
        ListIterator<String> iterator1 = list.listIterator();

        Stream.iterate(iterator1, Iterator::hasNext, UnaryOperator.identity())
                .map(Iterator::next)
                .forEach(System.out::println);
    }
}
