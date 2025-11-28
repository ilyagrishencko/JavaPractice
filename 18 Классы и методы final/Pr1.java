/*
Практика #1
Приведите пример кода, демонстрирующего невозможность переопределять в подклассе final-метод суперкласса.
 */

// Базовый класс с final методом
class SuperClass {
    // Обычный метод, который можно переопределить
    public void normalMethod() {
        System.out.println("Обычный метод в суперклассе");
    }

    // Final метод - нельзя переопределить в подклассах
    public final void finalMethod() {
        System.out.println("Final метод в суперклассе - этот метод нельзя переопределить");
    }

    // Еще один final метод
    public final String getConstantValue() {
        return "Константное значение";
    }
}

// Подкласс, пытающийся переопределить final метод
class SubClass extends SuperClass {

    // Этот метод можно переопределить - нормально
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный обычный метод в подклассе");
    }

    // Нельзя переопределить final метод
    /*
    @Override
    public void finalMethod() {
        System.out.println("Попытка переопределить final метод");
    }
    */

    // Это тоже вызовет ошибку компиляции
    /*
    @Override
    public String getConstantValue() {
        return "Новое значение";
    }
    */
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация final методов ===\n");

        // Создаем объекты
        SuperClass superObj = new SuperClass();
        SubClass subObj = new SubClass();

        // Демонстрация работы методов
        System.out.println("1. Работа с обычными методами:");
        superObj.normalMethod();  // Метод суперкласса
        subObj.normalMethod();    // Переопределенный метод

        System.out.println("\n2. Работа с final методами:");
        superObj.finalMethod();   // Final метод суперкласса
        subObj.finalMethod();     // Тот же final метод (не переопределен)

    }
}
