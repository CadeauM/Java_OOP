package Customer_Data;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    public Customer(){
        this("Nobody", "Cadeau@gmail.com");
    }
    public Customer(String name, String email) {
      this(name, 1000, email);
    }

    public String getEmail() {
        return email;
    }
}
