package Bank_Account;

public class Account {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;
    // creating constructors

    // creating Methods
    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of R" + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawFunds(double withdrawAmount){
        if (balance - withdrawAmount < 0){
            System.out.println("Insufficient Funds. You only have R" + balance + "in your account.");
        }else {
            balance -= withdrawAmount;
            System.out.println("Withdraw pf R" + withdrawAmount + "made. Remaining balance is R" + balance);
        }
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
