
// 7b. Write a java program to implement the vector class
import java.util.*;

public class P7_b {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(5); // Initial size 5
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());
        numbers.add(40);
        numbers.add(50);
        numbers.add(60); // Exceeds size, vector size increases
        System.out.println("Updated Vector: " + numbers);
        System.out.println("First Element: " +
                numbers.firstElement());
        System.out.println("Last Element: " +
                numbers.lastElement());
        System.out.println("Contains 30? " + numbers.contains(30));
        numbers.remove(2); // Remove element at index 2
        System.out.println("After Removal: " + numbers);
    }
}
