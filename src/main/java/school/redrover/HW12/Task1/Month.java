package school.redrover.HW12.Task1;

public final class Month {
    private final String monthName;
    private final int daysInMonth;
    private final int workDaysInMonth;

    public Month(String monthName, int daysInMonth, int workDaysInMonth) {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        this.workDaysInMonth = workDaysInMonth;
    }

    public String getMonthName() {
        return monthName;
    }
    public int getDaysInMonth() {
        return daysInMonth;
    }
    public int getWorkDaysInMonth() {
        return workDaysInMonth;
    }
}
