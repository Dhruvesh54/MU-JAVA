
// 7a. Write a java program to implement the Linked List
import java.util.*;

public class P7_a {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Monil");
        names.add("DK");
        names.add("Abhishek");
        System.out.println("LinkedList: " + names);
        names.addFirst("Manthan");
        System.out.println("After addFirst: " + names);
        names.removeLast();
        System.out.println("After removeLast: " + names);
    }
}
