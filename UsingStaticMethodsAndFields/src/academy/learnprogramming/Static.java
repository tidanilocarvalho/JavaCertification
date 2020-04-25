package academy.learnprogramming;

public class Static {

    private String name = "Static";

    public static void one() {}
    public static void two() {}

    public static void three() {
        one();
        two();
        // four(); does not compile, for is not a static method
        // System.out.println(name);
    }

    public void four() {
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();

        // we are in the same class
        one();
        two();
        three();

        // four(); not static

        Static myInstance = new Static();

        new Static().four();
    }
}
