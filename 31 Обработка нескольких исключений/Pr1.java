/*
Практика #1
Приведите пример кода, в котором продемонстрированы следующие ситуации:

несколько исключений обрабатываются абсолютно идентичным образом;
исключения, которые обрабатываются, образуют иерархию Ex1 <|-- Ex2 <|-- Ex3, т.е. Ex3 - подкласс Ex2, а Ex2 - подкласс Ex1.
  */
public class Main {

    // Создаем иерархию исключений
    static class Ex1 extends Exception {}
    static class Ex2 extends Ex1 {}
    static class Ex3 extends Ex2 {}

    public static void main(String[] args) {
        System.out.println("Демонстрация обработки исключений\n");

        // Ситуация 1: несколько исключений обрабатываются абсолютно одинаково
        System.out.println("1. Одинаковая обработка разных исключений:");
        try {
            // В зависимости от случайного числа бросаем разные исключения
            int random = (int) (Math.random() * 3);
            if (random == 0) {
                throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
            } else if (random == 1) {
                throw new NullPointerException("Ссылка на null объект");
            } else {
                throw new IllegalArgumentException("Некорректный аргумент");
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e) {
            // Все три исключения обрабатываются одинаково
            System.out.println("Общая обработка для исключения: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }

        System.out.println("\n2. Обработка иерархии исключений:");

        // Ситуация 2: исключения образуют иерархию
        try {
            throw new Ex3(); // Бросаем исключение самого нижнего уровня иерархии
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3 - самый конкретный тип");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2 - средний уровень");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1 - самый общий тип");
        }

    }
}
