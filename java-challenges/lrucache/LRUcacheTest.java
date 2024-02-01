package servlet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LRUcacheTest {


    @Test
    void LRUCacheTest() {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        lruCache.put(1, "Java");
        lruCache.put(2, "React");
        lruCache.put(3, "NodeJS");

        assertEquals("React", lruCache.get(2));

        lruCache.put(2, "Python");
        assertEquals("Python", lruCache.get(2));

        lruCache.put(4, "HTML");

        assertNull(lruCache.get(1));

        assertEquals("Python", lruCache.get(2));
        assertEquals("NodeJS", lruCache.get(3));
        assertEquals("HTML", lruCache.get(4));
    }

    @Test
    void LRUCacheDelet() {
        LRUCache<Integer, String> lruCache = new LRUCache<>(2);

        lruCache.put(1, "Java");
        lruCache.put(2, "Python");

        assertEquals("Java", lruCache.get(1));

        lruCache.put(3, "C");

        assertNull(lruCache.get(2));
        assertEquals("Java", lruCache.get(1));
        assertEquals("C", lruCache.get(3));
    }


}
