package school.redrover.HW11;

public class CodeWars {

    //    Task 1 (11.2)
    public static String abbrevName(String name) {
        String[] fullName = name.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];

        return (firstName.charAt(0) + "." + lastName.charAt(0)).toUpperCase();
    }

    //    Task 2 (11.2)
    public static boolean feast(String beast, String dish) {

        return beast.charAt(0) == dish.charAt(0) &&
                beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }

    //    Task 3 (11.2)
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";

        for (int i = 0; i < one.length(); i++) {
            result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }

    //    Task 4 (11.2)
    public static String position(char alphabet)
    {
        return "Position of alphabet: " + (alphabet - 'a' + 1);
    }

    //    Task 5 (11.2)
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int total = 0;

        for(int i = 0; i < arr1.length; i++) {
            total += arr1[i] + arr2[i];
        }
        return total;
    }

    //    Task 1 (11.3)
    public static String boolToWord(boolean b)
    {
        return b ? "Yes" : "No";
    }

    //    Task 2 (11.3)
    public static Integer basicMath(String op, int v1, int v2)
    {
        return switch(op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> (v2 !=0) ? v1 / v2 : null;
            default -> null;
        };
    }

    //    Task 3 (11.3)
    public static int[] reverse(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    //    Task 4 (11.3)
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    //    Task 5 (11.3)
    public static String correct(String string) {
        return string.replace('5','S').
                replace('0','O').
                replace('1', 'I');
    }
}
