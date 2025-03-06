package school.redrover.HW9;

public class MonthUtils {
  public static final Month JANUARY = new Month("January", 31, 17);
  public static final Month FEBRUARY = new Month("February", 28, 20);
  public static final Month MARCH = new Month("March", 31,20);
  public static final Month APRIL = new Month("April", 30,22);
  public static final Month MAY = new Month("May", 31,18);
  public static final Month JUNE = new Month("June", 30, 20);
  public static final Month JULY = new Month("July", 31, 23);
  public static final Month AUGUST = new Month("August", 31, 21);
  public static final Month SEPTEMBER = new Month("September", 30, 22);
  public static final Month OCTOBER = new Month("October", 31, 23);
  public static final Month NOVEMBER = new Month("November", 30, 19);
  public static final Month DECEMBER = new Month("December", 31, 21);

  public static final Month[] WINTER_MONTHS = new Month[] {DECEMBER, JANUARY, FEBRUARY};
  public static final Month[] SPRING_MONTHS = new Month[] {MARCH, APRIL, MAY};
  public static final Month[] SUMMER_MONTHS = new Month[] {JUNE, JULY, AUGUST};
  public static final Month[] FALL_MONTHS = new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
}
