package other;

import animals.Animal;

public class ForeignAnimal extends Animal {
    public void demonstrateAccess() {
        System.out.println("=== Доступ из подкласса в другом пакете ===");
        
        // public - доступно
        System.out.println("publicName: " + publicName);
        
        // protected - доступно (подкласс)
        System.out.println("protectedSpecies: " + protectedSpecies);
        
        // default - НЕ доступно (другой пакет)
        // System.out.println(defaultColor); // Ошибка компиляции
        
        // private - НЕ доступно
        // System.out.println(privateId); // Ошибка компиляции
        
        // Методы:
        publicMakeSound();     // public - доступно
        protectedSleep();      // protected - доступно
        // defaultEat();       // default - НЕ доступно
        // privateMethod();    // private - НЕ доступно
    }
}
