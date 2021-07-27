import java.util.HashMap;
import java.util.Map;

import io.javalin.Javalin;

public class Main {
   static double accountNumGenerator = 454654;
   static double accountNumGenerator2 = 2312331;

    static Map<String, User> users = new HashMap<String, User>();
    static Map<String, CheckingAccount> accounts = new HashMap<String, CheckingAccount>();
    static Map<String, SavingsAccount> accounts2 = new HashMap<String, SavingsAccount>();

    public static void main(String[] args) {

    	//setting up javalin application - set up config in public folder
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public");
        }).start(7777);

        //register user
        app.post("/registerUser", ctx -> {
            User user = new User();
            user.setFname(ctx.queryParam("fname"));
            user.setLname(ctx.queryParam("lname"));
            user.setPassword(ctx.queryParam("password"));
            user.setUserName(ctx.queryParam("userName"));
            users.put(ctx.queryParam("userName"),user);
            ctx.html("Your Registration has been saved "+ ctx.queryParam("userName"));
        });

        //checking to see if user data is currently stored 
        app.get("/check-registration", ctx -> {
            if ( users.containsKey(ctx.queryParam("userName").toString())) {
                String info = "First Name:" +users.get(ctx.queryParam("userName")).getFname().toString();
                info += " Last Name: " + users.get(ctx.queryParam("userName")).getLname();
                info += " UserName: " + users.get(ctx.queryParam("userName")).getUserName();
                info += " Password: " + users.get(ctx.queryParam("userName")).getPassword();
                ctx.html(info);
               // ctx.json(info);
            }else {
            	ctx.html("User is not found"); 
            }
        });
        //open checking out  
        app.post("/openCheckingAccount", ctx -> {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.setAccountNumber(accountNumGenerator);
            accountNumGenerator += 1;
          //this user name will opened with certain account number 
            accounts.put(ctx.queryParam("userName"), checkingAccount);
            ctx.html("Your account has been opened: account number " + checkingAccount.getAccountNumber());
        });
      
        //open savings account
        app.post("/openSavingsAccount", ctx -> {
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.setAccountNumber(accountNumGenerator2);
            accountNumGenerator2 += 1;
            accounts2.put(ctx.queryParam("userName"), savingsAccount);
            ctx.html("Your account has been opened: account number " + savingsAccount.getAccountNumber());
        });
        app.get("/getCheckingBalance", ctx -> {
            //check for user existance
//            if (accounts.containsKey((ctx.formParam("userName")))
           double currentBalance =  accounts.get(ctx.queryParam("userName")).getBalance();
            ctx.html("Your current balance is  " + currentBalance);
        });

       //check savings account balance
        app.get("/getSavingBalance", ctx -> {
          //variable to hold the balance from the account
        double currentBalance =  accounts2.get(ctx.queryParam("userName")).getBalance();
            ctx.html("Your current balance is  " + currentBalance);
        });

        //deposit money into checking account
        app.post("/depositChecking", ctx -> {
            accounts.get(ctx.queryParam("userName")).deposit(1000);
            ctx.html("Your current balance is " +  accounts.get(ctx.queryParam("userName")).getBalance());
        });
    
        //deposit money into savings account 
        app.post("/depositSaving", ctx -> {
            accounts2.get(ctx.queryParam("userName")).deposit(1000);
            ctx.html("Your current balance is " +  accounts2.get(ctx.queryParam("userName")).getBalance());
        });
    
   
      //withdraw money from checking account
        app.post("/WithdrawChecking", ctx -> {
            accounts.get(ctx.queryParam("userName")).withdraw(100);
            ctx.html("Your current balance is " +  accounts.get(ctx.queryParam("userName")).getBalance());
        });
    
    
      //withdraw money from saving account
        app.post("/WithdrawSaving", ctx -> {
            accounts2.get(ctx.queryParam("userName")).withdraw(100);
            ctx.html("Your current balance is " +  accounts2.get(ctx.queryParam("userName")).getBalance());
        });    
        
        
    }

}