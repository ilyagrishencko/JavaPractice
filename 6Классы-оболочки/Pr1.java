/*
Практика #1
Приведите примеры использования методы decode().
 */
public class Main {
    public static void main(String[] args) {
        // десятичные числа
        Integer num1 = Integer.decode("123");
        Integer num2 = Integer.decode("-456");
        System.out.println("десятичные: " + num1 + ", " + num2);
        
        // шестнадцатеричные числа с 0x
        Integer hex1 = Integer.decode("0x1F");
        Integer hex2 = Integer.decode("0XFF");
        System.out.println("шестнадцатеричные с 0x: " + hex1 + ", " + hex2);
        
        // шестнадцатеричные числа с #
        Integer hex3 = Integer.decode("#1F");
        Integer hex4 = Integer.decode("#FF");
        System.out.println("шестнадцатеричные с #: " + hex3 + ", " + hex4);
        
        // восьмеричные числа
        Integer oct1 = Integer.decode("012");
        Integer oct2 = Integer.decode("077");
        System.out.println("восьмеричные: " + oct1 + ", " + oct2);
        
        // разные типы чисел
        Long longNum = Long.decode("0xFFFFFFFF");
        Short shortNum = Short.decode("100");
        Byte byteNum = Byte.decode("50");
        System.out.println("разные типы: " + longNum + ", " + shortNum + ", " + byteNum);
    }
}
