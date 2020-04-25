package academy.learnprogramming;

import java.util.Arrays;

/**
 * If arrays is not sorted the binary search is unpredictable
 */
public class SearchingArrays {

    public static void main(String[] args) {

        int [] number = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(number, 2));
        System.out.println(Arrays.binarySearch(number, 5));
        System.out.println(Arrays.binarySearch(number, 7));
        System.out.println(Arrays.binarySearch(number, 1));
        System.out.println(Arrays.binarySearch(number, 3));
        System.out.println(Arrays.binarySearch(number, 6));
        System.out.println(Arrays.binarySearch(number, 4));

        int[] notSortedNumbers = {5, 4, 10, 8, 6};
        Arrays.sort(notSortedNumbers);
        System.out.println(Arrays.toString(notSortedNumbers));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));

    }

}
