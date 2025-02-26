package school.redrover.HW7;

public class HW72 {
    public static void main (String[] args) {

//        Task 1
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//        Task 2
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        Task 3
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
