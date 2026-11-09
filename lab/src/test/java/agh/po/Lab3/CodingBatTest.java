package agh.po.Lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();
    private static Map<String, String> map(String... kv) {
        Map<String, String> m = new HashMap<>();
        for (int i = 0; i < kv.length; i += 2) {
            m.put(kv[i], kv[i + 1]);
        }
        return m;
    }
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
    @org.junit.Test
    public void pairs() {
        assertEquals(map("b", "g", "c", "e"),
                cb.pairs(new String[]{"code", "bug"}));
        assertEquals(map("m", "n"),
                cb.pairs(new String[]{"man", "moon", "main"}));
        assertEquals(map("g", "d", "m", "n", "n", "t"),
                cb.pairs(new String[]{"man", "moon", "good", "night"}));
        assertEquals(map(),
                cb.pairs(new String[]{}));
        assertEquals(map("a", "a", "b", "b"),
                cb.pairs(new String[]{"a", "b"}));
        assertEquals(map("a", "d", "c", "s"),
                cb.pairs(new String[]{"are", "codes", "and", "cods"}));
        assertEquals(map("a", "e", "b", "a", "c", "e", "t", "a"),
                cb.pairs(new String[]{"apple", "banana", "tea", "coffee"}));
    }
}