class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        System.out.println("Before method call:");
        person1.display();
        person2.display();

        // Calling the method that modifies the object
        swapDetails(person1, person2);

        System.out.println("After method call:");
        person1.display();  // person1 details are swapped
        person2.display();  // person2 details are swapped
    }

    public static void swapDetails(Person p1, Person p2) {
        // Swap the names and ages of the objects
        String tempName = p1.name;
        int tempAge = p1.age;
        
        p1.name = p2.name;
        p1.age = p2.age;
        
        p2.name = tempName;
        p2.age = tempAge;
        
        System.out.println("Inside method (after swap):");
        p1.display();
        p2.display();
    }
}
