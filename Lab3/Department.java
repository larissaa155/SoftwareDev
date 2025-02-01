public enum Department {
    IT,
    ENGINEERING,
    HR,
    SALES,
    MARKETING;


    public String getDepartmentDescription() {
        switch (this) {
            case IT: return "Information Technology Department";
            case ENGINEERING: return "Engineering Department";
            case HR: return "Human Resources Department";
            case SALES: return "Sales Department";
            case MARKETING: return "Marketing Department";
            default: return "Unknown Department";
        }
    }
}
