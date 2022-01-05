package com.stepik.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Task2_15 {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("a");
        queue.offer("c");
        queue.offer("b");

        String name = queue.peek();
        String name1 = queue.poll();
        String name2 = queue.poll();
        queue.offer(name);

        queue.forEach(System.out::print);
        System.out.println();
//        spliteratorWork(Arrays.asList(1.0, 4.0, 8.0, 16.0, 99.0, 100.0, 110.0, 121.0));
    }
    public static List<Double> spliteratorWork(List<Double> list){
        return list.stream()
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }
    public static void print(List<Double> list){
        Spliterator<Double> spl = list.spliterator();

        printSpliterator(spl.trySplit(), 2);
        System.out.println();
        printSpliterator(spl, 10);
    }

     public static void printSpliterator(Spliterator<Double> spl, Integer num){
         spl.forEachRemaining(d -> {
             if(d >= num){
                 System.out.println(d);
             }
         });
     }
}
