package lab08.Q6;

public class Tester {
    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("First", 1000);
        BurgerStall stall2 = new BurgerStall("Second", 200);
        BurgerStall stall3 = new BurgerStall("Third", 1234);
        printBurgerSold(stall1);
        printBurgerSold(stall2);
        printBurgerSold(stall3);
        System.out.println("Total Burger Sold: " + BurgerStall.getTotalBurgerSold());
        System.out.println();

        BurgerStall stall4 = new BurgerStall("Fourth", 0);
        stall4.sold(999);
        printBurgerSold(stall4);
        System.out.println("Total Burger Sold: " + BurgerStall.getTotalBurgerSold());
    }

    public static void printBurgerSold(BurgerStall stall) {
        System.out.printf("%s Stall Burger Sold: %d\n", stall.getID(), stall.getBurgerSold());
    }
}
