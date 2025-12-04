import java.util.Date;

/*
Спецификатор формата	Выполняемое преобразование
%tH	Час (00–23)
%tI	Час (1–12)
%tM	Минуты как десятичное целое (00–59)
%tS	Секунды как десятичное целое (00–59)
%tL	Миллисекунды(000–999)
%tY	Год в четырехзначномформате
%ty	Год в двузначном формате (00–99)
%tB	Полное название месяца («январь»)
%tm	Месяц в двузначном формате (1–12)
%tA	Полное название дня недели («пятница»)
Практика #3
Приведите пример использования пяти любых спецификаторов из таблицы.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем объект с текущей датой и временем
        Date currentDate = new Date();

        System.out.println("Текущая дата и время: " + currentDate + "\n");

        // 1. %tH - Час (00-23)
        System.out.println("1. %tH - Час в 24-часовом формате (00-23):");
        System.out.println(String.format("   Текущий час: %tH", currentDate));

        // 2. %tI - Час (01-12)
        System.out.println("\n2. %tI - Час в 12-часовом формате (01-12):");
        System.out.println(String.format("   Текущий час: %tI", currentDate));

        // 3. %tM - Минуты (00-59)
        System.out.println("\n3. %tM - Минуты (00-59):");
        System.out.println(String.format("   Текущие минуты: %tM", currentDate));

        // 4. %tS - Секунды (00-59)
        System.out.println("\n4. %tS - Секунды (00-59):");
        System.out.println(String.format("   Текущие секунды: %tS", currentDate));

        // 5. %tL - Миллисекунды (000-999)
        System.out.println("\n5. %tL - Миллисекунды (000-999):");
        System.out.println(String.format("   Текущие миллисекунды: %tL", currentDate));

        // 6. %tY - Год в четырехзначном формате
        System.out.println("\n6. %tY - Год в четырехзначном формате:");
        System.out.println(String.format("   Текущий год: %tY", currentDate));

        // 7. %ty - Год в двузначном формате (00-99)
        System.out.println("\n7. %ty - Год в двузначном формате (00-99):");
        System.out.println(String.format("   Текущий год (две цифры): %ty", currentDate));

        // 8. %tB - Полное название месяца
        System.out.println("\n8. %tB - Полное название месяца:");
        System.out.println(String.format("   Текущий месяц: %tB", currentDate));

        // 9. %tm - Месяц в двузначном формате (01-12)
        System.out.println("\n9. %tm - Месяц в двузначном формате (01-12):");
        System.out.println(String.format("   Номер месяца: %tm", currentDate));

        // 10. %tA - Полное название дня недели
        System.out.println("\n10. %tA - Полное название дня недели:");
        System.out.println(String.format("   День недели: %tA", currentDate));
    }
}
