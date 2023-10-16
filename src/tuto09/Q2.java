package tuto9;

public class Q2 {

    public static void main(String[] args) {

        System.out.println(new Animal(50, 1.5, 200));
    }
}

class Organism {

    protected double initialSize;
    protected double growthRate;

    public Organism(double initialSize, double growthRate) {
        this.initialSize = initialSize;
        this.growthRate = growthRate;
    }
}

class Animal extends Organism {

    private double eatingNeed;

    public Animal(double initialSize, double growthRate, double eatingNeed) {
        super(initialSize, growthRate);
        this.eatingNeed = eatingNeed;
    }

    @Override
    public String toString() {
        return "Initial Size: " + initialSize +
                "\nGrowth rate: " + growthRate +
                "\nEating need: " + eatingNeed;
    }
}
