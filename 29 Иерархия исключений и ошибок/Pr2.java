/*
Практика #2
Приведите примеры кода, в которых генерируются и обрабатываются следующие исключения.

ArithmeticException
ArrayIndexOutOfBoundsException
IllegalArgumentException
ClassCastException
NullPointerException
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("демонстрация исключений в java\n");

        // 1. arithmeticexception - арифметическая ошибка
        try {
            System.out.println("1. попытка деления на ноль:");
            int a = 10;
            int b = 0;
            int result = a / b; // здесь произойдет исключение
            System.out.println("результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("сообщение: " + e.getMessage());
        }

        System.out.println();

        // 2. arrayindexoutofboundsexception - выход за границы массива
        try {
            System.out.println("2. попытка доступа к элементу за пределами массива:");
            int[] numbers = {1, 2, 3};
            // пытаемся получить элемент с индексом 5, хотя массив имеет длину 3
            int value = numbers[5]; // здесь произойдет исключение
            System.out.println("значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("сообщение: " + e.getMessage());
        }

        System.out.println();

        // 3. illegalargumentexception - недопустимый аргумент
        try {
            System.out.println("3. передача некорректного аргумента в метод:");
            // вызываем метод с отрицательным возрастом
            setAge(-5); // здесь метод выбросит исключение
        } catch (IllegalArgumentException e) {
            System.out.println("поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("сообщение: " + e.getMessage());
        }

        System.out.println();

        // 4. classcastexception - ошибка приведения типов
        try {
            System.out.println("4. попытка некорректного приведения типов:");
            Object obj = "это строка";
            // пытаемся привести строку к integer (это невозможно)
            Integer number = (Integer) obj; // здесь произойдет исключение
            System.out.println("число: " + number);
        } catch (ClassCastException e) {
            System.out.println("поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("сообщение: " + e.getMessage());
        }

        System.out.println();

        // 5. nullpointerexception - обращение к null объекту
        try {
            System.out.println("5. попытка вызова метода у null объекта:");
            String text = null;
            // пытаемся вызвать метод у переменной, которая содержит null
            int length = text.length(); // здесь произойдет исключение
            System.out.println("длина строки: " + length);
        } catch (NullPointerException e) {
            System.out.println("поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("сообщение: " + e.getMessage());
        }

    }

    /*
      метод для установки возраста
      выбрасывает illegalargumentexception, если возраст отрицательный
     */
    public static void setAge(int age) {
        if (age < 0) {
            // создаем исключение с поясняющим сообщением
            throw new IllegalArgumentException("возраст не может быть отрицательным. получено: " + age);
        }
        System.out.println("возраст установлен: " + age);
    }
}
