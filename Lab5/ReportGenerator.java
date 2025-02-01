// ReportGenerator class for generating reports (SRP)
class ReportGenerator {
    public static void generateReport(Employee employee) {
        System.out.println("Generating report for: " + employee.getName() + " Department: " + employee.getDepartment() + " Position: " + employee.getRoles());
        employee.print();
    }

    public static void generateReportByDepartment(String department) {
        System.out.println("Generating report for: " + "employee.getName()" + " Department: " + "employee.getDepartment()" );
    }

    public static void generateSummary(Compensable compensable) {
        System.out.printf("Total Compensation: $%.2f\n", compensable.calculateTotalCompensation());
    }
}