package school.redrover.HW10;

import school.redrover.HW9.Month;
/*
* Класс Manager должен иметь все то, что имеет Employee, и вдобавок,
 * хранить число подчиненных. Метод getSalary(Month[] monthArray)
 * должен учитывать количество подчиненных, и давать надбавку к зарплате в 1% за каждого подчиненного.
* */
public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int age, String sex, double dailySalary, int numberOfSubordinates) {
        super(name, age, sex, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) + super.getSalary(monthArray) * getNumberOfSubordinates() / 100;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
