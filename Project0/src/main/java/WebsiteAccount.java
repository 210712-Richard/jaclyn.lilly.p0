import java.util.Scanner;

public class WebsiteAccount {
	
	//method called register
	public void register() {
	
		Scanner in=new Scanner(System.in);	
		String userName;  
		String email;  
		String accountType; 
		boolean isTeller; 
		
		
		
		System.out.println("What is your username"); 
		//this saves username
		userName= in.nextLine();
		
		System.out.println("What is your email"); 
		//this saves email
		email= in.nextLine(); 
		
		System.out.println("Are you a bank teller? Type yes or no"); 
		accountType= in.nextLine(); 
		if (accountType.equals("yes")) {
			isTeller= true; 
		}else if (accountType.equals("no")) {
			isTeller= false;  
		}else {
			System.out.println("This is not a valid option"); 
			return; 
		}
		System.out.println("Username: " + userName + " Email: " + email + " isTeller: " + isTeller);
		
	}
	
	
}
