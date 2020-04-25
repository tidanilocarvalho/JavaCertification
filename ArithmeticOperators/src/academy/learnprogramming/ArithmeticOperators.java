package academy.learnprogramming;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3;

        // / and * has higher priority
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3
        // 5 + 3
        // 8
        System.out.println("result=" + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;

        // 2 + 1 - 8 + 10
        // 3 - 8 + 10
        // -5 + 10
        // 5
        System.out.println("result=" + result);

        int a = 4;
        int b = 3 - 2 * --a; // a = a - 1;

        // 3 - 2 * 3
        // 3 - 6
        // -3
        // a = 3, b = -3
        System.out.println("a=" + a + " b=" + b);

        a = 4;
        b = 3 - 2 * a--; // use and them decrement, a = a -1;

        // 3 - 2 * 4;
        // 3 - 8
        // -5
        // a = 3, b = -5
        System.out.println("a=" + a + " b=" + b);

        long c = 2;
        long d = 4 + 3 * c++; // Use then increment, c=c+1

        // 4 + 3 * 2
        // 4 + 6
        // 10
        // c = 3, d = 10
        System.out.println("c=" + c + " d=" + d);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);

        //() has higher priority
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 1
        // 10 - 10
        // 0
        System.out.println("result=" + result);

        // Modulus
        int i = 10;
        int j = 3;

        // 10 % 3 = 10 / 3 = 3 -> 3 * 3 = 9 -> 10 - 9 = 1
        int k = i % j;

        // 10 % 2 = 10 / 2 = 5 - > 2 * 5 = 10 -> 10 - 10 = 0
        int e = 10 % 2;

        System.out.println("k=" + k);
        System.out.println("e=" + e);

        int f = 12;
        int g = 5;
        int h = 2;

        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;

        //

        // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3

        // 10 % 7 = 10 / 7 = 1 -> 1 * 7 = 7 -> 10 - 7 = 3
        // 12 % 5 = 12 / 5 = 2 -> 2 * 5 = 10 -> 12 -10 = 2

        // 6 - 3 - 2 * 2 - 2 * 3
        // 6 - 3 - 4 - 6
        // 3 - 4 - 6
        // -1 - 6
        // -7
        System.out.println("m=" + m);

    }

}
