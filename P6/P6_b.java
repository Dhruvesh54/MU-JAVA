import java.util.*;

public class P6_b {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Mango");
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Vector elements:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
// public class P6_b {
    // public static void main(String[] args) {
    // // Creating a Vector
    // Vector<Integer> vector = new Vector<>();
    // // Vector<String> vector = new Vector<>();
    // vector.add(54);
    // vector.add(41);
    // // vector.add("Apple");
    // // vector.add("Banana");
    // // vector.add("Cherry");
    // // vector.add("Mango");
    // // Getting an Enumeration object
    // Enumeration<Integer> enumeration = vector.elements();
    // // Enumeration<String> enumeration = vector.elements();
    // // Iterating using Enumeration
    // System.out.println("Vector elements:");
    // while (enumeration.hasMoreElements()) {
    // System.out.println(enumeration.nextElement());
    // }
    // }
// }

