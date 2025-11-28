import java.util.Arrays;

/*
Практика #2
Самостоятельно изучите класс java.util.Array и приведите пример использования следующих методов:

String toString(...)
int binarySearch(...)
boolean equals(...)
boolean compare(...)
void sort(...)
 */
public class Main {
    public static void main(String[] args) {
        
        // создаем тестовые массивы
        int[] numbers1 = {5, 2, 8, 1, 9};
        int[] numbers2 = {5, 2, 8, 1, 9};
        int[] numbers3 = {1, 2, 3, 4, 5};
        int[] numbers4 = {1, 2, 3};
        
        // метод toString() - строковое представление массива
        System.out.println("метод toString():");
        System.out.println("numbers1: " + Arrays.toString(numbers1));
        System.out.println("numbers3: " + Arrays.toString(numbers3));
        
        // метод binarySearch() - бинарный поиск (массив должен быть отсортирован)
        System.out.println("\nметод binarySearch():");
        Arrays.sort(numbers3); // сортируем для бинарного поиска
        int index = Arrays.binarySearch(numbers3, 3);
        System.out.println("индекс числа 3 в numbers3: " + index);
        
        int notFound = Arrays.binarySearch(numbers3, 10);
        System.out.println("поиск несуществующего числа 10: " + notFound);
        
        // метод equals() - сравнение массивов
        System.out.println("\nметод equals():");
        System.out.println("numbers1 equals numbers2: " + Arrays.equals(numbers1, numbers2));
        System.out.println("numbers1 equals numbers3: " + Arrays.equals(numbers1, numbers3));
        System.out.println("numbers3 equals numbers4: " + Arrays.equals(numbers3, numbers4));
        
        // метод compare() - лексикографическое сравнение
        System.out.println("\nметод compare():");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        int[] arr4 = {1, 2};
        
        System.out.println("arr1 compare arr2: " + Arrays.compare(arr1, arr2)); // 0 - равны
        System.out.println("arr1 compare arr3: " + Arrays.compare(arr1, arr3)); // отрицательное - arr1 < arr3
        System.out.println("arr1 compare arr4: " + Arrays.compare(arr1, arr4)); // положительное - arr1 > arr4
        
        // метод sort() - сортировка массива
        System.out.println("\nметод sort():");
        System.out.println("до сортировки: " + Arrays.toString(numbers1));
        Arrays.sort(numbers1);
        System.out.println("после сортировки: " + Arrays.toString(numbers1));
        
        // сортировка части массива
        int[] partialArray = {5, 2, 8, 1, 9, 3, 7};
        System.out.println("частичная сортировка до: " + Arrays.toString(partialArray));
        Arrays.sort(partialArray, 2, 5); // сортировка с индекса 2 до 5 (не включая)
        System.out.println("частичная сортировка после: " + Arrays.toString(partialArray));
    }
}
