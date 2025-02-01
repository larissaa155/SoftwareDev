public class ExternalSalaryAdapter implements Compensable{
    private ExternalSalaryCalculator externalCalculator;

    public ExternalSalaryAdapter(ExternalSalaryCalculator externalCalculator) {
        this.externalCalculator = externalCalculator;
    }

    @Override
    public double calculateTotalCompensation() {
        return externalCalculator.calculateExternalSalary();
    }
}
