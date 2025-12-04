/*
Практика #3
Зачем нужны три двойные кавычки? Примеры использования.
 */
public class TextBlocksDemo {
    public static void main(String[] args) {      
        // Пример 1: Многострочный текст без экранирования
        System.out.println("1. Многострочный текст:");
        String text = """
            Это пример
            многострочного
            текстового блока.
            Каждая строка сохраняется
            как есть.""";
        System.out.println(text);
        
        // Пример 2: JSON данные
        System.out.println("\n2. JSON данные:");
        String json = """
            {
                "name": "Иван",
                "age": 30,
                "city": "Москва",
                "skills": ["Java", "Python", "SQL"]
            }""";
        System.out.println(json);
        
        // Пример 3: SQL запрос
        System.out.println("\n3. SQL запрос:");
        String sql = """
            SELECT id, name, age 
            FROM users 
            WHERE age > 18 
            AND city = 'Москва'
            ORDER BY name ASC""";
        System.out.println(sql);
        
        // Пример 4: HTML разметка
        System.out.println("\n4. HTML разметка:");
        String html = """
            <!DOCTYPE html>
            <html>
                <head>
                    <title>Пример страницы</title>
                </head>
                <body>
                    <h1>Привет, мир!</h1>
                    <p>Это пример HTML.</p>
                </body>
            </html>""";
        System.out.println(html);
    }
}
