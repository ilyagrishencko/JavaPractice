import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
Практика #2
Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Демонстрация работы метода write(int) из ByteArrayOutputStream\n");
        
        // Демонстрация записи отдельных байтов в поток
        System.out.println("1. Запись отдельных байтов в поток:");
        writeBytesToStream();
    }
    
    /**
     * Метод демонстрирует работу write(int b)
     * Записывает отдельные байты в поток
     */
    public static void writeBytesToStream() {
        // Создаем объект ByteArrayOutputStream
        ByteArrayOutputStream outputStream = null;
        
        try {
            // Инициализируем поток
            outputStream = new ByteArrayOutputStream();
            
            // Метод write(int b) записывает один байт в поток
            // Параметр int содержит значение байта (используются только младшие 8 бит)
            
            System.out.println("Записываем отдельные байты в поток:");
            
            // Записываем байты, соответствующие символам 'H', 'e', 'l', 'l', 'o'
            outputStream.write(72);   // 'H' в ASCII
            outputStream.write(101);  // 'e'
            outputStream.write(108);  // 'l'
            outputStream.write(108);  // 'l'
            outputStream.write(111);  // 'o'
            outputStream.write(32);   // пробел
            outputStream.write(87);   // 'W'
            outputStream.write(111);  // 'o'
            outputStream.write(114);  // 'r'
            outputStream.write(108);  // 'l'
            outputStream.write(100);  // 'd'
            outputStream.write(33);   // '!'
            
            // Также можно записывать байты, полученные из символов
            char exclamation = '!';
            outputStream.write(exclamation);  // автоматическое преобразование char в int
            
            // Выводим содержимое потока как строку
            String result = outputStream.toString();
            System.out.println("Содержимое потока: " + result);
            
            // Получаем массив байтов из потока
            byte[] byteArray = outputStream.toByteArray();
            System.out.print("Байтовый массив (в десятичном формате): ");
            for (byte b : byteArray) {
                // Приводим byte к int для отображения беззнакового значения
                System.out.print((b & 0xFF) + " ");
            }
            
            System.out.print("\nБайтовый массив (в шестнадцатеричном формате): ");
            for (byte b : byteArray) {
                System.out.printf("%02X ", b);
            }
            
            System.out.print("\nБайтовый массив (как символы): ");
            for (byte b : byteArray) {
                System.out.print((char) b);
            }
            
        } finally {
            // Закрываем поток
            if (outputStream != null) {
                try {
                    outputStream.close();
                    System.out.println("\nПоток успешно закрыт");
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии потока: " + e.getMessage());
                }
            }
        }
    }
}
