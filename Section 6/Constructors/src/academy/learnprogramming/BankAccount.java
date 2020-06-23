package academy.learnprogramming;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address",
                "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phone) {
        this("99999", 100.55, customerName, email, phone);
    }

    public BankAccount(String number, double balance, String customerName, String email,
                       String phone) {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void depositFunds (double funds) {
        this.balance += funds;
        System.out.println(this.balance);
    }

    public void withdrawFunds (double funds) {
        if (this.balance - funds < 0) {
            System.out.println("Not enough in account");
        } else {
            this.balance -= funds;
            System.out.println(this.balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }
}
