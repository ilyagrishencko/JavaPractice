/*
Практика #2
Имеет ли внутренний класс доступ к полям и методам внешнего класса?
Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.

  -private внутренний класс
Доступен только внутри внешнего класса
Не виден даже подклассам и классам в том же пакете

  -protected внутренний класс
Доступен в том же пакете + подклассы (даже в других пакетах)

  -package-private (без спецификатора) внутренний класс
Доступен только в том же пакете
Не виден подклассам в других пакетах

  -public внутренний класс
Доступен везде

Особенности доступа:
Внутренние классы имеют доступ ко всем полям внешнего класса (даже private)
Внешний код может создавать экземпляры внутренних классов только если они видны
Спецификаторы работают так же, как и для обычных классов
  - public: класс доступен из любого другого класса
  - private: класс доступен только внутри внешнего класса
  - protected: класс доступен внутри пакета и для классов-наследников
  - (по умолчанию): класс доступен только внутри пакета
 */
class OuterClass {
    // Поля с разными спецификаторами доступа
    private String privateField = "private поле";
    protected String protectedField = "protected поле";
    String packagePrivateField = "package-private поле";
    public String publicField = "public поле";

    // Методы с разными спецификаторами доступа
    private void privateMethod() {
        System.out.println("private метод внешнего класса");
    }

    protected void protectedMethod() {
        System.out.println("protected метод внешнего класса");
    }

    void packagePrivateMethod() {
        System.out.println("package-private метод внешнего класса");
    }

    public void publicMethod() {
        System.out.println("public метод внешнего класса");
    }

    /**
     * Внутренний класс - имеет доступ ко ВСЕМ полям и методам внешнего класса
     * независимо от их спецификаторов доступа
     */
    public class InnerClass {
        public void demonstrateAccess() {
            System.out.println("Внутренний класс имеет доступ ко всем полям и методам внешнего класса");

            // Доступ ко всем полям внешнего класса
            System.out.println("Доступ к полям:");
            System.out.println("  privateField: " + privateField);
            System.out.println("  protectedField: " + protectedField);
            System.out.println("  packagePrivateField: " + packagePrivateField);
            System.out.println("  publicField: " + publicField);

            System.out.println("\nДоступ к методам:");
            // Вызов всех методов внешнего класса
            privateMethod();
            protectedMethod();
            packagePrivateMethod();
            publicMethod();

            // Также доступны даже private поля других объектов того же внешнего класса
            OuterClass anotherOuter = new OuterClass();
            System.out.println("\nДоступ к private полю другого объекта OuterClass: " + anotherOuter.privateField);
        }

        public void modifyOuterFields() {
            System.out.println("\nМодификация полей внешнего класса из внутреннего класса");
            privateField = "изменено из внутреннего класса";
            protectedField = "тоже изменено";
            System.out.println("Поля внешнего класса изменены!");
        }
    }

    /**
     * Статический вложенный класс - не имеет автоматического доступа к не-static полям и методам
     */
    public static class StaticNestedClass {
        public void demonstrateAccess(OuterClass outer) {
            System.out.println("Статический вложенный класс");

            // Не имеет прямого доступа к полям внешнего класса
            // System.out.println(privateField); // Ошибка!

            // Должен использовать ссылку на объект внешнего класса
            System.out.println("Доступ через ссылку:");
            System.out.println("  publicField: " + outer.publicField);
            System.out.println("  protectedField: " + outer.protectedField);

            // Но не может получить доступ к private полям даже через ссылку
            // System.out.println(outer.privateField); // Ошибка!
        }
    }

    // Метод для демонстрации
    public void showFields() {
        System.out.println("\nТекущие значения полей внешнего класса:");
        System.out.println("  privateField: " + privateField);
        System.out.println("  protectedField: " + protectedField);
        System.out.println("  packagePrivateField: " + packagePrivateField);
        System.out.println("  publicField: " + publicField);
    }
}

/**
 * Подкласс OuterClass для демонстрации protected доступа
 */
class SubClass extends OuterClass {
    public void testAccess() {
        System.out.println("Доступ из подкласса");

        // Подкласс имеет доступ к protected и public полям/методам
        System.out.println("protectedField: " + protectedField);
        System.out.println("publicField: " + publicField);

        protectedMethod();
        publicMethod();

        // Но не имеет доступа к private и package-private (если в другом пакете)
        // System.out.println(privateField); // Ошибка!
        // privateMethod(); // Ошибка!
    }
}

/**
 * Класс в том же пакете
 */
class SamePackageClass {
    public void testAccess() {
        OuterClass outer = new OuterClass();
        System.out.println("Доступ из класса в том же пакете");

        // Имеет доступ к protected, package-private и public
        System.out.println("protectedField: " + outer.protectedField);
        System.out.println("packagePrivateField: " + outer.packagePrivateField);
        System.out.println("publicField: " + outer.publicField);

        outer.protectedMethod();
        outer.packagePrivateMethod();
        outer.publicMethod();

        // Не имеет доступа к private
        // System.out.println(outer.privateField); // Ошибка!
        // outer.privateMethod(); // Ошибка!
    }
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        System.out.println("Начальные значения:");
        outer.showFields();

        // Создаем внутренний класс
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Демонстрация доступа из внутреннего класса
        inner.demonstrateAccess();

        // Модификация полей внешнего класса через внутренний класс
        inner.modifyOuterFields();

        System.out.println("\nПосле модификации из внутреннего класса:");
        outer.showFields();

        // Демонстрация статического вложенного класса
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.demonstrateAccess(outer);

        // Демонстрация доступа из подкласса
        SubClass sub = new SubClass();
        sub.testAccess();

        // Демонстрация доступа из класса в том же пакете
        SamePackageClass samePkg = new SamePackageClass();
        samePkg.testAccess();
    }
}
