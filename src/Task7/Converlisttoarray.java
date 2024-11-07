package Task7;

import java.util.ArrayList;
import java.util.List;

public class Converlisttoarray {
	 public static void main(String[] args) {
	        // Create two lists of strings
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        List<String> vegetables = new ArrayList<>();
	        vegetables.add("Carrot");
	        vegetables.add("Broccoli");
	        vegetables.add("Spinach");

	        // Convert the first list to an array
	        String[] fruitArray = fruits.toArray(new String[0]);

	        // Convert the second list to an array
	        String[] vegetableArray = vegetables.toArray(new String[0]);

	        // Print the fruit array
	        System.out.println("Fruit array:");
	        for (String fruit : fruitArray) {
	            System.out.println(fruit);
	        }

	        // Print the vegetable array
	        System.out.println("\nVegetable array:");
	        for (String vegetable : vegetableArray) {
	            System.out.println(vegetable);
	        }
	    }

}
