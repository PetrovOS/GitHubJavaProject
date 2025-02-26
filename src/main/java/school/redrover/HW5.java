package school.redrover;

import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
        System.out.println("Task 1");

//        Task 1
        int[] arr1 = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 != 0) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Task 2");

//        Task 2
        int[] arr2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > 5) {
                count += 1;
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
        System.out.println("More than 5 in array: " + count);

        System.out.println();
        System.out.println("Task 3");

//        Task 3
        int[] arr3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr3[i] + 15;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
