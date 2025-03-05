package school.redrover.HW10;
/*
* Разобраться с двумя вариантами работы switch в Джаве: switch statement и switch expression.
* Используя их, написать два разных метода приведения оценок к старорежимной системе:
●	плохо
●	неудовлетворительно
●	удовлетворительно
●	хорошо
●	отлично
Один метод должен принимать цифровую оценку от 1 до 5 и
* возвращать соответствующую строку из вышеприведенного списка.
* Второй — принимать “американскую” оценку в виде символа F, C, B, A.
Один метод должен использовать switch statement, другой — switch expression.
*/
public class Switch {

    // Switch statement
    public static String oldSchool(int grade) {
        String oldGrade;
        switch (grade) {
            case 1:
                oldGrade = "неудовлетворительно";
                break;
            case 2:
                oldGrade = "плохо";
                break;
            case 3:
                oldGrade = "удовлетворительно";
                break;
            case 4:
                oldGrade = "хорошо";
                break;
            case 5:
                oldGrade = "отлично";
                break;
            default:
                oldGrade = "Введите оценку от 1 до 5";
        }
        return oldGrade;
    }

    public static String oldSchool(char letter) {
        return switch (letter) {
            case 'F' -> "неудовлетворительно";
            case 'D' -> "плохо";
            case 'C' -> "удовлетворительно";
            case 'B' -> "хорошо";
            case 'A' -> "отлично";
            default -> "Введите буквы А, B, C, D, F";
        };
    }
}
