package lesson2;

import my_library.checks_inputs;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type first string: " );
        String str1 = in.nextLine();
        System.out.println("Type second string: " );
        String str2 = in.nextLine();
        System.out.println("Enter number: " );
        int i = checks_inputs.getInt2();
        String strOut = str1.substring(0, i) + str2 + str1.substring(i);
        System.out.println(strOut);
    }
}
