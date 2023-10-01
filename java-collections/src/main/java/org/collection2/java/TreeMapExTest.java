package org.collection2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.TreeMap;

class TreeMapExTest {


    private TreeMap<Integer, String> treeMap;

    @BeforeEach
    public void setUp() {

        treeMap = new TreeMap<>();
    }

    @Test
    public void testAddAndGetElement() {
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        assertEquals("Three", treeMap.get(3));
    }

    @Test
    public void testKeySetOrder() {
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");


        assertArrayEquals(new Integer[]{1, 2, 3}, treeMap.keySet().toArray());
    }

    @Test
    public void testReverseOrder() {

        TreeMap<Integer, String> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());
        reverseTreeMap.put(3, "Three");
        reverseTreeMap.put(1, "One");
        reverseTreeMap.put(2, "Two");


        assertArrayEquals(new Integer[]{3, 2, 1}, reverseTreeMap.keySet().toArray());
    }

    @Test
    public void testNoDuplicateKeys() {
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        treeMap.put(1, "NewValue of one");

        assertEquals("NewValue of one", treeMap.get(1));
    }


}