class One {
    public void a() {
        System.out.print("Dk ");
    }
}

class Two extends One {
    public void b() {
        System.out.println("Patel");
    }
}

public class Single {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.a();
        obj.b();
    }
}