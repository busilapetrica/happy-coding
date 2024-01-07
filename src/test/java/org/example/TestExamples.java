package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestExamples {

    @Test
    void assertExamples() {

        String a = "test1";
        String b = "test1";

        assertEquals(a,b);

        int x = 10;
        int y = 10;

        assertEquals(x,y);

        boolean condition1 = true;
        boolean condition2 = false;

        assertTrue(condition1);
        assertFalse(condition2);

        int[] n = {5,6,7};
        int[] m = {5,6,7};
        int[] k = {5,6,8};

        int[] l = {5,6,8,5,7,7,4,4,3};
        int[] j = {5,6,8,5,7,7,4,4,3};

        assertArrayEquals(n,m);
        //assertArrayEquals(l,j);

        assertEquals(Arrays.toString(l), Arrays.toString(j));
    }
}
