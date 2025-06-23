//* Infinite*/ Infinite
// public class RecursionExample1 {
//     static void p() {
//         System.out.println("hello");
//         p();
//     }

//     public static void main(String[] args) {
//         p();
//     }
// }

// * Count ++ 1 to 10 number print
// public class RecursionExample1 {
//     static int count = 0;

//     static void display() {
//         // count++;
//         // if (count <= 5) {
//         // System.out.println("Dhruvesh " + count);
//         // display();
//         // }

//         // *First Trick
//         // if (count <= 10) {
//         // System.out.println(count);
//         // count++;
//         // display();
//         // }

//         // *Second Trick
//         if (count == 10) {
//         } else {
//             count++;
//             System.out.println(count);
//             display();
//         }
//     }

//     public static void main(String[] args) {
//         display();
//     }
// }

// * Add Two Number */
// public class RecursionExample1 {
// void add(int a, int b){
// if (b==0) {
// System.out.println(a);
// }
// else{
// // a++;
// // b--;
// // add(a,b);
// add(a+1, b-1);
// }
// }
// public static void main(String[] args) {
// RecursionExample1 example = new RecursionExample1();
// example.add(5, 6);
// }
// }

// * Reverse number
// public class RecursionExample1 {

// int rev = 0;

// void reverse(int no) {
// if (no == 0) {
// System.out.println(rev); // Print the reversed number
// } else {
// int dg = no % 10; // Get the last digit of the number
// rev = rev * 10 + dg; // Build the reversed number
// no = no / 10; // Remove the last digit
// reverse(no); // Recursive call with the reduced number
// }
// }

// public static void main(String[] args) {
// RecursionExample1 example = new RecursionExample1();
// example.reverse(12345);
// }
// }

public class RecursionExample1 {

    void display(int i) {
        if (i == 3) {
            System.out.println(i);
        } else {
            i++;
            System.out.println(i);
            display(i);
        }
    }

    public static void main(String[] args) {
        RecursionExample1 example1 = new RecursionExample1();
        example1.display(4);
    }
}