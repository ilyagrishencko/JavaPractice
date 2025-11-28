/*
Практика #3
Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.

Аннотация @Override помогает обнаружить ошибки на этапе компиляции, когда:

  -Опечатка в имени метода — если метод не существует в родительском классе/интерфейсе

  -Несовпадение сигнатуры — неправильные параметры или возвращаемый тип

  -Изменение в родительском классе — когда переопределяемый метод был удален или изменен

  -Ошибки реализации интерфейса — если метод не соответствует контракту интерфейса
 */

// Базовый класс
class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void move(int speed) {
        System.out.println("Животное двигается со скоростью " + speed + " км/ч");
    }

    public String getName() {
        return "Неизвестное животное";
    }
}

// Подкласс с ОШИБКАМИ
class Dog extends Animal {
    // ПРАВИЛЬНО: аннотация @Override подтверждает переопределение
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    // ОШИБКА 1: опечатка в имени метода (move -> moove)
    // Аннотация @Override поможет обнаружить эту ошибку
    /*
    @Override
    public void moove(int speed) { // Ошибка компиляции: метод не переопределяет метод суперкласса
        System.out.println("Собака бежит");
    }
    */

    // ОШИБКА 2: неправильный тип параметра (int -> String)
    /*
    @Override
    public void move(String speed) { // Ошибка компиляции: сигнатура не совпадает
        System.out.println("Собака двигается");
    }
    */

    // ОШИБКА 3: неправильный возвращаемый тип (String -> void)
    /*
    @Override
    public void getName() { // Ошибка компиляции: возвращаемый тип не совпадает
        System.out.println("Собака");
    }
    */

    // ПРАВИЛЬНО: аннотация @Override подтверждает корректное переопределение
    @Override
    public String getName() {
        return "Собака";
    }
}/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Корректно работает
        dog.move(10);    // Используется метод суперкласса
        System.out.println("Имя: " + dog.getName());
    }
}
