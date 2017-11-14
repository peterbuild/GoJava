package lesson1;

import java.util.Scanner;

public class passport {

    // Создаем свой метод для проверки целых чисел

    public static int getInt() {
        //System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);// Создаем объект Scanner
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
        } else {
            System.out.print("Please enter integer! ");
            in.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаем объект Scanner
        //запрашиваем имя
        System.out.print("Please, enter Your name: ");
        String name = sc.nextLine();
        //запрашиваем фамилию
        System.out.print("Please, enter Your surname: ");
        String surname = sc.nextLine();
        //Запрашиваем возраст
        System.out.print("Please, enter Your age: ");
        int age = getInt();

        //Запрашиваем место рождения
        System.out.print("Please enter the city where you were born: ");
        String born = sc.nextLine();
        //Запрашиваем место проживания
        System.out.print("Please enter the city where you are located: ");
        String locate = sc.nextLine();
        //Запрашиваем пол
        String gender;
        do { //запускаем цикл запроса на ввод значений male или famale
            System.out.print("Please, enter Your gender, male or famale: ");
            gender = sc.nextLine();

        } while ((!gender.equals("male")) & (!gender.equals("famale"))); //проверка усливия

        //выводим все в консоль
        System.out.println("-------------------- PASSPORT --------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("-----");
        System.out.println("----- Person: " + name + " " + surname);
        System.out.println("-----");
        System.out.println("----- Gender: " + gender + ", age " + age);
        System.out.println("-----");
        System.out.println("----- Location: from - " + born + ", current - " + locate);
        System.out.println("-----");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
    }


}

