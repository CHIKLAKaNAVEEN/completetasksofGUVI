package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateFileReader {
	 public static void main(String[] args) {
	        // Specify the file name
	        String fileName = "C:\\Users\\nchilaka\\Desktop\\Naveen\\D-drive\\avd.txt"; // Change to the path of your file

	        try {
	            // Attempt to read from the file
	            readDateFromFile(fileName);
	        } catch (FileNotFoundException e) {
	            // Handle the case where the file is not found
	            System.out.println("Error: The file '" + fileName + "' was not found.");
	        }
	    }

	    private static void readDateFromFile(String fileName) throws FileNotFoundException {
	        File file = new File(fileName);
	        Scanner fileScanner = new Scanner(file);

	        // Read and display the date from the file
	        if (fileScanner.hasNextLine()) {
	            String date = fileScanner.nextLine();
	            System.out.println("Date read from file: " + date);
	        } else {
	            System.out.println("The file is empty.");
	        }

	        fileScanner.close();
	    }

}
