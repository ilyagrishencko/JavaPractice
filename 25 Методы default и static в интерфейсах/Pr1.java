/*
Практика #1
Приведите пример интерфейса, в котором определен один неабстрактный метод и один статический метод,
а также класс, реализующий этот интерфейс. Покажите все способы вызова методов интерфейса.
*/
interface Calculator {
    
    // Статический метод - вызывается через имя интерфейса
    static double add(double a, double b) {
        return a + b;
    }
    
    // Метод по умолчанию (default) - имеет реализацию по умолчанию
    default double multiply(double a, double b) {
        return a * b;
    }
    
    // Абстрактный метод - должен быть реализован в классе
    String getCalculatorName();
}

// Класс, реализующий интерфейс
class SimpleCalculator implements Calculator {
    
    @Override
    public String getCalculatorName() {
        return "Простой калькулятор";
    }
    
    // Можно переопределить default метод (не обязательно)
    @Override
    public double multiply(double a, double b) {
        System.out.println("Используется переопределенная версия multiply");
        return a * b;
    }
}

// Еще один класс, который НЕ переопределяет default метод
class ScientificCalculator implements Calculator {
    
    @Override
    public String getCalculatorName() {
        return "Научный калькулятор";
    }
    // Использует default реализацию multiply
}

/**
 * Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Все способы вызова методов интерфейса\n");
        
        // 1. Вызов СТАТИЧЕСКОГО метода интерфейса
        System.out.println("1. Вызов статического метода:");
        double sum = Calculator.add(10, 5);
        System.out.println("Calculator.add(10, 5) = " + sum);
        
        // 2. Вызов через объект класса с переопределенным default методом
        System.out.println("\n2. Вызов через объект SimpleCalculator:");
        Calculator calc1 = new SimpleCalculator();
        System.out.println("Имя: " + calc1.getCalculatorName());
        double result1 = calc1.multiply(10, 5); // Вызовет переопределенную версию
        System.out.println("calc1.multiply(10, 5) = " + result1);
        
        // 3. Вызов через объект класса с непереопределенным default методом
        System.out.println("\n3. Вызов через объект ScientificCalculator:");
        Calculator calc2 = new ScientificCalculator();
        System.out.println("Имя: " + calc2.getCalculatorName());
        double result2 = calc2.multiply(10, 5); // Вызовет default реализацию
        System.out.println("calc2.multiply(10, 5) = " + result2);
        
        // 4. Вызов через конкретный тип класса
        System.out.println("\n4. Вызов через конкретный тип класса:");
        SimpleCalculator simpleCalc = new SimpleCalculator();
        System.out.println("simpleCalc.getCalculatorName() = " + simpleCalc.getCalculatorName());
        System.out.println("simpleCalc.multiply(3, 4) = " + simpleCalc.multiply(3, 4));
        
        // 5. Дополнительные примеры
        System.out.println("\n5. Дополнительные примеры:");
        
        // Использование в выражениях
        double complexResult = Calculator.add(15, 25) * 2;
        System.out.println("Сложное выражение: Calculator.add(15, 25) * 2 = " + complexResult);
        
        // Массив объектов
        Calculator[] calculators = {
            new SimpleCalculator(),
            new ScientificCalculator()
        };
        
        System.out.println("\nИтерация по массиву калькуляторов:");
        for (Calculator calc : calculators) {
            System.out.println(calc.getCalculatorName() + ": 6 × 7 = " + calc.multiply(6, 7));
        }
        
        // Проверка с разными типами
        System.out.println("\n6. Статический метод работает без создания объектов:");
        System.out.println("Calculator.add(100.5, 200.3) = " + Calculator.add(100.5, 200.3));
        System.out.println("Calculator.add(-10, 30) = " + Calculator.add(-10, 30));
        
        // Нельзя вызвать статический метод через объект!
        // calc1.add(5, 3); // Ошибка компиляции!
    }
}
