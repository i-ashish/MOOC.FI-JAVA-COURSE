
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account artosAccount = new Account("Arto's account", 100.00);
        artosAccount.deposit(20.0);
        System.out.println(artosAccount);
        
        // Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        // System.out.println("Initial state");
        // System.out.println(artosAccount);
        // System.out.println(artosSwissAccount);

        // artosAccount.withdraw(20);
        // System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        // artosSwissAccount.deposit(200);
        // System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        // System.out.println("End state");
        // System.out.println(artosAccount);
        // System.out.println(artosSwissAccount);
    }


}
