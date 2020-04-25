package academy.learnprogramming;

/**
 *
 * Wrappers
 * Box
 * Unboxing
 * Autoboxing
 *
 */
public class PrimitiveWrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;

        //Variables are just container for our values
        //Boxing put the value inside the wrapper
        Integer myInteger = new Integer(10);

        Integer myInteger2 = 20;

        Integer myInteger3 = Integer.valueOf(10);

        Integer myInteger4 = Integer.parseInt("3");

        Integer myInteger5 = null;
        //int myInt2 = null; // it does not compile

        System.out.println("myInteger=" + myInteger);
        System.out.println("myInteger2=" + myInteger2);
        System.out.println("myInteger3=" + myInteger3);
        System.out.println("myInteger4=" + myInteger4);
        System.out.println("myInteger5=" + myInteger5);

        //Unboxing, converting wrapper to primitive
        int myInt3 = myInteger3;

        //Boxing, converting to primtive to wrapper
        Integer myInteger6 = new Integer(10);
        Integer myInteger7 = myInt;
        // int myInt4 = myInteger5; Throws NPE

        //AutoBoxing
        printSum(1, 5);

        printSum(myInteger, myInteger2);
    }

    private static void printSum(Integer first, Integer second) {
        Integer sum = first + second;

        System.out.println("sum=" + sum);
    }

}
