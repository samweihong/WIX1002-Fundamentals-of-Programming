package tuto9;

public class Q3 {

    public static void main(String[] args) {

        RegularPay regular = new RegularPay(1.5, 3);
        System.out.println(regular.totalPay(24));
        regular.displayTotalPayment();

        SpecialPay special = new SpecialPay();
        System.out.println(special.totalPay(24));
    }
}

class PaySystem {

    protected double payratePerHour;
    protected int numOfHours;

    public double totalPay(int hours) {
        return payratePerHour * hours;
    }

    public void displayTotalPayment() {
        System.out.println("Total payment: " + (payratePerHour * numOfHours));
    }
}

class RegularPay extends PaySystem {

    public RegularPay(double payratePerHour, int numOfHours) {
        this.payratePerHour = payratePerHour;
        this.numOfHours = numOfHours;
    }
}

class SpecialPay extends PaySystem {

    @Override
    public double totalPay(int hours) {
        return super.totalPay(hours) * 1.3;
    }
}
