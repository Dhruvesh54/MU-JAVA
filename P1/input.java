import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner obj = new Scanner(System.in);

        String name = obj.nextLine();

        System.out.println(name + " is a nice name!");
    }
}
