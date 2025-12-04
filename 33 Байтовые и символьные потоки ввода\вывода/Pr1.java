import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Демонстрация работы метода read() из ByteArrayInputStream\n");
        
        // Способ 1: Чтение по одному байту
        System.out.println("1. Чтение данных из массива байтов по одному байту:");
        readByteArrayByteByByte();
    }
    
    /**
     * Метод демонстрирует работу read() без параметров
     * Читает данные из массива байтов по одному байту
     */
    public static void readByteArrayByteByByte() {
        // Создаем массив байтов с данными (не нужно создавать внешний файл)
        byte[] data = "Hello World!\nThis is a text.".getBytes();
        
        // Создаем объект ByteArrayInputStream для чтения из массива байтов
        ByteArrayInputStream inputStream = null;
        
        try {
            // Инициализируем поток данными из массива
            inputStream = new ByteArrayInputStream(data);
            
            int byteValue; // Переменная для хранения прочитанного байта
            int byteCount = 0; // Счетчик прочитанных байтов
            
            System.out.println("Содержимое массива байтов:");
            
            // Цикл чтения данных
            // Метод read() возвращает:
            // -1 если достигнут конец потока
            // значение прочитанного байта (0-255) в остальных случаях
            while ((byteValue = inputStream.read()) != -1) {
                byteCount++; // Увеличиваем счетчик
                
                // Преобразуем байт в символ и выводим на экран
                System.out.print((char) byteValue);
            }
            
            System.out.println("\nВсего прочитано байт: " + byteCount);
            
        } finally {
            // Блок finally выполняется всегда
            // Закрываем поток, если он был открыт
            if (inputStream != null) {
                try {
                    inputStream.close();
                    System.out.println("Поток успешно закрыт");
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии потока: " + e.getMessage());
                }
            }
        }
    }
}
