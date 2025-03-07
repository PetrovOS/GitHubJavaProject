package school.redrover.HW9;

public class Month {
    private final String monthName;
    private final int daysInMonth;
    private final int workDaysInMonth;

    public Month(String monthname, int daysInMonth, int workDaysInMonth) {
        this.monthName = monthname;
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
