class x{
    int x= 10;
    void show(){
        System.out.println(x);
    }
}
public class demo {
    public static void main(String[] args) {
        x ob1 = new x();
        x ob;
        ob = ob1;
        ob.x=15;
        ob.show();
        ob1.show();
    }
}
