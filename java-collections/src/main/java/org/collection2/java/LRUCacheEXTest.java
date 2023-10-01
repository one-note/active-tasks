package org.collection2.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheEXTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n1\n1\nValue1\n2\n1\n3\n4\n5\n".getBytes());
    private LRUCacheEX lruCacheApp;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
        lruCacheApp = new LRUCacheEX(3);
    }

    @Test
    public void testPutAndGet() {
        lruCacheApp.run();
        String output = outputStream.toString();
        assertTrue(output.contains("Choose an operation:"));
        assertTrue(output.contains("Value: Value1"));
    }

    @Test
    public void testRemove() {
        lruCacheApp.run();
        String output = outputStream.toString();
        assertTrue(output.contains("Key removed."));
    }

    @Test
    public void testPrintCache() {
        lruCacheApp.run();
        String output = outputStream.toString();
        assertTrue(output.contains("LRU Cache: {1=Value1}"));
    }

    @Test
    public void testExit() {
        lruCacheApp.run();
        String output = outputStream.toString();
        assertTrue(output.contains("Exiting..."));
    }


    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(System.in);
        outputStream.reset();
    }
}
