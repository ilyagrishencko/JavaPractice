package animals;

public class Cat {
    public void demonstrateAccess() {
        Animal animal = new Animal();
        System.out.println("=== Доступ из класса в том же пакете ===");
        
        // public - доступно
        System.out.println("publicName: " + animal.publicName);
        
        // protected - доступно (тот же пакет)
        System.out.println("protectedSpecies: " + animal.protectedSpecies);
        
        // default - доступно (тот же пакет)
        System.out.println("defaultColor: " + animal.defaultColor);
        
        // private - НЕ доступно
        // System.out.println(animal.privateId); // Ошибка компиляции
        
        // Методы:
        animal.publicMakeSound();     // public - доступно
        animal.protectedSleep();      // protected - доступно
        animal.defaultEat();          // default - доступно
        // animal.privateMethod();    // private - НЕ доступно
    }
}
