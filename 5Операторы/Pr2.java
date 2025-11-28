/*
 Практика #2
Приведите примеры использования оператора instanceof.
Отдельно рассмотрите случай, когда оператор применятся к null-объекту.
 */
public class Main {
    public static void main(String[] args) {
        // Примеры с наследованием
        
        // Создаем объекты разных типов
        Object obj = new Object();
        String str = "Hello World";
        Integer number = 42;
        
        // Проверки с Object (все объекты наследуются от Object)
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
        System.out.println("str instanceof Object: " + (str instanceof Object));
        System.out.println("number instanceof Object: " + (number instanceof Object));
        
        // Проверки конкретных типов
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("number instanceof Integer: " + (number instanceof Integer));
        System.out.println("number instanceof Number: " + (number instanceof Number)); // Integer наследует Number
        
        // Примеры с иерархией
        
        // Создаем объекты разных уровней иерархии
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animalDog = new Dog(); // Полиморфизм
        
        // Проверки для Animal
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
        
        // Проверки для Dog
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
        System.out.println("dog instanceof Object: " + (dog instanceof Object));
        
        // Проверки для Cat
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal));
        System.out.println("cat instanceof Cat: " + (cat instanceof Cat));
        
        // Полиморфный вызов
        System.out.println("animalDog instanceof Animal: " + (animalDog instanceof Animal));
        System.out.println("animalDog instanceof Dog: " + (animalDog instanceof Dog));
        System.out.println("animalDog instanceof Cat: " + (animalDog instanceof Cat));
        
        // Примеры с интерфейсами
        
        Swimmer swimmer = new Fish();
        Flyer bird = new Bird();
        
        System.out.println("swimmer instanceof Swimmer: " + (swimmer instanceof Swimmer));
        System.out.println("swimmer instanceof Animal: " + (swimmer instanceof Animal));
        System.out.println("swimmer instanceof Fish: " + (swimmer instanceof Fish));
        
        System.out.println("bird instanceof Flyer: " + (bird instanceof Flyer));
        System.out.println("bird instanceof Animal: " + (bird instanceof Animal));
        System.out.println("bird instanceof Bird: " + (bird instanceof Bird));
        
        // NULL
        
        String nullString = null;
        Integer nullInteger = null;
        Animal nullAnimal = null;
        
        // ВАЖНО: instanceof с null всегда возвращает false
        System.out.println("nullString instanceof String: " + (nullString instanceof String));
        System.out.println("nullInteger instanceof Integer: " + (nullInteger instanceof Integer));
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal));
        System.out.println("null instanceof Object: " + (null instanceof Object)); // Всегда false
    }
}

// ВСПОМОГАТЕЛЬНЫЕ КЛАССЫ

class Animal {
    public void eat() {
        System.out.println("Животное ест");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Гав-гав!");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Мяу!");
    }
}

// Интерфейсы
interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Fish extends Animal implements Swimmer {
    @Override
    public void swim() {
        System.out.println("Рыба плывет");
    }
}

class Bird extends Animal implements Flyer {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
