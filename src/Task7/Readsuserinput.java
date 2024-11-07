package Task7;

import java.util.Scanner;

public class Readsuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number");
		int numer1=scanner.nextInt();
		System.out.println("enter the second number");
		int numer2=scanner.nextInt();
try {
		
		int results=divide(numer1,numer1);
		System.out.println("Number is " +results );
		
 }
catch (ArithmeticException e) {
	System.out.println("Error: Division by zero is not allowed.");
}
	}
	
	private static int divide(int numer1, int numer12) {
		// TODO Auto-generated method stub
		return numer1/numer12;
	}
	
}
