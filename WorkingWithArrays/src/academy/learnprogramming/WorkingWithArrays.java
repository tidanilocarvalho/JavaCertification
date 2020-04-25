package academy.learnprogramming;

import java.util.Arrays;

/**
 *
 * arrays has a fixed size and it is a disadvantage
 *
 */
public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] one = new int[3]; // array with 3 elements
        int[] two = new int[]{10, 11, 12}; // array with 3 elements but initialized

        // double[] a = new double[2.55]; // does not compile

        double[] b = new double[4 * 5 / 2]; // create array with 10 elements  // it is legal and this compiles

        int x = 4;
        int y = 4;
        double[] c = new double[x * y]; // creates empty array with 16 elements

        // anonymous array
        int [] three = {10, 11, 12};
        int [] four = {}; // the size is zero

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] id, types; // creates 2 array
        int ids[], types2;// creates array and int

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;

        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        //.equals || == check the reference
        //Arrays.equals -> check the literal values

        System.out.println(animals.equals(myAnimals)); // true - the are the same reference
        System.out.println(animals == myAnimals); // true
        System.out.println(Arrays.equals(animals, myAnimals)); // true

        System.out.println(animals.equals(otherAnimals)); // false - not the same reference
        System.out.println(animals == otherAnimals); // false
        System.out.println(Arrays.equals(animals, otherAnimals)); // true

        System.out.println(animals);
        System.out.println(animals.toString());

        System.out.println(Arrays.toString(animals));
    }

}
