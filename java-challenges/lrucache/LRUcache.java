

import java.util.HashMap;
import java.util.Map;

class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, Node<K, V>> cache;
    private final DoublyLinkedList<K, V> lruList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.lruList = new DoublyLinkedList<>();
    }

    public V get(K key) {
        if (cache.containsKey(key)) {
            Node<K, V> node = cache.get(key);
            lruList.moveToFront(node);
            return node.value;
        }
        return null;
    }

    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            Node<K, V> node = cache.get(key);
            node.value = value;
            lruList.moveToFront(node);
        } else {
            if (cache.size() >= capacity) {
                Node<K, V> removedNode = lruList.removeLast();
                cache.remove(removedNode.key);
            }
            Node<K, V> newNode = new Node<>(key, value);
            cache.put(key, newNode);
            lruList.addToFront(newNode);
        }
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class DoublyLinkedList<K, V> {
        private Node<K, V> head;
        private Node<K, V> tail;

        public void addToFront(Node<K, V> node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        }

        public void moveToFront(Node<K, V> node) {
            if (node == head) {
                return;
            }

            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }

            if (node == tail) {
                tail = node.prev;
            }

            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }

        public Node<K, V> removeLast() {
            if (tail == null) {
                return null;
            }

            Node<K, V> removedNode = tail;

            if (tail.prev != null) {
                tail.prev.next = null;
                tail = tail.prev;
            } else {
                head = null;
                tail = null;
            }

            return removedNode;
        }
    }
}

class LRUCacheExample {
    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        lruCache.put(1, "c");
        lruCache.put(2, "react");
        lruCache.put(3, "node");
        lruCache.put(2, "java");

        System.out.println(lruCache.get(2));

        lruCache.put(4, "html");

        System.out.println(lruCache.get(1));
    }
}
