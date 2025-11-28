/*
Практика #1
Приведите примеры класса, в котором используется инициализация элементов перечисления.
 */
public enum Size {
    // Элементы перечисления с одним параметром
    SMALL("Маленький"),
    MEDIUM("Средний"),
    LARGE("Большой"),
    EXTRA_LARGE("Очень большой");

    // Поле перечисления
    private final String description;

    // Конструктор
    Size(String description) {
        this.description = description;
    }

    // Метод для получения описания
    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        // Использование перечисления
        Size mySize = Size.MEDIUM;
        
        // Перебор всех элементов
        System.out.println("\nВсе доступные размеры:");
        for (Size size : Size.values()) {
            System.out.println(size + " - " + size.getDescription());
        }
        
        // Использование в switch
        System.out.println("\nПроверка размера в switch:");
        switch (mySize) {
            case SMALL:
                System.out.println("Это маленький размер");
                break;
            case MEDIUM:
                System.out.println("Это средний размер");
                break;
            case LARGE:
                System.out.println("Это большой размер");
                break;
            case EXTRA_LARGE:
                System.out.println("Это очень большой размер");
                break;
        }
    }
}
