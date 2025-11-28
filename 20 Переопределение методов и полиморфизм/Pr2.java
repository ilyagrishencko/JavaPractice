/*Практика #2
Приведите пример переопределенного метода. 

Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?
Ответ: Если при переопределении метода тип возвращаемого значения не совместим с типом в родительском классе, 
компилятор Java выдаст ошибку и программа не будет скомпилирована.

Почему это происходит:
Компилятор Java строго следит за соблюдением правила совместимости возвращаемых типов. Допустимы только два варианта:
Полное совпадение типов - идентичные возвращаемые типы
Ковариантность - возвращаемый тип в дочернем классе является подтипом исходного типа
 */

// Базовый класс
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Метод, который будет переопределен в подклассе
    public void makeSound() {
        System.out.println(name + " издает звук");
    }

    public void move() {
        System.out.println(name + " двигается");
    }
}

// Подкласс
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }

    // Переопределение метода move()
    @Override
    public void move() {
        System.out.println(name + " бегает на четырех лапах");
    }
}

// Еще один подкласс
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound() {
        System.out.println(name + " поет: Чик-чирик!");
    }

    // Переопределение метода move()
    @Override
    public void move() {
        System.out.println(name + " летает");
    }
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        // Создаем объекты разных классов
        Animal animal = new Animal("Неизвестное животное");
        Dog dog = new Dog("Бобик");
        Bird bird = new Bird("Кеша");

        // Демонстрация переопределенных методов
        System.out.println("Демонстрация переопределенных методов\n");

        animal.makeSound();
        animal.move();

        System.out.println();

        dog.makeSound();
        dog.move();

        System.out.println();

        bird.makeSound();
        bird.move();

        // Демонстрация полиморфизма
        System.out.println("\nПолиморфизм");
        Animal[] animals = {animal, dog, bird};

        for (Animal a : animals) {
            a.makeSound();  // Вызывается переопределенная версия для каждого объекта
            a.move();       // Вызывается переопределенная версия для каждого объекта
        }
    }
}
