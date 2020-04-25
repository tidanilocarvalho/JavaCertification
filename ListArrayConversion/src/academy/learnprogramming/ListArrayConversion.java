package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArrays = names.toArray();
        System.out.println(namesArrays.length);

        String[] stringArray = names.toArray(new String[0]);

        String[] anotherStringArray = names.toArray(new String[names.size()]);

        String[] petsArray = new String[] {"dog", "cat", "parrot"};

        List<String> petsList = Arrays.asList(petsArray);
        //List<String> petsList = Arrays.asList("dog", "cat", "parrot"); // returns fixed size list

        System.out.println(petsList.size());

        petsList.set(0, "bird");

        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky";

        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        // we can change the values
        // we can add or remove because this list has fixed size
        //
        // petsList.add("newDog"); // UnsupportedOperationsException
        // petsList.remove(1); // UnsupportedOperationsException

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
        //list.add("four"); // UnsupportedOperationsException

    }

}
