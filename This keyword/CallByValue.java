public class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before method call:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Calling the method that modifies a and b
        swapValues(a, b);

        System.out.println("After method call:");
        System.out.println("a = " + a);  // 'a' will remain 5
        System.out.println("b = " + b);  // 'b' will remain 10
    }

    public static void swapValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside method:");
        System.out.println("a = " + a);  // Swapped values locally
        System.out.println("b = " + b);
    }
}
