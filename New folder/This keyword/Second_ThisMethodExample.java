public class Second_ThisMethodExample {

    int a, b;

    public Second_ThisMethodExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void displaySum() {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    void displayValues() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        this.displaySum();
    }

    public static void main(String[] args) {
        Second_ThisMethodExample obj = new Second_ThisMethodExample(5, 6);

        obj.displayValues();
    }
}
