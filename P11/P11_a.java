// a) Write a java program to implement multilevel Inheritance.
// * Multilevel Inheritance is not supported in java
interface A {
    void a();
}

interface B {
    void b();
}

class C implements A, B {
    public void a() {
        System.out.println("A is called");
    }

    public void b() {
        System.out.println("B is called");
    }
}

public class P11_a {
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();
    }
}
