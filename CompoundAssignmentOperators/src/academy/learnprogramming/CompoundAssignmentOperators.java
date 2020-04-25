package academy.learnprogramming;

/**
 * They calculate and store the value in the variable in the left side
 */
public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        int x = 2;
        int z = 3;

        x = x * z; // Simple assignment

        x *= z; // Shorter former of  x = x * z;

        System.out.println("x=" + x);

        //int a += 5; // does not compile, we can not declare and use the compound operator in the same time

        long a = 10;
        int b = 4;

        //b = b *a; // does not compile
        //b = (int) (b * a); // too long

        b *= a; // shorter form, automatic cast

        System.out.println("b=" + b);

        long c = 4;
        long d = (c = 2); // simple assignment - twice - trick - not a good practice

        System.out.println("c=" + c + " d=" + d);

        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f = 3) - (h -= 2);

        //e = 3
        //f = 3
        //h = -1
        //i = 10

        // 3 + 3 * 3 - ( -1 )
        // 3 + 3 * 3 + 1
        // 3 + 9 + 1
        // 13

        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println("h=" + h);
        System.out.println("i=" + i);

    }
}
