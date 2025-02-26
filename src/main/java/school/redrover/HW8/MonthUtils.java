package school.redrover.HW8;

public class MonthUtils {

    Month january = new Month();
    {
        january.monthName = "January";
        january.daysInMonth = 31;
        january.workDaysInMonth = 17;
    }
    Month february = new Month();
    {
        february.monthName = "February";
        february.daysInMonth = 28;
        february.workDaysInMonth = 20;
    }
    Month march = new Month();
    {
        march.monthName = "March";
        march.daysInMonth =31;
        march.workDaysInMonth = 20;
    }
    Month april = new Month();
    {
        april.monthName = "April";
        april.daysInMonth = 30;
        april.workDaysInMonth = 22;
    }
    Month may = new Month();
    {
        may.monthName = "May";
        may.daysInMonth = 31;
        may.workDaysInMonth = 18;
    }
    Month june = new Month();
    {
        june.monthName = "June";
        june.daysInMonth = 30;
        june.workDaysInMonth = 20;
    }
    Month july = new Month();
    {
        july.monthName = "July";
        july.daysInMonth = 31;
        july.workDaysInMonth = 23;
    }
    Month august = new Month();
    {
        august.monthName = "August";
        august.daysInMonth = 31;
        august.workDaysInMonth = 21;
    }
    Month september = new Month();
    {
        september.monthName = "September";
        september.daysInMonth = 30;
        september.workDaysInMonth = 22;
    }
    Month october = new Month();
    {
        october.monthName = "October";
        october.daysInMonth = 31;
        october.workDaysInMonth = 23;
    }
    Month november = new Month();
    {
        november.monthName = "November";
        november.daysInMonth = 30;
        november.workDaysInMonth = 19;
    }
    Month december = new Month();
    {
        december.monthName = "December";
        december.daysInMonth = 31;
        december.workDaysInMonth = 21;
    }

    Month[] winterMonths = new Month[] {december, january, february};
    Month[] springMonths = new Month[] {march, april, may};
    Month[] summerMonths = new Month[] {june, july, august};
    Month[] fallMonths = new Month[] {september, october, november};
}
