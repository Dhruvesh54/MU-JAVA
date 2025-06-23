class Six_example {
    String name;
    int age;

    public Six_example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Six_example setName(String name) {
        this.name = name;
        return this;
    }

    public Six_example setAge(int age) {
        this.age = age;
        return this;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Six_example Six_example = new Six_example("Dhruvesh", 21)
                            .setName("Monil") 
                            .setAge(30);

        Six_example.display();
    }
}
