package academy.learnprogramming;

public class CharacterArithmeteic {

    public static void main(String[] args) {
        // char 0 - 65535
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA=" + myCharA);
        System.out.println("myCharA isLetter=" + Character.isLetter(myCharA));
        System.out.println("myCharA isDigits=" + Character.isDigit(myCharA));

        System.out.println("myCharNum=" + myCharNum);
        System.out.println("myCharNum isLetter=" + Character.isLetter(myCharNum));
        System.out.println("myCharNum isDigits=" + Character.isDigit(myCharNum));

        // Exam examples

        char letter = 65; // A(65) + 1 -> B(66) + 1 -> C(67) + 1 -> D68
        int myInt = letter + 3;
        char myNewLetter = (char)myInt;

        System.out.println("letter=" + letter);
        System.out.println("myInt=" + myInt);
        System.out.println("myNewLetter=" + myNewLetter);


        char myChar = 65; // A
        char newChar = (char)(myChar + 1); // 66 -> B
        boolean b = newChar == 'B'; // true
        boolean c = (newChar++ < 'D'); // 66 < 68 -> TRUE

        System.out.println("myChar=" + myChar);
        System.out.println("newChar=" + newChar);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

    }

}
