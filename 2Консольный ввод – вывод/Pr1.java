import java.util.Scanner;

/*
 Практика #1
 Напишите программу, которая просит ввести имя и выводит на консоль строку "Привет, <введенное имя>".
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        System.out.println("Привет, " + name);
        scanner.close();
    }
}
