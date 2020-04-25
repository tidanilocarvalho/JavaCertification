package academy.learningprogramming;

public class WholeNumericPrimitives {

    public static void main(String[] args) {
        long max = 32_123_456_789L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07;

        // 8 decimal
        int firstOct = 010;

        // 18 decimal
        int secondOct = 022;

        // 26 decimal, 32 octal
        int sumOct = firstOct + secondOct;

        System.out.println("first=" + firstOct + " second=" + secondOct + " sum=" + sumOct);

        System.out.println("sumOct=" + Integer.toOctalString(sumOct));

        // Hexadecimal (0-9) and (A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex

        System.out.println("first=" + firstHex + " second=" + secondHex + " sum=" + sumHex);
        System.out.println("sumHex=" + Integer.toHexString(sumHex));

        // binary
        int firstBinary = 0b1001; // 9 decimal
        int secondBinary = 0b0111; // 7 decimal
        int sumBin = firstBinary + secondBinary; // 16 decimal, 10000 binary

        //int thirdBin = 0b2;

        System.out.println("first=" + firstBinary + " second=" + secondBinary + " sum=" + sumBin);
        System.out.println("sumHex=" + Integer.toBinaryString(sumBin));
    }

}
