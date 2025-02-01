abstract class CompensationDecorator extends Employee {
    protected Employee decoratedEmployee;

    public CompensationDecorator(Employee employee) {
        super(employee.getName(), employee.getAge(), employee.getAddress(), employee.getEmployeeID(), employee.getDepartment(), employee.getSalary(), employee.getSalaryCalculator());
        this.decoratedEmployee = employee;
    }

    @Override
    public double calculateTotalCompensation() {
        return decoratedEmployee.calculateTotalCompensation();
    }
}