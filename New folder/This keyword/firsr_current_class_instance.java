public class firsr_current_class_instance {

    int a, b;

    public firsr_current_class_instance(int a, int b) {
        // a = a;
        // b = b;
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // Main method
    public static void main(String[] args) {
        firsr_current_class_instance obj = new firsr_current_class_instance(5, 6);
        obj.display();
    }
}
