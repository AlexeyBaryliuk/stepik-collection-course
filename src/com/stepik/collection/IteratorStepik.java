package com.stepik.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class IteratorStepik {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1);

        Spliterator<Integer> spliterator = list.spliterator();
        spliterator.forEachRemaining(integer -> {    if (integer%2==0) System.out.println("even the number");
        });//using lambda expressions it becomes very convenient

//trySplit() example;
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Spliterator<Integer> split = lst.spliterator();
        split.trySplit().forEachRemaining(System.out::println);
        System.out.println("---------");
        split.trySplit().forEachRemaining(System.out::println);
        System.out.println("---------");
        split.trySplit().forEachRemaining(System.out::println);
        System.out.println("---------");
        split.forEachRemaining(System.out::println);

    }
}
