public class Main {
    public static void main(String[] args) {
        // Create an Employee object (Full-Time)
        ISalaryCalculator fullTimeCalculator = new FullTimeSalaryCalculator();
        Employee employee = new Employee("John Doe", 30, "123 Maple Street", "E12345", "Engineering", 85000.00, fullTimeCalculator);
        ReportGenerator.generateReport(employee); // Use ReportGenerator for printing
        System.out.println();  // For a new line

        // Create a Manager object with a performance-based bonus strategy
        IBonusStrategy performanceBonusStrategy = new BonusStrategy(0.10); // 15% bonus based on performance
        Manager manager = new Manager("Alice Johnson", 40, "789 Birch Lane", "M67890", "IT", 95000.00, 5, fullTimeCalculator, performanceBonusStrategy);
        ReportGenerator.generateReport(manager); // Use ReportGenerator for printing
    }
}