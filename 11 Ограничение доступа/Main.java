import animals.Animal;
// import animals.DefaultAccessClass; // ОШИБКА! Класс с default доступом не виден из другого пакета

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДОСТУП ПО УМОЛЧАНИЮ (БЕЗ СПЕЦИФИКАТОРА) ===\n");
        
        Animal animal = new Animal();
        
        // Public доступ - работает
        animal.publicMakeSound();
        
        // Default доступ - НЕ РАБОТАЕТ из другого пакета
        // System.out.println(animal.name); // Ошибка компиляции
        // animal.makeSound(); // Ошибка компиляции
        
        // Protected доступ - не доступен из не-подкласса в другом пакете
        // System.out.println(animal.protectedSpecies); // Ошибка компиляции
        
        System.out.println("\n=== ПРОВЕРКА ДОСТУПА ИЗ РАЗНЫХ КЛАССОВ ===");
        
        // Создаем объекты для тестирования
        animals.Dog dog = new animals.Dog();
        dog.testAccess();
        
        System.out.println("\n=== ЧТО МОЖНО И НЕЛЬЗЯ С DEFAULT ДОСТУПОМ ===");
        System.out.println("✓ Виден в том же пакете");
        System.out.println("✗ Не виден в других пакетах");
        System.out.println("✗ Не наследуется подклассами в других пакетах");
        System.out.println("✓ Наследуется подклассами в том же пакете");
    }
}
