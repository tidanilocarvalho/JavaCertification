package academy.learnprogramming;

public class ConditionalOperators {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean d = a && b; // false
        boolean e = a || b; // true

        System.out.println("d=" + d + " e=" + e);

        int f = 4;
        boolean g = false && (f++ < 4); // (f++ < 4) is never executed  (short-circuiting)
        boolean h = (f-- == 4) && !g;

        // f = 4 -> 3
        // g = false

        // h = (4 == 4) && g == false
        // h = true && true
        // h = true;

        System.out.println("f=" + f);
        System.out.println("g=" + g);
        System.out.println("h=" + h);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);

        // myInt = 3 ->
        // anotherInt = 4 -> 3
        // (3 <= 3) && (4 == 4) || ? never executed
        // true && true
        // true

        System.out.println("myInt=" + myInt);
        System.out.println("anotherInt=" + anotherInt);
        System.out.println("myBoolean=" + myBoolean);

        boolean x = true, z = true;
        int y = 20;

        x = (y != 10) ^ (z = false); // z = false, sets z to false

        // true ^ false // ^ is true when they are different
        // true

        // true, 20, false
        System.out.println(x + ", " + y + ", " + z);



    }

}
