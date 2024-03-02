package org.howard.edu.lsp.assignment4;

public class Driver {
    // Creating IntegerSet objects
  
/**
 * 
 * @param args, main function, entry point in the pogram
 */
  public static void main(String[] args) {
	    IntegerSet set1 = new IntegerSet();
	    IntegerSet set2 = new IntegerSet();
	    IntegerSet set4 = new IntegerSet();

	    // Adding elements to set1 and simultaneous testing clear
	    set1.add(1);
	    System.out.println(set1.toString()); 
	    set1.clear();
	    System.out.println(set1.toString());    
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    // Adding elements to set2
	    set2.add(3);
	    set2.add(4);
	    set2.add(5);
	    set2.add(7);

	    // Testing methods
	    System.out.println("Set 1: " + set1.toString());
	    System.out.println("Set 2: " + set2.toString());

	    System.out.println("Length of set 1: " + set1.length());
	    System.out.println("Is set 1 empty? " + set1.isEmpty());

	    System.out.println("Does set 1 contain 2? " + set1.contains(2));
	    System.out.println("Does set 1 contain 0? " + set1.contains(0));
	    
	    try {
	      System.out.println("Largest element in set 4: " + set4.largest());
	    } catch (IntegerSet.setValueException e){
	      System.out.println(e.getMessage());
	    }

	    try {
	      System.out.println("Largest element in set 1: " + set1.largest());
	      System.out.println("Smallest element in set 1: " + set1.smallest());
	    } catch (IntegerSet.setValueException e) {
	      System.out.println(e.getMessage());
	    }

	    System.out.println("Union of set 1 and set 2: " + set1.union(set2));
	    System.out.println("Intersection of set 1 and set 2: " + set1.intersect(set2));
	    System.out.println("Difference of set 1 and set 2: " + set1.diff(set2));
	    System.out.println("Difference of set 2 and set 1: " + set2.diff(set1));

	    // Removing elements from set1
	    set1.remove(1);
	    System.out.println("Set 1 after removing element 1: " + set1);

	    // Testing equals method
	    IntegerSet set3 = new IntegerSet();
	    set3.add(2);
	    set3.add(3);
	    System.out.println("Is set 1 equal to set 3? " + set1.equals(set3));
	    System.out.println("Is set 1 equal to set 2? " + set1.equals(set2));
  }
  
}
