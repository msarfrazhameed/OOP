public class AccountRunner {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.deposit(3000.25);
        System.out.println("The current balance of Account 1 is: "+ a1.getBalance());
        Account a2 = new Account(a1.getBalance());
        a2.withdraw(1000);
        System.out.println("The current balance of Account 2 is: "+a2.getBalance());
    }
}
