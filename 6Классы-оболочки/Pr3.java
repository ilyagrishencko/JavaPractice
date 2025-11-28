/*
Практика #3
В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример.

NullPointerException возникает только при автораспаковке, 
когда пытаемся преобразовать null объект-обертку в примитивный тип
 */
public class Main {

    public static void main(String[] args) {
        // Создаем null-ссылку на объект-оболочку
        Long nullLong = null;

        // Попытка автораспаковки null-значения вызовет NullPointerException
        try {
            long primitivelong = nullLong; // Автораспаковка null -> NullPointerException
            System.out.println("Значение: " + primitivelong);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Попытка автораспаковки null-значения Long в примитивный тиа long");
        }

    }
}
