package tuto10;

public class Q1 {

    public static void main(String[] args) {
        combineDiscount combineDiscount = new combineDiscount();
        System.out.println(combineDiscount.computeDiscount(6, 100));
    }
}

abstract class DiscountPolicy {
    public abstract double computeDiscount(int count, double itemCost);
}

class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discountRate;

    public BulkDiscount(int minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count > minimum)
            return discountRate * itemCost;
        return 0;
    }
}

class OtherDiscount extends DiscountPolicy {
    @Override
    public double computeDiscount(int count, double itemCost) {
        switch (count) {
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
                return .1 * itemCost;
            case 6:
            case 7:
            case 8:
                return .2 * itemCost;
            default:
                return .3 * itemCost;
        }
    }
}

class combineDiscount extends DiscountPolicy {

    DiscountPolicy bulkDiscount;
    DiscountPolicy otherDiscount;

    @Override
    public double computeDiscount(int count, double itemCost) {
        bulkDiscount = new BulkDiscount(1, .15);
        otherDiscount = new OtherDiscount();
        double discount1 = bulkDiscount.computeDiscount(count, itemCost);
        double discount2 = otherDiscount.computeDiscount(count, itemCost);
        return Math.max(discount1, discount2);
    }
}