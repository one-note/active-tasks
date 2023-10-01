package org.collection1.java;
import java.util.IdentityHashMap;
public class IdentityHashMapEx {


    public IdentityHashMap<String, Integer> createIdentityHashMap() {
        IdentityHashMap<String, Integer> identityMap = new IdentityHashMap<>();

        String key1 = new String("key");
        String key2 = new String("key");

        identityMap.put(key1, 1);
        identityMap.put(key2, 2);

        return identityMap;
    }
        public static void main(String[] args) {
            IdentityHashMap<String, Integer> identityMap = new IdentityHashMap<>();

            String key1 = new String("key");
            String key2 = new String("key");

            identityMap.put(key1, 1);
            identityMap.put(key2, 2);

            System.out.println("IdentityHashMap size: " + identityMap.size());
            String key3 = new String("key");
            System.out.println("Value for key1: " + identityMap.get(key1));
            System.out.println("Value for key2: " + identityMap.get(key2));
            System.out.println("Value for key3: " + identityMap.get(key3));

            System.out.println("key1 == key2: " + (key1.equals(key2)));
            System.out.println("key1 == key2: " + (key1 == key2));
            System.out.println("key1 == key3: " + (key1 == key3));
        }



}
