public class Third_ThisConstructorExample {

    int a, b;

    public Third_ThisConstructorExample() {
        this(5, 6);
    }

    public Third_ThisConstructorExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        Third_ThisConstructorExample obj = new Third_ThisConstructorExample();
        obj.display();
    }
}
