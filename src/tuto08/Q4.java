package tuto8;

public class Q4 {

}

class Payment {

    double amount;
    String chequeNumber;
    String cardHolderName;
    String cardType;
    String expirationDate;
    String validationCode;

    public Payment(double cash) {
        amount = cash;
        chequeNumber = null;
        cardHolderName = null;
        cardType = null;
        expirationDate = null;
        validationCode = null;
    }

    public Payment(double amount, String chequeNumber) {
        this.amount = amount;
        this.chequeNumber = chequeNumber;
        cardHolderName = null;
        cardType = null;
        expirationDate = null;
        validationCode = null;
    }

    public Payment(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        this.amount = amount;
        chequeNumber = null;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.expirationDate = expirationDate;
        this.validationCode = validationCode;
    }
}