/*
Практика #2
Приведите все способы создания экземпляра класса Boolean.
 */
public class Main {
    public static void main(string[] args) {
        
        // способ 1: через конструктор
        boolean boolean1 = new boolean(true);
        boolean boolean2 = new boolean("true");
        boolean boolean3 = new boolean("false");
        
        // способ 2: через valueof()
        boolean boolean4 = boolean.valueof(true);
        boolean boolean5 = boolean.valueof("true");
        boolean boolean6 = boolean.valueof("false");
        boolean boolean7 = boolean.valueof("truе"); // false - регистр важен
        
        // способ 3: автоупаковка примитива
        boolean boolean8 = true;
        boolean boolean9 = false;
        
        // способ 4: через parseboolean() + упаковка
        boolean boolean10 = boolean.parseboolean("true");
        boolean boolean11 = boolean.parseboolean("false");
        boolean boolean12 = boolean.parseboolean("yes"); // false
        
        // способ 5: получение существующих констант
        boolean boolean13 = boolean.true;
        boolean boolean14 = boolean.false;
        
        // демонстрация всех созданных объектов
        system.out.println("через конструктор: " + boolean1 + ", " + boolean2 + ", " + boolean3);
        system.out.println("через valueof: " + boolean4 + ", " + boolean5 + ", " + boolean6 + ", " + boolean7);
        system.out.println("автоупаковка: " + boolean8 + ", " + boolean9);
        system.out.println("через parseboolean: " + boolean10 + ", " + boolean11 + ", " + boolean12);
        system.out.println("константы: " + boolean13 + ", " + boolean14);
        
        // проверка равенства объектов
        system.out.println("\nпроверка равенства:");
        system.out.println("boolean.valueof(true) == boolean.true: " + (boolean4 == boolean13));
        system.out.println("new boolean(true) == boolean.true: " + (boolean1 == boolean13));
    }
}
