package animals;

public class Animal {
    // Поле с доступом по умолчанию (без спецификатора)
    String name = "Животное";
    
    // Метод с доступом по умолчанию
    void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    public void testDefaultAccess() {
        // Внутри пакета можем создавать и использовать класс с доступом по умолчанию
        DefaultAccessClass defaultObj = new DefaultAccessClass();
        System.out.println(defaultObj.defaultField);
        defaultObj.defaultMethod();
        
        // И использовать другие классы с доступом по умолчанию
        Animal anotherAnimal = new Animal();
        System.out.println(anotherAnimal.name); // Доступно - тот же пакет
        anotherAnimal.makeSound(); // Доступно - тот же пакет
    }
}
