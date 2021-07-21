import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebsiteAccount implements Serializable{
	private static List<WebsiteAccount> accounts;
	//attributes of website account class
	String userName;  
	String email;  
	String accountType; 
	boolean isTeller; 
	String phoneNumber; 
	String birthDate; 
	
	static {
		WebsiteAccount.load();
		System.out.println(accounts);
	}
	
	//default constructor 
	public WebsiteAccount() {
		
	}
	
	//creating constructor with parameters associated to class attributes
	public WebsiteAccount(String userName, String email, boolean isTeller, String phoneNumber, String birthDate) {
		this.userName= userName; 
		this.email= email; 
		this.isTeller=isTeller; 
		this.phoneNumber= phoneNumber; 
		this.birthDate=birthDate; 
	}
	
	//method called register
	public static WebsiteAccount register() {	
		Scanner in = new Scanner(System.in);
		Boolean isTeller; 
		String userName; 
		String email; 
		String phoneNumber; 
		String birthDate; 
		String accountType; 
		
		System.out.println("What is your username"); 
		//this saves username
		userName= in.nextLine();
		
		System.out.println("What is your email"); 
		//this saves email
		email= in.nextLine(); 
		
		System.out.println("What is your phone number"); 
		//this saves number
		phoneNumber= in.nextLine(); 
		
		
		System.out.println("What is your birthday"); 
		//this saves birthday
		birthDate= in.nextLine(); 
		
		
		System.out.println("Are you a bank teller? Type yes or no"); 
		accountType= in.nextLine(); 
		if (accountType.equals("yes")) {
			isTeller= true; 
		}else if (accountType.equals("no")) {
			isTeller= false;  
		}else {
			System.out.println("This is not a valid option"); 
			return null; 
		}
		
		WebsiteAccount websiteAccount = new WebsiteAccount(userName, email, isTeller, phoneNumber, birthDate); 
		// add the new account to the list
		accounts.add(websiteAccount);
		return websiteAccount; 
				
			
	}
	
	public static void save() {
		TextFiles<WebsiteAccount> file = new TextFiles<>();
		file.writeObjectsToFile(accounts, "accounts.txt"); 
	}
	
	public static void load(){
		TextFiles<WebsiteAccount> file = new TextFiles<>();
		accounts = file.readObjectsFromFile("accounts.txt");
		if(accounts == null) {
			accounts = new ArrayList<WebsiteAccount>();
		}
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserName: "+ this.userName 
				+ " Email: " + this.email 
				+ " isTeller: "+ isTeller
				+ " PhoneNumber: "+ this.phoneNumber 
				+ " BirthDate: "+ birthDate
				+ "\r\n"; 
		
	}

	public void login() {
			
	}

	public static WebsiteAccount login(String userName2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
