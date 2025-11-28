/*
Практика #1
Приведите пример кода, демонстрирующего все три варианта использования ключевого слова super.
 */

// Суперкласс
class Animal {
    protected String name;
    protected int age;

    // Конструктор суперкласса
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод суперкласса
    public void makeSound() {
        System.out.println(name + " издает звук");
    }

    public void displayInfo() {
        System.out.println("Животное: " + name + ", возраст: " + age + " лет");
    }

    protected String getSpecies() {
        return "Неизвестный вид";
    }
}

// Подкласс
class Dog extends Animal {
    private String breed;

    // 1. Использование super для вызова конструктора суперкласса
    public Dog(String name, int age, String breed) {
        super(name, age); // Вызов конструктора родительского класса
        this.breed = breed;
    }

    // Переопределение метода
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }

    public void showFullInfo() {
        // 2. Использование super для доступа к методу суперкласса
        super.displayInfo(); // Вызов метода родительского класса

        // 3. Использование super для доступа к полю суперкласса
        System.out.println("Порода: " + breed);
        System.out.println("Вид: " + super.getSpecies()); // Вызов метода родительского класса
    }

    // Демонстрация разницы между вызовом с super и без
    public void demonstrateSuper() {
        System.out.println("\nДемонстрация super vs this");

        // Вызов переопределенного метода (текущего класса)
        makeSound();

        // Вызов метода суперкласса с помощью super
        super.makeSound();

        // Обращение к полю суперкласса
        System.out.println("Имя из суперкласса: " + super.name);
    }
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация ключевого слова super\n");

        // Создаем объект Dog
        Dog dog = new Dog("Бобик", 3, "Овчарка");

        // Демонстрация работы с Dog
        dog.showFullInfo();
        dog.demonstrateSuper();

        System.out.println("\nВсе три способа использования super:");
        System.out.println("1. super() - вызов конструктора суперкласса");
        System.out.println("2. super.поле - доступ к полю суперкласса");
        System.out.println("3. super.метод() - вызов метода суперкласса");
    }
}
