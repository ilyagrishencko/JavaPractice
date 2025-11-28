/*
Практика #1
Приведите примеры класса, в котором перегружен метод с переменным числом параметров.
 */
public class Main {
    
    // Сумма целых чисел
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    // Сумма дробных чисел
    public static double sum(double... numbers) {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }
    
    // Конкатенация строк
    public static String sum(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    
    // Сумма массивов (сумма всех элементов во всех переданных массивах)
    public static int sum(int[]... arrays) {
        int total = 0;
        for (int[] array : arrays) {
            for (int num : array) {
                total += num;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // Сумма целых чисел
        System.out.println("Сумма целых: " + sum(1, 2, 3, 4, 5));
        
        // Сумма дробных чисел
        System.out.println("Сумма дробных: " + sum(1.1, 2.2, 3.3));
        
        // Конкатенация строк
        System.out.println("Конкатенация: " + sum("Hello", " ", "World", "!"));
        
        // Сумма массивов
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] arr3 = {6, 7, 8, 9};
        System.out.println("Сумма массивов: " + sum(arr1, arr2, arr3));
    }
}
