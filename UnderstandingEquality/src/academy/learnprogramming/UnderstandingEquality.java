package academy.learnprogramming;

public class UnderstandingEquality {

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two); // false
        System.out.println(one == three); // true

        String x = "Java";
        String y = "Java";

        System.out.println(x == y);

        String a = "Java";
        String b = " Java".trim();

        System.out.println(a == b); // false

        String c = "Java";
        String d = " Ja".trim() + "va"; // computed at runtime

        System.out.println(c == d); // false

        // 0 1 2 3 4 5
        // d a n i l o
        StringBuilder danilo = new StringBuilder("danilo");
        System.out.println(danilo.length());
        System.out.println(danilo.substring(1, 3));
        System.out.println(danilo.substring(3, 3));
        System.out.println(danilo.substring(2));

        String danilo1 = "danilo";
        System.out.println(danilo1.length());
        System.out.println(danilo1.substring(1, 3));
        System.out.println(danilo1.substring(3, 3)
        );
        System.out.println(danilo1.substring(2));
    }

}
