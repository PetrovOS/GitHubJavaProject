package school.redrover.HW10;

import school.redrover.HW9.Month;
/*
Класс Director должен вести себя как Manager,
но давать надбавку к зарплате в 3% за каждого подчиненного.
*/
public class Director extends Manager {

    public Director(String name, int age, String sex, double dailySalary, int numberOfSubordinates) {
        super(name, age, sex, dailySalary, numberOfSubordinates);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double employeeSalary = super.getSalary(monthArray);
        return employeeSalary + (employeeSalary * getNumberOfSubordinates() / 100) * 3;
    }
}
