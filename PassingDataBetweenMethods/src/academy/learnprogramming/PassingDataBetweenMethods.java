package academy.learnprogramming;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("number=" + number);
        newNumber(number);
        System.out.println("number=" + number);

        String name = "Jimmy";
        System.out.println("name=" + name);
        newName(name);
        System.out.println("name=" + name);

        StringBuilder sb = new StringBuilder();
        build(sb);
        System.out.println("stringBuilder=" + sb);

        Class1 class1 = new Class1();
        class1.name = "class1";
        System.out.println("class1=" + class1);
        newClass1(class1);
        System.out.println("class1=" + class1);

    }

    /**
     * Passing value as parameter
     *
     * The value is copied
     */
    public static void newNumber(int number) {
        System.out.println("in newNumber=" + number);
        number = 10;
        System.out.println("in newNumber=" + number);
    }

    public static void newName(String name) {
        System.out.println("in newName=" + name);
        name = "Timmy";
        System.out.println("in newName=" + name);
    }

    public static void build(StringBuilder sb) {
        sb.append("Tom");
    }

    public static void newClass1(Class1 class1) {
        Class1 newClass1 = class1;
        newClass1.name = "newClass1";
    }

}
