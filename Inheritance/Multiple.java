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
public class Multiple {
    public static void main(String[] args){

        Three obj = new Three();
        obj.A();
        obj.B();
        obj.C();
    }
}
