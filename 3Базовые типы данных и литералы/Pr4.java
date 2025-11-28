/*
Практика #4
Приведите пример использования перегруженного оператора + 
с объектами типа String и переменными принадлежащим другим типам (объектам и базовым типам).
 */

/*
  Класс для демонстрации конкатенации с объектами
 */
class Person {
    private String name;
    private int age;
    
    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /*
      Метод toString() автоматически вызывается при конкатенации
      объекта Person со строкой
     */
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
}


public class Main {
    public static void main(String[] args) {
        // Базовая строка для конкатенации
        String str = "Результат: ";
        
        //Конкатенация с базовыми типами данных.
        
        // int автоматически преобразуется в строку
        int number = 10;
        String result1 = str + number;  // "Результат: " + "10"
        System.out.println("Конкатенация с int: " + result1);
        
        // double автоматически преобразуется в строку
        double pi = 3.14;
        String result2 = str + pi;      // "Результат: " + "3.14"
        System.out.println("Конкатенация с double: " + result2);
        
        // boolean автоматически преобразуется в строку
        boolean flag = true;
        String result3 = str + flag;    // "Результат: " + "true"
        System.out.println("Конкатенация с boolean: " + result3);
        
        // char автоматически преобразуется в строку
        char symbol = 'A';
        String result4 = str + symbol;  // "Результат: " + "A"
        System.out.println("Конкатенация с char: " + result4);
        
        // Конкатенация с объектами
        
        // Объект Person - будет вызван его метод toString()
        Person person = new Person("Иван", 25);
        String result5 = str + person;  // "Результат: " + person.toString()
        System.out.println("Конкатенация с объектом: " + result5);
        
        //  Демонстрация порядка выполнения
        
        int a = 2, b = 3;
        
        // Операции выполняются слева направо
        // Сначала "Сумма: " + a = "Сумма: 2", затем + b = "Сумма: 23"
        System.out.println("Сумма: " + a + b);   // Результат: "Сумма: 23"
        
        // Скобки меняют приоритет - сначала a+b, затем конкатенация
        System.out.println("Сумма: " + (a + b)); // Результат: "Сумма: 5"
        
        // Сначала вычисляется a+b, затем конкатенация
        System.out.println(a + b + " это сумма"); // Результат: "5 это сумма"
        
        // Конкатенация с NULL
        
        String nullString = null;
        // null безопасно преобразуется в строку "null"
        System.out.println("Null значение: " + nullString);
        
        // Многократная конкатенация
        
        System.out.println("\n--- Множественная конкатенация ---");
        
        String complexResult = "Числа: " + a + ", " + b + ", сумма: " + (a + b);
        System.out.println(complexResult);
    }
}
