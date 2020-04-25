package academy.learningprogramming;

/**
 * When you have a decimal number withou any letter the compile assumes that is a double number
 * we can use _ as separtors
 * we cannot use _ before . after . and as first char neither last char
 * scientific notation
 */
public class DecimalNumericPrimtives {

    public static void main(String[] args) {
        float number = 25.4F;

        //double before = 10_.25; //does not compile
        //double after = 10._25; //does not compile
        //double first = _10.25; //does not compile
        //double last = 10.25_; //does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F; // A autoconversion happens automatically
        double anotherDouble = 2.45d; //It represents a double, but all number with . are double then it is optional

        double scientific = 5.000125E3;
        double scientific2 = 5.000125E03; // this is legal, it compiles
        double myDouble3 = 500.125; // it represents the scientific

        System.out.println("scientific=" + scientific);
        System.out.println("scientifi2=" + scientific2);
        System.out.println("myDouble3=" + myDouble3);

        // a decimal number in the hexdecimal notation
        // hexadecimal float-point literal
        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecial floatin poitin number

        System.out.println("hexPi=" + hexPi);
    }

}
