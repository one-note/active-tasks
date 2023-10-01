package org.collection2.java;

import java.util.*;

public class TreeMapEx {


    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();


        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");


        System.out.println(treeMap.get(2));


        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        TreeMap<Integer, String> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());
        reverseTreeMap.put(3, "Three");
        reverseTreeMap.put(1, "One");
        reverseTreeMap.put(2, "Two");


        for (Map.Entry<Integer, String> entry : reverseTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
