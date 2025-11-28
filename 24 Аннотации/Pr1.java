/*
Практика #1
Объясните, зачем нужны следующие аннотации и приведите примеры их использования.

@Override
@Deprecated
@SuppressWarnings

  - @Override указывает, что метод переопределяет метод суперкласса и проверяет это на этапе компиляции
  - @Deprecated помечает устаревшие элементы, которые не рекомендуется использовать
  - @SuppressWarnings убирает предупреждения компилятора для конкретного элемента
  */
public class Main {

    /**
     * Базовый класс для демонстрации @Override
     */
    static class Animal {
        public void makeSound() {
            System.out.println("Животное издает звук");
        }

        public void eat() {
            System.out.println("Животное ест");
        }
    }

    /**
     * Производный класс с использованием аннотаций
     */
    static class Dog extends Animal {

        /**
         * @Override - проверяет, что метод действительно переопределяет метод родителя
         * Если метода нет в родительском классе - будет ошибка компиляции
         */
        @Override
        public void makeSound() {
            System.out.println("Собака лает: Гав-гав!");
        }

        /**
         * @Deprecated - помечает устаревший метод
         * Компилятор выдаст предупреждение при использовании этого метода
         */
        @Deprecated
        public void oldBark() {
            System.out.println("Старый способ лая");
        }

        /**
         * @SuppressWarnings - отключает предупреждения компилятора
         * "unused" - подавляет предупреждение о неиспользуемой переменной
         */
        @SuppressWarnings("unused")
        public void processData() {
            int temporaryValue = 100; // Обычно компилятор выдал бы предупреждение
            System.out.println("Обработка данных");
        }

        /**
         * Новый метод, заменяющий устаревший
         */
        public void newBark() {
            System.out.println("Новый способ лая");
        }
    }

    /**
     * Главный метод программы для демонстрации работы аннотаций
     */
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Демонстрация @Override
        dog.makeSound();

        // Демонстрация @Deprecated
        dog.oldBark();

        // Демонстрация @SuppressWarnings
        dog.processData();

        // Использование нового метода вместо устаревшего
        dog.newBark();

        // Вызов метода родительского класса
        dog.eat();
    }
}
