package school.redrover.HW9;

public class Test {
    public static void main(String[] args) {
        Employee john = new Employee("John", 100);
        Employee mary = new Employee("Mary", 100, 25, "Female");
        Employee dima = Employee.withoutAge("Dmitriy", 150, "Male");
        Employee angelina = Employee.withoutSex("Angelina", 150, 35);

        Manager maryManager = mary.convertToManager(40);

        System.out.println(Employee.makeSummary(new Employee[] {john, mary, dima, angelina}));
        System.out.println(mary.getSalary(MonthUtils.fallMonths));
        System.out.println(maryManager.getSalary(MonthUtils.fallMonths));
    }
}
