package school.redrover.HW10;

import school.redrover.HW9.Month;
/*
Класс Employee должен иметь поля: имя, возраст, пол и ЗП в день.
Имя и ЗП должны быть обязательными, остальные поля — нет.
Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
*/
public class Employee {
    private String name;
    private int age;
    private String sex;
    private double dailySalary;

    public Employee(String name, double dailySalary) {
        this(name, 0, null, dailySalary);
    }

    public Employee(String name, int age, String sex, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.age = age;
        this.sex = sex;
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for(Month workDays : monthArray) {
            totalSalary += getDailySalary() * workDays.getWorkDaysInMonth();
        }
        return totalSalary;
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
}
