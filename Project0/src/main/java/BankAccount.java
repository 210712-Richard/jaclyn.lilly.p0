
public class BankAccount {


private double balance;
private int id;
double amount;


public BankAccount(int id, double balance) {
	this(); 
	this.id=id; 
	this.balance= balance; 
}
public BankAccount() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return this.id; 
}

public void setId(int id) {
	this.id=id; 
}

public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Checking getChecking() {
	return checking;
}
public void setChecking(Checking checking) {
	this.checking = checking;
}
public Saving getSaving() {
	return saving;
}
public void setSaving(Saving saving) {
	this.saving = saving;
}

Checking checking = new Checking(); 
Saving saving = new Saving(); 


public void register(String name, String email) {
	
}

public void deposit(double depositAmount) {
	this.balance+= depositAmount;
	System.out.println("You have deposit" +depositAmount + "to your account." + "\n"+
					"Balance is now: "+ this.balance);
}

public void withdraw(double withdrawalAmount) {
	
	if(this.balance<withdrawalAmount) {
		System.out.println("you don't have enough funds to withdrawl");
		
	}else {
		this.balance-= withdrawalAmount; 
			System.out.println("You have withdrawal " + withdrawalAmount + "from your account." + "\n" +
							"Balance is now: " + this.balance);
	}
}


}


