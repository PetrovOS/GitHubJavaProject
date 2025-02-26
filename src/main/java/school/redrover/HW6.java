package school.redrover;

public class HW6 {
    public static void main(String[] args) {

        //        Task 1
        String s = "Перестановочный алгоритм быстрого действия";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println("\n------------------------");

        //        Task 2
        String s1 = "Перевыборы выбранного президента";
        int totalE = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                totalE = totalE + 1;
            }
        }
        System.out.print(totalE);

        System.out.println("\n------------------------");

        //        Task 3
        String s2 = "Посмотрите как Рите нравится ритм";

        s2 = s2.toLowerCase();
        int position = s2.indexOf("рит");

        while (position >= 0) {
            System.out.print(position + " ");
            position = s2.indexOf("рит", position + 1);
        }
        System.out.println("\n------------------------");

        //        Task 4

        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"},
        };

        int countWithoutE = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    countWithoutE += 1;
                }
            }
        }
        System.out.print(countWithoutE);

        System.out.print("\n------------------------");

        //        Task 5
        int[][] fiveFive = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
        };

        int[][] newFive = new int[fiveFive[0].length][fiveFive.length];

        for (int i = 0; i < fiveFive[0].length; i++) {
            System.out.println();
            for (int j = 0; j < fiveFive.length; j++) {
                newFive[i][j] = fiveFive[j][i];
                System.out.print(newFive[i][j] + " ");
            }
        }
    }
}
