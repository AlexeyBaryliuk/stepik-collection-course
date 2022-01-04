package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2_12 {

    public static void main(String[] args) throws IOException {
        Arrays.stream(new BufferedReader(new InputStreamReader(System.in))
                .readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .filter(el -> el % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }
}
