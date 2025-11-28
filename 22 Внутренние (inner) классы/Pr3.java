/*
Практика #3
Имеет ли внешний класс доступ к полям и методам внутреннего класса?
Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.

Внешний класс имеет доступ к членам внутреннего класса. Внешний класс может обращаться к:
  - public членам внутреннего класса напрямую
  - protected и package-private членам, если находится в том же пакете
  - private членам только через public/protected методы
 */
 class OuterClass {
    private String outerField = "Поле внешнего класса";

    /**
     * private внутренний класс - доступен только внутри OuterClass
     */
    private class PrivateInnerClass {
        private String privateInnerField = "private поле внутреннего класса";
        protected String protectedInnerField = "protected поле внутреннего класса";
        String packageInnerField = "package-private поле внутреннего класса";
        public String publicInnerField = "public поле внутреннего класса";

        private void privateInnerMethod() {
            System.out.println("private метод внутреннего класса");
        }

        protected void protectedInnerMethod() {
            System.out.println("protected метод внутреннего класса");
        }

        void packageInnerMethod() {
            System.out.println("package-private метод внутреннего класса");
        }

        public void publicInnerMethod() {
            System.out.println("public метод внутреннего класса");
        }
    }

    /**
     * public внутренний класс
     */
    public class PublicInnerClass {
        private String privateField = "private поле public внутреннего класса";
        public String publicField = "public поле public внутреннего класса";

        private void privateMethod() {
            System.out.println("private метод public внутреннего класса");
        }

        public void publicMethod() {
            System.out.println("public метод public внутреннего класса");
        }
    }

    /**
     * Метод внешнего класса, демонстрирующий доступ к private внутреннему классу
     */
    public void accessPrivateInnerClass() {
        System.out.println("Доступ из внешнего класса к PRIVATE внутреннему классу");

        // Создаем экземпляр private внутреннего класса
        PrivateInnerClass privateInner = new PrivateInnerClass();

        // Внешний класс имеет доступ ко ВСЕМ полям private внутреннего класса
        System.out.println("Доступ к полям:");
        System.out.println("  private поле: " + privateInner.privateInnerField);
        System.out.println("  protected поле: " + privateInner.protectedInnerField);
        System.out.println("  package-private поле: " + privateInner.packageInnerField);
        System.out.println("  public поле: " + privateInner.publicInnerField);

        // Внешний класс имеет доступ ко ВСЕМ методам private внутреннего класса
        System.out.println("Доступ к методам:");
        privateInner.privateInnerMethod();
        privateInner.protectedInnerMethod();
        privateInner.packageInnerMethod();
        privateInner.publicInnerMethod();

        // Можем даже модифицировать private поля
        privateInner.privateInnerField = "изменено из внешнего класса";
        System.out.println("После модификации: " + privateInner.privateInnerField);
    }

    /**
     * Метод внешнего класса, демонстрирующий доступ к public внутреннему классу
     */
    public void accessPublicInnerClass() {
        System.out.println("\nДоступ из внешнего класса к PUBLIC внутреннему классу");

        PublicInnerClass publicInner = new PublicInnerClass();

        // Внешний класс также имеет доступ ко ВСЕМ полям public внутреннего класса
        System.out.println("Доступ к полям:");
        System.out.println("  private поле: " + publicInner.privateField);
        System.out.println("  public поле: " + publicInner.publicField);

        // И ко ВСЕМ методам
        System.out.println("Доступ к методам:");
        publicInner.privateMethod();
        publicInner.publicMethod();
    }

    /**
     * Метод, возвращающий экземпляр внутреннего класса для внешнего использования
     */
    public PublicInnerClass getPublicInnerInstance() {
        return new PublicInnerClass();
    }

    /**
     * Метод, возвращающий данные из private внутреннего класса (инкапсуляция)
     */
    public String getDataFromPrivateInner() {
        PrivateInnerClass privateInner = new PrivateInnerClass();
        return privateInner.privateInnerField; // Доступ к private полю внутреннего класса
    }
}

/**
 * Другой класс в том же пакете - демонстрация ограниченного доступа
 */
class SamePackageClass {
    public void testAccess() {
        OuterClass outer = new OuterClass();

        System.out.println("Доступ из другого класса в том же пакете");

        // Можем создать public внутренний класс
        OuterClass.PublicInnerClass publicInner = outer.new PublicInnerClass();

        // Но имеем доступ только к public членам
        System.out.println("public поле: " + publicInner.publicField);
        publicInner.publicMethod();

        // private члены НЕ доступны
        // System.out.println(publicInner.privateField); // Ошибка!
        // publicInner.privateMethod(); // Ошибка!

        // PrivateInnerClass вообще не виден здесь
        // OuterClass.PrivateInnerClass privateInner = outer.new PrivateInnerClass(); // Ошибка!
    }
}

/**
 * Подкласс OuterClass
 */
class SubClass extends OuterClass {
    public void testProtectedAccess() {
        System.out.println("Доступ из подкласса");

        // Подкласс не имеет прямого доступа к private внутреннему классу
        // PrivateInnerClass privateInner = new PrivateInnerClass(); // Ошибка!

        // Но может использовать public внутренний класс
        PublicInnerClass publicInner = new PublicInnerClass();
        System.out.println("public поле: " + publicInner.publicField);
        publicInner.publicMethod();

        // private члены все равно не доступны
        // System.out.println(publicInner.privateField); // Ошибка!
    }
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Демонстрация доступа внешнего класса к своим внутренним классам
        outer.accessPrivateInnerClass();
        outer.accessPublicInnerClass();

        System.out.println("\nДоступ через публичные методы");
        System.out.println("Данные из private внутреннего класса: " + outer.getDataFromPrivateInner());

        OuterClass.PublicInnerClass publicInner = outer.getPublicInnerInstance();
        publicInner.publicMethod();

        // Демонстрация ограниченного доступа из других классов
        SamePackageClass samePkg = new SamePackageClass();
        samePkg.testAccess();

        SubClass sub = new SubClass();
        sub.testProtectedAccess();

        System.out.println("\nСводка правил доступа");
        System.out.println("Внешний класс → внутренний класс: ПОЛНЫЙ доступ (даже к private)");
        System.out.println("Другие классы → внутренний класс: зависит от спецификатора внутреннего класса");
        System.out.println("Другие классы → члены внутреннего класса: зависит от спецификаторов членов");
    }
}
