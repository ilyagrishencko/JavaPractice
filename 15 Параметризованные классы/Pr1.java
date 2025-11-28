import java.util.*;

/*
Практика #1
Приведите примеры использования оператора instanceof с объектами параметризованных классов.
 */
public class InstanceofWithBoxExample {
    public static void main(String[] args) {
        // Создаем объекты параметризованного класса Box
        Box<String> stringBox = new Box<>("Hello World!");
        Box<Integer> integerBox = new Box<>(148);
        Box<Double> doubleBox = new Box<>(2.72);
        // Использование instanceof с параметризованными классами
        System.out.println("stringBox instanceof Box: " + (stringBox instanceof Box));
        System.out.println("integerBox instanceof Box: " + (integerBox instanceof Box));
        System.out.println("stringBox instanceof Box<?>: " + (stringBox instanceof Box<?>));
        System.out.println("integerBox instanceof Box<?>: " + (integerBox instanceof Box<?>));
    }
}

// Параметризованный класс Box
class Box<T> {
    private T content;
    
    public Box(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
}
