package school.redrover.HW8;

public class Employee {

    String name;
    int age;
    String sex;
    double dailySalary;

    public double getSalary(Month[] monthArray) {

        double totalSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            totalSalary += dailySalary * monthArray[i].workDaysInMonth;
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee johnEmployee = new Employee();
        johnEmployee.name = "John";
        johnEmployee.age = 39;
        johnEmployee.sex = "Male";
        johnEmployee.dailySalary = 100;

        Employee maryEmployee = new Employee();
        maryEmployee.name = "Mary";
        maryEmployee.age = 23;
        maryEmployee.sex = "Female";
        maryEmployee.dailySalary = 80;

        Employee valeraEmployee = new Employee();
        valeraEmployee.name = "Valera";
        valeraEmployee.age = 45;
        valeraEmployee.sex = "Male";
        valeraEmployee.dailySalary = 130;

        Employee[] employeesList = new Employee[]{johnEmployee, maryEmployee, valeraEmployee};

        for (Employee employee : employeesList) {
            System.out.println(employee.name);
            System.out.println(employee.age);
            System.out.println(employee.sex);
            System.out.println(employee.dailySalary);
            System.out.println("==================");
        }
        System.out.println(employeesList[1].name);
        System.out.println();

        MonthUtils monthUtils = new MonthUtils();
        for (Month month : monthUtils.fallMonths) {
            System.out.println(month.monthName);
        }
        System.out.println("==================");

        System.out.println(employeesList[1].name);
        System.out.println(employeesList[1].getSalary(monthUtils.fallMonths));
    }
}
