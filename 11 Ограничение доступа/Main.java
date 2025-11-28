public class Main {
    public static void main(String[] args) {
        System.out.println("ДЕМОНСТРАЦИЯ СПЕЦИФИКАТОРОВ ДОСТУПА\n");
        
        // Тестирование из того же пакета
        animals.Dog dog = new animals.Dog();
        dog.demonstrateAccess();
        
        System.out.println();
        
        animals.Cat cat = new animals.Cat();
        cat.demonstrateAccess();
        
        System.out.println();
        
        // Тестирование из другого пакета (подкласс)
        other.ForeignAnimal foreignAnimal = new other.ForeignAnimal();
        foreignAnimal.demonstrateAccess();
        
        System.out.println();
        
        // Тестирование из другого пакета (не подкласс)
        other.ForeignClass foreignClass = new other.ForeignClass();
        foreignClass.demonstrateAccess();
        
        System.out.println();
        
        // Демонстрация инкапсуляции
        animals.Animal animal = new animals.Animal();
        System.out.println("ИНКАПСУЛЯЦИЯ");
        // Прямой доступ к private полю невозможен:
        // System.out.println(animal.privateId); // Ошибка компиляции
        
        // Но доступ через public метод возможен:
        System.out.println("ID через геттер: " + animal.getPrivateId());
    }
}
