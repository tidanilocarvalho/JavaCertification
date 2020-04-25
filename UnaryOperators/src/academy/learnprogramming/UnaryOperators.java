package academy.learnprogramming;

/**
 *
 *  + indicates a literal number is positive
 *  - indicates literal number is negative or negates a expression
 *  ++ increments
 *  -- decrements
 *  ! inverts a boolean logical value, negates de boolean values
 *
 */
public class UnaryOperators {

    public static void main(String[] args) {
        int x = +3;
        System.out.println("x=" + x);

        double y = -x;
        System.out.println("x=" + x + " y=" + y);

        y = -y; // -1 * y
        System.out.println("x=" + x + " y=" + y);

        boolean a = true;
        boolean b = !a;

        System.out.println("a=" + a + " b=" + b);

        b = !b;

        System.out.println("a=" + a + " b=" + b);

        //int myInt = !5; // it does not compile
        //boolean myBoolean = -true; // it does not compile
        //boolean z = !0; // it does not compile

        // increment and decrement be carefull, have higher order than (+,-,*,/,..)
        int myInt = 5;
        //myInt = myInt + 1;
        //int otherint = myint;
        int otherInt = ++myInt;
        System.out.println("myInt=" + myInt + " otherInt=" + otherInt);

        int newInt = 5;
        //int newOtherInt = newInt;
        //newInt = newInt + 1;
        int newOtherInt = newInt++;

        System.out.println("newInt=" + newInt + " newOtherInt=" + newOtherInt);

        int count = 0;
        System.out.println("count=" + count); // 0
        System.out.println("count=" + ++count); // 1
        System.out.println("count=" + count); // 1
        System.out.println("count=" + count--); // 1 but also set count to 0
        System.out.println("count=" + count); // 0

        // exam questions

        int e = 3;
        int f = ++e * 5  / e-- + --e;

        // 4 * 5 / 4 + 2
        // 20 / 4 + 2
        // 5 + 2
        // e = 2 , f = 7
        System.out.println("e=" + e + " f=" + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;

        // g = 5
        // h = 2
        // i =

        // 3 + 5 * 3 + 2 * 5 - 3 % 5
        // 3 + 15 + 10 - 3 % 4

        // 3 % 5 = 3 / 5 = 0 = 0 * 5 = 0 -> 3 - 0 = 3

        // 3 + 15 + 10 - 3
        //28 - 3
        // 25


        System.out.println("g=" + g + " h=" + h + " i=" + i);
    }

}
