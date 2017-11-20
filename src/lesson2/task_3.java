package lesson2;

import my_library.checks_inputs;
//Площадь треугольника
public class task_3 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter side a: ");
            int a = checks_inputs.getInt2();
            System.out.print("Enter side b: ");
            int b = checks_inputs.getInt2();
            System.out.print("Enter side c: ");
            int c = checks_inputs.getInt2();
            System.out.println();
            try {
                if (a < (c + b) && c < (a + b) && b < (c + a)) {
                    double pp = (a + b + c) / 2.0;  // полупериметр
                    double area = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)); // формула Герона
                    System.out.println("Side a:  " + a + "\nSide b: " + b + "\nSide c " + c + "\nArea: "+ area);
                    break;
                } else {
                    System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.err.println("Non-existent triangle!!!");
                    System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }
            catch (Exception e) {
            }
        }
    }
}
