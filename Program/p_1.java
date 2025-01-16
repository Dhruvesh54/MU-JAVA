// package Program;

import java.util.*;

public class p_1 {
    public static void main(String[] args) {
        int Fahrenheit;
        System.out.println("Enter Fahrenheit : ");
        Scanner ob = new Scanner(System.in);
        Fahrenheit = ob.nextInt();
        float Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("Celsius is : " + Celsius);
    }
}
