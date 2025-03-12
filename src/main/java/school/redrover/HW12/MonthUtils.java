package school.redrover.HW12;

public class MonthUtils {
 private static final Month JANUARY = new Month("January", 31, 17);
 private static final Month FEBRUARY = new Month("February", 28, 20);
 private static final Month MARCH = new Month("March", 31,20);
 private static final Month APRIL = new Month("April", 30,22);
 private static final Month MAY = new Month("May", 31,18);
 private static final Month JUNE = new Month("June", 30, 20);
 private static final Month JULY = new Month("July", 31, 23);
 private static final Month AUGUST = new Month("August", 31, 21);
 private static final Month SEPTEMBER = new Month("September", 30, 22);
 private static final Month OCTOBER = new Month("October", 31, 23);
 private static final Month NOVEMBER = new Month("November", 30, 19);
 private static final Month DECEMBER = new Month("December", 31, 21);

 public static Month[] firstQuarter() {
  return new Month[] {JANUARY, FEBRUARY, MARCH};
 }

 public static Month[] secondQuarter() {
  return new Month[] {APRIL, MAY, JUNE};
 }

 public static Month[] thirdQuarter() {
  return new Month[] {JULY, AUGUST, SEPTEMBER};
 }

 public static Month[] fourthQuarter() {
  return new Month[] {OCTOBER, NOVEMBER, DECEMBER};
 }

 public static Month[] firstHalfOfTheYear() {
  return new Month[] {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
 }

 public static Month[] secondHalfOfTheYear() {
  return new Month[] {JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
 }

 public static Month[] wholeYear() {
  return new Month[] {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
          JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
 }
}
