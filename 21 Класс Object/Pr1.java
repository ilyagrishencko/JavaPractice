import java.util.Objects;

/*
Практика #1
Самостоятельно придумайте класс и переопределите для него метод equals(). Каким соглашениям должна следовать реализация этого метода?
 */
public class Student {
    private String name;
    private String studentId;
    
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    /**
     * Переопределение метода equals()
     */
    @Override
    public boolean equals(Object obj) {
        // Проверка рефлексивности - тот же объект
        if (this == obj) {
            return true;
        }
        
        // Проверка на null и совместимость типов
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        
        // Приведение типа и сравнение полей
        Student other = (Student) obj;
        return Objects.equals(this.name, other.name) &&
               Objects.equals(this.studentId, other.studentId);
    }
    
    /**
     * При переопределении equals() обязательно переопределять hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', studentId='" + studentId + "'}";
    }
}

/**
 * Демонстрационный класс
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "S12345");
        Student student2 = new Student("Иван", "S12345");
        Student student3 = new Student("Мария", "S12346");
        
        System.out.println("student1.equals(student2): " + student1.equals(student2)); // true
        System.out.println("student1.equals(student3): " + student1.equals(student3)); // false
        System.out.println("student1.equals(null): " + student1.equals(null)); // false
        
        System.out.println("HashCode student1: " + student1.hashCode());
        System.out.println("HashCode student2: " + student2.hashCode());
    }
}
