package academy.learnprogramming;

public class WhileLoop {

    public static void main(String[] args) {
        int spaceOnHdd = 5;

        while (spaceOnHdd > 0) {
            spaceOnHdd--;
            System.out.println("spaceOnHdd=" + spaceOnHdd);
        }

        int x = 2;
        int y = 5;

        while (x < 10) {
            y++;
            x++; // without this the while is endless
            // y = 6, x = 3
            // y = 7, x = 4
            // y = 8, x = 5
            // y = 9, x = 6
            // y = 10, x = 7
            // y = 11, x = 8
            // y = 12, x = 9
            // y = 13, x = 10
        }

        System.out.println("x=" + x + " y=" + y);

        int a = 5;
        int b = 7;

        while (a > 6) { // while will not execute
            b += 2;
            a++;
        }

        a = a > 6 ? a++ : b--;
        // false
        // a = b -> a = 7
        // b-- = b = b -1 = 6
        // 7 + 6 = 13

        System.out.println(a + ", " + b + ", " + (a + b)); // 7, 6, 13
    }

}
