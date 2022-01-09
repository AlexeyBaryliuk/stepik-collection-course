package com.stepik.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int days = 0;
        System.out.println("Sequentially enter the H, A, and B");
        for (int i = 0; i < 3; i++) {
            String current = reader.readLine();
            list.add(Integer.parseInt(current));
            if (i < 2){
                System.out.println("Next value is");
            }

        }
        validateList(list);
        anotherSolution(list);

        System.out.println("Number of days are " + reachGoal(list, days));

    }

    private static void anotherSolution(List<Integer> list) {
        System.out.println(
                Math.round(
                Math.ceil((double) (list.get(0) - list.get(2)) / (list.get(1) - list.get(2)))));
    }

    private static Integer reachGoal(List<Integer> list, int days) {
        Integer h = list.get(0);

        while (list.get(1) < h){
            days++;
            h = h - list.get(1) + list.get(2);
            list.set(0, h);
            reachGoal(list, days);
        }
        if (list.get(0) <= list.get(1) && list.get(0) != 0){
            days++;
        }
        return days;
    }

    private static void validateList(List<Integer> list) {
        if (list.get(2) > list.get(0) || list.get(2) > list.get(1)){
            throw new RuntimeException("B should be less than H and A");
        }
    }
}
