package school.redrover.HW9;

public class Month {
    private final String monthName;
    private final int daysInMonht;
    private final int workDaysInMonth;

    public Month(String monthname, int daysInMonht, int workDaysInMonth) {
        this.monthName = monthname;
        this.daysInMonht = daysInMonht;
        this.workDaysInMonth = workDaysInMonth;
    }

    public String getMonthName() {
        return monthName;
    }
    public int getDaysInMonht() {
        return daysInMonht;
    }
    public int getWorkDaysInMonth() {
        return workDaysInMonth;
    }
}
