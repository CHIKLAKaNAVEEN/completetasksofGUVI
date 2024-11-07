package Task7;

public class ExceptionDemo {

	public static void main(String[] args) {
        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing the fourth element: " + numbers[3]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds. " + e.getMessage());
        }

        // Demonstrating StringIndexOutOfBoundsException
        try {
            String text = "Hello";
            System.out.println("Accessing character at index 5: " + text.charAt(5)); // This will throw an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds. " + e.getMessage());
        }
	}
}
