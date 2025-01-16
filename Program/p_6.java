// package Program;

import java.util.Scanner;

public class p_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first subject mark: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second subject mark: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third subject mark: ");
        int num3 = scanner.nextInt();
        
        float sum = num1+num2+num3;
        if (sum > 200) {
            System.out.println("Student is admitted");
        } else {
            System.out.println("Student is not admitted");
            
        }
    }
}
