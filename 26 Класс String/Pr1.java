/*
Практика #1
Напишите программу, в которой будет продемонстрирована функциональность десяти любых методов класса String.
В комментариях к программе напишите пояснение к используемым методам.
 */
public class Main {
    public static void main(String[] args) {
        
        String text = "  Hello, World!  ";
        String text2 = "Java SPBPU";
        String text3 = "hello, world!";
        String text4 = "Java,Python,JavaScript,C++";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length() - длина строки:");
        System.out.println("   Длина строки \"" + text + "\": " + text.length());
        
        // 2. charAt() - возвращает символ по указанному индексу
        System.out.println("\n2. charAt() - символ по индексу:");
        System.out.println("   Символ на позиции 5 в \"" + text2 + "\": '" + text2.charAt(5) + "'");
        
        // 3. substring() - возвращает часть строки
        System.out.println("\n3. substring() - часть строки:");
        System.out.println("   substring(0, 4) от \"" + text2 + "\": \"" + text2.substring(0, 4) + "\"");
        System.out.println("   substring(5) от \"" + text2 + "\": \"" + text2.substring(5) + "\"");
        
        // 4. toUpperCase() / toLowerCase() - преобразование регистра
        System.out.println("\n4. toUpperCase() / toLowerCase():");
        System.out.println("   \"" + text3 + "\" в верхнем регистре: \"" + text3.toUpperCase() + "\"");
        System.out.println("   \"" + text2 + "\" в нижнем регистре: \"" + text2.toLowerCase() + "\"");
        
        // 5. trim() - удаляет пробелы в начале и конце
        System.out.println("\n5. trim() - удаление пробелов:");
        System.out.println("   Было: \"" + text + "\"");
        System.out.println("   Стало: \"" + text.trim() + "\"");
        
        // 6. replace() - замена символов/подстрок
        System.out.println("\n6. replace() - замена:");
        System.out.println("   Замена 'o' на '0' в \"" + text2 + "\": \"" + text2.replace('o', '0') + "\"");
        System.out.println("   Замена \"Java\" на \"Python\" в \"" + text2 + "\": \"" + text2.replace("Java", "Python") + "\"");
        
        // 7. split() - разделение строки на массив
        System.out.println("\n7. split() - разделение строки:");
        System.out.println("   Разделение \"" + text4 + "\" по запятой:");
        String[] languages = text4.split(",");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("   [" + i + "]: " + languages[i]);
        }
        
        // 8. equals() / equalsIgnoreCase() - сравнение строк
        System.out.println("\n8. equals() и equalsIgnoreCase():");
        System.out.println("   \"" + text2 + "\".equals(\"Java Programming\"): " + text2.equals("Java Programming"));
        System.out.println("   \"" + text3 + "\".equalsIgnoreCase(\"HELLO, WORLD!\"): " + text3.equalsIgnoreCase("HELLO, WORLD!"));
        
        // 9. indexOf() / lastIndexOf() - поиск подстроки
        System.out.println("\n9. indexOf() / lastIndexOf() - поиск:");
        System.out.println("   Первое вхождение 'a' в \"" + text2 + "\": " + text2.indexOf('a'));
        System.out.println("   Последнее вхождение 'a' в \"" + text2 + "\": " + text2.lastIndexOf('a'));
        System.out.println("   Поиск \"Prog\" в \"" + text2 + "\": " + text2.indexOf("Prog"));
        
        // 10. startsWith() / endsWith() - проверка начала/конца строки
        System.out.println("\n10. startsWith() / endsWith():");
        System.out.println("   \"" + text2 + "\".startsWith(\"Java\"): " + text2.startsWith("Java"));
        System.out.println("   \"" + text2 + "\".endsWith(\"ming\"): " + text2.endsWith("ming"));
    }
}
