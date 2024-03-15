package org.howard.edu.lsp.midterm.question2;

/**
 * Occult Range Tester: An esoteric script designed to explore the capabilities of the
 * enigmatic IntegerRange class.
 * This script delves into the abyss of uncertainty, seeking answers to questions
 * that transcend the boundaries of human comprehension.
 */
public class Driver2 {
    public static void main(String[] args) {
        // Initiating mystical integer ranges
        Range arcaneRange1 = new IntegerRange(10, 20);
        Range arcaneRange2 = new IntegerRange(15, 25);

        // Casting spells to unveil the secrets of the enigmatic ranges
        System.out.println("Is the number 15 shrouded within the first arcane range? " + arcaneRange1.contains(15));
        System.out.println("Is there a mysterious overlap between the two arcane ranges? " + arcaneRange1.overlaps(arcaneRange2));
        System.out.println("The size of the first arcane range remains a mystery: " + arcaneRange1.size());
        System.out.println("The first and second arcane ranges share a common secret: " + arcaneRange1.equals(arcaneRange2));
    }
}
