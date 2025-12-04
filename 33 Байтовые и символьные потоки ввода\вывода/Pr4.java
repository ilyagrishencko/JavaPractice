/*
Практика #4
Зачем нужен интерфейс AutoCloseable? Приведите пример.
*/
public class Main {

    // Создаем собственный ресурс, который реализует AutoCloseable
    static class MyResource implements AutoCloseable {
        private String name;

        public MyResource(String name) {
            this.name = name;
            System.out.println("Ресурс '" + name + "' создан");
        }

        public void use() {
            System.out.println("Ресурс '" + name + "' используется");
        }

        @Override
        public void close() {
            System.out.println("Ресурс '" + name + "' автоматически закрыт");
            // Здесь обычно освобождаются ресурсы: закрываются файлы,
            // разрываются соединения, освобождается память и т.д.
        }
    }

    public static void main(String[] args) {
        System.out.println("Демонстрация интерфейса AutoCloseable\n");

        // Пример: Использование try-with-resources
        System.out.println("1. Использование try-with-resources:");
        try (MyResource resource = new MyResource("Тестовый ресурс")) {
            resource.use();
            // Может произойти исключение
            // int result = 10 / 0; // раскомментируйте для теста
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }
}
