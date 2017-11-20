package lesson2;

import my_library.checks_inputs;

public class task_1 {
    public static void main(String[] args) {
        //task 1
        System.out.print("enter float number A: ");
        float a = checks_inputs.getfloat();
        System.out.print("enter float number B: ");
        float b = checks_inputs.getfloat();
        System.out.println("A + B = " + (a + b));



    }
}
