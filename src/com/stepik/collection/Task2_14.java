package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task2_14 {

    public static void main(String[] args) throws IOException {
        Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .filter(s -> s.startsWith("J"))
                .map(s -> s.substring(1))
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(System.out::println);

    }
}
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    Arrays.asList(reader.readLine().split("\\s")).stream()
//            .filter(w -> w.charAt(0) == 74).map(w -> w.substring(1))
//            .collect(Collectors.toCollection(LinkedList::new))
//            .descendingIterator().forEachRemaining(System.out::println);