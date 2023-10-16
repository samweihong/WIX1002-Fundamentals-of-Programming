package lab10.Q1;

class TemporaryStaff extends Employee {
    private int hours;

    public TemporaryStaff(String name, int hours) {
        super(name, "Temporary Staff");
        this.hours = hours;
    }

    @Override
    public double getTotalSalary() {
        return 15 * hours;
    }
}
