import java.util.Scanner;

public class Registration {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Student Registration Form"); 
		System.out.println(); 
		
		String firstName;
		System.out.print("Enter first name: ");
		firstName = input.next();
		
		String lastName;
		System.out.print("Enter last name: ");
		lastName = input.next();
		
		System.out.print("Enter year of birth: ");
		int year = input.nextInt();
		System.out.println();
		
		String fullName;
		fullName = firstName + " " + lastName + "!";
		System.out.println("Welcome " + fullName);
		
		System.out.println("Your registration is complete."); 
		
		String password;
		password = firstName + "*" + year;
		System.out.println("Your temporary password is: "+ password);


		
		
	}

}

//Jackie Beaugard 