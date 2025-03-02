package school.redrover.HW9;

public class Manager {
    private final String name;
    private final int age;
    private final String sex;
    private final double dailySalary;
    private final int numberOfSubordinates;

    public Manager(String name, int age, String sex, double dailySalary, int numberOfSubordinates) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
        this.numberOfSubordinates = numberOfSubordinates;
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
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public double getSalary (Month[] monthArray) {
        int totalSalary = 0;

        for(int i = 0; i < monthArray.length; i++) {
            totalSalary += getDailySalary() * monthArray[i].getWorkDaysInMonth();
        }
        return totalSalary + totalSalary * getNumberOfSubordinates() / 100;
    }
}
