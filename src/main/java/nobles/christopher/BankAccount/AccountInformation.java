package nobles.christopher.BankAccount;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 * Created by christophernobles on 9/14/16.
 */
public class AccountInformation {

    Scanner userInput = new Scanner(System.in);

    int accountType = 0;
    private int acctNum = 0;
    private SecureRandom accountNumber;
    int personalAccountNum = 0;
    int accountOverdraftPrevention = 0;
    int accountStatus = 0;

    double accountInterestRate = 0;
    double accountBalance = 0;
    String accountHolderName;

    SecureRandom randomGenerator = new SecureRandom();

    //Constructor
    AccountInformation(String a, String b) {
        Scanner userInput = new Scanner(System.in);
        Random accountNumber = new Random();

        accountNumberCreation();
        this.accountType = getAccountType(userInput.nextInt());
        setPersonalAccountNum(accountNumberCreation());


    }
    //Account creation/Number Generator
    public void setPersonalAccountNum(int a) {

        a = accountNumberCreation();
    }

    public int accountNumberCreation() {
        int acctnum = randomGenerator.nextInt(99999999);
        System.out.println(acctnum);
        return acctnum;
    }

    //Account Holder name setter/getter

    public String setAccountHolderName(String first, String last) {
        first = userInput.next();
        last = userInput.next();

        String keepName = new String;

        String holderName = first + " " + last;

        return holderName;

    }

    public String holdAccountName() {
        String keepName = new String;

        keepName =

        return
    }

    public void getAccountHolderName() {
        return setAccountHolderName();
    }



    //account type setter/getter
    public int setAccountType(int type) {

        switch (type) {
            case 1:
                this.accountType = 1;
                break;
            case 2:
                this.accountType = 2;
                break;
            case 3:
                this.accountType = 3;
                break;
            default:
                break;

        }
        return this.accountType;

    }

    private int getAccountType(int a) {

        return accountType;
    }
}