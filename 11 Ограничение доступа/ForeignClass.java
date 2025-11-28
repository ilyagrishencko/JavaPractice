package other;

import animals.Animal;

public class ForeignClass {
    public void demonstrateAccess() {
        Animal animal = new Animal();
        System.out.println("=== Доступ из другого пакета (не подкласс) ===");
        
        // public - доступно
        System.out.println("publicName: " + animal.publicName);
        
        // protected - НЕ доступно (не подкласс и не тот же пакет)
        // System.out.println(animal.protectedSpecies); // Ошибка компиляции
        
        // default - НЕ доступно (другой пакет)
        // System.out.println(animal.defaultColor); // Ошибка компиляции
        
        // private - НЕ доступно
        // System.out.println(animal.privateId); // Ошибка компиляции
        
        // Методы:
        animal.publicMakeSound();     // public - доступно
        // animal.protectedSleep();    // protected - НЕ доступно
        // animal.defaultEat();        // default - НЕ доступно
        // animal.privateMethod();     // private - НЕ доступно
    }
}
