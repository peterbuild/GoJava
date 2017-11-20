package lesson2;

import my_library.checks_inputs;

public class task_5 {
    public static void main(String[] args) {
        System.out.print("Enter first value a: ");
        int a = checks_inputs.getInt2();
        System.out.print("Enter second value b: ");
        int b = checks_inputs.getInt2();
        System.out.print("Enter third value c: ");
        int c = checks_inputs.getInt2();

        System.out.println("a is max - " + (a > b && a > c));
        System.out.println("b is max - " + (b > a && b > c));
        System.out.println("c is max - " + (c > a && c > b));

        System.out.println("a is min - " + (a < b && a < c));
        System.out.println("b is min - " + (b < a && b < c));
        System.out.println("c is min - " + (c < a && c < b));

        System.out.println("a between b and c " + (a > b && a < c));
        System.out.println("b between a and c " + (b > a && b < c));
        System.out.println("c between a and b " + (c > a && c < b));
    }
}
