/*
Практика #1
Приведите пример перегруженных методов.
 */
public class Main {

    // Метод 1: без параметров
    public void display() {
        System.out.println("Метод без параметров");
    }

    // Перегруженный метод 2: с одним целочисленным параметром
    public void display(int number) {
        System.out.println("Метод с целым числом: " + number);
    }

    // Перегруженный метод 3: с одним строковым параметром
    public void display(String text) {
        System.out.println("Метод со строкой: " + text);
    }

    // Перегруженный метод 4: с двумя целочисленными параметрами
    public void display(int a, int b) {
        System.out.println("Метод с двумя числами: " + a + " и " + b);
    }

    // Перегруженный метод 5: с одним параметром типа double
    public void display(double number) {
        System.out.println("Метод с дробным числом: " + number);
    }

    // Перегруженный метод 6: с разным порядком параметров
    public void display(String text, int number) {
        System.out.println("Метод со строкой и числом: '" + text + "', " + number);
    }

    // Перегруженный метод 7: с другим порядком параметров
    public void display(int number, String text) {
        System.out.println("Метод с числом и строкой: " + number + ", '" + text + "'");
    }

    public static void main(String[] args) {
        Main example = new Main();

        // Вызов различных перегруженных методов
        example.display();              // Метод без параметров
        example.display(10);            // Метод с целым числом
        example.display("Hello");       // Метод со строкой
        example.display(5, 7);          // Метод с двумя числами
        example.display(3.14);          // Метод с дробным числом
        example.display("Text", 100);   // Метод со строкой и числом
        example.display(200, "Word");   // Метод с числом и строкой
    }
}
