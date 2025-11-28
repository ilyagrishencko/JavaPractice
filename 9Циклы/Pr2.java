/*
Практика #2
Приведите пример использования операторов break и continue с любым видом цикла.
 */
public class Main {
    public static void main(String[] args) {
        
        // break и continue в цикле for
        System.out.println("цикл for:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) continue; // пропустить 3
            if (i == 8) break;    // выйти на 8
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // break и continue в цикле while
        System.out.println("цикл while:");
        int j = 1;
        while (j <= 10) {
            if (j == 3) {
                j++;
                continue; // пропустить 3
            }
            if (j == 8) break; // выйти на 8
            System.out.print(j + " ");
            j++;
        }
        System.out.println("\n");
    }
}
