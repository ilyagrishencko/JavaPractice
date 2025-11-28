/*
Практика #2
Приведите пример кода, демонстрирующего невозможность использовать наследование для final-класса.
 */

// Final класс - нельзя наследовать
final class FinalClass {
    private String data;

    public FinalClass(String data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Data: " + data);
    }

    public String getData() {
        return data;
    }
}

// Еще один final класс
final class MathConstants {
    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

// Нельзя наследовать от final класса
/*
class ExtendedClass extends FinalClass {
    public ExtendedClass(String data) {
        super(data);
    }

    // Нельзя переопределить методы final класса
}
*/

/*
class CustomMath extends MathConstants {
    // Нельзя наследовать от final класса
}
*/

// Можно создать обычный (не final) класс для сравнения
class NormalClass {
    protected String value;

    public NormalClass(String value) {
        this.value = value;
    }

    public void showValue() {
        System.out.println("Value: " + value);
    }
}

// От обычного класса можно наследовать
class ExtendedNormalClass extends NormalClass {
    public ExtendedNormalClass(String value) {
        super(value);
    }

    @Override
    public void showValue() {
        System.out.println("Extended value: " + value.toUpperCase());
    }
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация final классов\n");

        // Создание объектов final классов - это разрешено
        FinalClass finalObj = new FinalClass("Hello World");
        finalObj.display();

        // Использование final класса со статическими методами
        System.out.println("\nМатематические константы:");
        System.out.println("PI = " + MathConstants.PI);
        System.out.println("E = " + MathConstants.E);
        System.out.println("Площадь круга радиусом 5: " + MathConstants.circleArea(5));

        // Демонстрация работы с обычными классами
        System.out.println("\nОбычные классы (можно наследовать)");
        NormalClass normal = new NormalClass("test");
        normal.showValue();

        ExtendedNormalClass extended = new ExtendedNormalClass("test");
        extended.showValue(); // Переопределенный метод
        
        //1. Final классы можно использовать, но нельзя наследовать
        //2. Все методы final класса неявно являются final
        //3. Попытка наследования вызовет ошибку компиляции
    }
}

// Дополнительный пример - стандартные final классы из Java
class StandardFinalClassesExample {
    // String - final класс в Java
    String str = "Hello";

    // Integer - final класс в Java
    Integer num = 42;

    // Math - final класс в Java
    double sin = Math.sin(45);

    // Все эти классы нельзя наследовать:
    /*
    class MyString extends String { } // Ошибка!
    class MyInteger extends Integer { } // Ошибка!
    class MyMath extends Math { } // Ошибка!
    */
}
