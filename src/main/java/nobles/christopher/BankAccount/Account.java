package nobles.christopher.BankAccount;

/**
 * Created by christophernobles on 9/14/16.
 */
public class Account {

    AccountInformation accountInformation;
    Transactions transactions;

    public AccountInformation doStuff() {
        System.out.println("\n        --Greetings User--" +
                "\n The good news is, if you're here you're not broke." +
                "\n The bad news is, this application was developed by an idiot." +
                "\n So you might be broke now. Flip that coin." +
                "\n \n Input Account Type" +
                "\n [[Account Type 1: Checking]]" +
                "\n [[Account Type 2: Savings]]" +
                "\n [[Account Type 3: Investment]]");

        //accountInformation.setAccountType(accountInformation.userInput.nextInt());
        System.out.println(accountInformation);
        return accountInformation;
    }
}
