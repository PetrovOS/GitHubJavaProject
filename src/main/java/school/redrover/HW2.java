package school.redrover;

public class HW2 {
    public static void main(String[] args) {
// Результат сложения, вычитания и т.д.

        int a = 12;
        int b = 5;
        int resultPlus = a + b;
        int resultSubstract = a - b;
        int resultMult = a * b;
        int resultDivide = a / b;
        int resultOstatok = a % b;
        boolean evenA = (a % 2 == 0);
        boolean evenB = (b % 2 == 0);

        System.out.println("Результат сложения: " + resultPlus);
        System.out.println("Результат вычитания: " + resultSubstract);
        System.out.println("Результат умножения: " + resultMult);
        System.out.println("Результат деления: " + resultDivide);
        System.out.println("Остаток от деления: " + resultOstatok);
        System.out.println("Is A even: " + evenA);
        System.out.println("Is B even: " + evenB);

//        Замена переменных местами при помощи исключающего ИЛИ

        int x = 20;
        int y = 10;

        int temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

//        Дележка добычи на пиратском корабле
        int treasure = 1000;
        int crew = 25;
        int remaining = treasure;

        int ownerShare = remaining / 2;
        remaining = remaining - ownerShare;

        int captainShare = remaining / 2;
        remaining = remaining - captainShare;

        int crewShare = remaining / (crew + 1);
        captainShare = captainShare + crewShare;
        remaining = remaining - crewShare * (crew + 1);

        System.out.println("Владельцу: " + ownerShare);
        System.out.println("Капитану: " + captainShare);
        System.out.println("Членам команды: " + crewShare);
        System.out.println("На пропой: " + remaining);

        System.out.println(ownerShare + captainShare + (crewShare * crew) + remaining);
    }
}
