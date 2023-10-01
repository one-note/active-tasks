package org.collection2.java;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LFUCacheTest {

    private LFUCache<Integer, String> cache;

    @BeforeEach
    public void setUp() {
        cache = new LFUCache<>(3);
    }

    @Test
    public void testPutAndGet() {
        cache.put(1, "Value1");
        cache.put(2, "Value2");

        assertEquals("Value1", cache.get(1));
        assertEquals("Value2", cache.get(2));
    }

    @Test
    public void testRemove() {
        cache.put(1, "Value1");
        cache.put(2, "Value2");

        cache.remove(1);

        assertNull(cache.get(1));
        assertEquals("Value2", cache.get(2));
    }

    @Test
    public void testEviction() {
        cache.put(1, "Value1");
        cache.put(2, "Value2");
        cache.put(3, "Value3");
        cache.put(4, "Value4");

        assertNull(cache.get(1));
        assertEquals("Value2", cache.get(2));
        assertEquals("Value3", cache.get(3));
        assertEquals("Value4", cache.get(4));
    }

    @Test
    public void testFrequency() {
        cache.put(1, "Value1");
        cache.put(2, "Value2");
        cache.get(1);

        assertEquals("Value1", cache.get(1));
    }

    @Test
    public void testCacheSize() {
        cache.put(1, "Value1");
        cache.put(2, "Value2");
        cache.put(3, "Value3");
        cache.put(4, "Value4");

        assertEquals(3, cache.size());

        cache.put(5, "Value5");

        assertEquals(3, cache.size());
    }

    @Test
    public void testPrintCache() {
        cache.put(1, "Value1");
        cache.put(2, "Value2");

        cache.printCache();
    }
}

