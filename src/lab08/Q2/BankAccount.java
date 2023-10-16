package lab08.Q2;

public class BankAccount {
    private String name;
    private String id;
    private double balance;

    public BankAccount(String name, String id, double deposit) {
        this.name = name;
        this.id = id;
        balance = deposit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= Math.min(balance, amount);
    }

    public void displayBalance() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Balance: %.2f\n", balance);
    }
}
