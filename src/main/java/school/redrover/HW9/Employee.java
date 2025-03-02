package school.redrover.HW9;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private double dailySalary;

    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }
    public Employee(String name, double dailySalary, int age, String sex) {
        this(name, dailySalary);
        this.age = age;
        this.sex = sex;
    }

    public static Employee withoutAge (String name, double dailySalary, String sex) {
        return new Employee(name, dailySalary, 0, sex);
    }
    public static Employee withoutSex (String name, double dailySalary, int age) {
        return new Employee(name, dailySalary, age, null);
    }
    public Manager convertToManager(int numberOfsubordinates) {
            return new Manager(name, age, sex, dailySalary, numberOfsubordinates);
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

    public double getSalary(Month[] monthArray) {

        double totalSalary = 0;
        for(int i = 0; i < monthArray.length; i++) {
            totalSalary += getDailySalary() * monthArray[i].getWorkDaysInMonth();
        }
        return totalSalary;
    }

    public static String makeSummary(Employee[] employees) {
        String summary = "";
        System.out.println("Employee: ");
        for(Employee employee : employees) {
            summary += "name: " + employee.name +
            "\nAge: " + employee.age + "\nSex: " + employee.sex +
            "\nDaily salary: " + employee.dailySalary +
            "\n ===========================\n";
        }
        return summary;
    }
}
