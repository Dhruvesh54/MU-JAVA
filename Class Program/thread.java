public class thread {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        A x = new A(c);
        B y = new B(c);

        x.start();
        y.start();

        x.join(); 
        y.join();

        System.out.println("Final count: " + c.getCount());
    }
}

class Counter {
    int count = 1;

    synchronized void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class A extends Thread {
    Counter c;

    A(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
            }
    }
}

class B extends Thread {
    Counter c;

    B(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}
