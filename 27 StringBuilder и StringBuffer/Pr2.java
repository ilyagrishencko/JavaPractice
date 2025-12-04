/*
Практика #2
Покажите с помощью каких методов объекты классов String, StringBuffer и StringBuilder могут быть преобразованы друг в друга.
 */
public class Main {
    public static void main(String[] args) {
        
        String str = "Hello World";
        StringBuffer buffer = new StringBuffer("StringBuffer Text");
        StringBuilder builder = new StringBuilder("StringBuilder Text");
        
        // STRING → STRINGBUFFER
        System.out.println("1. String → StringBuffer:");
        
        // Способ 1: Через конструктор
        StringBuffer bufferFromStr1 = new StringBuffer(str);
        System.out.println("   Через конструктор: " + bufferFromStr1);
        
        // Способ 2: Через append()
        StringBuffer bufferFromStr2 = new StringBuffer();
        bufferFromStr2.append(str);
        System.out.println("   Через append(): " + bufferFromStr2);
        
        // Способ 3: С дополнительным текстом
        StringBuffer bufferFromStr3 = new StringBuffer("Начало: ").append(str).append(" - Конец");
        System.out.println("   С дополнением: " + bufferFromStr3);
        
        //STRING → STRINGBUILDE
        System.out.println("\n2. String → StringBuilder:");
        
        // Способ 1: Через конструктор
        StringBuilder builderFromStr1 = new StringBuilder(str);
        System.out.println("   Через конструктор: " + builderFromStr1);
        
        // Способ 2: Через append()
        StringBuilder builderFromStr2 = new StringBuilder();
        builderFromStr2.append(str);
        System.out.println("   Через append(): " + builderFromStr2);
        
        // Способ 3: С использованием valueOf()
        StringBuilder builderFromStr3 = new StringBuilder(String.valueOf(str));
        System.out.println("   Через String.valueOf(): " + builderFromStr3);
        
        // STRINGBUFFER → STRING
        System.out.println("\n3. StringBuffer → String:");
        
        // Способ 1: Через toString()
        String strFromBuffer1 = buffer.toString();
        System.out.println("   Через toString(): " + strFromBuffer1);
        
        // Способ 2: Через конструктор String
        String strFromBuffer2 = new String(buffer);
        System.out.println("   Через конструктор String: " + strFromBuffer2);
        
        // Способ 3: Через substring()
        String strFromBuffer3 = buffer.substring(0);
        System.out.println("   Через substring(): " + strFromBuffer3);
        
        // Способ 4: Через String.valueOf()
        String strFromBuffer4 = String.valueOf(buffer);
        System.out.println("   Через String.valueOf(): " + strFromBuffer4);
        
        // Способ 5: Через конкатенацию с пустой строкой
        String strFromBuffer5 = "" + buffer;
        System.out.println("   Через конкатенацию: " + strFromBuffer5);
        
        // STRINGBUILDER → STRING
        System.out.println("\n4. StringBuilder → String:");
        
        // Способ 1: Через toString() (рекомендуется)
        String strFromBuilder1 = builder.toString();
        System.out.println("   Через toString(): " + strFromBuilder1);
        
        // Способ 2: Через конструктор String
        String strFromBuilder2 = new String(builder);
        System.out.println("   Через конструктор String: " + strFromBuilder2);
        
        // Способ 3: Через substring()
        String strFromBuilder3 = builder.substring(0);
        System.out.println("   Через substring(): " + strFromBuilder3);
        
        // Способ 4: Через String.valueOf()
        String strFromBuilder4 = String.valueOf(builder);
        System.out.println("   Через String.valueOf(): " + strFromBuilder4);
        
        // STRINGBUFFER → STRINGBUILDER
        System.out.println("\n5. StringBuffer → StringBuilder:");
        
        // Способ 1: Через String как промежуточное звено
        StringBuilder builderFromBuffer1 = new StringBuilder(buffer.toString());
        System.out.println("   Через String: " + builderFromBuffer1);
        
        // Способ 2: Через конструктор с CharSequence
        StringBuilder builderFromBuffer2 = new StringBuilder((CharSequence) buffer);
        System.out.println("   Через CharSequence: " + builderFromBuffer2);
        
        // Способ 3: Через append() с CharSequence
        StringBuilder builderFromBuffer3 = new StringBuilder().append(buffer);
        System.out.println("   Через append(): " + builderFromBuffer3);
        
        // STRINGBUILDER → STRINGBUFFER
        System.out.println("\n6. StringBuilder → StringBuffer:");
        
        // Способ 1: Через String как промежуточное звено
        StringBuffer bufferFromBuilder1 = new StringBuffer(builder.toString());
        System.out.println("   Через String: " + bufferFromBuilder1);
        
        // Способ 2: Через конструктор с CharSequence
        StringBuffer bufferFromBuilder2 = new StringBuffer((CharSequence) builder);
        System.out.println("   Через CharSequence: " + bufferFromBuilder2);
        
        // Способ 3: Через append() с CharSequence
        StringBuffer bufferFromBuilder3 = new StringBuffer().append(builder);
        System.out.println("   Через append(): " + bufferFromBuilder3);
    }
}
