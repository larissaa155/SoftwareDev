class BonusStrategy implements IBonusStrategy {
    private double performanceFactor;
    ExternalSalaryCalculator externalSalaryCalculator = new ExternalSalaryCalculator();
    Compensable salaryAdapter = new ExternalSalaryAdapter(externalSalaryCalculator);

    public BonusStrategy(double performanceFactor) {
        this.performanceFactor = performanceFactor;
    }

    @Override
    public double PerformanceBonusStrategy(double salary) {
        return salary * performanceFactor; // Bonus based on performance factor
    }

    @Override
    public double ProjectBonusStrategy(double salary) {
        return salary * performanceFactor; // Bonus based on performance factor
    }

    @Override
    public double FixedBonusStrategy(double salary) {
        return salary + (salaryAdapter.calculateTotalCompensation()); // Bonus based on third-party system (ExternalSalaryCalculator) factor
    }

}