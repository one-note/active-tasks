package org.collection2.java;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

class LFUCache<K, V> {

    public int size() {
        return cache.size();
    }
    private final int capacity;
    private final Map<K, V> cache;
    private final Map<K, Integer> frequency;
    private final Map<Integer, Set<K>> frequencyLists;
    private int minFrequency;
    private final Scanner scanner;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.frequency = new HashMap<>(capacity);
        this.frequencyLists = new HashMap<>();
        this.minFrequency = 0;
        this.scanner = new Scanner(System.in);
    }

    public void put(K key, V value) {
        if (capacity <= 0)
            return;

        if (cache.size() >= capacity) {
            evict();
        }

        cache.put(key, value);
        frequency.put(key, 1);
        updateFrequencyList(key, 1);
    }

    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }

        int freq = frequency.get(key);
        frequency.put(key, freq + 1);
        updateFrequencyList(key, freq + 1);
        return cache.get(key);
    }

    public void remove(K key) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            frequency.remove(key);
            updateFrequencyList(key, 0);
        }
    }

    private void updateFrequencyList(K key, int newFreq) {
        if (!frequencyLists.containsKey(newFreq)) {
            frequencyLists.put(newFreq, new LinkedHashSet<>());
        }

        if (frequency.containsKey(key)) {
            int oldFreq = frequency.get(key);
            frequencyLists.get(oldFreq).remove(key);
        }

        frequencyLists.get(newFreq).add(key);

        if (newFreq < minFrequency || minFrequency == 0) {
            minFrequency = newFreq;
        }
    }

    private void evict() {
        if (cache.isEmpty()) {
            return;
        }
        Set<K> minFreqSet = frequencyLists.get(minFrequency);
        K evictKey = minFreqSet.iterator().next();
        minFreqSet.remove(evictKey);
        cache.remove(evictKey);
        frequency.remove(evictKey);
    }

    public void printCache() {
        System.out.println("LFU Cache: " + cache);
    }

    public void run() {
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Put");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Print Cache");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    K putKey = (K) scanner.next();
                    System.out.print("Enter value: ");
                    V putValue = (V) scanner.next();
                    put(putKey, putValue);
                    break;
                case 2:
                    System.out.print("Enter key to get: ");
                    K getKey = (K) scanner.next();
                    V retrievedValue = get(getKey);
                    System.out.println("Value: " + retrievedValue);
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    K removeKey = (K) scanner.next();
                    remove(removeKey);
                    System.out.println("Key removed.");
                    break;
                case 4:
                    printCache();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the capacity of the cache: ");
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();

        LFUCache<String, String> app = new LFUCache<>(capacity);
        app.run();
    }
}
