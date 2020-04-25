package academy.learningprogamming;

/**
 * Java doc comments
 */
public class Main {

    /**
     * Multi line comments and java doc comments
     *
     * This is the main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Simple comment
        //System.out.println("args-size " + args.length);

        /*
         * Multi line comment
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[ " + i + " ] = " + args[i]);
        }

        sum(1, 2 );
    }

    /**
     * Multi line comment and java doc
     *
     * @param a
     * @param b
     *
     * @return sum
     */
    public static int sum(int a, int b) {
        return a + b;
    }

}
