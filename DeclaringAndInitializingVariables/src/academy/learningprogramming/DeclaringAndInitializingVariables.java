package academy.learningprogramming;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {
        //declaring and initializing in two lines

        int myNumber; // declaration
//        System.out.println("myNumber=" + myNumber);
        myNumber = 10; //initialization
        System.out.println("myNumber=" + myNumber);

        // one line

        double myDouble = 7.50;
        System.out.println("myDouble=" + myDouble);

        float myFloat1, myFloat2, myFloat3; // This is not the best practice in the production

        float myFloat4; float myFloat5; // That is also legal and compiles

        float myFloat6 = 5f, myFloat7 = 10f, myFloat8;

        boolean b1, b2;

        //double d1, double d2; // It does not compile because we have multiple indentifier in the same line

        int i1;
        int i2;
        //int i3; i4; // does not compile the are not in the same statement

        // variable identifier
        // java is case sensitive
        //int int = 10; // does not compile

        char cHaR;
        char Char;

        float okFloat;
        double $ok2Double;
        double _asloDouble;
        float __okButNotNice$_123;

        // illegal examples
        //double 3point; // it does not compile, we can not start a variable with a number
        //doube my@Street;  // we only can use the $, _ or number in the variable names, but we can not start a variable name with a number
        //float *$coffe; // it does not compile;
        // float double; // it does not compile

    }

}
