package school.redrover.HW10;
/*
* Класс Employee должен иметь поля: имя, возраст, пол и ЗП в день.
Имя и ЗП должны быть обязательными, остальные поля — нет.
Класс должен иметь метод - getSalary(Month[] monthArray),
* метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

Класс Manager должен иметь все то, что имеет Employee, и вдобавок,
* хранить число подчиненных. Метод getSalary(Month[] monthArray)
* должен учитывать количество подчиненных, и давать надбавку к зарплате в 1% за каждого подчиненного.

Класс Director должен вести себя как Manager, но давать надбавку к зарплате в 3% за каждого подчиненного.
* */
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
