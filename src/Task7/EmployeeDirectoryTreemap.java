package Task7;

import java.util.TreeMap;

public class EmployeeDirectoryTreemap {
	 public static void main(String[] args) {
	        // Create a TreeMap to store employee IDs and names
	        TreeMap<Integer, String> employees = new TreeMap<>();

	        // Adding employee IDs and names to the TreeMap
	        employees.put(102, "Alice");
	        employees.put(101, "Bob");
	        employees.put(104, "Charlie");
	        employees.put(103, "Diana");

	        // Print the names of all employees in alphabetical order
	        System.out.println("Employee names in alphabetical order:");

	        // Extract the names from the TreeMap and store them in a list
	        for (String name : employees.values()) {
	            System.out.println(name);
	        }
	    }

}
