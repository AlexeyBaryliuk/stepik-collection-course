package com.stepik.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String allElements = reader.readLine();
//        List<Integer> bigList = createBigList(allElements);

//        ArrayList<Integer> div2list = new ArrayList<>();
//        ArrayList<Integer> div3list = new ArrayList<>();
//        ArrayList<Integer> otherlist = new ArrayList<>();
//
//        Collections.sort(bigList);
//
//        bigList.forEach(el -> {
//            if (el % 2 == 0){
//                div2list.add(el);
//            }
//            if (el % 3 == 0){
//                div3list.add(el);
//            }
//            if (!(el % 2 == 0 || el % 3 == 0)){
//                otherlist.add(el);
//            }
//        });
        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists

        //get result list from createListOfLists

        //call printInLine() for resultList
//        printInLine(createListOfLists(div2list, div3list, otherlist));
    printElements(new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)));

    }
    //1 task
    public static Integer maxElem(List<Integer> list){
        return list.stream().max(Comparator.naturalOrder()).get();
    }

    // 2.4

    public static void printElements(List<Integer> list){
        for (int i = 0; i < 3; i++){
            list.remove(0);
        }
        list.stream().sorted().forEach(System.out::println);
    }
    public static Integer maxElem1(List<Integer> list){
        return list.stream().max(Comparator.naturalOrder()).orElseThrow();
    }
    public static void printInLine(List<List<Integer>> lists){
        List<Integer> list = lists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i) < list.get(i - 1)){
                System.out.print(";");
            }
            System.out.print(" " + list.get(i));
        }
    }

    public static List<Integer> createBigList(String str){
        List<Integer> bigList = new ArrayList<>();
        String[] strarr = str.split(" ");

        for(String s : strarr){
            //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList
            bigList.add(Integer.parseInt(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list ,List<Integer> otherList){
        //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(div2list);
        lists.add(div3list);
        lists.add(otherList);
        return lists;
    }
}
