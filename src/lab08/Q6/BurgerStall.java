package lab08.Q6;

public class BurgerStall {
    private String ID;
    private int burgerSold;
    private static int totalBurgerSold;

    public BurgerStall(String ID, int burgerSold) {
        this.ID = ID;
        sold(burgerSold);
    }

    public String getID() {
        return ID;
    }

    public int getBurgerSold() {
        return burgerSold;
    }

    public static int getTotalBurgerSold() {
        return totalBurgerSold;
    }

    public void sold(int amount) {
        burgerSold += amount;
        totalBurgerSold += amount;
    }
}
