class Add {
    int a, b, c;
    float p, q,z;

    // Default constructor
    Add() {
        a = 5;
        b = 6;
    }

    // Constructor with two int parameters
    Add(int x, int y) {
        a = x;
        b = y;
    }

    // Copy constructor
    Add(Add ob) {
        a = ob.a;
        b = ob.b;
    }

    // Constructor with int and float parameters
    Add(int x, float y) {
        a = x;
        p = y;
    }

    // Constructor with float, int, and float parameters
    Add(float x, int y, float z) {
        p = x;
        b = y;
        q = z;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Add ob1 = new Add(); // Calls default constructor
        Add ob2 = new Add(ob1); // Calls copy constructor
        Add ob3 = new Add(7, 3.0f); // Calls constructor with int and float
        Add ob4 = new Add(3.2f, 4, 7.8f); // Calls constructor with float, int, and float
        Add ob5 = new Add(7, 5.4f); // Calls constructor with int and float
    }
}
