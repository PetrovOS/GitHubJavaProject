package school.redrover;

public class HW4 {
    public static void main(String[] args) {

//        Task 1
        int i = 0;

        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("Done 1");

//        Task 2
        int base = 5;
        int limit = 100000;


        for (int power = 0, result = 1; result < limit ; power ++, result *= base) {
            System.out.println(base + "^" + power + "=" + result);
        }
        System.out.println("Done 2");

//        Task 3
        for (int k = 40; k <= 60; k++) {
            if (k % 4 == 0) {
                System.out.println(k);
            }
        }
        System.out.println("Done 3");

        for (int k = 40; k <= 60; k += 4) {
            System.out.println(k);
        }
        System.out.println("Done 3");
    }
}
