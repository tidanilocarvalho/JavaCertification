package academy.learnprogramming;

public class MethodArguments {

    int getZero() { // 0 arguments (niladic)
        return 0;
    }

    int increment(int number) { // 1 argument (monadic)
        return number + 1;
    }

    int sum(int a, int b) { // 2 arguments(dyadic)
        return a + b;
    }

    int plusMinus(int a, int b, int c) { // 3 arguments (triadic)
        return a + b - c;
    }

    // avoid if you want to have clean code
    // 4 or more arguments (polyadic)
    double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4.0;
    }

    // void test {} // does not compile, not brackets

    // void test(int a; int b) {} // does not compile, parameters are separated by comma

    void test(int a, int b) {}

    // void test(int a); // does not compile, missing the method body


}
