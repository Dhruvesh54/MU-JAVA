import java.util.Scanner;

public class operaters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        System.out.println("\nRelational Operators:");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));

        System.out.println("\nLogical Operators:");
        System.out.println("num1 > 0 && num2 > 0: " + (num1 > 0 && num2 > 0));
        System.out.println("num1 > 0 || num2 > 0: " + (num1 > 0 || num2 > 0));
        System.out.println("!(num1 > num2): " + !(num1 > num2));

        int result;
        result = num1;
        System.out.println("\nAssignment Operators:");
        System.out.println("result = num1: " + result);

        result += num2; 
        System.out.println("result += num2: " + result);

        result -= num2;
        System.out.println("result -= num2: " + result);

        result *= num2; 
        System.out.println("result *= num2: " + result);

        result /= num2;
        System.out.println("result /= num2: " + result);

        result %= num2;
        System.out.println("result %= num2: " + result);

        System.out.println("\nUnary Operators:");
        System.out.println("num1++: " + num1++);
        System.out.println("num1 after post-increment: " + num1);
        System.out.println("++num1: " + ++num1);
        System.out.println("num1 after pre-increment: " + num1);

        System.out.println("num2--: " + num2--);
        System.out.println("num2 after post-decrement: " + num2);
        System.out.println("--num2: " + --num2);
        System.out.println("num2 after pre-decrement: " + num2);

        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2: " + (num1 & num2));
        System.out.println("num1 | num2: " + (num1 | num2));
        System.out.println("num1 ^ num2: " + (num1 ^ num2));
        System.out.println("~num1: " + (~num1));
        System.out.println("num1 << 2: " + (num1 << 2));
        System.out.println("num1 >> 2: " + (num1 >> 2));

        System.out.println("\nTernary Operator:");
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("The larger number is: " + largest);
    }
}
