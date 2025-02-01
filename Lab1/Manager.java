import java.text.NumberFormat;

public class Manager extends Employee {
    private int teamSize;
    private double bonus;

    public Manager(String name, int age, String address, String employeeID, String department, double salary, int teamSize, double bonus) {
        super(name, age, address, employeeID, department, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Manager Information:");
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: " + formatCurrency(bonus));
        System.out.println("Total Compensation: " + formatCurrency(calculateTotalCompensation()));
    }

    public double calculateTotalCompensation() {
        return getSalary() + bonus;
    }

    private String formatCurrency(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amount);
    }
}
