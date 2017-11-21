package lesson2;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type first string: ");
        String str1 = in.nextLine();
        System.out.println("Type second string: ");
        String str2 = in.nextLine();
        Boolean contains = str1.contains(str2);
        System.out.println("Contains " + str2 + " in " + str1 + " - " + contains);

        int cnt = 0;
        String sub;
        for (int i = 0; i < str1.length(); i++) {
            sub = str1.substring(i, str2.length() + i);
            if (sub.equals(str2))
                cnt++;

            if (i == (str1.length() - str2.length()))
                break;
        }
        System.out.println("How many times does the " + str2 + " in the " + str1 + " : " + cnt);
        System.out.println("Where " + str2 + " in " + str1 + " occurs in the first time? " + str1.indexOf(str2) + 1);
    }
}
