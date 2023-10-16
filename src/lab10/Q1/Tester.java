package lab10.Q1;

public class Tester {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("Alice", 'A');
        System.out.println(permanentEmployee);
        ContractStaff contractStaff = new ContractStaff("Bob", 2000);
        System.out.println(contractStaff);
        TemporaryStaff temporaryStaff = new TemporaryStaff("Cindy", 100);
        System.out.println(temporaryStaff);
    }
}
