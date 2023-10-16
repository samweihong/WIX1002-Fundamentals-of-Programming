package tuto10;

public class Q2 {

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(500);
        System.out.println(savingAccount.computeInterest());
        FixedAccount fixedAccount = new FixedAccount(500);
        System.out.println(fixedAccount.computeInterest());
    }
}

interface Interest {
    double computeInterest();
}

class SavingAccount implements Interest {

    private double balance;
    
    public SavingAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest() {
        return 0.005 * balance;
    }
}

class FixedAccount implements Interest {
    
    private double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest() {
        return 0.03 * balance;
    }
}
