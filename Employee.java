import java.text.NumberFormat;

public class Employee extends Person{
    private String employeeID;
    private String department;
    private double salary;

    public Employee(String name, int age, String address, String employeeID, String department, double salary) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Employee Information:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + formatCurrency(salary));
    }

    private String formatCurrency(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amount);
    }
}