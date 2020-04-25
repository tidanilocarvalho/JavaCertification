package academy.learningprogramming;

public class VariableScope {

    //global variable, can be use in anywhere in our class
    static int myNewInt = 5;

    public static void main(String[] args) {
        // it is only available in main method
        int myLocalInt = 10;

        {
            {
                int myOtherInt = 0;
                {
                    int myOtherInt2 = 20;
                }
            }

            //System.out.println("myOtherInt=" + myOtherInt); // it does not compile

            int myOtherInt = 20;
            int anotherInt = 30;
            System.out.println("myOtherInt=" + myOtherInt);
            System.out.println("inCodeBlock myLocalInt=" + myLocalInt);
        }

        //System.out.println("myOtherInt=" + myOtherInt); // it does not compile
        System.out.println("myLocalInt=" + myLocalInt);
        System.out.println("myNewInt=" + myNewInt);

        int myOtherInt = 30;
        int anotherInt = 40;

        System.out.println("myOtherInt=" + myOtherInt);
        System.out.println("anotherInt=" + anotherInt);
    }

    public static void myMethod() {

    }
}
