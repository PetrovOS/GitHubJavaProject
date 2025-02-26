package school.redrover.HW8;

public class Manager {
    String name;
    int age;
    String sex;
    double dailySalary;
    int numberOfSubordinates;


    public double getSalary (Month[] monthArray) {
        double salaryPerMonths = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salaryPerMonths += dailySalary * monthArray[i].workDaysInMonth;
        }
        return salaryPerMonths + salaryPerMonths * numberOfSubordinates / 100;
    }

    public static void main(String[] args) {
        Manager man = new Manager();
        man.name = "Vasiliy";
        man.age = 36;
        man.sex = "Male";
        man.dailySalary = 200;
        man.numberOfSubordinates = 50;
        MonthUtils monthUtils = new MonthUtils();

        System.out.println(man.name);
        System.out.println(man.getSalary(monthUtils.winterMonths));
    }
}
