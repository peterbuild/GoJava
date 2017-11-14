package lesson1;

public class calc {
    public static void main(String[] args) {
        //Запрашиваем первое число
        System.out.print("Enter the first number: ");
        int first = passport.getInt();
        //Запрашиваем второе
        System.out.print("Enter the second number: ");
        int second = passport.getInt();

        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " * " + second + " = " + (first * second));
        //проверка деления на ноль
        if (second != 0) {
            System.out.println(first + " / " + second + " = " + (double) (first / second));
            System.out.println(first + " module " + second + " = " + (first / second));
        } else {
            System.out.println(first + " / " + second + " = division by zero");
        }

        System.out.println(first + " - " + second + " = " + (first - second));

        //Делаем красивый вывод сравнение чисел в консоли без "непонятных" юзеру тру/фолс
        if (first == second) {
            System.out.println(first + " = " + second);
        } else {
            if (first > second) {
                System.out.println(first + " > " + second);
            } else {
                System.out.println(first + " < " + second);
            }
            System.out.println(first + " != " + second);
        }
        //можно слелать красиво в коде

        System.out.println(first + " = " + second + " " + (first == second));
        System.out.println(first + " > " + second + " " + (first > second));
        System.out.println(first + " < " + second + " " + (first < second));
    }
}
