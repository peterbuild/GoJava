package lesson2;

import my_library.checks_inputs;

public class task_2 {
// Площадь прямоугольника
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter rectangle width: ");
            int a = checks_inputs.getInt2();
            System.out.print("Enter rectangle height: ");
            int b = checks_inputs.getInt2();
            System.out.println();
            try {
                if (a > 0 && b > 0) {
                    System.out.println("Width:  " + a + "\nHeight: " + b + "\nArea of a rectangle: " + (a * b));
                    break;
                } else {
                    System.err.println("Can not be less than or equal to zero!!! ");
                }
            }
            catch (Exception e) {
            }
        }
    }
}

