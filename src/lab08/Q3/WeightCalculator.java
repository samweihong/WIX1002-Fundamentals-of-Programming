package lab08.Q3;

public class WeightCalculator {
    private int age;
    private double height;
    private double recommendWeight;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        recommendWeight = getRecommendWeight();
    }

    public double getRecommendWeight() {
        return (height - 100 + age / 10.0) * 0.9;
    }

    @Override
    public String toString() {
        return "Age = " + age + "\n" +
                "Height = " + height + "\n" +
                "Recommend Weight = " + recommendWeight;
    }
}
