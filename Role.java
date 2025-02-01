public enum Role {
    MANAGER(40, 10),          // Working hours, team size for managers
    ENGINEER(40, 5),          // Working hours, team size for engineers
    HR_REPRESENTATIVE(35, 3), // Working hours, team size for HR Representatives
    SALES_PERSON(45, 0);      // Working hours, no team size for Sales Person

    private final int workingHours;
    private final int teamSize;

    Role(int workingHours, int teamSize) {
        this.workingHours = workingHours;
        this.teamSize = teamSize;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String getRoleDescription() {
        switch (this) {
            case MANAGER: return "Manager Role";
            case ENGINEER: return "Engineer Role";
            case HR_REPRESENTATIVE: return "HR Representative Role";
            case SALES_PERSON: return "Sales Person Role";
            default: return "Unknown Role";
        }
    }
}
