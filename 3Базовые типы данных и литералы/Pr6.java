/*
Практика #6
Приведите примеры сужающего преобразования типов.
 */
public class NarrowingConversionExample {
    public static void main(String[] args) {
      
        // Преобразование без потери данных
        
        // int -> byte (значение в диапазоне byte)
        int int1 = 100;
        byte byte1 = (byte) int1;
        System.out.println("(byte) int(" + int1 + ") = byte(" + byte1 + ") - без потери");
        
        // double -> int (дробная часть = 0)
        double double1 = 50.0;
        int int2 = (int) double1;
        System.out.println("(int) double(" + double1 + ") = int(" + int2 + ") - без потери");
        
        // float -> short
        float float1 = 300.0f;
        short short1 = (short) float1;
        System.out.println("(short) float(" + float1 + ") = short(" + short1 + ") - без потери");
        
        // Преобразование с потерей данных
        
        // int -> byte (значение вне диапазона byte)
        int int3 = 300;                    // byte: -128 до 127
        byte byte2 = (byte) int3;
        System.out.println("(byte) int(" + int3 + ") = byte(" + byte2 + ") - С ПОТЕРЕЙ!");
        System.out.println("  Объяснение: 300 > 127, происходит циклическое переполнение");
        
        // double -> int (потеря дробной части)
        double double2 = 123.456;
        int int4 = (int) double2;
        System.out.println("(int) double(" + double2 + ") = int(" + int4 + ") - дробная часть отброшена");
        
        // float -> byte
        float float2 = 130.7f;
        byte byte3 = (byte) float2;
        System.out.println("(byte) float(" + float2 + ") = byte(" + byte3 + ") - дробная часть отброшена");
    }
}
