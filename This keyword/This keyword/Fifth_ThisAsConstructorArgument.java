public class Fifth_ThisAsConstructorArgument {

    // Instance variables
    int a, b;

    // Constructor 1: Default constructor
    public Fifth_ThisAsConstructorArgument() {
        // Passing 'this' to another constructor
        this(5, 6);  // Calls the parameterized constructor with 5 and 6
    }

    // Constructor 2: Parameterized constructor
    public Fifth_ThisAsConstructorArgument(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to display the values
    void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        Fifth_ThisAsConstructorArgument obj1 = new Fifth_ThisAsConstructorArgument();
        obj1.display();  // Will display: a=5, b=6
    }
}
