package academy.learningprogramming;

// 1 - static
// 2 - instance
// 3 - constructor
class Example {
    private String name = "dog";

    { // instance initializers
        System.out.println(name);
    }

    private static int COUNT = 0;

    static { // static initializer
        System.out.println(COUNT);
    }

    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example() {
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new Demo();
    }

    {
        add(8);
    }

}

public class OrderOfInitialization {

    public static void main(String[] args) {
        new Example();
        new Demo();
    }

}
