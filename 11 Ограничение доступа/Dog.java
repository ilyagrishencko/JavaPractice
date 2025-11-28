package animals;

public class Dog extends Animal {
    public void demonstrateAccess() {
        System.out.println("=== Доступ из подкласса в том же пакете ===");
        
        // public - доступно
        System.out.println("publicName: " + publicName);
        
        // protected - доступно (подкласс)
        System.out.println("protectedSpecies: " + protectedSpecies);
        
        // default - доступно (тот же пакет)
        System.out.println("defaultColor: " + defaultColor);
        
        // private - НЕ доступно
        // System.out.println(privateId); // Ошибка компиляции
        
        // Методы:
        publicMakeSound();     // public - доступно
        protectedSleep();      // protected - доступно
        defaultEat();          // default - доступно
        // privateMethod();    // private - НЕ доступно
    }
}
