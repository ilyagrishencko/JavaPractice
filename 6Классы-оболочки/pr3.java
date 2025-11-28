/*
Практика #3
В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример.

NullPointerException возникает только при автораспаковке, 
когда пытаемся преобразовать null объект-обертку в примитивный тип
 */
public class Main {

    public static void main(String[] args) {
        // Создаем null-ссылку на объект-оболочку
        Integer nullInteger = null;

        // Попытка автораспаковки null-значения вызовет NullPointerException
        try {
            int primitiveInt = nullInteger; // Автораспаковка null -> NullPointerException
            System.out.println("Значение: " + primitiveInt);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Попытка автораспаковки null-значения Integer в примитивный тиа int");
        }

    }
}
