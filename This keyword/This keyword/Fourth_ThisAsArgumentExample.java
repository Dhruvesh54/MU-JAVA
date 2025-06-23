public class Fourth_ThisAsArgumentExample {

    int a, b;

    public Fourth_ThisAsArgumentExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    void acceptObject(Fourth_ThisAsArgumentExample obj) {
        System.out.println("Inside acceptObject method:");
        obj.display();
    }

    public static void main(String[] args) {
        Fourth_ThisAsArgumentExample obj1 = new Fourth_ThisAsArgumentExample(5, 6);

        obj1.acceptObject(obj1);
    }
}
