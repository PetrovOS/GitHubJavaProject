package school.redrover.HW9;

public class MonthUtils {
  public static Month january = new Month("January", 31, 17);
  public static Month february = new Month("February", 28, 20);
  public static Month march = new Month("March", 31,20);
  public static Month april = new Month("April", 30,22);
  public static Month may = new Month("May", 31,18);
  public static Month june = new Month("June", 30, 20);
  public static Month july = new Month("July", 31, 23);
  public static Month august = new Month("August", 31, 21);
  public static Month september = new Month("September", 30, 22);
  public static Month october = new Month("October", 31, 23);
  public static Month november = new Month("November", 30, 19);
  public static Month december = new Month("December", 31, 21);

    public static Month[] winterMonths = new Month[] {december, january,february};
    public static Month[] springMonths = new Month[] {march, april, may};
    public static Month[] summerMonths = new Month[] {june, july, august};
    public static Month[] fallMonths = new Month[] {september, october, november};
}
