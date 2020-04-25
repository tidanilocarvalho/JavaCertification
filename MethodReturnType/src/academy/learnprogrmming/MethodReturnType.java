package academy.learnprogrmming;

public class MethodReturnType {

    public void jump() {} // return type void
    public void jump2() { // return type void
        return;
    }

    public String jump3() { // returns a empty string
        return "";
    }

    //public String jump4() { } // does not compile, there is no return statement

    //public jumpp5() {} // does not compile, return type is required

    String jump5(int a) {
        if (a == 5) {
            //return "";
        }
        return "abc";
    }

    int getInt() {
        return 9;
    }

    int getLong() {
        return (int)9L;
    }

    int expanded() {
        //int temp = 10;
        //return temp;
        return 10;
    }

    boolean isTrue() {
        //return 5 < 10;
        return 5 == 5;
    }

    public void test() {}
    //public void 2test() {} // does not compile
    //public void void() {} // does not compile
    public void $test() {}
    public void _test() {}
    //public void() {}

}
