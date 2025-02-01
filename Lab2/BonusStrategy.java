class BonusStrategy implements IBonusStrategy {
    private double performanceFactor;

    public BonusStrategy(double performanceFactor) {
        this.performanceFactor = performanceFactor;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * performanceFactor; // Bonus based on performance factor
    }
}