/*
Практика #5
Приведите примеры, когда арифметические операции выполняются с переменными различных типов. Объясните результат.
 */
public class TypePromotionExample {
    public static void main(String[] args) {
        
        // примеры расширения типов
        
        // Пример 1: int + long -> long
        int intVal = 100;
        long longVal = 200L;
        // Результат - long, так как long больше int
        long result2 = intVal + longVal;
        System.out.println("int(" + intVal + ") + long(" + longVal + ") = long(" + result2 + ")");
        
        // Пример 2: long + float -> float
        long longVal2 = 1000L;
        float floatVal = 2.5f;
        // Результат - float, так как float больше long
        float result3 = longVal2 + floatVal;
        System.out.println("long(" + longVal2 + ") + float(" + floatVal + ") = float(" + result3 + ")");
        
        // Пример 3: float + double -> double
        float floatVal2 = 3.14f;
        double doubleVal = 2.71;
        // Результат - double, так как double больше float
        double result4 = floatVal2 + doubleVal;
        System.out.println("float(" + floatVal2 + ") + double(" + doubleVal + ") = double(" + result4 + ")");
        
        // Деление с разными типами
        
        System.out.println("\n3. Деление с разными типами:");
        
        // Пример 4: int / int -> int (целочисленное деление)
        int x = 7;
        int y = 2;
        int result8 = x / y;
        System.out.println("int(" + x + ") / int(" + y + ") = int(" + result8 + ") - целочисленное деление");
        
        // Пример 5: int / double -> double (вещественное деление)
        int x2 = 7;
        double y2 = 2.0;
        double result9 = x2 / y2;
        System.out.println("int(" + x2 + ") / double(" + y2 + ") = double(" + result9 + ") - вещественное деление");
        
        // Пример 6: float / int -> float
        float f2 = 7.0f;
        int i2 = 2;
        float result10 = f2 / i2;
        System.out.println("float(" + f2 + ") / int(" + i2 + ") = float(" + result10 + ")");
      
        }
}
