package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

    private IntegerSet set;

    @BeforeEach
    void setUp() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear method")
    void testClear() {
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length method")
    void testLength() {
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals method")
    void testEquals() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains method")
    void testContains() {
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for largest method")
    void testLargest() throws IntegerSetException {
        set.add(1);
        set.add(2);
        assertEquals(2, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest method")
    void testSmallest() throws IntegerSetException {
        set.add(1);
        set.add(2);
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for add method")
    void testAdd() {
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    @DisplayName("Test case for remove method")
    void testRemove() {
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for union method")
    void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set2.add(2);
        set.union(set2);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
    }

    @Test
    @DisplayName("Test case for intersect method")
    void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set.intersect(set2);
        assertTrue(set.contains(2));
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for diff method")
    void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set.diff(set2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set1.complement(set2);
        assertEquals(1, set1.length()); // Complement should contain elements not in set2
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }

    @Test
    @DisplayName("Test case for largest method exception handling")
    void testLargestException() {
        assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
    }

    @Test
    @DisplayName("Test case for smallest method exception handling")
    void testSmallestException() {
        assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
    }
}

