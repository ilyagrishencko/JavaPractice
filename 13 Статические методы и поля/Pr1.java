/*
Практика #1
Приведите все варианты вызова метода printVars()

public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
*/
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    // Вариант 1: вызов из того же класса напрямую
    public void method1() {
        printVars();
    }

    // Вариант 2: вызов через имя класса
    public void method2() {
        A.printVars();
    }

    // Вариант 3: вызов через объект этого класса
    public void method3() {
        A obj = new A();
        obj.printVars();
    }

    // Вариант 4: вызов через this
    public void method4() {
        this.printVars();
    }
}

// Другой класс
class B {
    public void callFromOtherClass() {
        // Вариант 5: вызов через имя класса из другого класса
        A.printVars();
        
        // Вариант 6: вызов через объект из другого класса
        A obj = new A();
        obj.printVars();
    }
}

// Главный класс для демонстрации
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        
        // Демонстрация всех вариантов вызова
        System.out.println("1. Вызов через объект:");
        obj.printVars();
        
        System.out.println("\n2. Вызов через имя класса:");
        A.printVars();
        
        System.out.println("\n3. Вызов из методов того же класса:");
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        
        System.out.println("\n4. Вызов из другого класса:");
        B b = new B();
        b.callFromOtherClass();
    }
}
