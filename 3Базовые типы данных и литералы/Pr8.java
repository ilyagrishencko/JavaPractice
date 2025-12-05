/*
Практика #8
Самостоятельно изучите, что означает type interface и приведите пример с использование var.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {     
        var message = "Hello, World!"; // Компилятор определяет String
        var number = 42;               // Компилятор определяет int
        var price = 19.99;             // Компилятор определяет double
        var flag = true;               // Компилятор определяет boolean
        
        System.out.println("message: " + message + " (тип: String)");
        System.out.println("number: " + number + " (тип: int)");
        System.out.println("price: " + price + " (тип: double)");
        System.out.println("flag: " + flag + " (тип: boolean)");
               
        var numbersArray = new int[]{1, 2, 3, 4, 5}; // Компилятор определяет int[]
        var stringsArray = new String[]{"a", "b", "c"}; // Компилятор определяет String[]
        
        System.out.print("Массив чисел: ");
        for (var n : numbersArray) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
