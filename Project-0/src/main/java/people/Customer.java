package people;

public class Customer extends User {

	double checkingBalance;
	double savingsBalance;  
	
	
	public Customer(String firstName, String lastName, String userName, String password) {
		super(firstName, lastName, userName, password);
		// TODO Auto-generated constructor stub
	}

	

	public Customer(String firstName, String lastName, String userName, String password, double checkingBalance,
			double savingsBalance) {
		super(firstName, lastName, userName, password);
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
	}

	
	public double getCheckingBalance() {
		return checkingBalance;
	}



	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}



	public double getSavingsBalance() {
		return savingsBalance;
	}



	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}



	@Override
	public String toString() {
		return userName+ "," + firstName + "," + lastName+ "," + password 
				+ "," + checkingBalance + "," + savingsBalance + "," ;
		
	}
	
	
	
}
