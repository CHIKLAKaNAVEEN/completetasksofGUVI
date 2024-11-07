package Task7;

import java.util.Scanner;

import javax.imageio.IIOException;

public class AgeValidatorexceptiontrycatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
        	validateAge(age);
            System.out.println("Your age is: " + age);
        } 
        catch (IIOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18.");
        }	
        }

}
