package school.redrover.HW10;

import school.redrover.HW9.Month;
/*
Создать класс SalaryUtils, и в нем написать метод getTotalSalary(Employee[] employees),
который подсчитает общую сумму к выплате на всех сотрудников — простых работников, менеджеров и директоров.
* */
public class SalaryUtils {

    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double totalCompanySalary = 0;

        for(Employee employee : employees) {
            totalCompanySalary += employee.getSalary(months);
        }
        return totalCompanySalary;
    }
}
