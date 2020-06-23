package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 100.0, "default@email.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, String email) {
        this(name, 1000.0, email);
        System.out.println("Two constructor called");
    }

    public VipCustomer(String name, double creditLimit, String email) {
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

    public String getEmail() {
        return email;
    }
}
