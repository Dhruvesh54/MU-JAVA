// interface
interface Program {
    void a();
}

class A implements Program {
    public void a() {
        System.out.println("Interface A is called");
    }
}


class B implements Program {
    public void a() {
        System.out.println("Interface B is called");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Program obj;  
        obj = new A();
        obj.a();
        obj = new B();
        obj.a();
    }
}
