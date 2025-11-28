/*
Практика #1
Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.
  - public: класс доступен из любого другого класса
  - private: класс доступен только внутри внешнего класса
  - protected: класс доступен внутри пакета и для классов-наследников
  - (по умолчанию): класс доступен только внутри пакета
 */
class OuterClass {
    private String outerPrivate = "private поле внешнего класса";
    protected String outerProtected = "protected поле внешнего класса";
    String outerPackagePrivate = "package-private поле внешнего класса";
    public String outerPublic = "public поле внешнего класса";

    // 1. private внутренний класс - доступен только внутри OuterClass
    private class PrivateInnerClass {
        public void display() {
            System.out.println("PrivateInnerClass имеет доступ ко всем полям OuterClass:");
            System.out.println("  " + outerPrivate);     // Доступно
            System.out.println("  " + outerProtected);   // Доступно
            System.out.println("  " + outerPackagePrivate); // Доступно
            System.out.println("  " + outerPublic);      // Доступно
        }
    }

    // 2. protected внутренний класс - доступен в пакете и подклассах
    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("ProtectedInnerClass также имеет доступ ко всем полям OuterClass");
        }
    }

    // 3. package-private (по умолчанию) внутренний класс - доступен только в пакете
    class PackagePrivateInnerClass {
        public void display() {
            System.out.println("PackagePrivateInnerClass имеет полный доступ к OuterClass");
        }
    }

    // 4. public внутренний класс - доступен всем
    public class PublicInnerClass {
        public void display() {
            System.out.println("PublicInnerClass может использовать все поля OuterClass");
        }
    }

    // Метод для демонстрации доступа к private внутреннему классу
    public void demonstratePrivateInner() {
        PrivateInnerClass privateInner = new PrivateInnerClass();
        privateInner.display();
    }

    // Создание объектов внутренних классов
    public void createInnerInstances() {
        PrivateInnerClass priv = new PrivateInnerClass();
        ProtectedInnerClass prot = new ProtectedInnerClass();
        PackagePrivateInnerClass pkg = new PackagePrivateInnerClass();
        PublicInnerClass pub = new PublicInnerClass();

        System.out.println("Все внутренние классы созданы успешно внутри OuterClass");
    }
}

/**
 * Подкласс OuterClass в том же пакете - демонстрация protected доступа
 */
class SubClass extends OuterClass {
    public void demonstrateProtectedInner() {
        // Можем создать protected внутренний класс, так как это подкласс
        ProtectedInnerClass protectedInner = new ProtectedInnerClass();
        protectedInner.display();

        // Также доступны package-private и public внутренние классы
        PackagePrivateInnerClass packageInner = new PackagePrivateInnerClass();
        PublicInnerClass publicInner = new PublicInnerClass();

        // PrivateInnerClass НЕ доступен здесь
        // PrivateInnerClass privateInner = new PrivateInnerClass(); // Ошибка!
    }
}

/**
 * Класс в том же пакете - демонстрация package-private доступа
 */
class SamePackageClass {
    public void demonstrateAccess() {
        OuterClass outer = new OuterClass();

        // Доступны public, protected и package-private внутренние классы
        OuterClass.ProtectedInnerClass protectedInner = outer.new ProtectedInnerClass();
        OuterClass.PackagePrivateInnerClass packageInner = outer.new PackagePrivateInnerClass();
        OuterClass.PublicInnerClass publicInner = outer.new PublicInnerClass();

        // PrivateInnerClass НЕ доступен здесь
        // OuterClass.PrivateInnerClass privateInner = outer.new PrivateInnerClass(); // Ошибка!
    }
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        System.out.println("Демонстрация из того же класса");
        outer.demonstratePrivateInner();
        outer.createInnerInstances();

        System.out.println("\nДемонстрация public внутреннего класса");
        OuterClass.PublicInnerClass publicInner = outer.new PublicInnerClass();
        publicInner.display();

        System.out.println("\nДемонстрация из подкласса");
        SubClass sub = new SubClass();
        sub.demonstrateProtectedInner();

        System.out.println("\nДемонстрация из класса в том же пакете");
        SamePackageClass samePkg = new SamePackageClass();
        samePkg.demonstrateAccess();

        System.out.println("\nСводка поведения спецификаторов доступа");
        System.out.println("private:     доступен только внутри внешнего класса");
        System.out.println("protected:   доступен в пакете + подклассы (даже в других пакетах)");
        System.out.println("package:     доступен только в том же пакете");
        System.out.println("public:      доступен везде");
    }
}
