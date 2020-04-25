package academy.learnprogramming;

import java.util.Arrays;

/**
 *
 * Exact match by type
 *
 * Larger primitive type
 *
 * Autoboxed type
 *
 * Varargs
 *
 *
 * They have the same name but the different parameters
 */
public class OverloadingMethods {

    public void walk(int miles) {

    }

    public void walk(short feet) {

    }

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet) {

    }

    public void walk(float miles) {

    }

    //public int walk(float km) {} does not compile

    public void walk(int[] lenghts) {

    }

    // public walk(int... vars) { } does not compile

    public static void main(String[] args) {
        run(9L);
        jump("test");
        jump(25);

        sum(1, 2);

        boolean[] b1 = {true, true};

        System.out.println(count(true, true, true));
        System.out.println(count(true, new boolean[2]));
        //System.out.println(true, {true, true});
        System.out.println(count(true, b1));
    }

    public static void run(int length) {}
    public static void run(Integer length) {}
    public static void run(double kilometers) {}

    public static void jump(String s) {
        System.out.println("string");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }

//    public static int sum(int a, int b) {
//        System.out.println("int sum");
//        return a + b;
//    }

//    public static long sum(long a, long b) {
//        System.out.println("long sum");
//        return a + b;
//    }

//    public static Integer sum(Integer a, Integer b) {
//        System.out.println("integer sum");
//        return a + b;
//    }

    public static double sum(double a, double b) {
        System.out.println("double sum");
        return a + b;
    }


    public static int count(boolean b, boolean... b2) {
        return b2.length;
    }

    public static int sum(int... numbers) {
        System.out.println("sum var args");

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }
}
