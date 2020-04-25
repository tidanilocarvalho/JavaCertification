package academy.learnprogramming;

import java.util.*;

public class IterationList2 {

    public static void main(String[] args) {
        List<String> t = new ArrayList<>();
        t.add("danilo");
        System.out.println(t.contains(new String("danilo")));


        List<String> list = Arrays.asList(createArray());

        //for loop
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop totalTime=" + totalTime + " ms");

        //for each
        startTime = System.currentTimeMillis();

        for (String temp : list) { }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each totalTime=" + totalTime + " ms");

        // iterator
        startTime = System.currentTimeMillis();

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator totalTime=" + totalTime + " ms");


        // list iterator
        startTime = System.currentTimeMillis();

        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("list iterator totalTime=" + totalTime + " ms");
    }

    private static String[] createArray() {
        String[] stringArray = new String[10_000_000];

        for(int i = 0; i< stringArray.length; i++) {
            stringArray[i] = "Array " + i;
        }

        return stringArray;
    }
}
