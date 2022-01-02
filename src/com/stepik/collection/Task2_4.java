package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        LinkedList<Integer> ll =
                Arrays.stream(str.split(" "))
                        .map(Integer::parseInt)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toCollection(LinkedList::new));

        ll.subList(0, 3).clear();
        ll.stream().sorted().forEach(System.out::println);
    }
}
