class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal's name: " + name);
    }
}

public class superkey {
    class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        void display() {
            super.display();
            System.out.println("Dog's name is: " + name);
        }
    }

    public static void main(String[] args) {
        superkey ob1 = new superkey();

        Dog myDog = ob1.new Dog("Buddy");

        myDog.display();
    }
}
