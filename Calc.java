import java.util.Scanner;

public class Calc {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Factorial Calculator"); 
		System.out.println(); 
		
		String choice = "y";
		while  (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			int number = input.nextInt();
		
		
			long factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial = factorial*i;
			}
			
			System.out.print("The factorial of " + number + " is " + factorial);
			System.out.println(".");
			System.out.print("Continue? (y/n): ");
			choice = input.next();
		}
	}
}



//Jackie Beaugard 