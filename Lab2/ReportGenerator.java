// ReportGenerator class for generating reports (SRP)
class ReportGenerator {
    public static void generateReport(Employee employee) {
        System.out.println("Generating report for: " + employee.getName());
        employee.print();
    }

    public static void generateSummary(Compensable compensable) {
        System.out.printf("Total Compensation: $%.2f\n", compensable.calculateTotalCompensation());
    }
}