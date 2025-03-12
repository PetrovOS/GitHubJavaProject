package school.redrover.HW12;

public abstract class BaseEmployee {

    private final String name;
    private final int age;
    private final String sex;
    private final double dailySalary;

    protected BaseEmployee(String name, int age, String sex, double dailySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public abstract double getSalary(Month[] monthArray);
}
