package Bank_Account;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account(12345, 1000.0, "Bob Brown", "bob@gmail.com", "083 123 2344" );
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(200.0);
        bobsAccount.withdrawFunds(100.0);
    }
}
