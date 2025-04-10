// b) Write a java program to implement the Exception handling.
public class P9_b {
    public static void main(String[] args) {
        try {
            int a = 10, b = 20, c;
            c = a / ((a * 2) - b);
            System.out.println(c);

            int[] arr = { 1, 2, 3 };
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[3]);
            }
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e);
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e);
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}