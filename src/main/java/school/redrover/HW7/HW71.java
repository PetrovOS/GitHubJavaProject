package school.redrover.HW7;

import java.util.Arrays;

public class HW71 {
    public static void main (String[] args) {
//        Task 1
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int count = 0;
        for (int numbers : array) {
            count += numbers;
        }
        System.out.println(count);

//        Task 2
        int maxValue = Integer.MIN_VALUE;
        for (int max : array) {
            if (maxValue < max) {
                maxValue = max;
            }
        }
        System.out.println(maxValue);

//        Task 3
        int minValue = Integer.MAX_VALUE;
        for (int min : array) {
            if (minValue > min) {
                minValue = min;
            }
        }
        System.out.println(minValue);

//        Task 4
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int count1 = 0;
        for(int counts : array1) {
            count1 += counts;
        }
        int avg = count1 / array1.length;

        System.out.println(avg);

//        Task 5
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for(int j = 0; j < array2[i].length; j++) {
                count2 += array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array2));
        System.out.println(count2);

//        Task 6
        int maxValue1 = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            for(int j = 0; j < array2[i].length; j++) {
                if (maxValue1 < array2[i][j]) {
                    maxValue1 = array2[i][j];
                }
            }
        }
        System.out.println(maxValue1);

//        Task 7
        int count3 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                count3 ++;
            }
        }
        System.out.println(count3);
    }
}
