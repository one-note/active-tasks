package org.collection1.java;

import java.util.WeakHashMap;
import java.util.Map;

public class WeakHashMapEx {


    public static void main(String[] args) {

        Map<Key, String> weakHashMap = new WeakHashMap<>();


        Key key1 = new Key(1);
        Key key2 = new Key(2);

        weakHashMap.put(key1, "Value 1");
        weakHashMap.put(key2, "Value 2");


        System.out.println("WeakHashMap: " + weakHashMap);


        key1 = null;
        key2 = null;


        System.gc();


        System.out.println("WeakHashMap after key1 and key2 are null: " + weakHashMap);
    }
}

class Key {
    private int id;

    public Key(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Key-" + id;
    }
}



