/*
Практика #1
Приведите пример собственного класса исключения.
*/
public class Main {

    // Создаем собственный класс исключения
    static class MyException extends Exception {

        // 1. Конструктор по умолчанию (без параметров)
        // Создает исключение с предустановленным сообщением
        public MyException() {
            super();
        }

        // 2. Конструктор с сообщением об ошибке
        // Позволяет задать кастомное сообщение при создании исключения
        public MyException(String message) {
            super(message);
        }

        // 3. Конструктор с сообщением и причиной (другим исключением)
        // Позволяет создать цепочку исключений для отслеживания первопричины
        public MyException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {
        System.out.println("Демонстрация собственного исключения\n");

        // Пример 1: использование конструктора по умолчанию
        System.out.println("1. Использование конструктора по умолчанию:");
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        // Пример 2: использование конструктора с сообщением
        System.out.println("\n2. Использование конструктора с сообщением:");
        try {
            throw new MyException("Кастомное сообщение об ошибке");
        } catch (MyException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

}
