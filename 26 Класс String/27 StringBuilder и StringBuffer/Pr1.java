/*
Практика #1
Напишите программу, в которой будет продемонстрирована функциональность десяти любых методов классов StringBuffer и StringBuilder.
В комментариях к программе напишите пояснение к используемым методам.
 */
public class Main {
    public static void main(String[] args) {
      // Создаем объекты StringBuffer и StringBuilder
        StringBuffer buffer = new StringBuffer("Java");
        StringBuilder builder = new StringBuilder("Java");
        
        // 1. append() - добавляет строку в конец
        System.out.println("1. append() - добавление в конец:");
        buffer.append(" Programming");
        builder.append(" Programming");
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // 2. insert() - вставляет строку в указанную позицию
        System.out.println("\n2. insert() - вставка по индексу:");
        buffer.insert(4, " Core");
        builder.insert(4, " Core");
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // 3. delete() - удаляет символы в диапазоне
        System.out.println("\n3. delete() - удаление диапазона символов:");
        buffer.delete(4, 9);  // Удаляем " Core"
        builder.delete(4, 9); // Удаляем " Core"
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // 4. deleteCharAt() - удаляет один символ по индексу
        System.out.println("\n4. deleteCharAt() - удаление одного символа:");
        buffer.deleteCharAt(0); // Удаляем 'J'
        builder.deleteCharAt(0); // Удаляем 'J'
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // 5. replace() - заменяет диапазон символов новой строкой
        System.out.println("\n5. replace() - замена диапазона символов:");
        buffer.replace(0, 4, "Python");  // Заменяем "ava " на "Python"
        builder.replace(0, 4, "Python"); // Заменяем "ava " на "Python"
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // 6. reverse() - переворачивает строку задом наперед
        System.out.println("\n6. reverse() - реверс строки:");
        buffer.reverse();
        builder.reverse();
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // Возвращаем обратно для следующих примеров
        buffer.reverse();
        builder.reverse();
        
        // 7. capacity() и ensureCapacity() - работа с емкостью
        System.out.println("\n7. capacity() и ensureCapacity() - управление емкостью:");
        System.out.println("   StringBuffer емкость: " + buffer.capacity());
        System.out.println("   StringBuilder емкость: " + builder.capacity());
        
        buffer.ensureCapacity(100); // Гарантируем емкость не менее 100
        builder.ensureCapacity(100); // Гарантируем емкость не менее 100
        System.out.println("   После ensureCapacity(100):");
        System.out.println("   StringBuffer емкость: " + buffer.capacity());
        System.out.println("   StringBuilder емкость: " + builder.capacity());
        
        // 8. setLength() - устанавливает новую длину
        System.out.println("\n8. setLength() - установка новой длины:");
        System.out.println("   До setLength(10):");
        System.out.println("   StringBuffer: '" + buffer + "' длина: " + buffer.length());
        System.out.println("   StringBuilder: '" + builder + "' длина: " + builder.length());
        
        buffer.setLength(10);
        builder.setLength(10);
        System.out.println("\n   После setLength(10):");
        System.out.println("   StringBuffer: '" + buffer + "' длина: " + buffer.length());
        System.out.println("   StringBuilder: '" + builder + "' длина: " + builder.length());
        
        // 9. charAt() и setCharAt() - доступ и изменение символов
        System.out.println("\n9. charAt() и setCharAt() - доступ и изменение символов:");
        System.out.println("   charAt(2) в StringBuffer: " + buffer.charAt(2));
        System.out.println("   charAt(2) в StringBuilder: " + builder.charAt(2));
        
        buffer.setCharAt(2, 'X'); // Меняем символ на позиции 2
        builder.setCharAt(2, 'X'); // Меняем символ на позиции 2
        System.out.println("   После setCharAt(2, 'X'):");
        System.out.println("   StringBuffer: " + buffer);
        System.out.println("   StringBuilder: " + builder);
        
        // 10. substring() - получение подстроки
        System.out.println("\n10. substring() - получение подстроки:");
        String subBuffer = buffer.substring(0, 5); // Символы с 0 до 4
        String subBuilder = builder.substring(0, 5); // Символы с 0 до 4
        System.out.println("   StringBuffer substring(0, 5): " + subBuffer);
        System.out.println("   StringBuilder substring(0, 5): " + subBuilder);
    }
}
