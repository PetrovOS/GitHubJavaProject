package school.redrover.HW7;

import java.util.Arrays;

public class HW73 {
    public static void main(String[] args) {

//        Task 1
        int a = 40;
        int b = 4;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(mult(a, b));
        System.out.println(div(a, b));
        System.out.println(countingSheep(4));
        System.out.println(abbrevName("Collin Farrell"));
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    public static int add (int a, int b) {
        return a + b;
    }
    public static int sub (int a, int b) {
        return a - b;
    }
    public static int mult (int a, int b) {
        return a * b;
    }
    public static int div (int a, int b) {
        return a / b;
    }

//    Task 2
    public static boolean isLove(final int flower1, final int flower2) {
        if (flower1 % 2 != flower2 % 2) {
            return true;
        } else {
            return false;
        }
    }

    //        Task 3
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    //    Task 4
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int arg : args) {
            if (min > arg) {
                min = arg;
            }
        }
        return min;
    }

    //    Task 5
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += (i + " sheep...");
        }
        return result;
    }

    //    Task 6
    public static String abbrevName(String name) {
        String[] fullName = name.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];
        return (firstName.charAt(0) + "." + lastName.charAt(0)).toUpperCase();
    }

    //    Task 7
    public static String highAndLow(String numbers) {

        String[] numbers1 = numbers.split(" ");
        int[] arr = new int[numbers1.length];

        for (int i = 0; i < numbers1.length; i++) {
            arr[i] = Integer.valueOf(numbers1[i]);
        }
        Arrays.sort(arr);

        int lowest = arr[0];
        int high = arr[arr.length - 1];

        return Integer.toString(high) + " " + Integer.toString(lowest);
    }
}
