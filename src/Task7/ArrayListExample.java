package Task7;

import java.util.ArrayList;

public class ArrayListExample {

	
	  public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> fruits = new ArrayList<>();

	        // Add some elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");

	        // Print the ArrayList before removing elements
	        System.out.println("ArrayList before removing elements: " + fruits);

	        // Remove all elements from the ArrayList
	        fruits.clear();

	        // Print the ArrayList after removing elements
	        System.out.println("ArrayList after removing elements: " + fruits);
	    }
}
