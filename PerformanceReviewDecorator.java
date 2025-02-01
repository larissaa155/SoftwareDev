class PerformanceReviewDecorator extends CompensationDecorator {
    private double performanceScore;

    public PerformanceReviewDecorator(Employee employee, double performanceScore) {
        super(employee);
        this.performanceScore = performanceScore;
    }

    @Override
    public double calculateTotalCompensation() {
        double bonus = 0;
        if (performanceScore > 4.0) {
            bonus = decoratedEmployee.getSalary() * 0.1; // 10% bonus for high performers
        }
        return super.calculateTotalCompensation() + bonus;
    }
}