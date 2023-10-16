package tuto9;

public class Q4 {

}

class PurchaseSystem {

    private String productCode;
    protected double unitPrice, quantity, totalPrice;

    public void totalPrice() {
        totalPrice = unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Product Code = " + productCode +
                "\nUnit Price = " + unitPrice +
                "\nQuantity = " + quantity +
                "\nTotal Price = " + totalPrice;
    }
}

class SugarPurchase extends PurchaseSystem {

    private double sugarWeight;

    @Override
    public void totalPrice() {
        totalPrice = unitPrice * quantity * sugarWeight;
    }
}
