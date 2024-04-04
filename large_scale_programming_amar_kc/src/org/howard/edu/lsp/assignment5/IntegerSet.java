package org.howard.edu.lsp.assignment5;

import java.util.HashSet;
import java.util.Set;

public class IntegerSet {
    private Set<Integer> set = new HashSet<>();

    // Default Constructor
    public IntegerSet() {
    }

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order.
     */
    public boolean equals(Object o) {
        if (!(o instanceof IntegerSet))
            return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.equals(otherSet.set);
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws a IntegerSetException if the set
    // is empty
    public int largest() throws IntegerSetException {
        if (set.isEmpty())
            throw new IntegerSetException("Set is empty");
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set
    // is empty
    public int smallest() throws IntegerSetException {
        if (set.isEmpty())
            throw new IntegerSetException("Set is empty");
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // Adds an item to the set or does nothing if already there
    public void add(int item) {
        set.add(item);
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove(item);
    }

    // Set union
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    // Set intersection
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1
    public void complement(IntegerSet intSetb) {
        Set<Integer> complementSet = new HashSet<>(intSetb.set);
        complementSet.removeAll(set);
        set = complementSet;
    }

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set
    public String toString() {
        return set.toString();
    }
}
