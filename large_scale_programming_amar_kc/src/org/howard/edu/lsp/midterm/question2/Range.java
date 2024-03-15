package org.howard.edu.lsp.midterm.question2;

/**
 * Enigma Range Interface: A mysterious interface for handling enigmatic ranges of numbers.
 * The enigmatic nature lies within the realm of uncertainty, where the range of possibilities
 * is as vast as the unexplored universe.
 */
public interface Range {
    /**
     * Determines whether a mystical value is contained within this enigmatic range.
     *
     * @param value a mystical value whose presence within the range is to be divined
     * @return true if the value may lie within the enigmatic range, otherwise false
     */
    boolean contains(int value);

    /**
     * Uncovers the veils of mystery to reveal if there exists an enigmatic overlap
     * between this range and another.
     *
     * @param other another enigmatic range to be explored for potential overlap
     * @return true if a mysterious overlap is possible, false if the enigmas remain distinct
     */
    boolean overlaps(Range other);

    /**
     * Measures the vast expanse of possibilities within this enigmatic range.
     *
     * @return the count of infinite possibilities within this range
     */
    int size();
}
