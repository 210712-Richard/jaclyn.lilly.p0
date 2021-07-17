import java.util.Scanner; 
public class Driver {

	public static void main(String[] args) {
		
		
		
		
		Scanner in=new Scanner(System.in);
		int menuSelection=0; 
		
		 

		while(menuSelection !=3) {
		System.out.println("Hello! Please select an option"
				+ "\n1. Register for an account"
				+ "\n2. Login to account"
				+ "\n3. Quit"); 
		
		menuSelection=in.nextInt();
		
		switch (menuSelection) {
		//register option
		case 1:
			WebsiteAccount websiteAccount = new WebsiteAccount(); 
			websiteAccount.register();
			break; 
		case 2: 
			break; 
		case 3: 
			break; 
			
		
		}
		
		
	
		//if user selected number 1 call Register() -> myvar =new WebsiteAccount() -> myvar.Register()
		//if user seelected number 2 call login -> create new user, depending who they are they areetiehr a bankteller or a customer so do accordingly
		
		
		
	
	}
	
	//method call Login()
			//That does everything to login
			
			//metyod called register
			//does everything to register
	
	}
}

