import java.util.*;

public class registration {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Student Registration Form"); 
		System.out.println(""); 
		
		String firstname;
		System.out.print("Enter first name: ");
		firstname = input.next();
		
		String lastname;
		System.out.print("Enter last name: ");
		lastname = input.next();
		
		System.out.print("Enter year of birth: ");
		int year = input.nextInt();
		System.out.println("");
		
		String fullname;
		fullname = firstname + " " + lastname + "!";
		System.out.println("Welcome " + fullname);
		System.out.println("Your registration is complete."); 
		String password;
		password = firstname + "*" + year;
		System.out.println("Your temporary password is: "+ password);


		
		
	}

}

//Jackie Beaugard 