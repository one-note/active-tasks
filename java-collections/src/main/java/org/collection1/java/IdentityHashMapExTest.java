package org.collection1.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.IdentityHashMap;


public class IdentityHashMapExTest {
    private IdentityHashMapEx identityHashMapEx;

    @BeforeEach
    public void setUp() {
        identityHashMapEx = new IdentityHashMapEx();
    }

    @Test
    public void testIdentityHashMapSize() {
        IdentityHashMap<String, Integer> identityMap = identityHashMapEx.createIdentityHashMap();
        assertEquals(2, identityMap.size());
    }

    @Test
    public void testIdentityHashMapValues() {
        IdentityHashMap<String, Integer> identityMap = identityHashMapEx.createIdentityHashMap();

        Integer valueForKey1 = identityMap.get("key");
        Integer valueForKey2 = identityMap.get("key");
        Integer valueForKey3 = identityMap.get("otherKey");

        assertEquals(1, valueForKey1);
        assertEquals(2, valueForKey2);
        assertNull(valueForKey3);
    }

    @Test
    public void testIdentityHashMapEquality() {
        IdentityHashMap<String, Integer> identityMap = identityHashMapEx.createIdentityHashMap();

        String key1 = new String("key");
        String key2 = new String("key");
        String key3 = new String("otherKey");

        assertTrue(key1 != key2);
        assertTrue(key1 != key3);

        assertEquals(1, identityMap.get(key1));
        assertEquals(2, identityMap.get(key2));
        assertNull(identityMap.get(key3));
    }
}


