package school.redrover.HW12;

public final class Employee extends BaseEmployee {

        public Employee(String name, int age, String sex, double dailySalary) {
        super(name, age, sex, dailySalary);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        for(Month workDays : monthArray) {
            totalSalary += getDailySalary() * workDays.getWorkDaysInMonth();
        }
        return totalSalary;
    }
}
