package academy.learnprogramming;

public class DoWhileLoop {

    public static void main(String[] args) {
        int a = 0;

        do {
            a++;
        } while (false);

        System.out.println("a=" + a);

        // does not compile
//        while (false) { // The statement is unreachable
//            a++;
//        }

        int x = 20;

        while (x > 10) x--;
        System.out.println("x=" + x);

        int x2 = 20;

        do x2--;
        while (x2 > 10);

        System.out.println("x2=" + x2);

        int y = 10;
        int z = 5;

        while (y < 20) {
           y++;
        }

        // y = 20
        z += 2;
        y += 10;


        System.out.println("x=" + x + " y=" + y + " z=" + z);

        int number = 10;

        while (number > 10) { // will be never execute
            number--;
        }

        do {
            number--;
            // number = 9
            while (number > 5) { // nested loop
                number -= 2;
                // number = 7
                // number = 5
            }
        } while (number > 10);

        System.out.println("number=" + number);

    }

}
