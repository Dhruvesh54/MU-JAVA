class default_constructor {
    int x;

    public default_constructor() {
        x = 5;
    }

    public static void main(String[] args) {
        default_constructor myObj = new default_constructor();
        System.out.println(myObj.x);
    }
}
