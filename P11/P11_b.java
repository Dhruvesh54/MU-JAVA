// b) Write a java program to implement multiple inheritance
class One{
    public void A(){
        System.out.println("Inside A");
    }
}
class Two extends One{
    public void B(){
        System.out.println("Inside B");
    }
}
class Three extends Two{
    public void C(){
        System.out.println("Inside C");
    }
}
public class P11_b {
    public static void main(String[] args){

        Three obj = new Three();
        obj.A();
        obj.B();
        obj.C();
    }
}
