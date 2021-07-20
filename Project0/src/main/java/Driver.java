import java.util.Scanner; 
public class Driver {

	public static void main(String[] args) {		
		Scanner in=new Scanner(System.in);
		int menuSelection=0; 
		 
		WebsiteAccount websiteAccount1=new WebsiteAccount ("Will", "will@yahoo.com", false, "37382303", "042891"); 
		WebsiteAccount.save();
		WebsiteAccount websiteAccount2=new WebsiteAccount ("jaclyn", "jaclynlilly@yahoo.com", false, "37382303", "042891"); 
		WebsiteAccount.save();
		WebsiteAccount websiteAccount3=new WebsiteAccount ("julia", "julia@gmail.com", false, "92382303", "060898"); 
		WebsiteAccount.save();
		WebsiteAccount websiteAccount4=new WebsiteAccount ("Will", "will@yahoo.com", false, "37382303", "042891"); 
		WebsiteAccount.save();

		while(menuSelection !=3) {
		System.out.println("Hello! Please select an option"
				+ "\n1. Register for an account"
				+ "\n2. Login to account"
				+ "\n3. Quit"); 
		
		menuSelection=in.nextInt();
		
		switch (menuSelection) {
		//register option
		case 1:
			WebsiteAccount websiteAccount= WebsiteAccount.register();
			WebsiteAccount.save(); 
			break; 
		case 2:  
			WebsiteAccount.load(); 
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

