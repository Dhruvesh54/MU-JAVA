class Swap {
    public static void main(String[] args) {
        Swap ob1 = new Swap();
        ob1.exchangeObj = ob1.new Exchange(); // Create an instance of the inner class Exchange
        ob1.exchangeObj.a = 5;
        ob1.exchangeObj.b = 6;

        ob1.exchangeObj.exc(ob1.exchangeObj.a, ob1.exchangeObj.b);
        ob1.exchangeObj.display();
    }

    class Exchange {
        int a, b, c;

        // Correcting the exc method to actually modify the values of 'a' and 'b'
        void exc(int x, int y) {
            c = x;  // Store the value of x in 'c'
            x = y;  // Swap values
            y = c;
            a = x;  // Update 'a' with the swapped value
            b = y;  // Update 'b' with the swapped value
        }

        void display() {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }

    private Exchange exchangeObj; // Field for inner class instance
}
