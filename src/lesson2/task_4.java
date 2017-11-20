package lesson2;

import my_library.checks_inputs;

public class task_4 {
    public static void main(String[] args) {
        System.out.print("Enter first value ");
        int a = checks_inputs.getInt2();
        System.out.print("Enter second value ");
        int b = checks_inputs.getInt2();

        System.out.println(a + " == " + b + " " +(a == b));
        if (a % b == 0) {
            System.out.println(a + " is divisible by "+ b +" without residue");
        } else
            System.out.println(a + " is NOT divisible by "+ b +" without residue");
        System.out.println(a + " > " + b + " " +(a > b));
    }
}
