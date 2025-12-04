/*
Практика #1
Приведите пример кода с генерацией двух исключений, одно из которых будет "перхвачено", а другое приведет к аварийной остановке.
 */
public class Main {

    public static void main(String[] args) {
        
        // первое исключение - перехватывается
        try {
            System.out.println("первый блок try:");
            int[] numbers = {1, 2, 3};
            // этот код вызовет ArrayIndexOutOfBoundsException
            System.out.println("элемент массива: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("первое исключение перехвачено: " + e.getClass().getSimpleName());
            System.out.println("программа продолжает работу");
        }
        
        System.out.println("продолжение программы после первого исключения");
        
        // второе исключение - не перехватывается
        System.out.println("второй блок (без обработки):");
        String text = null;
        // этот код вызовет NullPointerException, но исключение не обрабатывается
        // программа завершится аварийно
        int length = text.length();
        
        // этот код уже не выполнится
        System.out.println("эта строка не будет напечатана");
    }
}
