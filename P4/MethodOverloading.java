public class MethodOverloading {
    public static void main(String[] args) {
        int a = 5, b = 6;
        float p = 4.7f, q = 9.2f;

        add(a, b);        // Calls add(int, int)
        add(p, q);        // Calls add(float, float)
        add(a, b, p, q);  // Calls add(int, int, float, float)
        add();            // Calls add() with no arguments
        add(p, a);        // Calls add(float, int)
    }

    // Method with no parameters
    static void add() {
        int i = 5, j = 7;
        int k = i + j;
        System.out.println("Sum (no params): " + k);
    }

    // Method with float and int parameters
    static void add(float x, int y) {
        float p = x + y;
        System.out.println("Sum (float, int): " + p);
    }

    // Method with int and int parameters
    static void add(int x, int y) {
        int sum = x + y;
        System.out.println("Sum (int, int): " + sum);
    }

    // Method with float and float parameters
    static void add(float x, float y) {
        float sum = x + y;
        System.out.println("Sum (float, float): " + sum);
    }

    // Method with int, int, float, and float parameters
    static void add(int x, int y, float p, float q) {
        float sum = x + y + p + q;
        System.out.println("Sum (int, int, float, float): " + sum);
    }
}
