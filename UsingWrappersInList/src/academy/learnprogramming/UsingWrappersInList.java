package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Autoboxing, boxing, unboxing exists since java 5
 *
 */
public class UsingWrappersInList {

    public static void main(String[] args) {
        // List<double> doubleList = new ArrayList<>(); // does not compile

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); // This is autoboxing
        doubleList.add(new Double(55.10)); // this is boxing
        doubleList.remove(55.10); // autoboxing

        double first = doubleList.get(0); // unboxing to primitive

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        System.out.println(numbers);

        // int number = numbers.get(0); // the primitives cannot hold null // throws NPE

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);

        //nums.remove(1);
        nums.remove(new Integer(1));

        System.out.println(nums);
    }

}
