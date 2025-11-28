/*
Практика #1
Приведите примеры использования перегрузки и переопределения методов.
 */

// Базовый класс
class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // Перегрузка методов
    public void makeSound() {
        System.out.println(name + " издает звук");
    }
    
    public void makeSound(String sound) {
        System.out.println(name + " издает звук: " + sound);
    }
    
    public void makeSound(String sound, int volume) {
        System.out.println(name + " издает звук: " + sound + " (громкость: " + volume + ")");
    }
    
    // Методы для переопределения
    public void move() {
        System.out.println(name + " двигается");
    }
    
    public String getInfo() {
        return "Животное: " + name;
    }
}

// Подкласс с переопределением
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    // Переопределение методов
    @Override
    public void move() {
        System.out.println(getName() + " бегает на четырех лапах");
    }
    
    @Override
    public String getInfo() {
        return "Собака: " + getName();
    }
    
    // Перегрузка в подклассе
    public void makeSound(boolean isHappy) {
        if (isHappy) {
            System.out.println(getName() + " весело гавкает");
        } else {
            System.out.println(getName() + " грустно скулит");
        }
    }
}

// Другой подкласс
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    
    @Override
    public void move() {
        System.out.println(getName() + " летает");
    }
    
    @Override
    public String getInfo() {
        return "Птица: " + getName();
    }
}

// Главный класс
public class MethodExamples {
    public static void main(String[] args) {
        // Создаем объекты
        Animal animal = new Animal("Неизвестное животное");
        Dog dog = new Dog("Бобик");
        Bird bird = new Bird("Кеша");
        
        System.out.println("Демонстрация перегрузки методов:");
        animal.makeSound();
        animal.makeSound("Рррр");
        animal.makeSound("Гав", 5);
        dog.makeSound(true);
        
        System.out.println("\nДемонстрация переопределения методов:");
        animal.move();
        dog.move();
        bird.move();
        
        System.out.println("\nИнформация о животных:");
        System.out.println(animal.getInfo());
        System.out.println(dog.getInfo());
        System.out.println(bird.getInfo());
        
        System.out.println("\nПолиморфизм:");
        Animal[] animals = {animal, dog, bird};
        for (Animal a : animals) {
            a.move();
        }
        
        System.out.println("\nVoid метод с return:");
        demonstrateReturn();
    }
    
    public static void demonstrateReturn() {
        System.out.println("Начало метода");
        for (int i = 1; i <= 3; i++) {
            if (i == 2) {
                System.out.println("Выход при i=2");
                return;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Конец метода"); // Не выполнится
    }
}
