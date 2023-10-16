package lab08.Q2;

public class Tester {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("DIO", "010101-01-0101", 5000);
        myAccount.displayBalance(); // 5000
        System.out.println();

        myAccount.deposit(250);
        myAccount.displayBalance(); // 5250
        System.out.println();

        myAccount.withdraw(1000);
        myAccount.displayBalance(); // 4250
        System.out.println();

        myAccount.withdraw(10000);
        myAccount.displayBalance(); // 0
    }
}

