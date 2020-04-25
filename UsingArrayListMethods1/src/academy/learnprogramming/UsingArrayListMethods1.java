package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("dog");
        list.add(5);

        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);
        pets.add(0, "cat");
        System.out.println(pets);

        // pets.add(5); // does no compile

        // 0    1
        // cat, dog

        pets.add(1, "parrot"); // cat, parrot, dog
        pets.add(0, "husk"); // husky, cat, parrot, dog
        pets.add(1, "bird"); // husky, bird, cat, parrot, dog
        System.out.println(pets);

        // remove
        pets.remove("parrot");
        System.out.println(pets);

        pets.remove(2);
        System.out.println(pets);

        pets.set(0, "newBird");
        System.out.println(pets);

        // pets.set(5, "myDog"); // throws IndexOutOfBoundsException


    }

}
