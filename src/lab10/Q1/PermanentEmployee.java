package lab10.Q1;

public class PermanentEmployee extends Employee {
    private char category;

    public PermanentEmployee(String name, char category) {
        super(name, "Permanent Employee");
        this.category = category;
    }

    @Override
    public double getTotalSalary() {
        return switch (category) {
            case 'A' -> 4000;
            case 'B' -> 3000;
            case 'C' -> 2000;
            default -> 0;
        };
    }
}
