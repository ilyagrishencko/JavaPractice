import java.util.*;

/*
Практика #2
Приведите примеры использования конструкций <? extends T> и <? super T>. Объясните, зачем они нужны?
 */

  /*
  PECS (Producer Extends, Consumer Super) принцип:
  - Если коллекция PRODUCER (производитель данных) - используем <? extends T>
  - Если коллекция CONSUMER (потребитель данных) - используем <? super T>
   */

public class Main {
    public static void main(String[] args) {
        // Создаем коллекции разных типов
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        List<Object> objects = new ArrayList<>();
        
        //<? extends Number> - чтение
        
        // <? extends Number> означает "любой тип, который является Number или его подклассом"
        // Такую коллекцию можно ЧИТАТЬ, но НЕЛЬЗЯ добавлять (кроме null)
        System.out.println("<? extends Number> - для чтения");
        
        // Мы можем передать List<Integer> или List<Double> в метод, ожидающий List<? extends Number>
        printNumbers(integers);  // Integer extends Number
        printNumbers(doubles);   // Double extends Number
        // addNumber(integers, 5); // Ошибка! Нельзя добавлять в <? extends Number>
        
        //<? super Integer> - запись
        
        // <? super Integer> означает "любой тип, который является Integer или его суперклассом"
        // Такую коллекцию можно ДОБАВЛЯТЬ, но сложно читать (только как Object)
        System.out.println("\n<? super Integer> - для записи");
        
        // Мы можем добавлять Integer в List<Number> или List<Object>
        addInteger(numbers, 10);  // Number super Integer
        addInteger(objects, 20);  // Object super Integer
        
        System.out.println("Numbers: " + numbers);
        System.out.println("Objects: " + objects);
    }
    
    /*
      <? extends Number> - используется когда нужно ЧИТАТЬ данные из коллекции
      Можно читать элементы как Number, но НЕЛЬЗЯ добавлять новые (кроме null)
      Принимает: List<Integer>, List<Double>, List<Number> и т.д.
     */
    public static void printNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();  // Можем вызывать методы Number
            System.out.println("Число: " + number);
        }
        System.out.println("Сумма: " + sum);
        
        // numbers.add(5); // ОШИБКА КОМПИЛЯЦИИ! Нельзя добавлять
        // numbers.add(new Integer(5)); // Тоже ошибка!
    }
    
    /*
      <? super Integer> - используется когда нужно ЗАПИСЫВАТЬ данные в коллекцию
      Можно добавлять Integer и его подклассы, но читать можно только как Object
      Принимает: List<Integer>, List<Number>, List<Object>
     */
    public static void addInteger(List<? super Integer> list, Integer value) {
        list.add(value);  // Можем добавлять Integer
        // list.add(new Object()); // ОШИБКА! Нельзя добавлять произвольные объекты
        
        // Чтение возможно только как Object
        Object obj = list.get(0);
        System.out.println("Прочитали как Object: " + obj);
        
        // Integer i = list.get(0); // ОШИБКА! Не знаем точный тип
    }
}
