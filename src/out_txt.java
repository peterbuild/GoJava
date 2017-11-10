import java.io.*;
import java.net.URLDecoder;

public class out_txt {
    public static void main(String[] args) throws IOException {
        /* Для выполнения этого задания решил немного пойти вперед и "нагуглил" чтеняе из файла и вывод в консоль,
         т.к. считаю нецелесобразно использовать sout большое количество раз, код выдает требуемое решение задачи))*/

        // получаем путь к файлу
        File currentClass = new File(URLDecoder.decode(out_txt.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath(), "UTF-8"));
        // присваиваем это значение переменной classDirectiry
        String classDirectory = currentClass.getParent();
        // проверяем что получается (правильный ли путь)
        //System.out.println(classDirectory);
        // Создаем переменную br для чтения в буффер
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // создаем переменную или конструктор для объекта f для чтения файла out.txt
        File f = new File(classDirectory+ "\\out.txt");

        BufferedReader fin = new BufferedReader(new FileReader(f));
        // создаем переменную для строки
        String line;
            //запучкаем цикл для чтения из файла построчно пока не получим конец файла и выводим сразу же в консоль
            while ((line=fin.readLine()) != null) System.out.println(line);

    }
}

