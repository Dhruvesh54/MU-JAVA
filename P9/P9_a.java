// a) Write a java program to implement the multithreading concept.
// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 50; i++) {
//             System.out.println("Thread A is called");
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 50; i++) {
//             System.out.println("Thread B is called");
//         }
//     }
// }

class A extends Thread {
    public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread A is called");
    }
}

class B extends Thread {
    public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread B is called");
    }
}

public class P9_a {
    public static void main(String[] args) {
        // Create thread objects
        A obj = new A();
        B obj1 = new B();
        obj.start(); 
        obj1.start();
    }
}
