package school.redrover.HW12.Task1;

public final class Director extends BaseEmployee {

    private final int numberOfSubordinates;
    private final double COEFFICIENT = 0.03;

    public Director(String name, int age, String sex, double dailySalary, int numberOfSubordinates) {
        super(name, age, sex, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        for(Month workDays : monthArray) {
            totalSalary += getDailySalary() * workDays.getWorkDaysInMonth();
        }

        double bonus = totalSalary * numberOfSubordinates * COEFFICIENT;

        return totalSalary + bonus;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
