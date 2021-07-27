public class SavingsAccount {
    private  double balance;
    private  double accountNumber;

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public boolean withdraw(double withdrawAmount) {
        if (withdrawAmount < this.balance) {
            this.balance =  this.balance - withdrawAmount;
            return true;
        }
        else{
            return false;
        }
    }
}
