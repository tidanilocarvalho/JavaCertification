package academy.learningprogramming;
// Static imports
// For static members, variables or methods
// regular imports are to classes

// USE TO MANY IMPORT STATIC IMPORT IN A BIG APPLICATIONS IS NOT A GOOD IDEA BECAUSE WE WILL NOT TO KNOW WHEREN THEY COME FROM

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static academy.learningprogramming.Config.*;

public class StaticImportExample {

    public static void main(String[] args) {
        int min = min(5, 7);
        out.println("min=" + min);
        out.print(PI);

        printConfig();

        out.println("name=" + NAME);
        out.println("column=" + MAX_COLUMN_COUNT);
    }

}
