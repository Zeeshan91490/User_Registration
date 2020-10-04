package UserReg;
import java.util.*;
import java.util.regex.Pattern;

public class uc2UserReg {


	
		private String firstName;
		private String lastName;

		private void addFirstName() {
			boolean validCounter = false;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("First Name: ");
				firstName = sc.nextLine();
				if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName)) {
					validCounter = true;
					System.out.println("Valid!");
				}
				else
					System.out.println("Invalid. Please enter again!");
			} while(!validCounter);
		}
		
		private void addLastName() {
			boolean validCounter = false;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("Last Name: ");
				lastName = sc.nextLine();
				if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName)) {
					validCounter = true;
					System.out.println("Valid!");
				}
				else
					System.out.println("Invalid. Please enter again!");
			} while(!validCounter);
			sc.close();
		}
		public static void main(String[] args) {
			uc2UserReg userOne = new uc2UserReg();
			userOne.addFirstName();
			userOne.addLastName();
		}

}

	