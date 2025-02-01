public class EmployeeManagementFacade{
    private String name;
    private String roles;
    private int age;
    private String address;
    private String employeeID;
    private String department;
    private double salary;

    private IBonusStrategy bonusStrategy;
    IBonusStrategy performanceBonusStrategy = new BonusStrategy(0.10);
    IBonusStrategy ProjectBonusStrategy = new BonusStrategy(0.10);
    IBonusStrategy FixedBonusStrategy = new BonusStrategy(0.10);
    ISalaryCalculator fullTimeCalculator = new FullTimeSalaryCalculator();

    void addEmployee(String name, int age, String address, String employeeID, String department, String roles, double salary){
         this.name = name;
         this.roles = roles;
         this.age = age;
         this.address = address;
         this.employeeID = employeeID;
         this.department = department;
         this.salary = salary;
        Employee _employee = new Employee(name, roles, age, address, employeeID, department, salary, fullTimeCalculator);
    }

    void generateReportByDepartment(String department){
        Employee _employee = new Employee(name, roles, age, address, employeeID, department, salary, fullTimeCalculator);
        ReportGenerator.generateReport(_employee);
    }


}
