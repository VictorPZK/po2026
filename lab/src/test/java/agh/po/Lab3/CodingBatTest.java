package agh.po.Lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();
    @org.junit.Test
    public void array123() {
        assertEquals(true,cb.array123(new int[]{1,2,3,2,2,3,3,3,4}));
        assertEquals(false,cb.array123(new int[]{1,2,2,3,3,2,2}));
        assertEquals(true,cb.array123(new int[]{1,2,3,1,2}));
        assertEquals(false,cb.array123(new int[]{1,4,3,1,4}));
        assertEquals(false,cb.array123(new int[]{1,2,1,1,3,2}));
        assertEquals(true,cb.array123(new int[]{1,2,1,1,2,3}));
        assertEquals(false,cb.array123(new int[]{1,2,1}));
        assertEquals(false,cb.array123(new int[]{1,2,5,5,4}));
        assertEquals(true,cb.array123(new int[]{1,2,3,3,3,2}));
    }
}