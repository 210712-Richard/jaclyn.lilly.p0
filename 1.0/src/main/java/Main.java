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

        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public");
        }).start(7777);

        app.post("/registerUser", ctx -> {
            User user = new User();
            user.setFname(ctx.formParam("fname"));
            user.setLname(ctx.formParam("lname"));
            user.setPassword(ctx.formParam("password"));
            user.setUserName(ctx.formParam("userName"));
            users.put(ctx.formParam("userName"),user);
            ctx.html("Your Registration has been saved");
        });

        app.get("/check-registration", ctx -> {
            if ( users.containsKey(ctx.queryParam("Username"))) {
                String info = "First Name:" +users.get(ctx.queryParam("Username")).getFname();
                info += " Last Name: " + users.get(ctx.queryParam("Username")).getLname();
                info += " UserName: " + users.get(ctx.queryParam("Username")).getUserName();
                info += " Password: " + users.get(ctx.queryParam("Username")).getPassword();
//                ctx.html(info);
                ctx.json(info);
            }
        });

        app.post("/openCheckingAccount", ctx -> {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.setAccountNumber(accountNumGenerator);
            accountNumGenerator += 1;
            accounts.put(ctx.formParam("userName"), checkingAccount);
            ctx.html("Your account has been opened: account number " + checkingAccount.getAccountNumber());
        });
        app.post("/openSavingsAccount", ctx -> {
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.setAccountNumber(accountNumGenerator2);
            accountNumGenerator2 += 1;
            accounts2.put(ctx.formParam("userName"), savingsAccount);
            ctx.html("Your account has been opened: account number " + savingsAccount.getAccountNumber());
        });
        app.get("/checkBalance", ctx -> {
            //check for user existance
//            if (accounts.containsKey((ctx.formParam("userName")))
           double currentBalance =  accounts.get(ctx.formParam("userName")).getBalance();
            ctx.html("Your current balance is  " + currentBalance);
        });

        app.post("/deposit", ctx -> {
            accounts.get(ctx.formParam("userName")).deposit(1000);
            ctx.html("Your current balance is " +  accounts.get(ctx.formParam("userName")).getBalance());
        });
    }

}