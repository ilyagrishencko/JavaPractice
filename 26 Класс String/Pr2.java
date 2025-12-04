import java.util.StringJoiner;

/*
Практика #2
Приведите примеры использования класса StringJoiner.
 */
public class Main {
    public static void main(String[] args) {      
        // Пример 1: Простое объединение с разделителем
        System.out.println("1. Простое объединение с разделителем:");
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println("   Результат: " + joiner1.toString());
        
        // Пример 2: С префиксом и суффиксом
        System.out.println("\n2. С префиксом и суффиксом:");
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Москва");
        joiner2.add("Санкт-Петербург");
        joiner2.add("Новосибирск");
        System.out.println("   Результат: " + joiner2.toString());
        
        // Пример 3: Пустой StringJoiner с значением по умолчанию
        System.out.println("\n3. Пустой StringJoiner с setEmptyValue:");
        StringJoiner joiner3 = new StringJoiner("; ");
        joiner3.setEmptyValue("Список пуст");
        System.out.println("   Пустой: " + joiner3.toString());
        joiner3.add("Первый элемент");
        System.out.println("   После добавления: " + joiner3.toString());
        
        // Пример 4: Объединение двух StringJoiner
        System.out.println("\n4. Объединение двух StringJoiner:");
        StringJoiner fruits = new StringJoiner(", ");
        fruits.add("Яблоко");
        fruits.add("Груша");
        
        StringJoiner vegetables = new StringJoiner(", ");
        vegetables.add("Морковь");
        vegetables.add("Картофель");
        
        StringJoiner allProducts = fruits.merge(vegetables);
        System.out.println("   Все продукты: " + allProducts.toString());
    }
}
