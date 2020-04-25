package academy.learnprogramming;

import java.util.Arrays;

public class VariableArguments {

//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//    }

    public static void main(String... args) {
        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));

        print(args);
        print("Java");
        print(new String[] {"this", "is", "my", "string", "again"});
        print("this", "is", "my", "string", "again");
    }

    private static void print(String... myArguments) {
        System.out.println(Arrays.toString(myArguments));
    }

}
