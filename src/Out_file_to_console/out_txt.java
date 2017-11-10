package Out_file_to_console;

import java.io.*;

public class out_txt {
    public static void main(String[] args) throws IOException {
        /* Для выполнения этого задания решил немного пойти вперед и "нагуглил" чтеняе из файла и вывод в консоль,
         т.к. считаю нецелесобразно использовать sout большое количество раз, код выдает требуемое решение задачи))*/

        // получаем путь к рабочему каталогу проэкта, загоняем его в переменную classDirectory
        String classDirectory = System.getProperty("user.dir");
        // проверяем что получается (правильный ли путь)
        //System.out.println(classDirectory);
        // Создаем переменную br для чтения в буффер
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // создаем переменную или конструктор для объекта f для чтения файла mario.txt
        File f = new File(classDirectory + "\\src\\mario.txt");

        BufferedReader fin = new BufferedReader(new FileReader(f));
        // создаем переменную для строки
        String line;
            //запуcкаем цикл для чтения из файла построчно пока не получим конец файла и выводим сразу же в консоль
            while ((line=fin.readLine()) != null) System.out.println(line);

    }
}

