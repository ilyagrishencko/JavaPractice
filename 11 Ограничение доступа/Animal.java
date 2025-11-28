package animals;

public class Animal {
    // public - доступен всем
    public String publicName = "Животное";
    
    // protected - доступен в том же пакете и подклассам
    protected String protectedSpecies = "Млекопитающее";
    
    // default (package-private) - доступен только в том же пакете
    String defaultColor = "Серый";
    
    // private - доступен только внутри класса
    private String privateId = "ID123";
    
    // public метод - доступен везде
    public void publicMakeSound() {
        System.out.println("Животное издает звук");
        // private метод доступен внутри класса
        privateMethod();
    }
    
    // protected метод
    protected void protectedSleep() {
        System.out.println("Животное спит");
    }
    
    // default метод
    void defaultEat() {
        System.out.println("Животное ест");
    }
    
    // private метод
    private void privateMethod() {
        System.out.println("Это приватный метод");
    }
    
    // public метод для доступа к private полю (инкапсуляция)
    public String getPrivateId() {
        return privateId;
    }
}
