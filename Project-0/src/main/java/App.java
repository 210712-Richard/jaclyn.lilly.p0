import java.util.Scanner;
import people.Customer; 

public class App {

	public static void main(String[] args) {

		// creating scanner
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input;

			System.out.println("Welcome to the Bank");
			System.out.println("(1) Login");
			System.out.println("(2) Register a New Customer");
			System.out.println("(3) Reigster a New Teller");
			System.out.println("(4) Exit");
			System.out.println("Use Numbers for input");

			input = sc.nextLine();

			if (input.equals("4")) {
				System.out.println("Goodbye");
				
			} else if (input.equals("2")) {
				registerCustomer(sc); 
				
			}
			else if input.equals("3")){
				registerTeller(sc); 
			
			}
			{
				System.out.println("Invalid Input");
				continue;
			}

		}

	}

	private static void registerTeller(Scanner sc) {
		while(true) {
			//collect user name
			System.out.println("Enter your username or hit (1) to go back"); 
			String userName = sc.nextLine(); 
			if(userName.equals("1")) {
				break; 
			}
			
			//collect first name
			System.out.println("Enter your Name or press (1) to go back"); 
			String firstName = sc.nextLine();
			if (firstName.equals("1")) {
				break; 
			}
			
			// collect last name
			System.out.println("Enter your last name or hit (1) to go back");
			String lastName = sc.nextLine();
			if (lastName.equals("1")) {
				break;
			}
						
			// collect password
			System.out.println("Enter your password or hit (1) to go back");
			String password = sc.nextLine();
			if (password.equals("1")) {
				continue;
			
			
			
			Teller teller = new Teller(firstName, lastName, userName, password, 0, 0); 
		}
		
	}

	public static void registerCustomer(Scanner sc) {
		while(true) {
			// collect the user name
			System.out.println("Enter your username or hit (1) to go back");
			String userName = sc.nextLine();
			if (userName.equals("1")) {
				break;
			}

			// collect first name
			System.out.println("Enter your Name or (1) to go back");
			String firstName = sc.nextLine();
			if (firstName.equals("1")) {
				break;
			}
			// collect last name
			System.out.println("Enter your last name or hit (1) to go back");
			String lastName = sc.nextLine();
			if (lastName.equals("1")) {
				break;
			}
			// collect password
			System.out.println("Enter your password or hit (1) to go back");
			String password = sc.nextLine();
			if (password.equals("1")) {
				continue;
				
			}
			
			Customer cust = new Customer(firstName, lastName, userName, password, 0, 0); 
			//call a method that writes your customer to a file - filewriter 
			//close file it should save
		}
		
		
		
		
		
	}
	
}
