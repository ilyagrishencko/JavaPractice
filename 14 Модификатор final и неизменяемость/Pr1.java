/*
Практика #1
Как можно проинициализировать константу, которая объявлена следующим образом? Приведите все возможные варианты.

public class A {
    public final int a;
}
*/
public class A {
    public final int a;

    // Вариант 1: Инициализация в конструкторе
    public A() {
        this.a = 10;
    }

    // Вариант 2: Инициализация в конструкторе с параметром
    public A(int value) {
        this.a = value;
    }

    // Вариант 3: Инициализация в блоке инициализации
    {
        // a = 20; // Раскомментировать, если не инициализировано в конструкторе
    }
}

// Альтернативные варианты в других классах:

// Вариант 4: Инициализация при объявлении
class B {
    public final int a = 30;
}

// Вариант 5: Инициализация в нескольких конструкторах
class C {
    public final int a;

    public C() {
        this.a = 40;
    }

    public C(int value) {
        this.a = value;
    }

    public C(String str) {
        this.a = str.length();
    }
}

// Вариант 6: Использование методов для инициализации
class D {
    public final int a;

    public D() {
        this.a = calculateInitialValue();
    }

    private int calculateInitialValue() {
        return 50;
    }
}

// Вариант 7: Инициализация на основе условий
class E {
    public final int a;

    public E(boolean flag) {
        if (flag) {
            this.a = 60;
        } else {
            this.a = 70;
        }
    }
}

// Главный класс для демонстрации
public class FinalFieldInitialization {
    public static void main(String[] args) {
        // Демонстрация всех вариантов
        A obj1 = new A(); // a = 10
        A obj2 = new A(15); // a = 15
        
        B obj3 = new B(); // a = 30
        
        C obj4 = new C(); // a = 40
        C obj5 = new C(45); // a = 45
        C obj6 = new C("hello"); // a = 5
        
        D obj7 = new D(); // a = 50
        
        E obj8 = new E(true); // a = 60
        E obj9 = new E(false); // a = 70

        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
        System.out.println("obj3.a = " + obj3.a);
        System.out.println("obj4.a = " + obj4.a);
        System.out.println("obj5.a = " + obj5.a);
        System.out.println("obj6.a = " + obj6.a);
        System.out.println("obj7.a = " + obj7.a);
        System.out.println("obj8.a = " + obj8.a);
        System.out.println("obj9.a = " + obj9.a);
    }
}
