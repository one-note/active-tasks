package org.collection1.java;

import java.util.concurrent.ConcurrentHashMap;


public class FailSafeCollections {


    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                concurrentMap.put(i, "Value " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                concurrentMap.put(i, "Value " + i);
            }
        });


        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("ConcurrentMap size: " + concurrentMap.size());
    }
}



