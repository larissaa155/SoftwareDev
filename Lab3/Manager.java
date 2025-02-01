class Manager extends Employee {
    private int teamSize;
    private double bonus;
    private IBonusStrategy bonusStrategy;

    public Manager(String name, String roles, int age, String address, String employeeID, String department, double salary, int teamSize, ISalaryCalculator salaryCalculator, IBonusStrategy bonusStrategy) {
        super(name, roles, age, address, employeeID, department, salary, salaryCalculator);
        this.teamSize = teamSize;
        this.bonusStrategy = bonusStrategy;
        this.bonus = bonusStrategy.PerformanceBonusStrategy(salary);
    }

    @Override
    public double calculateTotalCompensation() {
        return getSalary() + bonus;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Manager Information:");
        System.out.println("Team Size: " + teamSize);
        System.out.printf("Bonus: $%.2f\n", bonus);
        System.out.printf("Total Compensation: $%.2f\n", calculateTotalCompensation());
    }
}