package ademy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Since java 5 we do not need to specify type in the right side
 *
 * List is the interface some for Lists, the we can use List as our type of list
 *
 * ArrayList will automatically resize if you put more elements
 *
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<Object>();

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>(); // diamond operator

        List<String> list3 = new ArrayList<>(); // using interface as type

        // ArrayList<String> list4 = new List<>(); // does not compile

        List<String> list5 = new ArrayList<>(20);



    }

}
