class Add {
    int a, b, c;

    Add() {
        a = 5;
        b = 6;
    }

    Add(Add ob) {
        a = ob.a;
        b = ob.b;
    }

    void add() {
        c = a + b;
        System.out.println("Sum is : "+c);
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        Add ob1 = new Add();
        ob1.add();

        Add ob2 = new Add(ob1);
        ob2.add();
    }
}
