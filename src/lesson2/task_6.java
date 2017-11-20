package lesson2;

import my_library.checks_inputs;

public class task_6 {
    public static void main(String[] args) {
        System.out.print("Enter first value a: ");
        int a = checks_inputs.getInt2();
        System.out.print("Enter second value b: ");
        int b = checks_inputs.getInt2();
        System.out.print("Enter third value c: ");
        int c = checks_inputs.getInt2();

        System.out.println("a == b || c - " + (a == b || a == c));
        System.out.println("b == a || c - " + (b == a || b == c));
        System.out.println("c == a || b - " + (c == a || c == b));

        System.out.println("a > b || c - " + (a > b || a > c));
        System.out.println("b > a || c - " + (b > a || b > c));
        System.out.println("c > a || b - " + (c > a || c > b));
    }
}

