package animals;

public class Dog {
    public void testAccess() {
        // Доступ к классу с default доступом из того же пакета
        DefaultAccessClass defaultObj = new DefaultAccessClass();
        System.out.println("Из того же пакета: " + defaultObj.defaultField);
        defaultObj.defaultMethod();
        
        // Доступ к default полям и методам Animal из того же пакета
        Animal animal = new Animal();
        System.out.println("Имя животного: " + animal.name);
        animal.makeSound();
    }
}
