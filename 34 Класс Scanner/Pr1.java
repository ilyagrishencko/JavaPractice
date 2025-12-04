/*
Практика #1
Приведите пример кода для чтение данных из текстового файла с помощью Scanner.
  */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пример чтения данных из текстового файла с помощью Scanner\n");
        
        // Указываем путь к файлу (в данном примере файл называется data.txt)
        File file = new File("data.txt");
        
        try {
            // Создаем объект Scanner для чтения из файла
            Scanner scanner = new Scanner(file);
            
            System.out.println("Содержимое файла " + file.getName() + ":\n");
            
            // Читаем файл построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            // Важно закрыть Scanner после использования
            scanner.close();
            System.out.println("\nФайл успешно прочитан.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
            System.out.println("Убедитесь, что файл data.txt существует в корневой папке проекта.");
        }
    }
}
