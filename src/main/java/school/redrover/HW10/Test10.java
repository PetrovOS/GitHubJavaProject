package school.redrover.HW10;

import school.redrover.HW9.MonthUtils;

public class Test10 {
    public static void main(String[] args) {

        // Task 1
        Employee john = new Employee("John",150);
        Employee vasiliy = new Employee("Vasiliy", 150);
        Employee denis = new Employee("Denis", 200);
        Employee mary = new Employee("Mary", 200);
        Employee michael = new Employee("Michael", 400);

        System.out.println("Employees salary: " + "\nJohn's salary: " + john.getSalary(MonthUtils.fallMonths));
        System.out.println("Vasiliy salary: " + vasiliy.getSalary(MonthUtils.fallMonths));
        System.out.println("Denis salary: " + denis.getSalary(MonthUtils.fallMonths));
        System.out.println("Mary salary: " + mary.getSalary(MonthUtils.fallMonths));
        System.out.println("Michael salary: " + michael.getSalary(MonthUtils.fallMonths));
        System.out.println("=======================");


        Manager maryManager = mary.advanceToManager(50);
        System.out.println("Managers salary: " + "\nManager Mary's salary: " + maryManager.getSalary(MonthUtils.fallMonths));

        Director michaelDirector = michael.advanceToDirector(52);
        System.out.println("Director Michael's salary: " + michaelDirector.getSalary(MonthUtils.fallMonths));
        System.out.println("=======================");

        // Task 2
        Employee[] totalEmployees = {john, vasiliy, denis, maryManager, michaelDirector};

        double total = SalaryUtils.getTotalSalary(totalEmployees, MonthUtils.fallMonths);
        System.out.println("Total Company salary: " + total);
        System.out.println("=======================");

        // Task 3
        System.out.println(Switch.oldSchool(4));
        System.out.println("=======================");
        System.out.println(Switch.oldSchool('E'));
    }
}
