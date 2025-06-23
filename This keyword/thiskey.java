public class thiskey {

    class add {
        int a, b, c;

        // Constructor for initializing values
        add(int a, int b) {
            this.a = a;
            this.b = b;
        }

        // Method to display the values
        void display() {
            System.out.println(a);
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class first
        thiskey ob1 = new thiskey();

        // Now create an instance of the inner class using ob1
        thiskey.add ob = ob1.new add(5, 6);
        ob.display();
    }
}
