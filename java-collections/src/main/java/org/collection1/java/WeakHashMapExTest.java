package org.collection1.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExTest {

    @Test
    public void testWeakHashMapGarbageCollection() {
        Map<Key, String> weakHashMap = new WeakHashMap<>();

        Key key1 = new Key(1);
        Key key2 = new Key(2);

        weakHashMap.put(key1, "Value 1");
        weakHashMap.put(key2, "Value 2");


        assertTrue(weakHashMap.containsKey(key1));
        assertTrue(weakHashMap.containsKey(key2));


        key1 = null;
        key2 = null;


        System.gc();


        assertFalse(weakHashMap.containsKey(new Key(1)));
        assertFalse(weakHashMap.containsKey(new Key(2)));
    }
}
