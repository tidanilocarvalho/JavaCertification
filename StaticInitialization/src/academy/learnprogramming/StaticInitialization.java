package academy.learnprogramming;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE;

    private static int one;
    private static final int two;
    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();
    // private static final int four;

    static {
        System.out.println("first static init");
        int rows = 5;
        int columns = 5;

        SIZE = rows * columns;
    }

    static {
        System.out.println("third static init");

        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }

    static {
        System.out.println("Second static init");
        one = 1;
        two = 2;

        one = three; // one is no final

        // two = 6; // does no compile
        // three = 3; does not compile
    }

    public static void main(String[] args) {
        System.out.println(NAMES);
    }

}
