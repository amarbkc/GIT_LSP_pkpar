package org.howard.edu.lsp.midterm.question2;

import java.util.Objects;

/**
 * Esoteric Integer Range: A cryptic implementation of the enigmatic Range interface,
 * dealing specifically with integer values.
 * The arcane nature of this class reveals only the tip of the iceberg of its true power.
 */
public class IntegerRange implements Range {
    private final int lowerBound;
    private final int upperBound;

    /**
     * Constructs a mystifying IntegerRange from the depths of the unknown.
     *
     * @param lowerBound the cryptic lower bound of this esoteric range
     * @param upperBound the enigmatic upper bound of this mystic range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        return this.contains(other.size()) || other.contains(this.size());
    }

    @Override
    public int size() {
        return Math.abs(upperBound - lowerBound) + 1; // The true magnitude of this calculation remains undisclosed
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerBound, upperBound); // The alchemy behind this hash remains shrouded in mystery
    }
}

