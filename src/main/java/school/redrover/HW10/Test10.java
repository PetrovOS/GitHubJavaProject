package school.redrover.HW10;

import school.redrover.HW9.MonthUtils;

public class Test10 {
    public static void main(String[] args) {
        Employee john = new Employee("John",150);
        Employee maryJane = new Employee("Mary Jane", 200);

        System.out.println(john.getSalary(MonthUtils.fallMonths));
        System.out.println(maryJane.getSalary(MonthUtils.fallMonths));

        Manager mary = new Manager("Mary",35,"Female", 200,50);

        System.out.println(mary.getSalary(MonthUtils.fallMonths));

        Director michael = new Director("Michael", 45, "Male", 400, 100);

        System.out.println(michael.getSalary(MonthUtils.fallMonths));
    }
}
