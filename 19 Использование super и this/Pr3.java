/*
Практика #3
Перепешите следующий код с использованием конструкции this().
Помните, что в каждом конструкторе вызов this() должен быть единственным и первым среди всех операций.

class A {
  int a;
  int b;
  int c;
  int z;

  public A() {
    z = 1;
  }

  public A(int a) {
    this.a = a;
    z = 1;
  }

  public A(int a, int b) {
    this.a = a;
    this.b = b;
    z = 1;
  }

  public A(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    z = 1;
  }
  ...
}
*/

class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0); // Вызов конструктора с тремя параметрами
    }
  
    public A(int a) {
        this(a, 0, 0); // Вызов конструктора с тремя параметрами
    }

    public A(int a, int b) {
        this(a, b, 0); // Вызов конструктора с тремя параметрами
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
}
