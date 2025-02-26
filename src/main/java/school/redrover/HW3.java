package school.redrover;

public class HW3 {
    public static void main(String[] args) {

        int a = 16;
        int b = 15;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

        int c = 24;
        int d = 34;

        System.out.println(c + d);

        if ((c + d) % 2 == 0) {
            System.out.println("maybe c and d are even");
        } else {
            System.out.println("some variable is odd");
        }

        int e = 99;

        if (e > 10) {
            System.out.println("больше 10");
        }
        if (e < 100) {
            System.out.println("меньше 100");
        }
        if (e / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (e >= 5 && e <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
