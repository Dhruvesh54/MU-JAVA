class a {
    void add() {
        System.out.println("Class Is a");
    }
}

class b extends a {
    void add() {
        System.out.println("Class Is b");
    }
}

public class DMD {
    public static void main(String[] args) {
        a obj;
		
        obj = new a();
        obj.add();  
        obj = new b();
        obj.add();
    }
}
