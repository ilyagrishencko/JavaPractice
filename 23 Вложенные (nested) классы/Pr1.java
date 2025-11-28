/*
Практика #1
Приведите примеры "вложение" класса в интерфейс и покажите способ вызова методе такого вложенного класса.
  */
// Интерфейс с вложенным классом
interface Calculator {
    class MathUtils {
        public static int add(int a, int b) {
            return a + b;
        }
    }
}

// Демонстрация использования
public class SimpleExample {
    public static void main(String[] args) {
        // Вызов метода вложенного класса
        int result = Calculator.MathUtils.add(5, 3);
        System.out.println("Результат: " + result);
    }
}
