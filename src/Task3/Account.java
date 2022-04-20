package Task3;

public class Account {
    private static String owner;
    private static int balance;
    private static String  accountNumber;

    Account(){
        super();
    }
    //It can't be (this.) because it's static
//    if it's not static it will be like this.owner = owner;
    Account(String owner, int balance, String accountNumber){
        Account.owner =  owner;
        Account.balance = balance;
        Account.accountNumber = accountNumber;
    }

    //getter and setter
    public static String getOwner() {
        return owner;
    }

    public static void setOwner(String owner) {
        Account.owner = owner;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        Account.balance = balance;
    }

    public static String getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(String accountNumber) {
        Account.accountNumber = accountNumber;
    }

    public static void Cal(int withdraw){
        if(balance > withdraw ){
            System.out.println("Total balance " + (balance -= withdraw) + " Thank You");
        }
        else System.out.println(balance);
    }
}
class NotEnoughMoney extends Exception{
    public NotEnoughMoney(){
        super("Sorry You don't have enough money in your account.");
    }
    public NotEnoughMoney(String message){
        super(message);
    }
}


