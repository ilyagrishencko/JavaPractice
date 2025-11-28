/*
Практика #1
Приведите тривиальные примеры бесконечных циклов для конструкций while и do-while.
 */
public class Main {
    public static void main(String[] args) {
        
        // бесконечный цикл while
        while (true) {
          
        }
        
        // еще один вариант бесконечного цикла while
        int count = 0;
        while (count < 10) { // условие всегда истинно, так как count не увеличивается
        }
        
        // бесконечный цикл do-while
        do {
        } while (true);
        
        // еще один вариант бесконечного do-while
        boolean flag = true;
        do {
        } while (flag);
    }
}
