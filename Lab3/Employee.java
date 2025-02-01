class Employee extends Person implements Printable, Compensable {
    private String employeeID;
    private String department;
    private double salary;
    private ISalaryCalculator salaryCalculator;

    public Employee(String name, String roles,  int age, String address, String employeeID, String department, double salary, ISalaryCalculator salaryCalculator) {
        super(name, roles, age, address);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        this.salaryCalculator = salaryCalculator;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    
    @Override
    public double calculateTotalCompensation() {
        return salary; 
    }

    public double calculateAnnualSalary() {
        return salaryCalculator.calculateAnnualSalary(salary);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Employee details...");
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Department: " + getDepartment());
        System.out.printf("Monthly Salary: $%.2f\n", getSalary());
        System.out.printf("Annual Salary: $%.2f\n", calculateAnnualSalary());
    }
}