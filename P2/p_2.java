// package Program;

import java.util.Scanner;

public class p_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        if (number >= 1000 && number <= 9999) {
            int firstDigit = number / 1000;

            int thirdDigit = (number / 10) % 10;

            System.out.println("First digit: " + firstDigit);
            System.out.println("Third digit: " + thirdDigit);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }
    }

}