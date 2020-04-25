package academy.learnprogramming;

public class ForLoop {


    // initialization; booleanExpression; updateStatement
    public static void main(String[] args) {

        for(int i= 0; i < 10; i++) {
            System.out.print(i + "");
        }

        //System.out.println("i=" + i);// does not compile
        System.out.println(); // prints a new line sign
        int a;

        for (a = 0; a < 10; a++) {
            System.out.print(a + "");
        }

        System.out.println();
        System.out.println("after for loop a=" + a);

        // it is endless/infinity
//        for(;;) {
//            System.out.println("Hello");
//        }


        int x = 0;

        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println("y=" + y);
        }

        System.out.println("x=" + x);

        int d = 10;

        //for (int e = 0, d = 0; e < 10 || d < 10; e++, d--) { } // does not compile
        // for (long z = 0; int d = 0; z < 10; z++, d++) {} // does no compile, different data types

        for (long z = 0; z < 100; z++) {}
        for (double xy= 0.0; xy < 10.5; xy += 0.5) {}
    }

}
