/*
Практика #1
Какого типа может быть переменная в switch? Приведите примеры для всех возможных случаев.
 */
public class SwitchTypesExample {
    public static void main(String[] args) {
        // целочисленные типы
        int day = 3;
        switch (day) {
            case 1: System.out.println("понедельник"); break;
            case 2: System.out.println("вторник"); break;
            case 3: System.out.println("среда"); break;
            default: System.out.println("другой день");
        }
        
        // тип char
        char grade = 'B';
        switch (grade) {
            case 'A': System.out.println("отлично"); break;
            case 'B': System.out.println("хорошо"); break;
            case 'C': System.out.println("удовлетворительно"); break;
            default: System.out.println("неудовлетворительно");
        }
        // примитивный byte
        byte byteValue = 2;
        switch (byteValue) {
            case 1: System.out.println("byte: один"); break;
            case 2: System.out.println("byte: два"); break;
            case 3: System.out.println("byte: три"); break;
        }
        
        // примитивный short
        short shortValue = 100;
        switch (shortValue) {
            case 100: System.out.println("short: сто"); break;
            case 200: System.out.println("short: двести"); break;
        }
        
        // примитивный int
        int intValue = 5;
        switch (intValue) {
            case 5: System.out.println("int: пять"); break;
            case 10: System.out.println("int: десять"); break;
        }
        
        // примитивный char
        char charValue = 'A';
        switch (charValue) {
            case 'A': System.out.println("char: A"); break;
            case 'B': System.out.println("char: B"); break;
        }
        
        //Byte
        Byte byteWrapper = 10;
        switch (byteWrapper) {
            case 10: System.out.println("Byte: десять"); break;
            case 20: System.out.println("Byte: двадцать"); break;
        }
        
        //Short
        Short shortWrapper = 30;
        switch (shortWrapper) {
            case 30: System.out.println("Short: тридцать"); break;
            case 40: System.out.println("Short: сорок"); break;
        }
        
        //Character
        Character charWrapper = 'X';
        switch (charWrapper) {
            case 'X': System.out.println("Character: X"); break;
            case 'Y': System.out.println("Character: Y"); break;
        }
      
        // строки (String) - с Java 7
        String color = "red";
        switch (color) {
            case "red": System.out.println("красный"); break;
            case "blue": System.out.println("синий"); break;
            case "green": System.out.println("зеленый"); break;
            default: System.out.println("неизвестный цвет");
        }
        
        // перечисления (enum)
        Size size = Size.MEDIUM;
        switch (size) {
            case SMALL: System.out.println("маленький"); break;
            case MEDIUM: System.out.println("средний"); break;
            case LARGE: System.out.println("большой"); break;
        }
        
        // обертки примитивных типов
        Integer number = 2;
        switch (number) {
            case 1: System.out.println("один"); break;
            case 2: System.out.println("два"); break;
            case 3: System.out.println("три"); break;
        }
    }
    
    // перечисление для примера
    enum Size {
        SMALL, MEDIUM, LARGE
    }
}
