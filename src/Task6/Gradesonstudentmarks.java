package Task6;

import java.util.Scanner;

public class Gradesonstudentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter average of your marks (less than 100)::");
	      int average = sc.nextInt();
	      char grade;

	      if(average>=90){
	         grade = 'A';
	      }else if(average>=80){
	         grade = 'B';
	      }
	      else if(average>=70){
	         grade = 'C';
	      } 
	      else if(average>=60){
		         grade = 'D';
		      }
	      else if(average>=50){
		         grade = 'E';
		      }
	      else {
	         grade = 'F';
	      }

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!");
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	         System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	}

}
