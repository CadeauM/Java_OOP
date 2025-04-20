package Bank_Account;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(200.0);
        bobsAccount.withdrawFunds(100.0);
    }
}
