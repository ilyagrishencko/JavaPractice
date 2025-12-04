/*
Спецификатор формата	Выполняемое форматирование
%b	Логическое значение аргумента
%c	Символьное представление аргумента
%d	Десятичное целое значение аргумента
%h	Хэшкод аргумента
%e	Экспоненциальное представление аргумента
%f	Десятичное значение с плавающей точкой
%n	Вставка символа новой строки
%s	Строковое представление аргумента
%t	Время и дата
%%	Вставка знака %
Практика #1
Приведите пример использования пяти любых спецификаторов из таблицы.
 */
public class Main {
    public static void main(String[] args) {
      
        // 1. %b - логическое значение
        System.out.println("1. %b - логическое значение:");
        System.out.println(String.format("Логическое true: %b", true));
        System.out.println(String.format("Логическое false: %b", false));
        System.out.println(String.format("Не null объект: %b", "текст"));
        System.out.println(String.format("Null объект: %b", null));
        
        // 2. %c - символьное представление
        System.out.println("\n2. %c - символьное представление:");
        System.out.println(String.format("Символ: %c", 'A'));
        System.out.println(String.format("Символ из числа: %c", 65)); // ASCII код 'A'
        
        // 3. %d - десятичное целое число
        System.out.println("\n3. %d - десятичное целое число:");
        System.out.println(String.format("Целое число: %d", 123));
        System.out.println(String.format("Отрицательное число: %d", -456));
        System.out.println(String.format("Число с отступами: %10d", 789)); // 10 символов шириной
        System.out.println(String.format("Число с нулями: %05d", 42)); // 5 символов с ведущими нулями
        
        // 4. %h - хэшкод
        System.out.println("\n4. %h - хэшкод:");
        String str = "Hello";
        System.out.println(String.format("Хэшкод строки '%s': %h", str, str));
        System.out.println(String.format("Хэшкод числа 100: %h", 100));
        System.out.println(String.format("Хэшкод null: %h", null));
        
        // 5. %e - экспоненциальное представление
        System.out.println("\n5. %e - экспоненциальное представление:");
        System.out.println(String.format("Экспонента: %e", 1234567.89));
        System.out.println(String.format("Экспонента маленького числа: %e", 0.0000123));
        System.out.println(String.format("Экспонента с точностью: %.3e", 1234567.89)); // 3 знака после запятой
        
        // 6. %f - десятичное с плавающей точкой
        System.out.println("\n6. %f - десятичное с плавающей точкой:");
        System.out.println(String.format("Число с плавающей точкой: %f", 3.14159));
        System.out.println(String.format("С двумя знаками после запятой: %.2f", 3.14159));
        System.out.println(String.format("С отступами: %10.2f", 3.14159)); // 10 символов, 2 знака после запятой
        System.out.println(String.format("С нулями: %08.2f", 3.14159)); // 8 символов с ведущими нулями
        
        // 7. %n - вставка символа новой строки
        System.out.println("\n7. %n - вставка символа новой строки:");
        System.out.println(String.format("Первая строка%nВторая строка%nТретья строка"));
    }
}
