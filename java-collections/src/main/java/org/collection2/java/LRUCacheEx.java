package org.collection2.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class LRUCacheEx {

    static class LRUCacheEX {
        private final int capacity;
        private final LinkedHashMap<Integer, String> cache;
        private final Scanner scanner;

        public LRUCacheEX(int capacity) {
            this.capacity = capacity;
            this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                    return size() > capacity;
                }
            };
            this.scanner = new Scanner(System.in);
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
                        int key = scanner.nextInt();
                        System.out.print("Enter value: ");
                        String value = scanner.next();
                        cache.put(key, value);
                        break;
                    case 2:
                        System.out.print("Enter key to get: ");
                        int getKey = scanner.nextInt();
                        String retrievedValue = cache.get(getKey);
                        System.out.println("Value: " + retrievedValue);
                        break;
                    case 3:
                        System.out.print("Enter key to remove: ");
                        int removeKey = scanner.nextInt();
                        cache.remove(removeKey);
                        System.out.println("Key removed.");
                        break;
                    case 4:
                        System.out.println("LRU Cache: " + cache);
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

            LRUCacheEX app = new LRUCacheEX(capacity);
            app.run();
        }
    }
}