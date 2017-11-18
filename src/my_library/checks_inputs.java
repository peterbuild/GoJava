package my_library;

import java.util.Scanner;

public class checks_inputs {


    public static int getInt() { //Этот метод проверки ввода использует рекурсию
        Scanner in = new Scanner(System.in);// Создаем объект Scanner
        int num;
        //System.out.print("Please enter integer: ");
        if (in.hasNextInt()) {
            num = in.nextInt();
        } else {
            System.err.print("This not integer!!! Please enter integer: ");
            in.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static int getInt2() { //Этот метод без рекурсии
        Scanner in = new Scanner(System.in);
        String str;
        int num;

        while(true) {
            //System.out.print("Please enter integer: ");
            str = in.nextLine();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.err.print("This not integer!!! Please enter integer: ");
            }
        }
        return num;
    }

    public static void main(String[] args) {
    getInt();
    getInt2();

    }
}
