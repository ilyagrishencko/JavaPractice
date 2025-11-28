/*
Практика #2
Приведите примеры реализации собственного перечисления c любым дополнительным методом.
 */
enum Day {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", true);

    private final String Name;
    private final boolean isWeekend;

    // Конструктор
    Day(String Name, boolean isWeekend) {
        this.Name = Name;
        this.isWeekend = isWeekend;
    }

    // Дополнительный метод - проверка выходного дня
    public boolean isWeekend() {
        return isWeekend;
    }

    // Дополнительный метод - получение названия
    public String getName() {
        return Name;
    }

    // Дополнительный метод - получение следующего дня
    public Day nextDay() {
        Day[] days = values();
        return days[(this.ordinal() + 1) % days.length];
    }

    // Дополнительный метод - получение предыдущего дня
    public Day previousDay() {
        Day[] days = values();
        return days[(this.ordinal() - 1 + days.length) % days.length];
    }

    // Дополнительный метод - получение дня по названию
    public static Day getByName(String name) {
        for (Day day : values()) {
            if (day.Name.equalsIgnoreCase(name)) {
                return day;
            }
        }
        throw new IllegalArgumentException("Неизвестный день: " + name);
    }
}

/*
  Демонстрационный класс
 */
public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        
        System.out.println("Демонстрация методов перечисления");
        
        // Проверка выходного дня
        System.out.println(today.getName() + " выходной? " + today.isWeekend());
        System.out.println(Day.SATURDAY.getName() + " выходной? " + Day.SATURDAY.isWeekend());
        
        // Получение следующего дня
        System.out.println("\nСледующий день после " + today.getName() + ": " + today.nextDay().getName());
        
        // Получение предыдущего дня
        System.out.println("Предыдущий день перед " + today.getName() + ": " + today.previousDay().getName());
        
        // Поиск по названию
        Day foundDay = Day.getByName("Среда");
        System.out.println("\nНайденный день: " + foundDay + " (" + foundDay.getName() + ")");
        
        // Перебор всех дней с информацией
        System.out.println("\nВсе дни недели");
        for (Day day : Day.values()) {
            System.out.println(day + " (" + day.getName() + ") - " + 
                (day.isWeekend() ? "выходной" : "рабочий день"));
        }
    }
}
