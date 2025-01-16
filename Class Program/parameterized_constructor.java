public class parameterized_constructor {
    int x;

    public parameterized_constructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        parameterized_constructor myObj = new parameterized_constructor(5);
        System.out.println(myObj.x);
    }
}
