package lab08.Q7;

class Money {
    private double amount;
    private int _100Note, _50Note, _10Note, _5Note, _1Note;
    private int _50Cent, _20Cent, _10Cent, _5Cent;

    public Money(double amount) {
        assignMoney(amount);
    }

    public void add(Money money) {
        assignMoney(amount + money.amount);
    }

    public void subtract(Money money) {
        if (amount - money.amount < 0)
            throw new IllegalStateException("The amount of money in this object is less than the other object.");
        assignMoney(amount - money.amount);
    }

    private void assignMoney(double amount) {
        this.amount = round(amount);
        int notes = (int) this.amount;
        int cents = (int) (this.amount * 100 % 100);

        _100Note = notes / 100;
        notes %= 100;
        _50Note = notes / 50;
        notes %= 50;
        _10Note = notes / 10;
        notes %= 10;
        _5Note = notes / 5;
        notes %= 5;
        _1Note = notes;

        _50Cent = cents / 50;
        cents %= 50;
        _20Cent = cents / 20;
        cents %= 20;
        _10Cent = cents / 10;
        cents %= 10;
        _5Cent = cents / 5;
    }

    private double round(double amount) {
        int total = (int) (amount * 100);
        int secondDigit = total % 10;
        total /= 10;
        int firstDigit = total % 10;
        total /= 10;

        return switch (secondDigit) {
            case 0, 1, 2 -> total + firstDigit / 10.0;
            case 8, 9 -> total + (firstDigit + 1) / 10.0;
            default -> total + (10 * firstDigit + 5) / 100.0;
        };
    }

    @Override
    public String toString() {
        return "amount = " + String.format("%.2f", amount) + "\n" +
                "RM100 = " + _100Note + "\n" +
                "RM50 = " + _50Note + "\n" +
                "RM10 = " + _10Note + "\n" +
                "RM5 = " + _5Note + "\n" +
                "RM1 = " + _1Note + "\n" +
                "50Cent = " + _50Cent + "\n" +
                "20Cent = " + _20Cent + "\n" +
                "10Cent = " + _10Cent + "\n" +
                "5Cent = " + _5Cent;
    }
}
