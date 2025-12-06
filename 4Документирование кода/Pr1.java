/*
Практика #1
Изучите утилиту javadoc и научитесь ее пользоваться.
 */
public class Calculator {
    
    /**
     * Константа для названия калькулятора.
     * @see #getName()
     */
    public static final String CALCULATOR_NAME = "SimpleCalculator";
    
    private double lastResult;
    
    /**
     * Создает новый экземпляр калькулятора.
     * Начальное значение последнего результата равно 0.
     */
    public Calculator() {
        this.lastResult = 0.0;
    }
    
    /**
     * Возвращает название калькулятора.
     * 
     * @return строку с названием калькулятора
     * @see #CALCULATOR_NAME
     */
    public String getName() {
        return CALCULATOR_NAME;
    }
    
    /**
     * Складывает два числа и сохраняет результат.
     * 
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумму a и b
     * @see #subtract(double, double)
     * @see #getLastResult()
     */
    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }
    
    /**
     * Вычитает второе число из первого.
     * 
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }
    
    /**
     * Умножает два числа.
     * 
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }
    
    /**
     * Делит первое число на второе.
     * <p>
     * <b>Внимание:</b> деление на ноль вызовет исключение.
     * </p>
     * 
     * @param a делимое
     * @param b делитель
     * @return частное a и b
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        lastResult = a / b;
        return lastResult;
    }
    
    /**
     * Возвращает последний вычисленный результат.
     * 
     * @return последний результат операции
     */
    public double getLastResult() {
        return lastResult;
    }
    
    /**
     * Проверяет, является ли число четным.
     * 
     * @param number число для проверки
     * @return true, если число четное, иначе false
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Точка входа в программу для демонстрации работы калькулятора.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Калькулятор: " + calc.getName());
        
        double sum = calc.add(10, 5);
        System.out.println("10 + 5 = " + sum);
        
        double diff = calc.subtract(10, 5);
        System.out.println("10 - 5 = " + diff);
        
        double product = calc.multiply(10, 5);
        System.out.println("10 * 5 = " + product);
        
        try {
            double quotient = calc.divide(10, 5);
            System.out.println("10 / 5 = " + quotient);
            
            // Это вызовет исключение
            // calc.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        System.out.println("Последний результат: " + calc.getLastResult());
        System.out.println("Число 4 четное? " + Calculator.isEven(4));
        System.out.println("Число 7 четное? " + Calculator.isEven(7));
    }
}
